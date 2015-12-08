// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;


public final class TrackingStates extends Enum
{

    private static final TrackingStates $VALUES[];
    public static final TrackingStates INVITED;
    public static final TrackingStates INVITE_DECLINED;
    public static final TrackingStates ON_EXIT_DETAILS_PRESENTED;
    public static final TrackingStates ON_EXIT_INVITED;
    public static final TrackingStates PENDING_EXIT_SURVEY;
    public static final TrackingStates PENDING_EXIT_SURVEY_NOTIFICATION;
    public static final TrackingStates PENDING_REINVITE;
    public static final TrackingStates PENDING_REPEAT;
    public static final TrackingStates POOLING_DECLINED;
    public static final TrackingStates SURVEY_ABORTED;
    public static final TrackingStates SURVEY_COMPLETED;
    public static final TrackingStates SURVEY_PRESENTED;
    public static final TrackingStates TRACKING;

    private TrackingStates(String s, int i)
    {
        super(s, i);
    }

    public static TrackingStates valueOf(String s)
    {
        return (TrackingStates)Enum.valueOf(com/fsr/tracker/state/TrackingStates, s);
    }

    public static TrackingStates[] values()
    {
        return (TrackingStates[])$VALUES.clone();
    }

    static 
    {
        TRACKING = new TrackingStates("TRACKING", 0);
        INVITED = new TrackingStates("INVITED", 1);
        ON_EXIT_INVITED = new TrackingStates("ON_EXIT_INVITED", 2);
        ON_EXIT_DETAILS_PRESENTED = new TrackingStates("ON_EXIT_DETAILS_PRESENTED", 3);
        PENDING_EXIT_SURVEY_NOTIFICATION = new TrackingStates("PENDING_EXIT_SURVEY_NOTIFICATION", 4);
        POOLING_DECLINED = new TrackingStates("POOLING_DECLINED", 5);
        INVITE_DECLINED = new TrackingStates("INVITE_DECLINED", 6);
        SURVEY_PRESENTED = new TrackingStates("SURVEY_PRESENTED", 7);
        SURVEY_COMPLETED = new TrackingStates("SURVEY_COMPLETED", 8);
        SURVEY_ABORTED = new TrackingStates("SURVEY_ABORTED", 9);
        PENDING_REPEAT = new TrackingStates("PENDING_REPEAT", 10);
        PENDING_REINVITE = new TrackingStates("PENDING_REINVITE", 11);
        PENDING_EXIT_SURVEY = new TrackingStates("PENDING_EXIT_SURVEY", 12);
        $VALUES = (new TrackingStates[] {
            TRACKING, INVITED, ON_EXIT_INVITED, ON_EXIT_DETAILS_PRESENTED, PENDING_EXIT_SURVEY_NOTIFICATION, POOLING_DECLINED, INVITE_DECLINED, SURVEY_PRESENTED, SURVEY_COMPLETED, SURVEY_ABORTED, 
            PENDING_REPEAT, PENDING_REINVITE, PENDING_EXIT_SURVEY
        });
    }
}
