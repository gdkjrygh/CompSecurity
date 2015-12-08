// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.logging.Logger;

public final class $Stopwatch
{

    private static final Logger logger = Logger.getLogger(com/google/inject/internal/util/$Stopwatch.getName());
    private long start;

    public $Stopwatch()
    {
        start = System.currentTimeMillis();
    }

    public long reset()
    {
        long l = System.currentTimeMillis();
        long l1 = start;
        start = l;
        return l - l1;
        Exception exception;
        exception;
        start = l;
        throw exception;
    }

    public void resetAndLog(String s)
    {
        logger.fine((new StringBuilder()).append(s).append(": ").append(reset()).append("ms").toString());
    }

}
