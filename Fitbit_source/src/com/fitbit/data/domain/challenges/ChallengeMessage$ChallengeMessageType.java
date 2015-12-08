// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.challenges;

import com.fitbit.data.domain.s;
import com.fitbit.e.a;
import com.fitbit.util.w;

// Referenced classes of package com.fitbit.data.domain.challenges:
//            ChallengeMessage

public static final class serializableName extends Enum
    implements s
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN CONTRIBUTE;
    public static final UNKNOWN DAILY_GOAL_PROGRESS;
    public static final UNKNOWN DAILY_GOAL_PROGRESS_ACHIEVED;
    public static final UNKNOWN DAILY_GOAL_PROGRESS_ALERT;
    public static final UNKNOWN DAILY_GOAL_STREAK;
    public static final UNKNOWN EARN;
    public static final UNKNOWN END;
    public static final UNKNOWN END_SOON_ALERT;
    public static final UNKNOWN EPIC_DAY;
    public static final UNKNOWN FINAL_RESULTS;
    public static final UNKNOWN INVITE;
    public static final UNKNOWN JOIN;
    public static final UNKNOWN LEAVE;
    public static final UNKNOWN NO_WINNERS;
    public static final UNKNOWN PASS;
    public static final UNKNOWN QUIT;
    public static final UNKNOWN REMATCH;
    public static final UNKNOWN START_ALERT;
    public static final UNKNOWN TALK;
    public static final UNKNOWN UNKNOWN;
    private final String serializableName;

    public static serializableName getSafeChallengeStatusFromString(String s1)
    {
        serializableName serializablename = UNKNOWN;
        try
        {
            s1 = (UNKNOWN)w.a(s1, com/fitbit/data/domain/challenges/ChallengeMessage$ChallengeMessageType);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            a.e("ChallengeMessage", a.a(s1), new Object[0]);
            return serializablename;
        }
        return s1;
    }

    public static UNKNOWN valueOf(String s1)
    {
        return (UNKNOWN)Enum.valueOf(com/fitbit/data/domain/challenges/ChallengeMessage$ChallengeMessageType, s1);
    }

    public static UNKNOWN[] values()
    {
        return (UNKNOWN[])$VALUES.clone();
    }

    public String getSerializableName()
    {
        return serializableName;
    }

    static 
    {
        QUIT = new <init>("QUIT", 0, "QUIT");
        FINAL_RESULTS = new <init>("FINAL_RESULTS", 1, "FINAL_RESULTS");
        TALK = new <init>("TALK", 2, "TALK");
        INVITE = new <init>("INVITE", 3, "INVITE");
        JOIN = new <init>("JOIN", 4, "JOIN");
        LEAVE = new <init>("LEAVE", 5, "LEAVE");
        START_ALERT = new <init>("START_ALERT", 6, "START_ALERT");
        END_SOON_ALERT = new <init>("END_SOON_ALERT", 7, "END_SOON_ALERT");
        END = new <init>("END", 8, "END");
        PASS = new <init>("PASS", 9, "PASS");
        EARN = new <init>("EARN", 10, "EARN");
        EPIC_DAY = new <init>("EPIC_DAY", 11, "EPIC_DAY");
        CONTRIBUTE = new <init>("CONTRIBUTE", 12, "CONTRIBUTE");
        DAILY_GOAL_PROGRESS = new <init>("DAILY_GOAL_PROGRESS", 13, "DAILY_GOAL_PROGRESS");
        DAILY_GOAL_PROGRESS_ACHIEVED = new <init>("DAILY_GOAL_PROGRESS_ACHIEVED", 14, "DAILY_GOAL_PROGRESS_ACHIEVED");
        DAILY_GOAL_PROGRESS_ALERT = new <init>("DAILY_GOAL_PROGRESS_ALERT", 15, "DAILY_GOAL_PROGRESS_ALERT");
        DAILY_GOAL_STREAK = new <init>("DAILY_GOAL_STREAK", 16, "DAILY_GOAL_STREAK");
        NO_WINNERS = new <init>("NO_WINNERS", 17, "NO_WINNERS");
        REMATCH = new <init>("REMATCH", 18, "REMATCH");
        UNKNOWN = new <init>("UNKNOWN", 19, "UNKNOWN");
        $VALUES = (new .VALUES[] {
            QUIT, FINAL_RESULTS, TALK, INVITE, JOIN, LEAVE, START_ALERT, END_SOON_ALERT, END, PASS, 
            EARN, EPIC_DAY, CONTRIBUTE, DAILY_GOAL_PROGRESS, DAILY_GOAL_PROGRESS_ACHIEVED, DAILY_GOAL_PROGRESS_ALERT, DAILY_GOAL_STREAK, NO_WINNERS, REMATCH, UNKNOWN
        });
    }

    private (String s1, int i, String s2)
    {
        super(s1, i);
        serializableName = s2;
    }
}
