// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;


public final class  extends Enum
{

    public static final CLOUDHANCE CLOUDHANCE;
    public static final CLOUDHANCE FROZEN;
    public static final CLOUDHANCE UNINITIALIZED;
    public static final CLOUDHANCE VIDEO;
    private static final CLOUDHANCE a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/translate/inputs/Camera2InputPopup$InputUIState, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        UNINITIALIZED = new <init>("UNINITIALIZED", 0);
        VIDEO = new <init>("VIDEO", 1);
        FROZEN = new <init>("FROZEN", 2);
        CLOUDHANCE = new <init>("CLOUDHANCE", 3);
        a = (new a[] {
            UNINITIALIZED, VIDEO, FROZEN, CLOUDHANCE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
