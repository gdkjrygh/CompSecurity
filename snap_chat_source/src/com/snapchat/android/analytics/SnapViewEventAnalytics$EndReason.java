// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;

import hn;

// Referenced classes of package com.snapchat.android.analytics:
//            SnapViewEventAnalytics

public static final class mExitEvent extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR BACK_PRESSED;
    public static final ERROR ENTER_BACKGROUND;
    public static final ERROR ERROR;
    public static final ERROR FINISHED_VIEWING;
    public static final ERROR KICKED_OUT;
    public static final ERROR SWIPED_DOWN;
    public static final ERROR TAP_PAST_END;
    private final String mEventName;
    private final hn mExitEvent;

    public static mExitEvent valueOf(String s)
    {
        return (mExitEvent)Enum.valueOf(com/snapchat/android/analytics/SnapViewEventAnalytics$EndReason, s);
    }

    public static mExitEvent[] values()
    {
        return (mExitEvent[])$VALUES.clone();
    }

    public final String getEventName()
    {
        return mEventName;
    }

    public final hn getExitEvent()
    {
        return mExitEvent;
    }

    static 
    {
        FINISHED_VIEWING = new <init>("FINISHED_VIEWING", 0, "finished_viewing", hn.AUTO_ADVANCE);
        TAP_PAST_END = new <init>("TAP_PAST_END", 1, "finished_viewing", hn.TAP);
        SWIPED_DOWN = new <init>("SWIPED_DOWN", 2, "user_exited", hn.SWIPE_DOWN);
        BACK_PRESSED = new <init>("BACK_PRESSED", 3, "back_pressed", hn.BACK_PRESSED);
        KICKED_OUT = new <init>("KICKED_OUT", 4, "kicked_out", hn.ERROR);
        ENTER_BACKGROUND = new <init>("ENTER_BACKGROUND", 5, "enter_background", hn.ENTER_BACKGROUND);
        ERROR = new <init>("ERROR", 6, "error", hn.ERROR);
        $VALUES = (new .VALUES[] {
            FINISHED_VIEWING, TAP_PAST_END, SWIPED_DOWN, BACK_PRESSED, KICKED_OUT, ENTER_BACKGROUND, ERROR
        });
    }

    private (String s, int i, String s1, hn hn1)
    {
        super(s, i);
        mEventName = s1;
        mExitEvent = hn1;
    }
}
