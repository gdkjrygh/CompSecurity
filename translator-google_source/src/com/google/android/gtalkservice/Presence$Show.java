// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gtalkservice;


public final class  extends Enum
{

    public static final AVAILABLE AVAILABLE;
    public static final AVAILABLE AWAY;
    public static final AVAILABLE DND;
    public static final AVAILABLE EXTENDED_AWAY;
    public static final AVAILABLE NONE;
    private static final AVAILABLE a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gtalkservice/Presence$Show, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        AWAY = new <init>("AWAY", 1);
        EXTENDED_AWAY = new <init>("EXTENDED_AWAY", 2);
        DND = new <init>("DND", 3);
        AVAILABLE = new <init>("AVAILABLE", 4);
        a = (new a[] {
            NONE, AWAY, EXTENDED_AWAY, DND, AVAILABLE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
