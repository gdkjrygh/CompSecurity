// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.koushikdutta.urlimageviewhelper;

import android.os.AsyncTask;
import java.io.File;
import java.net.URI;

// Referenced classes of package com.koushikdutta.urlimageviewhelper:
//            FileUrlDownloader

class val.completion extends AsyncTask
{

    final FileUrlDownloader this$0;
    final nloaderCallback val$callback;
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
            val$callback.onDownloadComplete(FileUrlDownloader.this, null, (new File(new URI(val$url))).getAbsolutePath());
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
        val$completion.run();
    }

    nloaderCallback()
    {
        this$0 = final_fileurldownloader;
        val$callback = nloadercallback;
        val$url = s;
        val$completion = Runnable.this;
        super();
    }
}
