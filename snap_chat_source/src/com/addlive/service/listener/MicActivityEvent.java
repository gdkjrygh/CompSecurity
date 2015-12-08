// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service.listener;

import org.json.JSONObject;

public class MicActivityEvent
{

    private int activity;

    public MicActivityEvent(JSONObject jsonobject)
    {
        activity = jsonobject.getInt("activity");
    }

    public String toString()
    {
        return (new StringBuilder("MicActivityEvent{activity=")).append(activity).append("}").toString();
    }
}
