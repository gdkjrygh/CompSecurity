// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;


public final class  extends Enum
{

    public static final GEST_FLING_FROM_LEFT GEST_BACKSPACE;
    public static final GEST_FLING_FROM_LEFT GEST_FLING_FROM_LEFT;
    public static final GEST_FLING_FROM_LEFT GEST_IGNORE;
    public static final GEST_FLING_FROM_LEFT GEST_NEW_WORD;
    public static final GEST_FLING_FROM_LEFT GEST_SPACE;
    public static final GEST_FLING_FROM_LEFT NOT_A_GESTURE;
    private static final GEST_FLING_FROM_LEFT a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/libraries/handwriting/gui/GestureRecognizer$Gesture, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        NOT_A_GESTURE = new <init>("NOT_A_GESTURE", 0);
        GEST_BACKSPACE = new <init>("GEST_BACKSPACE", 1);
        GEST_SPACE = new <init>("GEST_SPACE", 2);
        GEST_NEW_WORD = new <init>("GEST_NEW_WORD", 3);
        GEST_IGNORE = new <init>("GEST_IGNORE", 4);
        GEST_FLING_FROM_LEFT = new <init>("GEST_FLING_FROM_LEFT", 5);
        a = (new a[] {
            NOT_A_GESTURE, GEST_BACKSPACE, GEST_SPACE, GEST_NEW_WORD, GEST_IGNORE, GEST_FLING_FROM_LEFT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
