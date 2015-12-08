// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import mc;
import oO;
import oV;
import pn;

public class UploadUsageAnalyticsTask extends oV
{
    public class Payload extends mc
    {

        Payload()
        {
        }
    }


    private final String a;

    public UploadUsageAnalyticsTask(String s)
    {
        a = s;
    }

    public pn getRequestPayload()
    {
        return new oO(new Payload());
    }

    public String getUrl()
    {
        return a;
    }
}
