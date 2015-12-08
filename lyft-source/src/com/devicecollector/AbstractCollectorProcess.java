// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;
import java.util.EnumSet;

public abstract class AbstractCollectorProcess extends AsyncTask
{

    protected DeviceCollector.StatusListener a;
    protected Activity b;
    protected boolean c;
    protected EnumSet d;
    private long e;
    private boolean f;

    public AbstractCollectorProcess(Activity activity, DeviceCollector.StatusListener statuslistener, EnumSet enumset)
    {
        c = true;
        e = 10000L;
        f = false;
        a = statuslistener;
        b = activity;
        d = enumset;
        c = false;
    }

    protected transient abstract Void a(String as[]);

    public void a(long l)
    {
        if (l > 5000L)
        {
            e = l;
            f = true;
        }
    }

    transient void a(String s, Object aobj[])
    {
        String s1 = getClass().getSimpleName();
        Log.v(s1, (new StringBuilder()).append("[").append(s1).append("]").append(String.format(s, aobj)).toString());
    }

    public boolean a()
    {
        return c;
    }

    public long b()
    {
        return e;
    }

    public boolean c()
    {
        return f;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPreExecute()
    {
        if (a != null)
        {
            a.a();
        }
        c = false;
    }
}
