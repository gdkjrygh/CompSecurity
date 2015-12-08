// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import android.os.AsyncTask;

public abstract class b extends AsyncTask
{

    public b()
    {
    }

    public transient AsyncTask a(Object aobj[])
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, aobj);
        } else
        {
            return execute(aobj);
        }
    }
}
