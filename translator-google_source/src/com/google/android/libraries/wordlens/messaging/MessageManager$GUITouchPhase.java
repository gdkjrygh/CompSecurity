// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens.messaging;


public final class  extends Enum
{

    public static final CANCELLED BEGAN;
    public static final CANCELLED CANCELLED;
    public static final CANCELLED ENDED;
    public static final CANCELLED INVALID;
    public static final CANCELLED MOVED;
    public static final CANCELLED STATIONARY;
    private static final CANCELLED a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/libraries/wordlens/messaging/MessageManager$GUITouchPhase, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        INVALID = new <init>("INVALID", 0);
        BEGAN = new <init>("BEGAN", 1);
        MOVED = new <init>("MOVED", 2);
        STATIONARY = new <init>("STATIONARY", 3);
        ENDED = new <init>("ENDED", 4);
        CANCELLED = new <init>("CANCELLED", 5);
        a = (new a[] {
            INVALID, BEGAN, MOVED, STATIONARY, ENDED, CANCELLED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
