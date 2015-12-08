// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import android.graphics.drawable.Drawable;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerBioViewModel;
import org.joda.time.DateTime;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.events:
//            EventViewModel

public static class a
{

    private PlayerBioViewModel bio;
    private String event;
    private String eventType;
    private Drawable goal;
    private Drawable redCard;
    private String time;
    private DateTime timestamp;
    private String type;

    public a bio(PlayerBioViewModel playerbioviewmodel)
    {
        bio = playerbioviewmodel;
        return this;
    }

    public EventViewModel build()
    {
        return new EventViewModel(eventType, type, time, bio, event, timestamp, goal, redCard);
    }

    public redCard event(String s)
    {
        event = s;
        return this;
    }

    public event eventType(String s)
    {
        eventType = s;
        return this;
    }

    public eventType goal(Drawable drawable)
    {
        goal = drawable;
        return this;
    }

    public goal redCard(Drawable drawable)
    {
        redCard = drawable;
        return this;
    }

    public redCard time(String s)
    {
        time = s;
        return this;
    }

    public time timestamp(DateTime datetime)
    {
        timestamp = datetime;
        return this;
    }

    public String toString()
    {
        return (new StringBuilder()).append("EventViewModel.EventViewModelBuilder(eventType=").append(eventType).append(", type=").append(type).append(", time=").append(time).append(", bio=").append(bio).append(", event=").append(event).append(", timestamp=").append(timestamp).append(", goal=").append(goal).append(", redCard=").append(redCard).append(")").toString();
    }

    public redCard type(String s)
    {
        type = s;
        return this;
    }

    a()
    {
    }
}
