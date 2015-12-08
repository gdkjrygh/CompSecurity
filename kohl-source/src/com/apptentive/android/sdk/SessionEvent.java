// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk;

import com.apptentive.android.sdk.util.Util;

public class SessionEvent
{
    public static final class Action extends Enum
    {

        private static final Action $VALUES[];
        public static final Action START;
        public static final Action STOP;

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/apptentive/android/sdk/SessionEvent$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])$VALUES.clone();
        }

        static 
        {
            START = new Action("START", 0);
            STOP = new Action("STOP", 1);
            $VALUES = (new Action[] {
                START, STOP
            });
        }

        private Action(String s, int i)
        {
            super(s, i);
        }
    }


    private Action action;
    private String activityName;
    private long id;
    private long time;

    public SessionEvent()
    {
    }

    public SessionEvent(long l, Action action1, String s)
    {
        time = l;
        action = action1;
        activityName = s;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof SessionEvent)
        {
            if (getAction() == ((SessionEvent) (obj = (SessionEvent)obj)).getAction() && getActivityName().equals(((SessionEvent) (obj)).getActivityName()) && getTime() == ((SessionEvent) (obj)).getTime())
            {
                return true;
            }
        }
        return false;
    }

    public Action getAction()
    {
        return action;
    }

    public String getActivityName()
    {
        return activityName;
    }

    public String getDebugString()
    {
        long l = id;
        StringBuilder stringbuilder = (new StringBuilder()).append(action.name());
        String s;
        if (isStopEvent())
        {
            s = " ";
        } else
        {
            s = "";
        }
        return String.format("#%d : %s : %s : %s", new Object[] {
            Long.valueOf(l), stringbuilder.append(s).toString(), activityName, Util.dateToIso8601String(time)
        });
    }

    public long getId()
    {
        return id;
    }

    public long getTime()
    {
        return time;
    }

    public boolean isStartEvent()
    {
        return action == Action.START;
    }

    public boolean isStopEvent()
    {
        return action == Action.STOP;
    }

    public void setAction(Action action1)
    {
        action = action1;
    }

    public void setActivityName(String s)
    {
        activityName = s;
    }

    public void setId(long l)
    {
        id = l;
    }

    public void setTime(long l)
    {
        time = l;
    }
}
