// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.ui;


public final class  extends Enum
{

    public static final BOTTOM BOTTOM;
    public static final BOTTOM CENTER;
    public static final BOTTOM TOP;
    private static final BOTTOM a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/unveil/ui/CameraWrappingLayout$Alignment, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        TOP = new <init>("TOP", 0);
        CENTER = new <init>("CENTER", 1);
        BOTTOM = new <init>("BOTTOM", 2);
        a = (new a[] {
            TOP, CENTER, BOTTOM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
