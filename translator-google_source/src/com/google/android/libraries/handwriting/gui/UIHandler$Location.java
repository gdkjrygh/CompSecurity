// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;


final class  extends Enum
{

    public static final TOP GONE;
    public static final TOP LEFT;
    public static final TOP RIGHT;
    public static final TOP TOP;
    private static final TOP a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/libraries/handwriting/gui/UIHandler$Location, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        GONE = new <init>("GONE", 0);
        LEFT = new <init>("LEFT", 1);
        RIGHT = new <init>("RIGHT", 2);
        TOP = new <init>("TOP", 3);
        a = (new a[] {
            GONE, LEFT, RIGHT, TOP
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
