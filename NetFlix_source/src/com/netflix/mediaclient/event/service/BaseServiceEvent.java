// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.service;

import com.netflix.mediaclient.event.nrdp.BaseUIEvent;

public abstract class BaseServiceEvent extends BaseUIEvent
{

    public BaseServiceEvent(String s)
    {
        super(s);
    }

    public String getObject()
    {
        return "nrdp.service";
    }
}
