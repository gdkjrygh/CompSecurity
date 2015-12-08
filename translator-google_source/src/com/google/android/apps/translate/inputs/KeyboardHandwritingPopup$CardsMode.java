// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;


final class Q extends Enum
{

    public static final FULL FULL;
    public static final FULL INPUT_AND_BUTTONS;
    private static final FULL a[];

    public static Q valueOf(String s)
    {
        return (Q)Enum.valueOf(com/google/android/apps/translate/inputs/KeyboardHandwritingPopup$CardsMode, s);
    }

    public static Q[] values()
    {
        return (Q[])a.clone();
    }

    static 
    {
        INPUT_AND_BUTTONS = new <init>("INPUT_AND_BUTTONS", 0);
        FULL = new <init>("FULL", 1);
        a = (new a[] {
            INPUT_AND_BUTTONS, FULL
        });
    }

    private Q(String s, int i)
    {
        super(s, i);
    }
}
