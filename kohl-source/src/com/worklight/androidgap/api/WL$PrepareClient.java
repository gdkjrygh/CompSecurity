// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.api;

import android.content.Context;
import android.os.AsyncTask;

// Referenced classes of package com.worklight.androidgap.api:
//            WL, WLInitWebFrameworkListener, WLInitWebFrameworkResult

private class listener extends AsyncTask
{

    private WLInitWebFrameworkListener listener;
    final WL this$0;

    protected transient WLInitWebFrameworkResult doInBackground(Context acontext[])
    {
        return WL.access$000(WL.this, acontext[0]);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Context[])aobj);
    }

    protected void onPostExecute(WLInitWebFrameworkResult wlinitwebframeworkresult)
    {
        if (listener != null)
        {
            listener.onInitWebFrameworkComplete(wlinitwebframeworkresult);
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((WLInitWebFrameworkResult)obj);
    }

    kListener(WLInitWebFrameworkListener wlinitwebframeworklistener)
    {
        this$0 = WL.this;
        super();
        listener = null;
        listener = wlinitwebframeworklistener;
    }
}
