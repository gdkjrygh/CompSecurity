// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.mp4;

import android.util.Pair;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.util.Ac3Util;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.CodecSpecificDataUtil;
import com.google.android.exoplayer.util.NalUnitUtil;
import com.google.android.exoplayer.util.ParsableByteArray;
import com.google.android.exoplayer.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//            Atom, Track, TrackSampleTable, TrackEncryptionBox

final class AtomParsers
{

    private AtomParsers()
    {
    }

    private static long a(ParsableByteArray parsablebytearray)
    {
        byte byte0 = 8;
        parsablebytearray.b(8);
        if (Atom.a(parsablebytearray.j()) != 0)
        {
            byte0 = 16;
        }
        parsablebytearray.c(byte0);
        return parsablebytearray.i();
    }

    private static Pair a(ParsableByteArray parsablebytearray, int i)
    {
        boolean flag = false;
        parsablebytearray.b(i + 8 + 4);
        int j = (parsablebytearray.f() & 3) + 1;
        if (j == 3)
        {
            throw new IllegalStateException();
        }
        ArrayList arraylist = new ArrayList();
        int k = parsablebytearray.f();
        for (i = 0; i < (k & 0x1f); i++)
        {
            arraylist.add(NalUnitUtil.a(parsablebytearray));
        }

        k = parsablebytearray.f();
        for (i = ((flag) ? 1 : 0); i < k; i++)
        {
            arraylist.add(NalUnitUtil.a(parsablebytearray));
        }

        return Pair.create(arraylist, Integer.valueOf(j));
    }

    private static StsdDataHolder a(ParsableByteArray parsablebytearray, long l)
    {
        parsablebytearray.b(12);
        int j = parsablebytearray.j();
        StsdDataHolder stsddataholder = new StsdDataHolder(j);
        int i = 0;
        while (i < j) 
        {
            int k = parsablebytearray.d();
            int i1 = parsablebytearray.j();
            int j1;
            boolean flag;
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Assertions.a(flag, "childAtomSize should be positive");
            j1 = parsablebytearray.j();
            if (j1 == Atom.b || j1 == Atom.c || j1 == Atom.N || j1 == Atom.X || j1 == Atom.d || j1 == Atom.e || j1 == Atom.f)
            {
                a(parsablebytearray, k, i1, l, stsddataholder, i);
            } else
            if (j1 == Atom.i || j1 == Atom.O || j1 == Atom.j)
            {
                a(parsablebytearray, j1, k, i1, l, stsddataholder, i);
            } else
            if (j1 == Atom.U)
            {
                stsddataholder.b = MediaFormat.a("application/ttml+xml", l);
            } else
            if (j1 == Atom.af)
            {
                stsddataholder.b = MediaFormat.a("application/x-quicktime-tx3g", l);
            }
            parsablebytearray.b(k + i1);
            i++;
        }
        return stsddataholder;
    }

    public static Track a(Atom.ContainerAtom containeratom, Atom.LeafAtom leafatom)
    {
        long l = -1L;
        Atom.ContainerAtom containeratom1 = containeratom.e(Atom.v);
        int i = c(containeratom1.d(Atom.G).ah);
        if (i != Track.b && i != Track.a && i != Track.c && i != Track.d)
        {
            return null;
        }
        containeratom = b(containeratom.d(Atom.E).ah);
        int j = ((Integer)((Pair) (containeratom)).first).intValue();
        long l1 = ((Long)((Pair) (containeratom)).second).longValue();
        long l2 = a(leafatom.ah);
        if (l1 != -1L)
        {
            l = Util.a(l1, 0xf4240L, l2);
        }
        containeratom = containeratom1.e(Atom.w).e(Atom.x);
        l1 = d(containeratom1.d(Atom.F).ah);
        containeratom = a(containeratom.d(Atom.H).ah, l);
        if (((StsdDataHolder) (containeratom)).b == null)
        {
            return null;
        } else
        {
            return new Track(j, i, l1, l, ((StsdDataHolder) (containeratom)).b, ((StsdDataHolder) (containeratom)).a, ((StsdDataHolder) (containeratom)).c);
        }
    }

    private static TrackEncryptionBox a(ParsableByteArray parsablebytearray, int i, int j)
    {
        int k = i + 8;
        TrackEncryptionBox trackencryptionbox = null;
        while (k - i < j) 
        {
            parsablebytearray.b(k);
            int l = parsablebytearray.j();
            int i1 = parsablebytearray.j();
            if (i1 == Atom.P)
            {
                parsablebytearray.j();
            } else
            if (i1 == Atom.K)
            {
                parsablebytearray.c(4);
                parsablebytearray.j();
                parsablebytearray.j();
            } else
            if (i1 == Atom.L)
            {
                trackencryptionbox = b(parsablebytearray, k, l);
            }
            k += l;
        }
        return trackencryptionbox;
    }

    public static TrackSampleTable a(Track track, Atom.ContainerAtom containeratom)
    {
        ParsableByteArray parsablebytearray = containeratom.d(Atom.ac).ah;
        Object obj = containeratom.d(Atom.ad);
        Atom.LeafAtom leafatom = ((Atom.LeafAtom) (obj));
        if (obj == null)
        {
            leafatom = containeratom.d(Atom.ae);
        }
        ParsableByteArray parsablebytearray1 = leafatom.ah;
        ParsableByteArray parsablebytearray2 = containeratom.d(Atom.ab).ah;
        ParsableByteArray parsablebytearray3 = containeratom.d(Atom.Y).ah;
        obj = containeratom.d(Atom.Z);
        long al[];
        int ai[];
        long al1[];
        int ai1[];
        int i5;
        int j5;
        if (obj != null)
        {
            obj = ((Atom.LeafAtom) (obj)).ah;
        } else
        {
            obj = null;
        }
        containeratom = containeratom.d(Atom.aa);
        if (containeratom != null)
        {
            containeratom = ((Atom.LeafAtom) (containeratom)).ah;
        } else
        {
            containeratom = null;
        }
        parsablebytearray.b(12);
        i5 = parsablebytearray.m();
        j5 = parsablebytearray.m();
        al = new long[j5];
        ai = new int[j5];
        al1 = new long[j5];
        ai1 = new int[j5];
        if (j5 == 0)
        {
            return new TrackSampleTable(al, ai, al1, ai1);
        }
        parsablebytearray1.b(12);
        int k5 = parsablebytearray1.m();
        parsablebytearray2.b(12);
        int i2 = parsablebytearray2.m() - 1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        boolean flag;
        long l5;
        long l6;
        boolean flag1;
        if (parsablebytearray2.j() == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assertions.b(flag1, "stsc first chunk must be 1");
        l1 = parsablebytearray2.m();
        parsablebytearray2.c(4);
        k = -1;
        if (i2 > 0)
        {
            k = parsablebytearray2.m() - 1;
        }
        parsablebytearray3.b(12);
        j2 = parsablebytearray3.m();
        l2 = parsablebytearray3.m();
        k2 = parsablebytearray3.m();
        i = 0;
        j = 0;
        l = 0;
        if (containeratom != null)
        {
            containeratom.b(12);
            j = containeratom.m() - 1;
            i = containeratom.m();
            l = containeratom.j();
        }
        i1 = -1;
        j1 = 0;
        if (obj != null)
        {
            ((ParsableByteArray) (obj)).b(12);
            j1 = ((ParsableByteArray) (obj)).m();
            i1 = ((ParsableByteArray) (obj)).m() - 1;
        }
        if (leafatom.ag == Atom.ad)
        {
            l5 = parsablebytearray1.i();
        } else
        {
            l5 = parsablebytearray1.n();
        }
        l6 = 0L;
        i3 = l1;
        k1 = j1;
        j1 = l1;
        j3 = 0;
        j2--;
        flag = false;
        k3 = l;
        l = j;
        j = i1;
        i1 = k1;
        l1 = i;
        k1 = l;
        i = i2;
        l = j1;
        i2 = ((flag) ? 1 : 0);
        j1 = k3;
        while (j3 < j5) 
        {
            al[j3] = l5;
            int l3;
            if (i5 == 0)
            {
                l3 = parsablebytearray.m();
            } else
            {
                l3 = i5;
            }
            ai[j3] = l3;
            al1[j3] = (long)j1 + l6;
            if (obj == null)
            {
                l3 = 1;
            } else
            {
                l3 = 0;
            }
            ai1[j3] = l3;
            if (j3 == j)
            {
                ai1[j3] = 1;
                i1--;
                if (i1 > 0)
                {
                    j = ((ParsableByteArray) (obj)).m();
                    j--;
                }
            }
            l6 += k2;
            l2--;
            if (l2 == 0 && j2 > 0)
            {
                l2 = parsablebytearray3.m();
                k2 = parsablebytearray3.m();
                j2--;
            }
            if (containeratom != null)
            {
                l1--;
                if (l1 == 0 && k1 > 0)
                {
                    l1 = containeratom.m();
                    j1 = containeratom.j();
                    k1--;
                }
            }
            l3 = i3 - 1;
            if (l3 == 0)
            {
                i2++;
                if (i2 < k5)
                {
                    if (leafatom.ag == Atom.ad)
                    {
                        l5 = parsablebytearray1.i();
                    } else
                    {
                        l5 = parsablebytearray1.n();
                    }
                }
                int j4;
                int l4;
                if (i2 == k)
                {
                    l = parsablebytearray2.m();
                    parsablebytearray2.c(4);
                    int i4 = i - 1;
                    i = l;
                    i3 = i4;
                    if (i4 > 0)
                    {
                        k = parsablebytearray2.m() - 1;
                        i3 = i4;
                        i = l;
                    }
                } else
                {
                    i3 = i;
                    i = l;
                }
                if (i2 < k5)
                {
                    l3 = i2;
                    i2 = i;
                    l = k;
                    k = l3;
                } else
                {
                    l = k;
                    int k4 = i;
                    i = l3;
                    k = i2;
                    i2 = k4;
                }
            } else
            {
                l5 += ai[j3];
                i3 = k;
                j4 = l;
                l4 = i;
                i = l3;
                k = i2;
                l = i3;
                i2 = j4;
                i3 = l4;
            }
            j3++;
            l3 = i;
            i = i3;
            i3 = i2;
            i2 = k;
            k = l;
            l = i3;
            i3 = l3;
        }
        Util.a(al1, 0xf4240L, track.g);
        if (i1 == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assertions.a(flag1);
        if (l2 == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assertions.a(flag1);
        if (i3 == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assertions.a(flag1);
        if (j2 == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assertions.a(flag1);
        if (k1 == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assertions.a(flag1);
        return new TrackSampleTable(al, ai, al1, ai1);
    }

    private static void a(ParsableByteArray parsablebytearray, int i, int j, int k, long l, StsdDataHolder stsddataholder, int i1)
    {
        Object obj;
        int j1;
        int k1;
        int k2;
        parsablebytearray.b(j + 8);
        parsablebytearray.c(16);
        k1 = parsablebytearray.g();
        k2 = parsablebytearray.g();
        parsablebytearray.c(4);
        j1 = parsablebytearray.l();
        obj = null;
        if (i != Atom.j) goto _L2; else goto _L1
_L1:
        obj = "audio/ac3";
_L16:
        byte abyte0[];
        int l1;
        abyte0 = null;
        l1 = parsablebytearray.d();
_L7:
        if (l1 - j >= k) goto _L4; else goto _L3
_L3:
        byte abyte1[];
        Object obj1;
        int i2;
        int j2;
        int l2;
        int i3;
        int j3;
        parsablebytearray.b(l1);
        i3 = parsablebytearray.d();
        l2 = parsablebytearray.j();
        boolean flag;
        if (l2 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.a(flag, "childAtomSize should be positive");
        j3 = parsablebytearray.j();
        if (i != Atom.i && i != Atom.O) goto _L6; else goto _L5
_L5:
        if (j3 == Atom.A)
        {
            obj = d(parsablebytearray, i3);
            obj1 = (String)((Pair) (obj)).first;
            abyte1 = (byte[])((Pair) (obj)).second;
            if ("audio/mp4a-latm".equals(obj1))
            {
                obj = CodecSpecificDataUtil.a(abyte1);
                j1 = ((Integer)((Pair) (obj)).first).intValue();
                k1 = ((Integer)((Pair) (obj)).second).intValue();
            }
            i2 = j1;
            j2 = k1;
        } else
        {
            obj1 = obj;
            abyte1 = abyte0;
            j2 = k1;
            i2 = j1;
            if (j3 == Atom.J)
            {
                stsddataholder.a[i1] = a(parsablebytearray, i3, l2);
                obj1 = obj;
                abyte1 = abyte0;
                j2 = k1;
                i2 = j1;
            }
        }
_L11:
        l1 += l2;
        obj = obj1;
        abyte0 = abyte1;
        k1 = j2;
        j1 = i2;
          goto _L7
_L2:
        if (i == Atom.l)
        {
            obj = "audio/eac3";
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (i != Atom.j || j3 != Atom.k) goto _L9; else goto _L8
_L8:
        parsablebytearray.b(i3 + 8);
        stsddataholder.b = Ac3Util.a(parsablebytearray);
_L14:
        return;
_L9:
        obj1 = obj;
        abyte1 = abyte0;
        j2 = k1;
        i2 = j1;
        if (i != Atom.l) goto _L11; else goto _L10
_L10:
        obj1 = obj;
        abyte1 = abyte0;
        j2 = k1;
        i2 = j1;
        if (j3 != Atom.m) goto _L11; else goto _L12
_L12:
        parsablebytearray.b(i3 + 8);
        stsddataholder.b = Ac3Util.b(parsablebytearray);
        return;
_L4:
        if (obj == null) goto _L14; else goto _L13
_L13:
        if (abyte0 == null)
        {
            parsablebytearray = null;
        } else
        {
            parsablebytearray = Collections.singletonList(abyte0);
        }
        stsddataholder.b = MediaFormat.b(((String) (obj)), k2, l, k1, j1, parsablebytearray);
        return;
        if (true) goto _L16; else goto _L15
_L15:
    }

    private static void a(ParsableByteArray parsablebytearray, int i, int j, long l, StsdDataHolder stsddataholder, int k)
    {
        parsablebytearray.b(i + 8);
        parsablebytearray.c(24);
        int j1 = parsablebytearray.g();
        int k1 = parsablebytearray.g();
        float f = 1.0F;
        parsablebytearray.c(50);
        List list = null;
        int i1 = parsablebytearray.d();
        String s = null;
        do
        {
            if (i1 - i >= j)
            {
                break;
            }
            parsablebytearray.b(i1);
            int l1 = parsablebytearray.d();
            int i2 = parsablebytearray.j();
            if (i2 == 0 && parsablebytearray.d() - i == j)
            {
                break;
            }
            Object obj;
            Object obj1;
            int j2;
            boolean flag;
            if (i2 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Assertions.a(flag, "childAtomSize should be positive");
            j2 = parsablebytearray.j();
            if (j2 == Atom.y)
            {
                if (s == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Assertions.b(flag);
                obj = a(parsablebytearray, l1);
                obj1 = (List)((Pair) (obj)).first;
                stsddataholder.c = ((Integer)((Pair) (obj)).second).intValue();
                obj = "video/avc";
            } else
            if (j2 == Atom.z)
            {
                boolean flag1;
                if (s == null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                Assertions.b(flag1);
                obj = b(parsablebytearray, l1);
                obj1 = (List)((Pair) (obj)).first;
                stsddataholder.c = ((Integer)((Pair) (obj)).second).intValue();
                obj = "video/hevc";
            } else
            if (j2 == Atom.g)
            {
                boolean flag2;
                if (s == null)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                Assertions.b(flag2);
                obj = "video/3gpp";
                obj1 = list;
            } else
            if (j2 == Atom.A)
            {
                boolean flag3;
                if (s == null)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                Assertions.b(flag3);
                obj1 = d(parsablebytearray, l1);
                obj = (String)((Pair) (obj1)).first;
                obj1 = Collections.singletonList(((Pair) (obj1)).second);
            } else
            if (j2 == Atom.J)
            {
                stsddataholder.a[k] = a(parsablebytearray, l1, i2);
                obj = s;
                obj1 = list;
            } else
            {
                obj = s;
                obj1 = list;
                if (j2 == Atom.T)
                {
                    f = c(parsablebytearray, l1);
                    obj = s;
                    obj1 = list;
                }
            }
            i1 += i2;
            s = ((String) (obj));
            list = ((List) (obj1));
        } while (true);
        if (s == null)
        {
            return;
        } else
        {
            stsddataholder.b = MediaFormat.a(s, -1, l, j1, k1, f, list);
            return;
        }
    }

    private static Pair b(ParsableByteArray parsablebytearray)
    {
        int i = 8;
        parsablebytearray.b(8);
        int j = Atom.a(parsablebytearray.j());
        byte byte0;
        boolean flag1;
        int k;
        int l;
        if (j == 0)
        {
            byte0 = 8;
        } else
        {
            byte0 = 16;
        }
        parsablebytearray.c(byte0);
        k = parsablebytearray.j();
        parsablebytearray.c(4);
        flag1 = true;
        l = parsablebytearray.d();
        byte0 = i;
        if (j == 0)
        {
            byte0 = 4;
        }
        i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < byte0)
                {
                    if (parsablebytearray.a[l + i] == -1)
                    {
                        break label0;
                    }
                    flag = false;
                }
                long l1;
                if (flag)
                {
                    parsablebytearray.c(byte0);
                    l1 = -1L;
                } else
                if (j == 0)
                {
                    l1 = parsablebytearray.i();
                } else
                {
                    l1 = parsablebytearray.n();
                }
                return Pair.create(Integer.valueOf(k), Long.valueOf(l1));
            }
            i++;
        } while (true);
    }

    private static Pair b(ParsableByteArray parsablebytearray, int i)
    {
        parsablebytearray.b(i + 8 + 21);
        int k1 = parsablebytearray.f();
        int l1 = parsablebytearray.f();
        int i1 = parsablebytearray.d();
        int j = 0;
        i = 0;
        for (; j < l1; j++)
        {
            parsablebytearray.c(1);
            int i2 = parsablebytearray.g();
            for (int k = 0; k < i2; k++)
            {
                int k2 = parsablebytearray.g();
                i += k2 + 4;
                parsablebytearray.c(k2);
            }

        }

        parsablebytearray.b(i1);
        byte abyte0[] = new byte[i];
        int l = 0;
        j = 0;
        for (; l < l1; l++)
        {
            parsablebytearray.c(1);
            int j2 = parsablebytearray.g();
            for (int j1 = 0; j1 < j2; j1++)
            {
                int l2 = parsablebytearray.g();
                System.arraycopy(NalUnitUtil.a, 0, abyte0, j, NalUnitUtil.a.length);
                j += NalUnitUtil.a.length;
                System.arraycopy(parsablebytearray.a, parsablebytearray.d(), abyte0, j, l2);
                j += l2;
                parsablebytearray.c(l2);
            }

        }

        if (i == 0)
        {
            parsablebytearray = null;
        } else
        {
            parsablebytearray = Collections.singletonList(abyte0);
        }
        return Pair.create(parsablebytearray, Integer.valueOf((k1 & 3) + 1));
    }

    private static TrackEncryptionBox b(ParsableByteArray parsablebytearray, int i, int j)
    {
        boolean flag = true;
        int l;
        for (int k = i + 8; k - i < j; k += l)
        {
            parsablebytearray.b(k);
            l = parsablebytearray.j();
            if (parsablebytearray.j() == Atom.M)
            {
                parsablebytearray.c(4);
                i = parsablebytearray.j();
                byte abyte0[];
                if (i >> 8 != 1)
                {
                    flag = false;
                }
                abyte0 = new byte[16];
                parsablebytearray.a(abyte0, 0, 16);
                return new TrackEncryptionBox(flag, i & 0xff, abyte0);
            }
        }

        return null;
    }

    private static float c(ParsableByteArray parsablebytearray, int i)
    {
        parsablebytearray.b(i + 8);
        i = parsablebytearray.m();
        int j = parsablebytearray.m();
        return (float)i / (float)j;
    }

    private static int c(ParsableByteArray parsablebytearray)
    {
        parsablebytearray.b(16);
        return parsablebytearray.j();
    }

    private static long d(ParsableByteArray parsablebytearray)
    {
        byte byte0 = 8;
        parsablebytearray.b(8);
        if (Atom.a(parsablebytearray.j()) != 0)
        {
            byte0 = 16;
        }
        parsablebytearray.c(byte0);
        return parsablebytearray.i();
    }

    private static Pair d(ParsableByteArray parsablebytearray, int i)
    {
        String s;
        s = null;
        parsablebytearray.b(i + 8 + 4);
        parsablebytearray.c(1);
        for (i = parsablebytearray.f(); i > 127; i = parsablebytearray.f()) { }
        parsablebytearray.c(2);
        i = parsablebytearray.f();
        if ((i & 0x80) != 0)
        {
            parsablebytearray.c(2);
        }
        if ((i & 0x40) != 0)
        {
            parsablebytearray.c(parsablebytearray.g());
        }
        if ((i & 0x20) != 0)
        {
            parsablebytearray.c(2);
        }
        parsablebytearray.c(1);
        for (i = parsablebytearray.f(); i > 127; i = parsablebytearray.f()) { }
        parsablebytearray.f();
        JVM INSTR lookupswitch 7: default 180
    //                   32: 238
    //                   33: 245
    //                   35: 252
    //                   64: 259
    //                   107: 230
    //                   165: 266
    //                   166: 273;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        parsablebytearray.c(12);
        parsablebytearray.c(1);
        int j = parsablebytearray.f();
        for (i = j & 0x7f; j > 127; i = i << 8 | j & 0x7f)
        {
            j = parsablebytearray.f();
        }

        break; /* Loop/switch isn't completed */
_L6:
        return Pair.create("audio/mpeg", null);
_L2:
        s = "video/mp4v-es";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "video/avc";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "video/hevc";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "audio/mp4a-latm";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "audio/ac3";
        continue; /* Loop/switch isn't completed */
_L8:
        s = "audio/eac3";
        if (true) goto _L1; else goto _L9
_L9:
        byte abyte0[] = new byte[i];
        parsablebytearray.a(abyte0, 0, i);
        return Pair.create(s, abyte0);
    }

    private class StsdDataHolder
    {

        public final TrackEncryptionBox a[];
        public MediaFormat b;
        public int c;

        public StsdDataHolder(int i)
        {
            a = new TrackEncryptionBox[i];
            c = -1;
        }
    }

}
