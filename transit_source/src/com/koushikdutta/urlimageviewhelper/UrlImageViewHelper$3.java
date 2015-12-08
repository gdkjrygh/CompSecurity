// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.koushikdutta.urlimageviewhelper;

import android.os.AsyncTask;

// Referenced classes of package com.koushikdutta.urlimageviewhelper:
//            UrlImageViewHelper

static final class val.completion extends AsyncTask
{

    final Runnable val$completion;
    final String val$filename;
    final ader val$loader;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        val$loader.onDownloadComplete(null, null, val$filename);
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        val$completion.run();
    }

    ader(ader ader, String s, Runnable runnable)
    {
        val$loader = ader;
        val$filename = s;
        val$completion = runnable;
        super();
    }
}
