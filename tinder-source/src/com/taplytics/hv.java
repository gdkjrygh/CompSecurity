// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class hv
{

    private static final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();

    public static ScheduledExecutorService a()
    {
        return a;
    }

}
