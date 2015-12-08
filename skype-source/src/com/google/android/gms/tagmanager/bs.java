// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class bs
    implements db.c
{

    private final Context a;
    private final String b;
    private final ExecutorService c = Executors.newSingleThreadExecutor();

    bs(Context context, String s)
    {
        a = context;
        b = s;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        c.shutdown();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
