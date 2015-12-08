// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events;

import android.content.Context;
import android.location.Location;
import java.util.Queue;
import org.json.JSONObject;

public interface IEvent
{

    public abstract boolean addToQueue(Queue queue);

    public abstract void afterSend(boolean flag);

    public abstract void beforeSend();

    public abstract Context getContext();

    public abstract Location getEventLocation();

    public abstract JSONObject getJSON();

    public abstract void setEventLocation(Location location);
}
