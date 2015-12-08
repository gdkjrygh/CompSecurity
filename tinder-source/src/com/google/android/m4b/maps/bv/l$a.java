// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;


// Referenced classes of package com.google.android.m4b.maps.bv:
//            l

public static final class d
{

    public final float a;
    public final float b;
    public final float c;
    private float d;

    public final float a(float f, float f1, float f2)
    {
        return d / (a * f + b * f1 + c * f2);
    }

    public final boolean a()
    {
        return Math.abs(c) >= 0.9F;
    }

    public (float f, float f1, float f2, float f3)
    {
        a = f;
        b = f1;
        c = f2;
        d = f3;
    }
}
