// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;


// Referenced classes of package com.google.android.m4b.maps.bl:
//            r, h, i

public final class o extends r
{

    public o(i.b b1)
    {
        super(b1);
        c = 0.05F;
        d = (float)Math.tan(0.3490658503988659D);
    }

    protected final float a(float f1)
    {
        float f2 = (float)Math.abs((double)Math.abs(f1) - 3.1415926535897931D);
        return Math.min(Math.abs(f1), f2);
    }

    protected final float a(h h1, int i)
    {
        return h1.b(i);
    }

    protected final float b(h h1, int i)
    {
        return h1.a(i);
    }

    protected final boolean b(i i)
    {
        return a.h(i);
    }

    protected final void d(i i)
    {
        a.i(i);
    }

    protected final boolean f(i i)
    {
        return a.g(i);
    }
}
