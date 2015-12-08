// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;


public final class  extends Enum
{

    public static final UNDO BACK;
    public static final UNDO NONE;
    public static final UNDO UNDO;
    private static final UNDO a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/libraries/handwriting/gui/UndoButtonInterface$UndoButtonState, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        BACK = new <init>("BACK", 1);
        UNDO = new <init>("UNDO", 2);
        a = (new a[] {
            NONE, BACK, UNDO
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
