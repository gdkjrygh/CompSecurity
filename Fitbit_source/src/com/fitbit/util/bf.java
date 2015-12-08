// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

public abstract class bf extends AsyncTaskLoader
{

    protected Object f;

    public bf(Context context)
    {
        super(context);
    }

    protected boolean a(Object obj)
    {
        return true;
    }

    public void deliverResult(Object obj)
    {
        if (a(obj))
        {
            super.deliverResult(obj);
            return;
        } else
        {
            commitContentChanged();
            return;
        }
    }

    protected abstract Object f_();

    public final Object loadInBackground()
    {
        Object obj = f_();
        f = obj;
        return obj;
    }

    protected void onReset()
    {
        super.onReset();
        cancelLoad();
    }

    protected void onStartLoading()
    {
        boolean flag = takeContentChanged();
        if (f != null && !flag)
        {
            deliverResult(f);
            return;
        } else
        {
            forceLoad();
            return;
        }
    }

    protected void onStopLoading()
    {
        super.onStopLoading();
        cancelLoad();
    }

    public void stopLoading()
    {
        super.stopLoading();
        cancelLoad();
    }
}
