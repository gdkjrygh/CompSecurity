// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.testing.util;

import com.google.api.client.util.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class LogRecordingHandler extends Handler
{

    private final List records = Lists.newArrayList();

    public LogRecordingHandler()
    {
    }

    public void close()
        throws SecurityException
    {
    }

    public void flush()
    {
    }

    public List messages()
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        for (Iterator iterator = records.iterator(); iterator.hasNext(); arraylist.add(((LogRecord)iterator.next()).getMessage())) { }
        return arraylist;
    }

    public void publish(LogRecord logrecord)
    {
        records.add(logrecord);
    }
}
