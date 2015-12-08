// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.snapview;


public final class SnapViewSessionStopReason extends Enum
{

    private static final SnapViewSessionStopReason $VALUES[];
    public static final SnapViewSessionStopReason ABORT_REQUESTED;
    public static final SnapViewSessionStopReason DELETED_SNAP;
    public static final SnapViewSessionStopReason ERROR_STARTING_MEDIA_UNAVAILABLE_FROM_SERVER;
    public static final SnapViewSessionStopReason ERROR_STARTING_MEDIA_UNAVAILABLE_LOCALLY;
    public static final SnapViewSessionStopReason ERROR_UNABLE_TO_SHOW_MEDIA;
    public static final SnapViewSessionStopReason SKIP_REQUESTED;
    public static final SnapViewSessionStopReason TEMPORARY_ABORT_REQUEST;
    public static final SnapViewSessionStopReason TIMER_EXPIRED;
    public static final SnapViewSessionStopReason UNFILLED_AD_PLACEHOLDER;
    private final boolean a;
    private final boolean b;

    private SnapViewSessionStopReason(String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        a = flag;
        b = flag1;
    }

    public static SnapViewSessionStopReason valueOf(String s)
    {
        return (SnapViewSessionStopReason)Enum.valueOf(com/snapchat/android/ui/snapview/SnapViewSessionStopReason, s);
    }

    public static SnapViewSessionStopReason[] values()
    {
        return (SnapViewSessionStopReason[])$VALUES.clone();
    }

    public final boolean isErrorReason()
    {
        return b;
    }

    public final boolean shouldFinishSnap()
    {
        return a;
    }

    static 
    {
        ERROR_STARTING_MEDIA_UNAVAILABLE_FROM_SERVER = new SnapViewSessionStopReason("ERROR_STARTING_MEDIA_UNAVAILABLE_FROM_SERVER", 0, true, true);
        ERROR_STARTING_MEDIA_UNAVAILABLE_LOCALLY = new SnapViewSessionStopReason("ERROR_STARTING_MEDIA_UNAVAILABLE_LOCALLY", 1, false, true);
        ERROR_UNABLE_TO_SHOW_MEDIA = new SnapViewSessionStopReason("ERROR_UNABLE_TO_SHOW_MEDIA", 2, true, true);
        TIMER_EXPIRED = new SnapViewSessionStopReason("TIMER_EXPIRED", 3, true, false);
        ABORT_REQUESTED = new SnapViewSessionStopReason("ABORT_REQUESTED", 4, false, false);
        TEMPORARY_ABORT_REQUEST = new SnapViewSessionStopReason("TEMPORARY_ABORT_REQUEST", 5, false, false);
        SKIP_REQUESTED = new SnapViewSessionStopReason("SKIP_REQUESTED", 6, true, false);
        UNFILLED_AD_PLACEHOLDER = new SnapViewSessionStopReason("UNFILLED_AD_PLACEHOLDER", 7, true, false);
        DELETED_SNAP = new SnapViewSessionStopReason("DELETED_SNAP", 8, false, false);
        $VALUES = (new SnapViewSessionStopReason[] {
            ERROR_STARTING_MEDIA_UNAVAILABLE_FROM_SERVER, ERROR_STARTING_MEDIA_UNAVAILABLE_LOCALLY, ERROR_UNABLE_TO_SHOW_MEDIA, TIMER_EXPIRED, ABORT_REQUESTED, TEMPORARY_ABORT_REQUEST, SKIP_REQUESTED, UNFILLED_AD_PLACEHOLDER, DELETED_SNAP
        });
    }
}
