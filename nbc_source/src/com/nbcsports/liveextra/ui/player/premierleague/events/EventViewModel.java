// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import android.graphics.drawable.Drawable;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerBioViewModel;
import org.joda.time.DateTime;

public class EventViewModel
{
    public static class EventViewModelBuilder
    {

        private PlayerBioViewModel bio;
        private String event;
        private String eventType;
        private Drawable goal;
        private Drawable redCard;
        private String time;
        private DateTime timestamp;
        private String type;

        public EventViewModelBuilder bio(PlayerBioViewModel playerbioviewmodel)
        {
            bio = playerbioviewmodel;
            return this;
        }

        public EventViewModel build()
        {
            return new EventViewModel(eventType, type, time, bio, event, timestamp, goal, redCard);
        }

        public EventViewModelBuilder event(String s)
        {
            event = s;
            return this;
        }

        public EventViewModelBuilder eventType(String s)
        {
            eventType = s;
            return this;
        }

        public EventViewModelBuilder goal(Drawable drawable)
        {
            goal = drawable;
            return this;
        }

        public EventViewModelBuilder redCard(Drawable drawable)
        {
            redCard = drawable;
            return this;
        }

        public EventViewModelBuilder time(String s)
        {
            time = s;
            return this;
        }

        public EventViewModelBuilder timestamp(DateTime datetime)
        {
            timestamp = datetime;
            return this;
        }

        public String toString()
        {
            return (new StringBuilder()).append("EventViewModel.EventViewModelBuilder(eventType=").append(eventType).append(", type=").append(type).append(", time=").append(time).append(", bio=").append(bio).append(", event=").append(event).append(", timestamp=").append(timestamp).append(", goal=").append(goal).append(", redCard=").append(redCard).append(")").toString();
        }

        public EventViewModelBuilder type(String s)
        {
            type = s;
            return this;
        }

        EventViewModelBuilder()
        {
        }
    }


    public static final String CARD = "Card";
    public static final String END_HALF = "EndHalf";
    public static final String GOAL = "Goal";
    public static final String PRE_MATCH = "PreMatch";
    public static final String RED_CARD = "Red";
    public static final CharSequence SECOND_YELLOW_CARD = "SecondYellow";
    public static final String START_HALF = "StartHalf";
    public static final String SUBSTITUTION = "Sub";
    public static final String YELLOW_CARD = "Yellow";
    PlayerBioViewModel bio;
    String event;
    String eventType;
    private Drawable goal;
    private Drawable redCard;
    String time;
    DateTime timestamp;
    String type;

    EventViewModel(String s, String s1, String s2, PlayerBioViewModel playerbioviewmodel, String s3, DateTime datetime, Drawable drawable, 
            Drawable drawable1)
    {
        bio = PlayerBioViewModel.builder().build();
        eventType = s;
        type = s1;
        time = s2;
        bio = playerbioviewmodel;
        event = s3;
        timestamp = datetime;
        goal = drawable;
        redCard = drawable1;
    }

    public static EventViewModelBuilder builder()
    {
        return new EventViewModelBuilder();
    }

    protected boolean canEqual(Object obj)
    {
        return obj instanceof EventViewModel;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof EventViewModel))
            {
                return false;
            }
            Object obj1 = (EventViewModel)obj;
            if (!((EventViewModel) (obj1)).canEqual(this))
            {
                return false;
            }
            obj = timestamp;
            obj1 = ((EventViewModel) (obj1)).timestamp;
            if (obj != null ? !obj.equals(obj1) : obj1 != null)
            {
                return false;
            }
        }
        return true;
    }

    public PlayerBioViewModel getBio()
    {
        return bio;
    }

    public String getTime()
    {
        return time;
    }

    public int hashCode()
    {
        DateTime datetime = timestamp;
        int i;
        if (datetime == null)
        {
            i = 0;
        } else
        {
            i = datetime.hashCode();
        }
        return i + 59;
    }

    public boolean isStart()
    {
        return eventType.equals("StartHalf");
    }

}
