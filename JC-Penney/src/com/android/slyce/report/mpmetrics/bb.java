// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            bc, bd

class bb
{

    private final Executor a = Executors.newSingleThreadExecutor();

    public bb()
    {
    }

    public Future a(Context context, String s, bd bd)
    {
        context = new FutureTask(new bc(context, s, bd));
        a.execute(context);
        return context;
    }
}
