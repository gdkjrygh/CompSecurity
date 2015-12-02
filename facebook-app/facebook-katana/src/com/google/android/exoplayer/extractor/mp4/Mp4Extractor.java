// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.extractor.Extractor;
import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.extractor.ExtractorOutput;
import com.google.android.exoplayer.extractor.PositionHolder;
import com.google.android.exoplayer.extractor.SeekMap;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.NalUnitUtil;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//            Atom, AtomParsers, TrackSampleTable, Track, 
//            Sniffer

public final class Mp4Extractor
    implements Extractor, SeekMap
{

    private final ParsableByteArray a;
    private final ParsableByteArray b = new ParsableByteArray(4);
    private final ParsableByteArray c = new ParsableByteArray(16);
    private final Stack d = new Stack();
    private int e;
    private int g;
    private long h;
    private int i;
    private ParsableByteArray j;
    private int k;
    private int l;
    private int m;
    private ExtractorOutput n;
    private Mp4Track o[];

    public Mp4Extractor()
    {
        a = new ParsableByteArray(NalUnitUtil.a);
        c();
    }

    private void a(Atom.ContainerAtom containeratom)
    {
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; i1 < containeratom.aj.size(); i1++)
        {
            Object obj = (Atom.ContainerAtom)containeratom.aj.get(i1);
            if (((Atom.ContainerAtom) (obj)).ag != Atom.u)
            {
                continue;
            }
            Track track = AtomParsers.a(((Atom.ContainerAtom) (obj)), containeratom.d(Atom.t));
            if (track == null)
            {
                continue;
            }
            obj = AtomParsers.a(track, ((Atom.ContainerAtom) (obj)).e(Atom.v).e(Atom.w).e(Atom.x));
            if (((TrackSampleTable) (obj)).a != 0)
            {
                obj = new Mp4Track(track, ((TrackSampleTable) (obj)), n.a_(i1));
                ((Mp4Track) (obj)).c.a(track.i);
                arraylist.add(obj);
            }
        }

        o = (Mp4Track[])arraylist.toArray(new Mp4Track[0]);
        n.a();
        n.a(this);
    }

    private static boolean a(int i1)
    {
        return i1 == Atom.F || i1 == Atom.t || i1 == Atom.G || i1 == Atom.V || i1 == Atom.W || i1 == Atom.H || i1 == Atom.b || i1 == Atom.y || i1 == Atom.i || i1 == Atom.A || i1 == Atom.Y || i1 == Atom.Z || i1 == Atom.aa || i1 == Atom.ab || i1 == Atom.ac || i1 == Atom.ad || i1 == Atom.ae || i1 == Atom.E || i1 == Atom.f;
    }

    private static boolean b(int i1)
    {
        return i1 == Atom.s || i1 == Atom.u || i1 == Atom.v || i1 == Atom.w || i1 == Atom.x;
    }

    private boolean b(ExtractorInput extractorinput)
    {
        if (i == 0)
        {
            if (!extractorinput.a(c.a, 0, 8, true))
            {
                return false;
            }
            i = 8;
            c.b(0);
            h = c.i();
            g = c.j();
        }
        if (h == 1L)
        {
            extractorinput.b(c.a, 8, 8);
            i = i + 8;
            h = c.n();
        }
        if (b(g))
        {
            long l1 = extractorinput.b();
            long l2 = h;
            long l3 = i;
            d.add(new Atom.ContainerAtom(g, (l1 + l2) - l3));
            c();
        } else
        if (a(g))
        {
            boolean flag;
            if (i == 8)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Assertions.b(flag);
            if (h <= 0x7fffffffL)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Assertions.b(flag);
            j = new ParsableByteArray((int)h);
            System.arraycopy(c.a, 0, j.a, 0, 8);
            e = 2;
        } else
        {
            j = null;
            e = 2;
        }
        return true;
    }

    private boolean b(ExtractorInput extractorinput, PositionHolder positionholder)
    {
        long l1 = h - (long)i;
        long l2 = extractorinput.b();
        if (j != null)
        {
            extractorinput.b(j.a, i, (int)l1);
            boolean flag;
            if (!d.isEmpty())
            {
                ((Atom.ContainerAtom)d.peek()).a(new Atom.LeafAtom(g, j));
                flag = false;
            } else
            {
                flag = false;
            }
        } else
        if (l1 < 0x40000L)
        {
            extractorinput.a((int)l1);
            flag = false;
        } else
        {
            positionholder.a = l1 + extractorinput.b();
            flag = true;
        }
        do
        {
            if (d.isEmpty() || ((Atom.ContainerAtom)d.peek()).ah != l2 + l1)
            {
                break;
            }
            extractorinput = (Atom.ContainerAtom)d.pop();
            if (((Atom.ContainerAtom) (extractorinput)).ag == Atom.s)
            {
                a(extractorinput);
                d.clear();
                e = 3;
                return false;
            }
            if (!d.isEmpty())
            {
                ((Atom.ContainerAtom)d.peek()).a(extractorinput);
            }
        } while (true);
        c();
        return flag;
    }

    private int c(ExtractorInput extractorinput, PositionHolder positionholder)
    {
        int i1 = d();
        if (i1 == -1)
        {
            return -1;
        }
        Mp4Track mp4track = o[i1];
        TrackOutput trackoutput = mp4track.c;
        i1 = mp4track.d;
        long l2 = mp4track.b.b[i1];
        long l3 = (l2 - extractorinput.b()) + (long)l;
        if (l3 < 0L || l3 >= 0x40000L)
        {
            positionholder.a = l2;
            return 1;
        }
        extractorinput.a((int)l3);
        k = mp4track.b.c[i1];
        if (mp4track.a.k != -1)
        {
            positionholder = b.a;
            positionholder[0] = 0;
            positionholder[1] = 0;
            positionholder[2] = 0;
            int j1 = mp4track.a.k;
            int l1 = 4 - mp4track.a.k;
            while (l < k) 
            {
                if (m == 0)
                {
                    extractorinput.b(b.a, l1, j1);
                    b.b(0);
                    m = b.m();
                    a.b(0);
                    trackoutput.a(a, 4);
                    l = l + 4;
                    k = k + l1;
                } else
                {
                    int i2 = trackoutput.a(extractorinput, m, false);
                    l = l + i2;
                    m = m - i2;
                }
            }
        } else
        {
            while (l < k) 
            {
                int k1 = trackoutput.a(extractorinput, k - l, false);
                l = l + k1;
                m = m - k1;
            }
        }
        trackoutput.a(mp4track.b.d[i1], mp4track.b.e[i1], k, 0, null);
        mp4track.d = mp4track.d + 1;
        l = 0;
        m = 0;
        return 0;
    }

    private void c()
    {
        e = 1;
        i = 0;
    }

    private int d()
    {
        int j1 = -1;
        long l2 = 0x7fffffffffffffffL;
        for (int i1 = 0; i1 < o.length;)
        {
            Mp4Track mp4track = o[i1];
            int l1 = mp4track.d;
            int k1 = j1;
            long l3 = l2;
            if (l1 != mp4track.b.a)
            {
                long l4 = mp4track.b.b[l1];
                k1 = j1;
                l3 = l2;
                if (l4 < l2)
                {
                    l3 = l4;
                    k1 = i1;
                }
            }
            i1++;
            j1 = k1;
            l2 = l3;
        }

        return j1;
    }

    public final int a(ExtractorInput extractorinput, PositionHolder positionholder)
    {
label0:
        do
        {
label1:
            do
            {
                switch (e)
                {
                default:
                    return c(extractorinput, positionholder);

                case 2: // '\002'
                    continue label0;

                case 0: // '\0'
                    if (extractorinput.b() == 0L)
                    {
                        c();
                    } else
                    {
                        e = 3;
                    }
                    break;

                case 1: // '\001'
                    if (!b(extractorinput))
                    {
                        break label1;
                    }
                    break;
                }
            } while (true);
            return -1;
        } while (!b(extractorinput, positionholder));
        return 1;
    }

    public final void a(ExtractorOutput extractoroutput)
    {
        n = extractoroutput;
    }

    public final boolean a()
    {
        return true;
    }

    public final boolean a(ExtractorInput extractorinput)
    {
        return Sniffer.b(extractorinput);
    }

    public final long b(long l1)
    {
        long l2 = 0x7fffffffffffffffL;
        for (int i1 = 0; i1 < o.length;)
        {
            TrackSampleTable tracksampletable = o[i1].b;
            int k1 = tracksampletable.a(l1);
            int j1 = k1;
            if (k1 == -1)
            {
                j1 = tracksampletable.b(l1);
            }
            o[i1].d = j1;
            long l4 = tracksampletable.b[o[i1].d];
            long l3 = l2;
            if (l4 < l2)
            {
                l3 = l4;
            }
            i1++;
            l2 = l3;
        }

        return l2;
    }

    public final void b()
    {
        d.clear();
        i = 0;
        l = 0;
        m = 0;
        e = 0;
    }

    private class Mp4Track
    {

        public final Track a;
        public final TrackSampleTable b;
        public final TrackOutput c;
        public int d;

        public Mp4Track(Track track, TrackSampleTable tracksampletable, TrackOutput trackoutput)
        {
            a = track;
            b = tracksampletable;
            c = trackoutput;
        }
    }

}
