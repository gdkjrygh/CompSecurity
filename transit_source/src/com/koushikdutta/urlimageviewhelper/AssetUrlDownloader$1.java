// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.koushikdutta.urlimageviewhelper;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.AsyncTask;

// Referenced classes of package com.koushikdutta.urlimageviewhelper:
//            AssetUrlDownloader

class val.completion extends AsyncTask
{

    final AssetUrlDownloader this$0;
    final loaderCallback val$callback;
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
            avoid = val$url.replaceFirst("file:///android_asset/", "");
            avoid = val$context.getAssets().open(avoid);
            val$callback.onDownloadComplete(AssetUrlDownloader.this, avoid, null);
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

    loaderCallback()
    {
        this$0 = final_asseturldownloader;
        val$url = s;
        val$context = context1;
        val$callback = loadercallback;
        val$completion = Runnable.this;
        super();
    }
}
