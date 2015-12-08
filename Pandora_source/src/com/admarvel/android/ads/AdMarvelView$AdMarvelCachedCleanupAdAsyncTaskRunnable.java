// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelView, Version, AdMarvelCachedCleanupAdAsyncTask

private static class m_cachedDirectory
    implements Runnable
{

    private final File m_cachedDirectory;
    private final WeakReference m_contextReference;

    public void run()
    {
        Context context;
label0:
        {
            context = (Context)m_contextReference.get();
            if (context != null)
            {
                if (Version.getAndroidSDKVersion() < 11)
                {
                    break label0;
                }
                (new AdMarvelCachedCleanupAdAsyncTask(context, m_cachedDirectory)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
            }
            return;
        }
        (new AdMarvelCachedCleanupAdAsyncTask(context, m_cachedDirectory)).execute(new Object[0]);
    }

    public (Context context, File file)
    {
        m_contextReference = new WeakReference(context);
        m_cachedDirectory = file;
    }
}
