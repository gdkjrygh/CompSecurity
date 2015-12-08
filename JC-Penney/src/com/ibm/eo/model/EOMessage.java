// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.model;

import com.ibm.eo.EOCore;
import org.json.JSONObject;

public abstract class EOMessage
{

    private Integer logLevel;
    private long offset;

    public EOMessage()
    {
        setLogLevel(Integer.valueOf(EOCore.getConfigItemInt("LoggingLevel", EOCore.getInstance())));
        setOffset(EOCore.getTimestampFromSession());
    }

    public abstract JSONObject getJSON();

    public final Integer getLogLevel()
    {
        return logLevel;
    }

    public final long getOffset()
    {
        return offset;
    }

    public final void setLogLevel(Integer integer)
    {
        logLevel = integer;
    }

    public final void setOffset(long l)
    {
        offset = l;
    }
}
