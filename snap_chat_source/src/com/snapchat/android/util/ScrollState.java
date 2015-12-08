// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;


public final class ScrollState extends Enum
{

    private static final ScrollState $VALUES[];
    public static final ScrollState DRAGGING;
    public static final ScrollState IDLE;
    public static final ScrollState SETTLING;
    public static final ScrollState UNKNOWN;

    private ScrollState(String s, int i)
    {
        super(s, i);
    }

    public static ScrollState fromRecyclerViewState(int i)
    {
        switch (i)
        {
        default:
            return UNKNOWN;

        case 0: // '\0'
            return IDLE;

        case 1: // '\001'
            return DRAGGING;

        case 2: // '\002'
            return SETTLING;
        }
    }

    public static ScrollState fromViewPagerState(int i)
    {
        switch (i)
        {
        default:
            return UNKNOWN;

        case 0: // '\0'
            return IDLE;

        case 1: // '\001'
            return DRAGGING;

        case 2: // '\002'
            return SETTLING;
        }
    }

    public static ScrollState valueOf(String s)
    {
        return (ScrollState)Enum.valueOf(com/snapchat/android/util/ScrollState, s);
    }

    public static ScrollState[] values()
    {
        return (ScrollState[])$VALUES.clone();
    }

    static 
    {
        IDLE = new ScrollState("IDLE", 0);
        DRAGGING = new ScrollState("DRAGGING", 1);
        SETTLING = new ScrollState("SETTLING", 2);
        UNKNOWN = new ScrollState("UNKNOWN", 3);
        $VALUES = (new ScrollState[] {
            IDLE, DRAGGING, SETTLING, UNKNOWN
        });
    }
}
