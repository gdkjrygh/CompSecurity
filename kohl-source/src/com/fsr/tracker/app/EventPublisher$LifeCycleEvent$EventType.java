// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;


// Referenced classes of package com.fsr.tracker.app:
//            EventPublisher

public static final class value extends Enum
{

    private static final UNDEFINED $VALUES[];
    public static final UNDEFINED DEBUG;
    public static final UNDEFINED INVITE_ACCEPTED;
    public static final UNDEFINED INVITE_DECLINED;
    public static final UNDEFINED INVITE_PRESENTED;
    public static final UNDEFINED SESSION_ENDED;
    public static final UNDEFINED SESSION_STARTED;
    public static final UNDEFINED STATE_UPDATED;
    public static final UNDEFINED UNDEFINED;
    private String value;

    public static value fromValue(String s)
    {
        value avalue[] = values();
        int j = avalue.length;
        for (int i = 0; i < j; i++)
        {
            value value1 = avalue[i];
            if (value1.value.equals(s))
            {
                return value1;
            }
        }

        return UNDEFINED;
    }

    public static UNDEFINED valueOf(String s)
    {
        return (UNDEFINED)Enum.valueOf(com/fsr/tracker/app/EventPublisher$LifeCycleEvent$EventType, s);
    }

    public static UNDEFINED[] values()
    {
        return (UNDEFINED[])$VALUES.clone();
    }

    public boolean equals(String s)
    {
        return value.equals(s);
    }

    public String value()
    {
        return value;
    }

    static 
    {
        SESSION_STARTED = new <init>("SESSION_STARTED", 0, "SESSION_STARTED");
        SESSION_ENDED = new <init>("SESSION_ENDED", 1, "SESSION_ENDED");
        INVITE_PRESENTED = new <init>("INVITE_PRESENTED", 2, "INVITE_PRESENTED");
        INVITE_ACCEPTED = new <init>("INVITE_ACCEPTED", 3, "INVITE_ACCEPTED");
        INVITE_DECLINED = new <init>("INVITE_DECLINED", 4, "INVITE_DECLINED");
        STATE_UPDATED = new <init>("STATE_UPDATED", 5, "STATE_UPDATED");
        DEBUG = new <init>("DEBUG", 6, "DEBUG");
        UNDEFINED = new <init>("UNDEFINED", 7, "UNDEFINED");
        $VALUES = (new .VALUES[] {
            SESSION_STARTED, SESSION_ENDED, INVITE_PRESENTED, INVITE_ACCEPTED, INVITE_DECLINED, STATE_UPDATED, DEBUG, UNDEFINED
        });
    }


    private A(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
