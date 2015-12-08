// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env.gl;


public final class  extends Enum
{

    public static final COLOR COLOR;
    public static final COLOR DISTORTION;
    public static final COLOR PVMATRIX;
    public static final COLOR TEX_MATRIX;
    public static final COLOR TEX_OES;
    public static final COLOR TEX_UV;
    public static final COLOR TEX_Y;
    private static final COLOR a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/unveil/env/gl/ShaderProgram$UNIFORM_SLOT, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        PVMATRIX = new <init>("PVMATRIX", 0);
        TEX_MATRIX = new <init>("TEX_MATRIX", 1);
        TEX_OES = new <init>("TEX_OES", 2);
        DISTORTION = new <init>("DISTORTION", 3);
        TEX_Y = new <init>("TEX_Y", 4);
        TEX_UV = new <init>("TEX_UV", 5);
        COLOR = new <init>("COLOR", 6);
        a = (new a[] {
            PVMATRIX, TEX_MATRIX, TEX_OES, DISTORTION, TEX_Y, TEX_UV, COLOR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
