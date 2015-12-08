// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.snapeditormotion;


public final class SwipeHandlerType extends Enum
{

    private static final SwipeHandlerType $VALUES[];
    public static final SwipeHandlerType DOUBLE_SWIPE;
    public static final SwipeHandlerType NO_SWIPE_STARTED;
    public static final SwipeHandlerType SINGLE_SWIPE;
    public static final SwipeHandlerType SWIPE_STARTED;

    private SwipeHandlerType(String s, int i)
    {
        super(s, i);
    }

    public static SwipeHandlerType valueOf(String s)
    {
        return (SwipeHandlerType)Enum.valueOf(com/snapchat/android/ui/snapeditormotion/SwipeHandlerType, s);
    }

    public static SwipeHandlerType[] values()
    {
        return (SwipeHandlerType[])$VALUES.clone();
    }

    static 
    {
        NO_SWIPE_STARTED = new SwipeHandlerType("NO_SWIPE_STARTED", 0);
        SWIPE_STARTED = new SwipeHandlerType("SWIPE_STARTED", 1);
        SINGLE_SWIPE = new SwipeHandlerType("SINGLE_SWIPE", 2);
        DOUBLE_SWIPE = new SwipeHandlerType("DOUBLE_SWIPE", 3);
        $VALUES = (new SwipeHandlerType[] {
            NO_SWIPE_STARTED, SWIPE_STARTED, SINGLE_SWIPE, DOUBLE_SWIPE
        });
    }
}
