// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ad.a;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.bq.i;
import com.google.android.m4b.maps.bs.b;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.bs.g;
import com.google.android.m4b.maps.bw.d;
import com.google.android.m4b.maps.bw.f;
import java.io.DataInput;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            ba, ac, am, x, 
//            v, ae, bb, ao, 
//            o, az, t, k, 
//            w, bk, d, p, 
//            ak, au, av, bo, 
//            l, a, g, h, 
//            bm, ai, bn, ah

public class ap
    implements ba
{
    public static final class a
    {

        public ac a;
        int b;
        int c;
        public bb d[];
        public long e;
        String f[];
        String g[];
        int h;
        ah i;
        long j;
        private final e k;

        public final ap a()
        {
            ac ac1 = a;
            int i1 = b;
            int j1 = c;
            String as[];
            String as1[];
            bb abb[];
            int k1;
            if (f == null)
            {
                as = new String[0];
            } else
            {
                as = f;
            }
            if (g == null)
            {
                as1 = new String[0];
            } else
            {
                as1 = g;
            }
            k1 = h;
            if (d == null)
            {
                abb = new bb[0];
            } else
            {
                abb = d;
            }
            return new ap(ac1, i1, (byte)0, j1, as, as1, k1, abb, i, null, e, j, k);
        }

        public a(e e1)
        {
            c = -1;
            e = -1L;
            h = -1;
            i = com.google.android.m4b.maps.bo.ah.a;
            j = -1L;
            k = e1;
        }
    }

    public static interface b
        extends Iterator
    {

        public abstract bb a();

        public abstract void b();

        public abstract void c();
    }

    final class c
        implements b
    {

        private int a;
        private int b;
        private ap c;

        public final bb a()
        {
            return c.f[a];
        }

        public final void b()
        {
            b = a;
        }

        public final void c()
        {
            a = b;
        }

        public final boolean hasNext()
        {
            return a < c.f.length;
        }

        public final Object next()
        {
            bb abb[] = c.f;
            int i1 = a;
            a = i1 + 1;
            return abb[i1];
        }

        public final void remove()
        {
            throw new UnsupportedOperationException("remove() not supported");
        }

        private c()
        {
            c = ap.this;
            super();
            a = 0;
            b = 0;
        }

        c(byte byte0)
        {
            this();
        }
    }


    private final long a;
    private final String b[];
    public final ac c;
    final int d;
    final byte e;
    final bb f[];
    public final int g;
    public final ah h;
    final ao i[];
    public final int j;
    long k;
    private final String l[] = new String[0];
    private final String m[];
    private final e n;

    protected ap(ac ac1, int i1, byte byte0, int j1, String as[], String as1[], int k1, 
            bb abb[], ah ah, ao aao[], long l1, long l2, 
            e e1)
    {
        c = ac1;
        d = i1;
        e = byte0;
        b = as;
        m = as1;
        g = k1;
        f = abb;
        h = ah;
        i = aao;
        j = j1;
        a = l1;
        k = l2;
        n = e1;
    }

    private static long a(e e1)
    {
        if (e1.a != null && e1.a.a && e1.c != null)
        {
            e1 = e1.c;
            return TimeUnit.MINUTES.toMillis(((g) (e1)).a);
        } else
        {
            return -1L;
        }
    }

    private static ap a(ac ac1, DataInput datainput, int i1, byte byte0, int j1, int k1, ah ah, long l1, long l2, e e1)
    {
        String as1[];
        String as2[];
        x x1;
        int i2;
        a(datainput);
        ac ac2 = com.google.android.m4b.maps.bo.ac.a(datainput);
        if (ac2.b != ac1.b || ac2.c != ac1.c || ac2.a != ac1.a)
        {
            ac1 = String.valueOf(ac1);
            datainput = String.valueOf(ac2);
            throw new IOException((new StringBuilder(String.valueOf(ac1).length() + 36 + String.valueOf(datainput).length())).append("Expected tile coords: ").append(ac1).append(" but received ").append(datainput).toString());
        }
        int j2 = datainput.readUnsignedByte();
        i2 = j2;
        if (j2 > 0)
        {
            i2 = j2 + 2000;
        }
        int j4 = com.google.android.m4b.maps.bo.am.a(datainput);
        as1 = new String[j4];
        for (int k2 = 0; k2 < j4; k2++)
        {
            as1[k2] = datainput.readUTF().intern();
        }

        j4 = com.google.android.m4b.maps.bo.am.a(datainput);
        as2 = new String[j4];
        for (int i3 = 0; i3 < j4; i3++)
        {
            as2[i3] = datainput.readUTF().intern();
        }

        if (i1 == 11)
        {
            int k4 = com.google.android.m4b.maps.bo.am.a(datainput);
            for (int j3 = 0; j3 < k4; j3++)
            {
                datainput.readUTF();
            }

        }
        x1 = com.google.android.m4b.maps.bo.x.a(datainput, i1);
        if (i1 != 11) goto _L2; else goto _L1
_L1:
        Object obj;
        Object aobj[];
        aobj = new String[0];
        obj = com.google.android.m4b.maps.bo.v.a(datainput, x1);
_L4:
        obj = new ae(i1, ac1, x1, ((String []) (aobj)), ((v) (obj)));
        int k3 = com.google.android.m4b.maps.bo.am.a(datainput);
        aobj = new bb[k3];
        for (i1 = 0; i1 < k3; i1++)
        {
            aobj[i1] = a(datainput, ((ae) (obj)));
        }

        break MISSING_BLOCK_LABEL_405;
_L2:
        Object obj1 = null;
        int l4 = com.google.android.m4b.maps.bo.am.a(datainput);
        String as[] = new String[l4];
        int l3 = 0;
        do
        {
            aobj = as;
            obj = obj1;
            if (l3 >= l4)
            {
                break;
            }
            as[l3] = datainput.readUTF().intern();
            l3++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        int i4 = com.google.android.m4b.maps.bo.am.a(datainput);
        ao aao[] = new ao[i4];
        for (i1 = 0; i1 < i4; i1++)
        {
            aao[i1] = com.google.android.m4b.maps.bo.ao.a(datainput, ((ae) (obj)));
        }

        return new ap(ac1, j1, byte0, k1, as1, as2, i2, ((bb []) (aobj)), ah, aao, l1, l2, e1);
    }

    public static ap a(ac ac1, byte abyte0[], int i1, ah ah, long l1, long l2, 
            e e1)
    {
        Object obj = new com.google.android.m4b.maps.ad.a(abyte0);
        ((com.google.android.m4b.maps.ad.a) (obj)).skipBytes(i1);
        int j1 = ((com.google.android.m4b.maps.ad.a) (obj)).readInt();
        int k1 = ((com.google.android.m4b.maps.ad.a) (obj)).readInt();
        a(((DataInput) (obj)));
        int i2 = ((com.google.android.m4b.maps.ad.a) (obj)).readUnsignedShort();
        if (i2 != 10 && i2 != 11)
        {
            ac1 = String.valueOf("Version mismatch: 10 or 11 expected, ");
            throw new IOException((new StringBuilder(String.valueOf(ac1).length() + 17)).append(ac1).append(i2).append(" found").toString());
        }
        int j2 = ((com.google.android.m4b.maps.ad.a) (obj)).readInt();
        long l3 = ((com.google.android.m4b.maps.ad.a) (obj)).readLong();
        int k2 = ((com.google.android.m4b.maps.ad.a) (obj)).readUnsignedByte();
        long al[] = new long[6];
        al[0] = j1;
        al[1] = k1;
        al[2] = i2;
        al[3] = j2;
        al[4] = l3;
        al[5] = k2;
        j1 = (int)al[0];
        k1 = (int)al[1];
        i2 = (int)al[2];
        j2 = (int)al[3];
        l3 = al[4];
        byte byte0 = (byte)(int)al[5];
        i1 += 27;
        k2 = abyte0.length - i1;
        al = new i();
        byte abyte1[] = new byte[40];
        com.google.android.m4b.maps.bq.i.a(ac1.b, ac1.c, ac1.a, i2, j2, l3, abyte1);
        al.a(abyte1);
        al.a(abyte0, i1, k2);
        try
        {
            Object obj1 = com.google.android.m4b.maps.bw.d.a(abyte0, i1, k2);
            abyte0 = ((com.google.android.m4b.maps.bw.d.a) (obj1)).a;
            i1 = ((com.google.android.m4b.maps.bw.d.a) (obj1)).b;
            obj1 = new com.google.android.m4b.maps.ad.a(abyte0);
            ac1 = a(ac1, ((DataInput) (obj1)), i2, byte0, j1, k1, ah, l1, l2, e1);
            if (((com.google.android.m4b.maps.ad.a) (obj1)).a != i1)
            {
                ac1 = String.valueOf(((ap) (ac1)).c);
                throw new IOException((new StringBuilder(String.valueOf(ac1).length() + 32)).append("Byte stream not fully read for: ").append(ac1).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            throw new IOException(ac1.getMessage());
        }
        com.google.android.m4b.maps.bw.f.a(abyte0);
        return ac1;
    }

    static bb a(DataInput datainput, ae ae1)
    {
        o o1;
        int i1 = com.google.android.m4b.maps.bo.am.a(datainput);
        if (ae1.a == 11)
        {
            int k3 = com.google.android.m4b.maps.bo.am.a(datainput);
            datainput.skipBytes(com.google.android.m4b.maps.bo.am.a(datainput));
            o1 = new o(k3);
        } else
        {
            o1 = new o(-1);
        }
        i1;
        JVM INSTR tableswitch 1 11: default 104
    //                   1 148
    //                   2 203
    //                   3 402
    //                   4 564
    //                   5 572
    //                   6 677
    //                   7 770
    //                   8 1410
    //                   9 1418
    //                   10 104
    //                   11 1426;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L1 _L11
_L1:
        throw new IOException((new StringBuilder(33)).append("Unknown feature type: ").append(i1).toString());
_L2:
        if (ae1.a == 10)
        {
            int l3 = com.google.android.m4b.maps.bo.am.a(datainput);
            for (int j1 = 0; j1 < l3; j1++)
            {
                com.google.android.m4b.maps.bo.am.a(datainput);
            }

        }
        return new az(o1.a, com.google.android.m4b.maps.bo.t.a());
_L3:
        Object obj;
        w w1;
        bk abk[];
        int i4;
        int j4;
        int k4;
        obj = com.google.android.m4b.maps.bo.k.a(datainput, ae1.b);
        w1 = com.google.android.m4b.maps.bo.w.a(datainput, ae1);
        i4 = com.google.android.m4b.maps.bo.am.a(datainput);
        abk = new bk[i4];
        for (int k1 = 0; k1 < i4; k1++)
        {
            abk[k1] = com.google.android.m4b.maps.bo.bk.a(datainput, ae1, w1);
        }

        i4 = com.google.android.m4b.maps.bo.am.a(datainput);
        j4 = datainput.readByte();
        k4 = datainput.readInt();
        ae1 = null;
        if (!com.google.android.m4b.maps.bo.d.a(1, k4)) goto _L13; else goto _L12
_L12:
        ae1 = com.google.android.m4b.maps.ak.a.a(datainput);
_L15:
        int ai3[];
        int l4 = com.google.android.m4b.maps.bo.am.a(datainput);
        ai3 = new int[l4];
        for (int l1 = 0; l1 < l4; l1++)
        {
            ai3[l1] = com.google.android.m4b.maps.bo.am.a(datainput);
        }

        break; /* Loop/switch isn't completed */
_L13:
        if (com.google.android.m4b.maps.bo.d.a(2, k4))
        {
            ae1 = com.google.android.m4b.maps.ak.a.b(datainput);
        }
        if (true) goto _L15; else goto _L14
_L14:
        return new p(o1.a, ae1, ((com.google.android.m4b.maps.bo.k) (obj)), abk, w1.a, w1.c, w1.b, i4, j4, k4 >>> 2, ai3);
_L4:
        byte abyte0[];
        w w2;
        obj = com.google.android.m4b.maps.bo.ak.a(datainput, ae1.b);
        abyte0 = new byte[((ak) (obj)).a()];
        datainput.readFully(abyte0);
        w2 = com.google.android.m4b.maps.bo.w.a(datainput, ae1);
        i4 = datainput.readByte();
        j4 = datainput.readInt();
        ae1 = null;
        if (!com.google.android.m4b.maps.bo.d.a(1, j4)) goto _L17; else goto _L16
_L16:
        ae1 = com.google.android.m4b.maps.ak.a.a(datainput);
_L19:
        k4 = com.google.android.m4b.maps.bo.am.a(datainput);
        ai3 = new int[k4];
        for (int i2 = 0; i2 < k4; i2++)
        {
            ai3[i2] = com.google.android.m4b.maps.bo.am.a(datainput);
        }

        break; /* Loop/switch isn't completed */
_L17:
        if (com.google.android.m4b.maps.bo.d.a(2, j4))
        {
            ae1 = com.google.android.m4b.maps.ak.a.b(datainput);
        }
        if (true) goto _L19; else goto _L18
_L18:
        return new au(o1.a, ae1, ((ak) (obj)), abyte0, w2.a, w2.c, w2.b, i4, j4, ai3);
_L5:
        return com.google.android.m4b.maps.bo.av.a(datainput, ae1, o1);
_L6:
        obj = com.google.android.m4b.maps.bo.k.a(datainput, ae1.b);
        ae1 = com.google.android.m4b.maps.bo.w.a(datainput, ae1);
        i4 = datainput.readByte();
        j4 = datainput.readInt();
        k4 = com.google.android.m4b.maps.bo.am.a(datainput);
        int ai2[] = new int[k4];
        for (int j2 = 0; j2 < k4; j2++)
        {
            ai2[j2] = com.google.android.m4b.maps.bo.am.a(datainput);
        }

        return new bo(o1.a, ((com.google.android.m4b.maps.bo.k) (obj)), ((w) (ae1)).a, ((w) (ae1)).c, ((w) (ae1)).b, i4, j4, ai2);
_L7:
        i4 = com.google.android.m4b.maps.bo.am.a(datainput);
        ae1 = new byte[datainput.readInt()];
        datainput.readFully(ae1);
        j4 = datainput.readByte();
        k4 = com.google.android.m4b.maps.bo.am.a(datainput);
        int ai1[] = new int[k4];
        for (int k2 = 0; k2 < k4; k2++)
        {
            ai1[k2] = com.google.android.m4b.maps.bo.am.a(datainput);
        }

        return new l(o1.a, i4, ae1, j4, com.google.android.m4b.maps.bo.t.a(), ai1);
_L8:
        com.google.android.m4b.maps.bo.a aa[];
        ac ac1;
        com.google.android.m4b.maps.bo.g g2;
        w w3;
        bk bk1;
        bk bk2;
        ab.a aa1[];
        int i5;
        i4 = com.google.android.m4b.maps.bo.am.a(datainput);
        aa = new com.google.android.m4b.maps.bo.a[i4];
        ac1 = ae1.b;
        for (int l2 = 0; l2 < i4; l2++)
        {
            com.google.android.m4b.maps.bo.g g1 = com.google.android.m4b.maps.bo.g.a(datainput, ac1);
            j4 = datainput.readUnsignedByte();
            float f1 = (0.0F / 0.0F);
            if (com.google.android.m4b.maps.bo.d.a(j4, 1))
            {
                f1 = (float)com.google.android.m4b.maps.bo.am.a(datainput) / 10F;
            }
            ai1 = null;
            float f2 = (0.0F / 0.0F);
            float f3 = (0.0F / 0.0F);
            float f4 = (0.0F / 0.0F);
            if (com.google.android.m4b.maps.bo.d.a(j4, 2))
            {
                ai1 = com.google.android.m4b.maps.bo.g.a(datainput, ac1);
                f2 = (float)com.google.android.m4b.maps.bo.am.a(datainput) / 10F;
                f3 = (float)com.google.android.m4b.maps.bo.am.a(datainput) / 8F;
                f4 = (float)com.google.android.m4b.maps.bo.am.a(datainput) / 8F;
            }
            aa[l2] = new com.google.android.m4b.maps.bo.a(g1, j4, f1, ai1, f2, f3, f4);
        }

        g2 = aa[0].a;
        w3 = com.google.android.m4b.maps.bo.w.a(datainput, ae1);
        bk1 = com.google.android.m4b.maps.bo.bk.a(datainput, ae1, w3);
        bk2 = com.google.android.m4b.maps.bo.bk.a(datainput, ae1, w3);
        i4 = com.google.android.m4b.maps.bo.am.a(datainput);
        aa1 = new ab.a[i4];
        for (int i3 = 0; i3 < i4; i3++)
        {
            aa1[i3] = com.google.android.m4b.maps.bo.ab.a.b(datainput);
        }

        i4 = datainput.readByte();
        j4 = datainput.readByte();
        k4 = datainput.readByte();
        i5 = datainput.readInt();
        ai1 = null;
        if (!com.google.android.m4b.maps.bo.d.a(1, i5)) goto _L21; else goto _L20
_L20:
        ai1 = com.google.android.m4b.maps.ak.a.a(datainput);
          goto _L22
_L21:
        if (com.google.android.m4b.maps.bo.d.a(2, i5))
        {
            ai1 = com.google.android.m4b.maps.ak.a.b(datainput);
        }
        continue; /* Loop/switch isn't completed */
_L22:
        String s = null;
        if (com.google.android.m4b.maps.bo.d.a(32, i5))
        {
            s = com.google.android.m4b.maps.as.f.a(datainput.readUTF()).intern();
        }
        String s1 = null;
        if (com.google.android.m4b.maps.bo.d.a(64, i5))
        {
            s1 = datainput.readUTF();
        }
        Object obj1;
        int ai4[];
        int j5;
        if (com.google.android.m4b.maps.bo.d.a(128, i5))
        {
            obj1 = datainput.readUTF();
        } else
        {
            ai4 = bk1.b;
            String s2 = bk2.b;
            obj1 = ai4;
            if (ai4.length() > 0)
            {
                obj1 = ai4;
                if (s2.length() > 0)
                {
                    obj1 = String.valueOf(ai4);
                    obj1 = (new StringBuilder(String.valueOf(obj1).length() + 1)).append(((String) (obj1))).append('\n').toString();
                }
            }
            obj1 = String.valueOf(obj1);
            ai4 = String.valueOf(s2);
            if (ai4.length() != 0)
            {
                obj1 = ((String) (obj1)).concat(ai4);
            } else
            {
                obj1 = new String(((String) (obj1)));
            }
        }
        if (ae1.a == 11)
        {
            if (com.google.android.m4b.maps.bo.d.a(512, i5))
            {
                ae1 = com.google.android.m4b.maps.bo.ab.a.b(datainput);
            } else
            {
                ae1 = ab.a.c;
            }
        } else
        {
            ae1 = ab.a.c;
        }
        j5 = com.google.android.m4b.maps.bo.am.a(datainput);
        ai4 = new int[j5];
        for (int j3 = 0; j3 < j5; j3++)
        {
            ai4[j3] = com.google.android.m4b.maps.bo.am.a(datainput);
        }

        return new h(o1.a, ac1, g2, ai1, aa, bk1, bk2, aa1, s, w3.a, w3.c, w3.b, i4, j4, k4, i5, s1, ((String) (obj1)), ae1, ai4);
_L9:
        return com.google.android.m4b.maps.bo.bm.a(datainput, ae1, o1);
_L10:
        return com.google.android.m4b.maps.bo.ai.a(datainput, ae1, o1);
_L11:
        return com.google.android.m4b.maps.bo.bn.b(datainput, ae1, o1);
        if (true) goto _L22; else goto _L23
_L23:
    }

    private static void a(DataInput datainput)
    {
        int i1 = datainput.readInt();
        if (i1 != 0x44524154)
        {
            throw new IOException((new StringBuilder(39)).append("TILE_MAGIC expected. Found: ").append(i1).toString());
        } else
        {
            return;
        }
    }

    private boolean p()
    {
        return (e & 2) != 0;
    }

    public final ac a()
    {
        return c;
    }

    public bb a(int i1)
    {
        return f[i1];
    }

    public final ah b()
    {
        return h;
    }

    public final int c()
    {
        return d;
    }

    public boolean d()
    {
        return a >= 0L && com.google.android.m4b.maps.ay.k.c() > a;
    }

    public final int e()
    {
        return j;
    }

    public final boolean f()
    {
        return k >= 0L && com.google.android.m4b.maps.ay.k.c() > k;
    }

    public final void g()
    {
        if (a(n) > 0L)
        {
            k = com.google.android.m4b.maps.ay.k.c() + a(n);
            return;
        } else
        {
            k = -1L;
            return;
        }
    }

    public final boolean h()
    {
        if (n.c != null && !n.c.c) goto _L2; else goto _L1
_L1:
        boolean flag;
        if ((e & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && p()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (p())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public String[] i()
    {
        return b;
    }

    public String[] j()
    {
        return m;
    }

    public int k()
    {
        return f.length;
    }

    public b l()
    {
        return new c((byte)0);
    }

    public long m()
    {
        return a;
    }

    public final int n()
    {
        if (i != null)
        {
            return i.length;
        } else
        {
            return 0;
        }
    }

    public final long o()
    {
        return k;
    }
}
