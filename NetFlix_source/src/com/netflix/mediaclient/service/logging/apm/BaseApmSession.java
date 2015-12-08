// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm;

import com.netflix.mediaclient.service.logging.client.BaseLoggingSession;

public abstract class BaseApmSession extends BaseLoggingSession
{

    public static final String CATEGORY = "uiQOE";

    public BaseApmSession()
    {
    }

    public String getCategory()
    {
        return "uiQOE";
    }
}
