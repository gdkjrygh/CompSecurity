// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;


// Referenced classes of package com.google.android.m4b.maps.bl:
//            b, i

public final class n extends b
{

    private float b;
    private float c;

    public n(int j, i k)
    {
        super(j, k);
    }

    public final float a()
    {
        return b;
    }

    public final void a(float f, float f1)
    {
        b = f / 2.0F;
        c = f1 / 2.0F;
    }

    public final float b()
    {
        return c;
    }

    public final float c()
    {
        float f = a.i;
        return (float)(((double)((a.g - f) * Math.signum(a.h - c)) * 3.1415926535897931D) / 256D);
    }
}
