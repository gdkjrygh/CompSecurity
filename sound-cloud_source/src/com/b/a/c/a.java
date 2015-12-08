// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import android.opengl.GLES10;
import com.b.a.b.a.e;
import com.b.a.b.a.h;

public final class a
{

    private static e a;

    public static int a(e e1)
    {
        int i = e1.a;
        int j = e1.b;
        int k = a.a;
        int l = a.b;
        return Math.max((int)Math.ceil((float)i / (float)k), (int)Math.ceil((float)j / (float)l));
    }

    public static int a(e e1, e e2, int i, boolean flag)
    {
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        j = e1.a;
        k = e1.b;
        i1 = e2.a;
        j1 = e2.b;
        l = j / i1;
        k1 = k / j1;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[h.a().length];
                try
                {
                    a[h.a - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[h.b - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[i - 1];
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

    public static e a(com.b.a.b.e.a a1, e e1)
    {
        int j = a1.a();
        int i = j;
        if (j <= 0)
        {
            i = e1.a;
        }
        int k = a1.b();
        j = k;
        if (k <= 0)
        {
            j = e1.b;
        }
        return new e(i, j);
    }

    public static float b(e e1, e e2, int i, boolean flag)
    {
label0:
        {
            int l = e1.a;
            int i1 = e1.b;
            int j = e2.a;
            int k = e2.b;
            float f = (float)l / (float)j;
            float f1 = (float)i1 / (float)k;
            if (i == h.a && f >= f1 || i == h.b && f < f1)
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
        a = new e(i, i);
    }
}
