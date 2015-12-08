// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service.listener;

import org.json.JSONObject;

public class SubscribersCountChangedEvent
{

    private long count;

    public SubscribersCountChangedEvent(JSONObject jsonobject)
    {
        count = jsonobject.getJSONObject("params").getLong("count");
    }

    public long getCount()
    {
        return count;
    }

    public String toString()
    {
        return (new StringBuilder("SubscribersCountChangedEvent{count='")).append(count).append('\'').append('}').toString();
    }
}
