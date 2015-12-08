// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media.effects;


public final class FaceDecoration extends Enum
{

    public static final FaceDecoration a;
    public static final FaceDecoration b;
    public static final FaceDecoration c;
    public static final FaceDecoration d;
    public static final FaceDecoration e;
    private static final FaceDecoration j[];
    private int f;
    private float g;
    private float h;
    private float i;

    private FaceDecoration(String s, int k, int l, float f1)
    {
        super(s, k);
        f = l;
        g = 1.2F;
        h = 0.0F;
        i = f1;
    }

    public static FaceDecoration valueOf(String s)
    {
        return (FaceDecoration)Enum.valueOf(com/skype/android/media/effects/FaceDecoration, s);
    }

    public static FaceDecoration[] values()
    {
        return (FaceDecoration[])j.clone();
    }

    public final int a()
    {
        return f;
    }

    public final float b()
    {
        return g;
    }

    public final float c()
    {
        return h;
    }

    public final float d()
    {
        return i;
    }

    static 
    {
        a = new FaceDecoration("SUNGLASSES", 0, R.raw.qikster, 0.0F);
        b = new FaceDecoration("EVILEYES", 1, R.raw.qikster2, -0.1F);
        c = new FaceDecoration("EGGS", 2, R.raw.qikster3, -0.1F);
        d = new FaceDecoration("MASK", 3, R.raw.qikster4, -0.1F);
        e = new FaceDecoration("BEARD", 4, R.raw.qikster5, -0.2F);
        j = (new FaceDecoration[] {
            a, b, c, d, e
        });
    }
}
