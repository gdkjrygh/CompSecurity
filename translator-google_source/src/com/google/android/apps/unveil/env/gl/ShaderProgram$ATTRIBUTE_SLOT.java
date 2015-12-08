// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env.gl;


public final class  extends Enum
{

    public static final TEXUV COLOR;
    public static final TEXUV TEXUV;
    public static final TEXUV VERTEX;
    private static final TEXUV a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/unveil/env/gl/ShaderProgram$ATTRIBUTE_SLOT, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        VERTEX = new <init>("VERTEX", 0);
        COLOR = new <init>("COLOR", 1);
        TEXUV = new <init>("TEXUV", 2);
        a = (new a[] {
            VERTEX, COLOR, TEXUV
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
