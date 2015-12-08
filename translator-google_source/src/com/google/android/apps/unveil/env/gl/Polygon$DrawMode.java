// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env.gl;


public final class  extends Enum
{

    public static final SOLID OUTLINE;
    public static final SOLID SOLID;
    private static final SOLID a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/unveil/env/gl/Polygon$DrawMode, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        OUTLINE = new <init>("OUTLINE", 0);
        SOLID = new <init>("SOLID", 1);
        a = (new a[] {
            OUTLINE, SOLID
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
