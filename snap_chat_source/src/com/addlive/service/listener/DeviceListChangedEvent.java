// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service.listener;

import org.json.JSONObject;

public class DeviceListChangedEvent
{

    private boolean audioIn;
    private boolean audioOut;
    private boolean videoIn;

    public DeviceListChangedEvent(JSONObject jsonobject)
    {
        audioIn = jsonobject.getBoolean("audioIn");
        audioOut = jsonobject.getBoolean("audioOut");
        videoIn = jsonobject.getBoolean("videoIn");
    }

    public String toString()
    {
        return (new StringBuilder("DeviceListChangedEvent{audioIn=")).append(audioIn).append(", audioOut=").append(audioOut).append(", videoIn=").append(videoIn).append("}").toString();
    }
}
