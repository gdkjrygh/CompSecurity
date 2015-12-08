// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bm;

import com.google.android.m4b.maps.bn.d;
import com.google.android.m4b.maps.bn.l;

public final class m
{

    private static final float a[] = {
        0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 
        0.0F, 0.0F
    };
    private static final float b[] = {
        0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 
        1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F
    };
    private static final float c[] = {
        -1F, 1.0F, 0.0F, 0.0F, 0.0F, -1F, -1F, 0.0F, 0.0F, 1.0F, 
        1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, -1F, 0.0F, 1.0F, 1.0F
    };

    public static void a(l l1, d d1)
    {
        float f3 = (float)Math.tan(0.062831856310367584D);
        float f4 = (float)Math.cos(0.062831856310367584D);
        int i = 0;
        float f = 1.0F;
        float f1 = 0.0F;
        do
        {
            float f2 = f;
            if (i < 100)
            {
                l1.a(f2 + 0.0F, f1 + 0.0F, 0.0F);
                if (d1 != null)
                {
                    d1.d((short)i);
                }
                f = (-f1 * f3 + f2) * f4;
                f1 = (f1 + f2 * f3) * f4;
                i++;
            } else
            {
                return;
            }
        } while (true);
    }

    public static void b(l l1, d d1)
    {
        int i = 0;
        float f3 = (float)Math.tan(0.062831856310367584D);
        float f4 = (float)Math.cos(0.062831856310367584D);
        l1.a(0.0F, 0.0F, 0.0F);
        if (d1 != null)
        {
            d1.d(0);
        }
        float f1 = 0.0F;
        float f = 1.0F;
        do
        {
            float f2 = f;
            if (i >= 100)
            {
                break;
            }
            l1.a(f2 + 0.0F, f1 + 0.0F, 0.0F);
            if (d1 != null)
            {
                d1.d((short)(i + 1));
            }
            f = (-f1 * f3 + f2) * f4;
            f1 = (f1 + f2 * f3) * f4;
            i++;
        } while (true);
        if (d1 != null)
        {
            d1.d(1);
            return;
        } else
        {
            l1.a(1.0F, 0.0F, 0.0F);
            return;
        }
    }

}
