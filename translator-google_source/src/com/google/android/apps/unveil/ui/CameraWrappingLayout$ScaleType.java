// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.ui;


public final class  extends Enum
{

    public static final FILL FILL;
    public static final FILL FIT;
    private static final FILL a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/unveil/ui/CameraWrappingLayout$ScaleType, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        FIT = new <init>("FIT", 0);
        FILL = new <init>("FILL", 1);
        a = (new a[] {
            FIT, FILL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
