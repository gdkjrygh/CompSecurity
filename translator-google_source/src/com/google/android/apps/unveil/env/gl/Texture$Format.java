// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env.gl;


public final class  extends Enum
{

    public static final RGBA LUMINANCE;
    public static final RGBA LUMINANCE_ALPHA;
    public static final RGBA RGB;
    public static final RGBA RGBA;
    private static final RGBA a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/unveil/env/gl/Texture$Format, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        LUMINANCE = new <init>("LUMINANCE", 0);
        LUMINANCE_ALPHA = new <init>("LUMINANCE_ALPHA", 1);
        RGB = new <init>("RGB", 2);
        RGBA = new <init>("RGBA", 3);
        a = (new a[] {
            LUMINANCE, LUMINANCE_ALPHA, RGB, RGBA
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
