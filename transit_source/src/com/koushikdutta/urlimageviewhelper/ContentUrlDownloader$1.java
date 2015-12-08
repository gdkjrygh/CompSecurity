// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.koushikdutta.urlimageviewhelper;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;

// Referenced classes of package com.koushikdutta.urlimageviewhelper:
//            ContentUrlDownloader

class val.completion extends AsyncTask
{

    final ContentUrlDownloader this$0;
    final aderCallback val$callback;
    final Runnable val$completion;
    final Context val$context;
    final String val$url;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        try
        {
            avoid = val$context.getContentResolver().openInputStream(Uri.parse(val$url));
            val$callback.onDownloadComplete(ContentUrlDownloader.this, avoid, null);
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

    aderCallback()
    {
        this$0 = final_contenturldownloader;
        val$context = context1;
        val$url = s;
        val$callback = adercallback;
        val$completion = Runnable.this;
        super();
    }
}
