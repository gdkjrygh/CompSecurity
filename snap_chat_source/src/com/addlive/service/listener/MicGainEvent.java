// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service.listener;

import org.json.JSONObject;

public class MicGainEvent
{

    private int gain;

    public MicGainEvent(JSONObject jsonobject)
    {
        gain = jsonobject.getInt("gain");
    }

    public String toString()
    {
        return (new StringBuilder("MicGainEvent{gain=")).append(gain).append("}").toString();
    }
}
