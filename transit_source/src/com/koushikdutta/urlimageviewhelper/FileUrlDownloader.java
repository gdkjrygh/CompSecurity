// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.koushikdutta.urlimageviewhelper;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import java.net.URI;

// Referenced classes of package com.koushikdutta.urlimageviewhelper:
//            UrlDownloader, UrlImageViewHelper

public class FileUrlDownloader
    implements UrlDownloader
{

    public FileUrlDownloader()
    {
    }

    public boolean allowCache()
    {
        return false;
    }

    public boolean canDownloadUrl(String s)
    {
        return s.startsWith("file:/");
    }

    public void download(Context context, final String url, String s, final UrlDownloader.UrlDownloaderCallback callback, final Runnable completion)
    {
        UrlImageViewHelper.executeTask(new AsyncTask() {

            final FileUrlDownloader this$0;
            final UrlDownloader.UrlDownloaderCallback val$callback;
            final Runnable val$completion;
            final String val$url;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Void[])aobj);
            }

            protected transient Void doInBackground(Void avoid[])
            {
                try
                {
                    callback.onDownloadComplete(FileUrlDownloader.this, null, (new File(new URI(url))).getAbsolutePath());
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    avoid.printStackTrace();
                    return null;
                }
                return null;
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((Void)obj);
            }

            protected void onPostExecute(Void void1)
            {
                completion.run();
            }

            
            {
                this$0 = FileUrlDownloader.this;
                callback = urldownloadercallback;
                url = s;
                completion = runnable;
                super();
            }
        });
    }
}
