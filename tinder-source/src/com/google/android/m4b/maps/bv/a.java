// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import com.google.android.m4b.maps.cg.ar;
import com.google.android.m4b.maps.cg.ay;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            n, p, q, l, 
//            ae, g

public final class a extends n
{

    private float b[];

    public a(ae ae, ae.c c)
    {
        super(ae, c);
        b = new float[2];
    }

    public final int a(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException("Invalid face index for cube.");

        case 0: // '\0'
            return 1;

        case 1: // '\001'
            return 2;

        case 2: // '\002'
            return 3;

        case 3: // '\003'
            return 4;

        case 4: // '\004'
            return 5;

        case 5: // '\005'
            return 6;
        }
    }

    public final p a(int i, int j, float f, float f1, int k, float f2, float f3, 
            float f4, float f5, boolean flag)
    {
        p p1;
        int i1;
        int k1;
        int l1;
        if (k < 0 || k > 5)
        {
            throw new IllegalArgumentException("Invalid cube face.");
        }
        if (!flag)
        {
            i = 1;
            j = 1;
        }
        k1 = i + 1;
        l1 = j + 1;
        p1 = new p(k1, l1);
        i1 = 0;
_L12:
        float f11;
        float f12;
        int j1;
        if (i1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        f11 = (float)i1 / (float)i;
        f12 = ar.a(f11 * f2 + f, 0.0F, 1.0F);
        j1 = 0;
_L9:
        float f8;
        float f13;
        if (j1 >= l1)
        {
            break MISSING_BLOCK_LABEL_458;
        }
        f13 = (float)j1 / (float)j;
        f8 = ar.a(f13 * f3 + f1, 0.0F, 1.0F);
        k;
        JVM INSTR tableswitch 0 5: default 160
    //                   0 190
    //                   1 346
    //                   2 369
    //                   3 391
    //                   4 413
    //                   5 435;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_435;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalStateException((new StringBuilder(30)).append("Invalid cube face: ").append(k).toString());
_L2:
        float f6;
        float f7;
        f7 = 2.0F * f12 - 1.0F;
        f6 = 1.0F - f8 * 2.0F;
        f8 = -1F;
_L10:
        if (flag && a.z != null)
        {
            ar.a(f7, f6, f8, b);
            float f9 = b[0];
            float f10 = b[1];
            f10 = Math.min(200F, a.z.a(f9, f10, null));
            f9 = f10;
            if (f10 == 0.0F)
            {
                f9 = 200F;
            }
            f6 *= f9;
            f8 = f9 * f8;
            f7 *= f9;
        }
        p1.a(i1, j1, f7, f6, f8, f11 * f4, f13 * f5);
        j1++;
        if (true) goto _L9; else goto _L8
_L8:
        f7 = -1F;
        f6 = 1.0F - f8 * 2.0F;
        f8 = 1.0F - 2.0F * f12;
          goto _L10
_L4:
        f7 = 1.0F - 2.0F * f12;
        f6 = 1.0F - f8 * 2.0F;
        f8 = 1.0F;
          goto _L10
_L5:
        f7 = 1.0F;
        f6 = 1.0F - f8 * 2.0F;
        f8 = 2.0F * f12 - 1.0F;
          goto _L10
_L6:
        f7 = 2.0F * f12 - 1.0F;
        f6 = 1.0F;
        f8 = 1.0F - f8 * 2.0F;
          goto _L10
        f7 = 2.0F * f12 - 1.0F;
        f6 = -1F;
        f8 = f8 * 2.0F - 1.0F;
          goto _L10
        i1++;
        if (true) goto _L12; else goto _L11
_L11:
        return p1;
    }

    public final void a(q q1, g g, int i, int j)
    {
        a(q1, g, i, j, 6);
    }

    public final volatile void a(GL10 gl10, ay ay, ah.f f, ah.i i)
    {
        super.a(gl10, ay, f, i);
    }
}
