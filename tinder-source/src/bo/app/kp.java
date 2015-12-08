// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.opengl.GLES10;

// Referenced classes of package bo.app:
//            ji, kq, km, jo

public final class kp
{

    private static ji a;

    public static int a(ji ji1)
    {
        int i = ji1.a;
        int j = ji1.b;
        int k = a.a;
        int l = a.b;
        return Math.max((int)Math.ceil((float)i / (float)k), (int)Math.ceil((float)j / (float)l));
    }

    public static int a(ji ji1, ji ji2, int i, boolean flag)
    {
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        j = ji1.a;
        k = ji1.b;
        i1 = ji2.a;
        j1 = ji2.b;
        l = j / i1;
        k1 = k / j1;
        kq.a[i - 1];
        JVM INSTR tableswitch 1 2: default 68
    //                   1 76
    //                   2 142;
           goto _L1 _L2 _L3
_L1:
        i = 1;
_L8:
        if (i <= 0)
        {
            return 1;
        } else
        {
            return i;
        }
_L2:
        if (!flag) goto _L5; else goto _L4
_L4:
        i = 1;
        l = j;
        j = i;
_L9:
        if (l / 2 >= i1) goto _L7; else goto _L6
_L6:
        i = j;
        if (k / 2 < j1) goto _L8; else goto _L7
_L7:
        l /= 2;
        k /= 2;
        j *= 2;
          goto _L9
_L5:
        i = Math.max(l, k1);
          goto _L8
_L3:
        if (!flag) goto _L11; else goto _L10
_L10:
        i = 1;
        l = j;
        j = i;
_L14:
        i = j;
        if (l / 2 < i1) goto _L8; else goto _L12
_L12:
        i = j;
        if (k / 2 < j1) goto _L8; else goto _L13
_L13:
        l /= 2;
        k /= 2;
        j *= 2;
          goto _L14
_L11:
        i = Math.min(l, k1);
          goto _L8
    }

    public static ji a(km km1, ji ji1)
    {
        int j = km1.a();
        int i = j;
        if (j <= 0)
        {
            i = ji1.a;
        }
        int k = km1.b();
        j = k;
        if (k <= 0)
        {
            j = ji1.b;
        }
        return new ji(i, j);
    }

    public static float b(ji ji1, ji ji2, int i, boolean flag)
    {
label0:
        {
            int l = ji1.a;
            int i1 = ji1.b;
            int j = ji2.a;
            int k = ji2.b;
            float f = (float)l / (float)j;
            float f1 = (float)i1 / (float)k;
            if (i == jo.a && f >= f1 || i == jo.b && f < f1)
            {
                k = (int)((float)i1 / f);
                i = j;
                j = i;
            } else
            {
                j = (int)((float)l / f1);
                i = k;
                k = i;
            }
            f1 = 1.0F;
            if (flag || j >= l || k >= i1)
            {
                f = f1;
                if (!flag)
                {
                    break label0;
                }
                f = f1;
                if (j == l)
                {
                    break label0;
                }
                f = f1;
                if (k == i1)
                {
                    break label0;
                }
            }
            f = (float)j / (float)l;
        }
        return f;
    }

    static 
    {
        int ai[] = new int[1];
        GLES10.glGetIntegerv(3379, ai, 0);
        int i = Math.max(ai[0], 2048);
        a = new ji(i, i);
    }
}
