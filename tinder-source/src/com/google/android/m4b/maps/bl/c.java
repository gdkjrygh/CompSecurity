// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;

import android.view.MotionEvent;

// Referenced classes of package com.google.android.m4b.maps.bl:
//            l, i

public final class c extends l
{

    private final i b;

    public c(int j, i k)
    {
        super(j);
        b = k;
    }

    public final float a()
    {
        return b.g;
    }

    public final float b()
    {
        return b.h;
    }

    public final float c()
    {
        i j;
        for (j = b; !i.a(j.e) || j.c.getPointerCount() != j.b.getPointerCount();)
        {
            return 1.0F;
        }

        if (j.r == -1F)
        {
            if (j.n == -1F)
            {
                float f = j.l;
                float f2 = j.m;
                j.n = (float)Math.sqrt(f * f + f2 * f2);
            }
            float f1 = j.n;
            if (j.o == -1F)
            {
                float f3 = j.j;
                float f4 = j.k;
                j.o = (float)Math.sqrt(f3 * f3 + f4 * f4);
            }
            j.r = f1 / j.o;
        }
        return j.r;
    }
}
