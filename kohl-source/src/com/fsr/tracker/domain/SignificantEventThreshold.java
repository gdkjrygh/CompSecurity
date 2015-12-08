// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.domain;

import java.io.Serializable;

public class SignificantEventThreshold
    implements Serializable
{

    private String eventName;
    private int threshold;

    public SignificantEventThreshold(String s, int i)
    {
        eventName = s;
        threshold = i;
    }

    public String getEventName()
    {
        return eventName;
    }

    public int getThreshold()
    {
        return threshold;
    }

    public void setEventName(String s)
    {
        eventName = s;
    }

    public void setThreshold(int i)
    {
        threshold = i;
    }
}
