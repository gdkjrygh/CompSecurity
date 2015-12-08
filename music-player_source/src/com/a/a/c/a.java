// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import android.opengl.GLES10;
import com.a.a.b.a.f;
import com.a.a.b.a.i;

// Referenced classes of package com.a.a.c:
//            b

public final class a
{

    private static f a;

    public static int a(f f1)
    {
        int j = f1.a();
        int k = f1.b();
        int l = a.a();
        int i1 = a.b();
        return Math.max((int)Math.ceil((float)j / (float)l), (int)Math.ceil((float)k / (float)i1));
    }

    public static int a(f f1, f f2, i j, boolean flag)
    {
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        k = f1.a();
        l = f1.b();
        k1 = f2.a();
        l1 = f2.b();
        i1 = k / k1;
        j1 = l / l1;
        b.a[j.ordinal()];
        JVM INSTR tableswitch 1 2: default 68
    //                   1 78
    //                   2 152;
           goto _L1 _L2 _L3
_L1:
        k = 1;
_L8:
        if (k <= 0)
        {
            return 1;
        } else
        {
            return k;
        }
_L2:
        if (!flag) goto _L5; else goto _L4
_L4:
        boolean flag1 = true;
        i1 = l;
        j1 = k;
        l = ((flag1) ? 1 : 0);
_L9:
        if (j1 / 2 >= k1) goto _L7; else goto _L6
_L6:
        k = l;
        if (i1 / 2 < l1) goto _L8; else goto _L7
_L7:
        j1 /= 2;
        i1 /= 2;
        l *= 2;
          goto _L9
_L5:
        k = Math.max(i1, j1);
          goto _L8
_L3:
        if (!flag) goto _L11; else goto _L10
_L10:
        boolean flag2 = true;
        i1 = l;
        j1 = k;
        l = ((flag2) ? 1 : 0);
_L14:
        k = l;
        if (j1 / 2 < k1) goto _L8; else goto _L12
_L12:
        k = l;
        if (i1 / 2 < l1) goto _L8; else goto _L13
_L13:
        j1 /= 2;
        i1 /= 2;
        l *= 2;
          goto _L14
_L11:
        k = Math.min(i1, j1);
          goto _L8
    }

    public static f a(com.a.a.b.e.a a1, f f1)
    {
        int k = a1.a();
        int j = k;
        if (k <= 0)
        {
            j = f1.a();
        }
        int l = a1.b();
        k = l;
        if (l <= 0)
        {
            k = f1.b();
        }
        return new f(j, k);
    }

    public static float b(f f1, f f2, i j, boolean flag)
    {
label0:
        {
            int k1 = f1.a();
            int l1 = f1.b();
            int k = f2.a();
            int i1 = f2.b();
            float f3 = (float)k1 / (float)k;
            float f4 = (float)l1 / (float)i1;
            int j1;
            if (j == i.a && f3 >= f4 || j == i.b && f3 < f4)
            {
                j1 = (int)((float)l1 / f3);
                i1 = k;
            } else
            {
                j1 = (int)((float)k1 / f4);
                int l = i1;
                i1 = j1;
                j1 = l;
            }
            f4 = 1.0F;
            if (flag || i1 >= k1 || j1 >= l1)
            {
                f3 = f4;
                if (!flag)
                {
                    break label0;
                }
                f3 = f4;
                if (i1 == k1)
                {
                    break label0;
                }
                f3 = f4;
                if (j1 == l1)
                {
                    break label0;
                }
            }
            f3 = (float)i1 / (float)k1;
        }
        return f3;
    }

    static 
    {
        int ai[] = new int[1];
        GLES10.glGetIntegerv(3379, ai, 0);
        int j = Math.max(ai[0], 2048);
        a = new f(j, j);
    }
}
