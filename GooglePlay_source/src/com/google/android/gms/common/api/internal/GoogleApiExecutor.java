// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class GoogleApiExecutor
{

    private static final ExecutorService sInstance = Executors.newFixedThreadPool(2, new NumberedThreadFactory("GAC_Executor"));

    public static ExecutorService getInstance()
    {
        return sInstance;
    }

}
