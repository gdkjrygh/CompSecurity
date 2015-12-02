// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.extractor.ChunkIndex;
import com.google.android.exoplayer.extractor.Extractor;
import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.extractor.ExtractorOutput;
import com.google.android.exoplayer.extractor.PositionHolder;
import com.google.android.exoplayer.extractor.SeekMap;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.NalUnitUtil;
import com.google.android.exoplayer.util.ParsableByteArray;
import com.google.android.exoplayer.util.Util;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//            TrackFragment, Atom, DefaultSampleValues, Track, 
//            TrackEncryptionBox, PsshAtomUtil, AtomParsers, Sniffer

public final class FragmentedMp4Extractor
    implements Extractor
{

    private static final byte a[] = {
        -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 
        108, 66, 124, 100, -115, -12
    };
    private final int b;
    private final ParsableByteArray c;
    private final ParsableByteArray d;
    private final ParsableByteArray e;
    private final ParsableByteArray f;
    private final byte g[];
    private final Stack h;
    private final TrackFragment i;
    private int j;
    private int k;
    private long l;
    private int m;
    private ParsableByteArray n;
    private int o;
    private int p;
    private int q;
    private int r;
    private Track s;
    private DefaultSampleValues t;
    private ExtractorOutput u;
    private TrackOutput v;
    private boolean w;

    public FragmentedMp4Extractor()
    {
        this(0);
    }

    private FragmentedMp4Extractor(int i1)
    {
        b = i1;
        f = new ParsableByteArray(16);
        c = new ParsableByteArray(NalUnitUtil.a);
        d = new ParsableByteArray(4);
        e = new ParsableByteArray(1);
        g = new byte[16];
        h = new Stack();
        i = new TrackFragment();
        a();
    }

    private static ChunkIndex a(ParsableByteArray parsablebytearray, long l1)
    {
        parsablebytearray.b(8);
        int i1 = Atom.a(parsablebytearray.j());
        parsablebytearray.c(4);
        long l7 = parsablebytearray.i();
        int ai[];
        long al[];
        long al1[];
        long al2[];
        int j1;
        long l2;
        long l4;
        long l5;
        if (i1 == 0)
        {
            long l3 = parsablebytearray.i();
            l2 = parsablebytearray.i() + l1;
            l1 = l3;
        } else
        {
            l2 = parsablebytearray.n();
            l4 = parsablebytearray.n() + l1;
            l1 = l2;
            l2 = l4;
        }
        parsablebytearray.c(2);
        j1 = parsablebytearray.g();
        ai = new int[j1];
        al = new long[j1];
        al1 = new long[j1];
        al2 = new long[j1];
        l5 = Util.a(l1, 0xf4240L, l7);
        i1 = 0;
        l4 = l1;
        l1 = l2;
        l2 = l5;
        for (; i1 < j1; i1++)
        {
            int k1 = parsablebytearray.j();
            if ((0x80000000 & k1) != 0)
            {
                throw new IllegalStateException("Unhandled indirect reference");
            }
            long l6 = parsablebytearray.i();
            ai[i1] = k1 & 0x7fffffff;
            al[i1] = l1;
            al2[i1] = l2;
            l4 += l6;
            l2 = Util.a(l4, 0xf4240L, l7);
            al1[i1] = l2 - al2[i1];
            parsablebytearray.c(4);
            l1 += ai[i1];
        }

        return new ChunkIndex(ai, al, al1, al2);
    }

    private static DefaultSampleValues a(DefaultSampleValues defaultsamplevalues, ParsableByteArray parsablebytearray)
    {
        parsablebytearray.b(8);
        int l1 = Atom.b(parsablebytearray.j());
        parsablebytearray.c(4);
        if ((l1 & 1) != 0)
        {
            parsablebytearray.c(8);
        }
        int i1;
        int j1;
        int k1;
        if ((l1 & 2) != 0)
        {
            i1 = parsablebytearray.m() - 1;
        } else
        {
            i1 = defaultsamplevalues.a;
        }
        if ((l1 & 8) != 0)
        {
            j1 = parsablebytearray.m();
        } else
        {
            j1 = defaultsamplevalues.b;
        }
        if ((l1 & 0x10) != 0)
        {
            k1 = parsablebytearray.m();
        } else
        {
            k1 = defaultsamplevalues.c;
        }
        if ((l1 & 0x20) != 0)
        {
            l1 = parsablebytearray.m();
        } else
        {
            l1 = defaultsamplevalues.d;
        }
        return new DefaultSampleValues(i1, j1, k1, l1);
    }

    private static DefaultSampleValues a(ParsableByteArray parsablebytearray)
    {
        parsablebytearray.b(16);
        return new DefaultSampleValues(parsablebytearray.m() - 1, parsablebytearray.m(), parsablebytearray.m(), parsablebytearray.j());
    }

    private void a()
    {
        j = 0;
        m = 0;
    }

    private void a(Atom.ContainerAtom containeratom)
    {
        if (containeratom.ag == Atom.s)
        {
            b(containeratom);
        } else
        {
            if (containeratom.ag == Atom.B)
            {
                c(containeratom);
                return;
            }
            if (!h.isEmpty())
            {
                ((Atom.ContainerAtom)h.peek()).a(containeratom);
                return;
            }
        }
    }

    private void a(Atom.LeafAtom leafatom, long l1)
    {
        if (!h.isEmpty())
        {
            ((Atom.ContainerAtom)h.peek()).a(leafatom);
        } else
        if (leafatom.ag == Atom.r)
        {
            leafatom = a(leafatom.ah, l1);
            u.a(leafatom);
            w = true;
            return;
        }
    }

    private static void a(Track track, DefaultSampleValues defaultsamplevalues, long l1, int i1, ParsableByteArray parsablebytearray, TrackFragment trackfragment)
    {
        parsablebytearray.b(8);
        int k1 = Atom.b(parsablebytearray.j());
        int l2 = parsablebytearray.m();
        if ((k1 & 1) != 0)
        {
            parsablebytearray.c(4);
        }
        int ai[];
        int ai1[];
        long al[];
        int j1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        int i2;
        long l3;
        if ((k1 & 4) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1 = defaultsamplevalues.d;
        if (flag)
        {
            j1 = parsablebytearray.m();
        }
        if ((k1 & 0x100) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((k1 & 0x200) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if ((k1 & 0x400) != 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if ((k1 & 0x800) != 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        trackfragment.a(l2);
        ai = trackfragment.c;
        ai1 = trackfragment.d;
        al = trackfragment.e;
        trackfragment = trackfragment.f;
        l3 = track.g;
        if (track.f == Track.a && (i1 & 1) == 1)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        i2 = 0;
        while (i2 < l2) 
        {
            int j2;
            int k2;
            byte byte0;
            if (flag1)
            {
                j2 = parsablebytearray.m();
            } else
            {
                j2 = defaultsamplevalues.b;
            }
            if (flag2)
            {
                k2 = parsablebytearray.m();
            } else
            {
                k2 = defaultsamplevalues.c;
            }
            if (i2 == 0 && flag)
            {
                i1 = j1;
            } else
            if (flag3)
            {
                i1 = parsablebytearray.j();
            } else
            {
                i1 = defaultsamplevalues.d;
            }
            if (flag4)
            {
                ai1[i2] = (int)((long)(parsablebytearray.j() * 1000) / l3);
            } else
            {
                ai1[i2] = 0;
            }
            al[i2] = (1000L * l1) / l3;
            ai[i2] = k2;
            if ((i1 >> 16 & 1) == 0 && (!flag5 || i2 == 0))
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            trackfragment[i2] = byte0;
            l1 += j2;
            i2++;
        }
    }

    private static void a(Track track, DefaultSampleValues defaultsamplevalues, Atom.ContainerAtom containeratom, TrackFragment trackfragment, int i1, byte abyte0[])
    {
        b(track, defaultsamplevalues, containeratom.e(Atom.C), trackfragment, i1, abyte0);
    }

    private static void a(TrackEncryptionBox trackencryptionbox, ParsableByteArray parsablebytearray, TrackFragment trackfragment)
    {
        boolean flag = true;
        int i2 = trackencryptionbox.b;
        parsablebytearray.b(8);
        if ((Atom.b(parsablebytearray.j()) & 1) == 1)
        {
            parsablebytearray.c(8);
        }
        int i1 = parsablebytearray.f();
        int l1 = parsablebytearray.m();
        if (l1 != trackfragment.b)
        {
            throw new IllegalStateException((new StringBuilder("Length mismatch: ")).append(l1).append(", ").append(trackfragment.b).toString());
        }
        int k1;
        if (i1 == 0)
        {
            trackencryptionbox = trackfragment.h;
            int j1 = 0;
            i1 = 0;
            do
            {
                k1 = i1;
                if (j1 >= l1)
                {
                    break;
                }
                k1 = parsablebytearray.f();
                if (k1 > i2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                trackencryptionbox[j1] = flag;
                j1++;
                i1 += k1;
            } while (true);
        } else
        {
            if (i1 <= i2)
            {
                flag = false;
            }
            k1 = i1 * l1 + 0;
            Arrays.fill(trackfragment.h, 0, l1, flag);
        }
        trackfragment.b(k1);
    }

    private static void a(ParsableByteArray parsablebytearray, int i1, TrackFragment trackfragment)
    {
        parsablebytearray.b(i1 + 8);
        i1 = Atom.b(parsablebytearray.j());
        if ((i1 & 1) != 0)
        {
            throw new IllegalStateException("Overriding TrackEncryptionBox parameters is unsupported");
        }
        boolean flag;
        if ((i1 & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = parsablebytearray.m();
        if (i1 != trackfragment.b)
        {
            throw new IllegalStateException((new StringBuilder("Length mismatch: ")).append(i1).append(", ").append(trackfragment.b).toString());
        } else
        {
            Arrays.fill(trackfragment.h, 0, i1, flag);
            trackfragment.b(parsablebytearray.b());
            trackfragment.a(parsablebytearray);
            return;
        }
    }

    private static void a(ParsableByteArray parsablebytearray, TrackFragment trackfragment)
    {
        a(parsablebytearray, 0, trackfragment);
    }

    private static void a(ParsableByteArray parsablebytearray, TrackFragment trackfragment, byte abyte0[])
    {
        parsablebytearray.b(8);
        parsablebytearray.a(abyte0, 0, 16);
        if (!Arrays.equals(abyte0, a))
        {
            return;
        } else
        {
            a(parsablebytearray, 16, trackfragment);
            return;
        }
    }

    private static boolean a(int i1)
    {
        return i1 == Atom.b || i1 == Atom.c || i1 == Atom.A || i1 == Atom.G || i1 == Atom.h || i1 == Atom.F || i1 == Atom.B || i1 == Atom.s || i1 == Atom.i || i1 == Atom.t || i1 == Atom.r || i1 == Atom.H || i1 == Atom.n || i1 == Atom.o || i1 == Atom.E || i1 == Atom.C || i1 == Atom.u || i1 == Atom.p || i1 == Atom.q || i1 == Atom.D || i1 == Atom.v || i1 == Atom.w || i1 == Atom.x || i1 == Atom.I || i1 == Atom.Q || i1 == Atom.R || i1 == Atom.S || i1 == Atom.T || i1 == Atom.f;
    }

    private static long b(ParsableByteArray parsablebytearray)
    {
        parsablebytearray.b(8);
        if (Atom.a(parsablebytearray.j()) == 1)
        {
            return parsablebytearray.n();
        } else
        {
            return parsablebytearray.i();
        }
    }

    private void b(Atom.ContainerAtom containeratom)
    {
        List list = containeratom.ai;
        int j1 = list.size();
        byte abyte0[] = null;
        for (int i1 = 0; i1 < j1;)
        {
            Atom.LeafAtom leafatom = (Atom.LeafAtom)list.get(i1);
            Object obj = abyte0;
            if (leafatom.ag == Atom.I)
            {
                obj = abyte0;
                if (abyte0 == null)
                {
                    obj = new com.google.android.exoplayer.drm.DrmInitData.Mapped("video/mp4");
                }
                abyte0 = leafatom.ah.a;
                ((com.google.android.exoplayer.drm.DrmInitData.Mapped) (obj)).a(PsshAtomUtil.a(abyte0), abyte0);
            }
            i1++;
            abyte0 = ((byte []) (obj));
        }

        if (abyte0 != null)
        {
            u.a(abyte0);
        }
        t = a(containeratom.e(Atom.D).d(Atom.p).ah);
        s = AtomParsers.a(containeratom.e(Atom.u), containeratom.d(Atom.t));
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        v.a(s.i);
    }

    private static void b(Track track, DefaultSampleValues defaultsamplevalues, Atom.ContainerAtom containeratom, TrackFragment trackfragment, int i1, byte abyte0[])
    {
        Atom.LeafAtom leafatom;
        int j1;
        long l1;
        if (containeratom.d(Atom.n) == null)
        {
            l1 = 0L;
        } else
        {
            l1 = b(containeratom.d(Atom.n).ah);
        }
        defaultsamplevalues = a(defaultsamplevalues, containeratom.d(Atom.o).ah);
        trackfragment.a = defaultsamplevalues.a;
        a(track, defaultsamplevalues, l1, i1, containeratom.d(Atom.q).ah, trackfragment);
        leafatom = containeratom.d(Atom.Q);
        if (leafatom != null)
        {
            a(track.j[defaultsamplevalues.a], leafatom.ah, trackfragment);
        }
        track = containeratom.d(Atom.S);
        if (track != null)
        {
            a(((Atom.LeafAtom) (track)).ah, trackfragment);
        }
        j1 = containeratom.ai.size();
        for (i1 = 0; i1 < j1; i1++)
        {
            track = (Atom.LeafAtom)containeratom.ai.get(i1);
            if (((Atom.LeafAtom) (track)).ag == Atom.R)
            {
                a(((Atom.LeafAtom) (track)).ah, trackfragment, abyte0);
            }
        }

    }

    private static boolean b(int i1)
    {
        return i1 == Atom.s || i1 == Atom.u || i1 == Atom.v || i1 == Atom.w || i1 == Atom.x || i1 == Atom.y || i1 == Atom.B || i1 == Atom.C || i1 == Atom.D;
    }

    private boolean b(ExtractorInput extractorinput)
    {
        boolean flag = false;
        if (m == 0)
        {
            if (!extractorinput.a(f.a, 0, 8, true))
            {
                return false;
            }
            m = 8;
            f.b(0);
            l = f.i();
            k = f.j();
        }
        if (l == 1L)
        {
            extractorinput.b(f.a, 8, 8);
            m = m + 8;
            l = f.n();
        }
        if (k == Atom.h)
        {
            if (!w)
            {
                u.a(SeekMap.f);
                w = true;
            }
            if (i.k)
            {
                j = 2;
                return true;
            } else
            {
                j = 3;
                return true;
            }
        }
        if (a(k))
        {
            if (b(k))
            {
                long l1 = extractorinput.b();
                long l2 = l;
                h.add(new Atom.ContainerAtom(k, (l1 + l2) - 8L));
                a();
                return true;
            }
            if (m == 8)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Assertions.b(flag);
            if (l <= 0x7fffffffL)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Assertions.b(flag);
            n = new ParsableByteArray((int)l);
            System.arraycopy(f.a, 0, n.a, 0, 8);
            j = 1;
            return true;
        }
        if (l <= 0x7fffffffL)
        {
            flag = true;
        }
        Assertions.b(flag);
        n = null;
        j = 1;
        return true;
    }

    private int c(ParsableByteArray parsablebytearray)
    {
        int j1 = s.j[i.a].b;
        boolean flag = i.h[o];
        byte abyte0[] = e.a;
        char c1;
        if (flag)
        {
            c1 = '\200';
        } else
        {
            c1 = '\0';
        }
        abyte0[0] = (byte)(c1 | j1);
        e.b(0);
        v.a(e, 1);
        v.a(parsablebytearray, j1);
        if (!flag)
        {
            return j1 + 1;
        } else
        {
            int i1 = parsablebytearray.g();
            parsablebytearray.c(-2);
            i1 = i1 * 6 + 2;
            v.a(parsablebytearray, i1);
            return i1 + (j1 + 1);
        }
    }

    private void c(ExtractorInput extractorinput)
    {
        int i1 = (int)l - m;
        long l1;
        if (n != null)
        {
            extractorinput.b(n.a, 8, i1);
            a(new Atom.LeafAtom(k, n), extractorinput.b());
        } else
        {
            extractorinput.a(i1);
        }
        for (l1 = extractorinput.b(); !h.isEmpty() && ((Atom.ContainerAtom)h.peek()).ah == l1; a((Atom.ContainerAtom)h.pop())) { }
        a();
    }

    private void c(Atom.ContainerAtom containeratom)
    {
        i.a();
        a(s, t, containeratom, i, b, g);
        o = 0;
    }

    private void d(ExtractorInput extractorinput)
    {
        i.a(extractorinput);
        j = 3;
    }

    private boolean e(ExtractorInput extractorinput)
    {
        byte byte0 = 2;
        if (o >= i.b)
        {
            a();
            return false;
        }
        if (j == 3)
        {
            p = i.c[o];
            byte abyte0[];
            int i1;
            int j1;
            if (i.g)
            {
                q = c(i.j);
                p = p + q;
            } else
            {
                q = 0;
            }
            r = 0;
            j = 4;
        }
        if (s.k != -1)
        {
            abyte0 = d.a;
            abyte0[0] = 0;
            abyte0[1] = 0;
            abyte0[2] = 0;
            i1 = s.k;
            j1 = 4 - s.k;
            while (q < p) 
            {
                if (r == 0)
                {
                    extractorinput.b(d.a, j1, i1);
                    d.b(0);
                    r = d.m();
                    c.b(0);
                    v.a(c, 4);
                    q = q + 4;
                    p = p + j1;
                } else
                {
                    int k1 = v.a(extractorinput, r, false);
                    q = q + k1;
                    r = r - k1;
                }
            }
        } else
        {
            for (; q < p; q = v.a(extractorinput, p - q, false) + q) { }
        }
        long l1 = i.c(o);
        boolean flag;
        if (!i.g)
        {
            byte0 = 0;
        }
        if (i.f[o])
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i.g)
        {
            extractorinput = s.j[i.a].c;
        } else
        {
            extractorinput = null;
        }
        v.a(l1 * 1000L, byte0 | flag, p, 0, extractorinput);
        o = o + 1;
        j = 3;
        return true;
    }

    public final int a(ExtractorInput extractorinput, PositionHolder positionholder)
    {
        do
        {
            switch (j)
            {
            default:
                if (e(extractorinput))
                {
                    return 0;
                }
                break;

            case 0: // '\0'
                if (!b(extractorinput))
                {
                    return -1;
                }
                break;

            case 1: // '\001'
                c(extractorinput);
                break;

            case 2: // '\002'
                d(extractorinput);
                break;
            }
        } while (true);
    }

    public final void a(ExtractorOutput extractoroutput)
    {
        u = extractoroutput;
        v = extractoroutput.a_(0);
        u.a();
    }

    public final boolean a(ExtractorInput extractorinput)
    {
        return Sniffer.a(extractorinput);
    }

    public final void b()
    {
        h.clear();
        a();
    }

}
