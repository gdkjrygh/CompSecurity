// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;
import java.util.Collections;

final class bci
{

    static Pair a(bec bec1, int i)
    {
        bec1.a(i + 8 + 21);
        int j1 = bec1.c();
        int k1 = bec1.c();
        int i1 = bec1.b;
        int j = 0;
        i = 0;
        for (; j < k1; j++)
        {
            bec1.b(1);
            int l1 = bec1.d();
            for (int k = 0; k < l1; k++)
            {
                int j2 = bec1.d();
                i += j2 + 4;
                bec1.b(j2);
            }

        }

        bec1.a(i1);
        byte abyte0[] = new byte[i];
        j = 0;
        i1 = 0;
        for (; j < k1; j++)
        {
            bec1.b(1);
            int i2 = bec1.d();
            for (int l = 0; l < i2; l++)
            {
                int k2 = bec1.d();
                byte abyte1[] = beb.a;
                byte abyte2[] = beb.a;
                System.arraycopy(abyte1, 0, abyte0, i1, 4);
                abyte1 = beb.a;
                i1 += 4;
                System.arraycopy(bec1.a, bec1.b, abyte0, i1, k2);
                i1 += k2;
                bec1.b(k2);
            }

        }

        if (i == 0)
        {
            bec1 = null;
        } else
        {
            bec1 = Collections.singletonList(abyte0);
        }
        return Pair.create(bec1, Integer.valueOf((j1 & 3) + 1));
    }

    static bco a(bec bec1, int i, int j)
    {
        Object obj;
        int k;
        k = i + 8;
        obj = null;
_L2:
        int l;
        int i1;
        if (k - i >= j)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        bec1.a(k);
        i1 = bec1.f();
        l = bec1.f();
        if (l != bcf.O)
        {
            break; /* Loop/switch isn't completed */
        }
        bec1.f();
_L5:
        k += i1;
        if (true) goto _L2; else goto _L1
_L1:
        if (l != bcf.J) goto _L4; else goto _L3
_L3:
        bec1.b(4);
        bec1.f();
        bec1.f();
          goto _L5
_L4:
        if (l != bcf.K) goto _L5; else goto _L6
_L6:
        l = k + 8;
_L7:
        int j1;
label0:
        {
            if (l - k >= i1)
            {
                break MISSING_BLOCK_LABEL_182;
            }
            bec1.a(l);
            j1 = bec1.f();
            if (bec1.f() != bcf.L)
            {
                break label0;
            }
            bec1.b(4);
            l = bec1.f();
            obj = new byte[16];
            bec1.a(((byte []) (obj)), 0, 16);
            obj = new bco(l & 0xff, ((byte []) (obj)));
        }
          goto _L5
        l += j1;
          goto _L7
        obj = null;
          goto _L5
        return ((bco) (obj));
    }

    static void a(bec bec1, int i, int j, int k, long l, bcj bcj1, int i1)
    {
        Object obj;
        int l1;
        int j2;
        int l2;
        bec1.a(j + 8);
        bec1.b(16);
        j2 = bec1.d();
        l2 = bec1.d();
        bec1.b(4);
        byte abyte0[] = bec1.a;
        int j1 = bec1.b;
        bec1.b = j1 + 1;
        j1 = abyte0[j1];
        abyte0 = bec1.a;
        l1 = bec1.b;
        bec1.b = l1 + 1;
        l1 = (j1 & 0xff) << 8 | abyte0[l1] & 0xff;
        bec1.b = bec1.b + 2;
        obj = null;
        if (i != bcf.i) goto _L2; else goto _L1
_L1:
        obj = "audio/ac3";
_L16:
        byte abyte2[];
        int k1;
        k1 = bec1.b;
        abyte2 = null;
_L7:
        if (k1 - j >= k) goto _L4; else goto _L3
_L3:
        Object obj1;
        byte abyte1[];
        int i2;
        int k2;
        int i3;
        int j3;
        int k3;
        bec1.a(k1);
        j3 = bec1.b;
        i3 = bec1.f();
        boolean flag;
        if (i3 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.a(flag, "childAtomSize should be positive");
        k3 = bec1.f();
        if (i != bcf.h && i != bcf.N) goto _L6; else goto _L5
_L5:
        if (k3 == bcf.z)
        {
            obj1 = b(bec1, j3);
            obj = (String)((Pair) (obj1)).first;
            abyte2 = (byte[])((Pair) (obj1)).second;
            obj1 = obj;
            abyte1 = abyte2;
            k2 = j2;
            i2 = l1;
            if ("audio/mp4a-latm".equals(obj))
            {
                obj1 = bdu.a(abyte2);
                i2 = ((Integer)((Pair) (obj1)).first).intValue();
                k2 = ((Integer)((Pair) (obj1)).second).intValue();
                abyte1 = abyte2;
                obj1 = obj;
            }
        } else
        {
            obj1 = obj;
            abyte1 = abyte2;
            k2 = j2;
            i2 = l1;
            if (k3 == bcf.I)
            {
                bcj1.a[i1] = a(bec1, j3, i3);
                obj1 = obj;
                abyte1 = abyte2;
                k2 = j2;
                i2 = l1;
            }
        }
_L11:
        k1 += i3;
        obj = obj1;
        abyte2 = abyte1;
        j2 = k2;
        l1 = i2;
          goto _L7
_L2:
        if (i == bcf.k)
        {
            obj = "audio/eac3";
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (i != bcf.i || k3 != bcf.j) goto _L9; else goto _L8
_L8:
        bec1.a(j3 + 8);
        bcj1.b = bdr.a(bec1);
_L14:
        return;
_L9:
        obj1 = obj;
        abyte1 = abyte2;
        k2 = j2;
        i2 = l1;
        if (i != bcf.k) goto _L11; else goto _L10
_L10:
        obj1 = obj;
        abyte1 = abyte2;
        k2 = j2;
        i2 = l1;
        if (k3 != bcf.l) goto _L11; else goto _L12
_L12:
        bec1.a(j3 + 8);
        bcj1.b = bdr.b(bec1);
        return;
_L4:
        if (obj == null) goto _L14; else goto _L13
_L13:
        if (abyte2 == null)
        {
            bec1 = null;
        } else
        {
            bec1 = Collections.singletonList(abyte2);
        }
        bcj1.b = azi.a(((String) (obj)), l2, l, j2, l1, bec1);
        return;
        if (true) goto _L16; else goto _L15
_L15:
    }

    static Pair b(bec bec1, int i)
    {
        String s;
        s = null;
        bec1.a(i + 8 + 4);
        bec1.b(1);
        for (i = bec1.c(); i > 127; i = bec1.c()) { }
        bec1.b(2);
        i = bec1.c();
        if ((i & 0x80) != 0)
        {
            bec1.b(2);
        }
        if ((i & 0x40) != 0)
        {
            bec1.b(bec1.d());
        }
        if ((i & 0x20) != 0)
        {
            bec1.b(2);
        }
        bec1.b(1);
        for (i = bec1.c(); i > 127; i = bec1.c()) { }
        bec1.c();
        JVM INSTR lookupswitch 7: default 180
    //                   32: 237
    //                   33: 243
    //                   35: 249
    //                   64: 255
    //                   107: 230
    //                   165: 261
    //                   166: 267;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        bec1.b(12);
        bec1.b(1);
        int j = bec1.c();
        for (i = j & 0x7f; j > 127; i = i << 8 | j & 0x7f)
        {
            j = bec1.c();
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
        bec1.a(abyte0, 0, i);
        return Pair.create(s, abyte0);
    }
}
