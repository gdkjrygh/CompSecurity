// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, AdMarvelJavascriptCachedAdAsyncTask, AdMarvelInternalWebView

private static class storage
    implements Runnable
{

    private final String callback;
    private final WeakReference contextReference;
    private final File storage;
    private final int timeout;
    private final String url;
    private final WeakReference view;

    public void run()
    {
        if (contextReference.get() != null && view.get() != null)
        {
            (new AdMarvelJavascriptCachedAdAsyncTask((Context)contextReference.get(), (AdMarvelInternalWebView)view.get(), storage)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] {
                url, callback, Integer.valueOf(timeout)
            });
        }
    }

    public (Context context, AdMarvelInternalWebView admarvelinternalwebview, String s, String s1, int i, File file)
    {
        contextReference = new WeakReference(context);
        view = new WeakReference(admarvelinternalwebview);
        url = s;
        callback = s1;
        timeout = i;
        storage = file;
    }
}
