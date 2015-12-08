// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.koushikdutta.urlimageviewhelper;

import android.content.Context;
import android.os.AsyncTask;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.NameValuePair;

// Referenced classes of package com.koushikdutta.urlimageviewhelper:
//            HttpUrlDownloader, UrlImageViewHelper

class val.completion extends AsyncTask
{

    final HttpUrlDownloader this$0;
    final nloaderCallback val$callback;
    final Runnable val$completion;
    final Context val$context;
    final String val$url;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        avoid = val$url;
_L3:
        avoid = (HttpURLConnection)(new URL(avoid)).openConnection();
        avoid.setInstanceFollowRedirects(true);
        if (HttpUrlDownloader.access$000(HttpUrlDownloader.this) == null) goto _L2; else goto _L1
_L1:
        Object obj = HttpUrlDownloader.access$000(HttpUrlDownloader.this).getHeadersForRequest(val$context, val$url);
        if (obj != null)
        {
            try
            {
                NameValuePair namevaluepair;
                for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); avoid.addRequestProperty(namevaluepair.getName(), namevaluepair.getValue()))
                {
                    namevaluepair = (NameValuePair)((Iterator) (obj)).next();
                }

            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                avoid.printStackTrace();
                return null;
            }
        }
_L2:
        if (avoid.getResponseCode() == 302 || avoid.getResponseCode() == 301)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        if (avoid.getResponseCode() == 200)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        UrlImageViewHelper.clog((new StringBuilder()).append("Response Code: ").append(avoid.getResponseCode()).toString(), new Object[0]);
        return null;
        avoid = avoid.getHeaderField("Location");
          goto _L3
        avoid = avoid.getInputStream();
        val$callback.onDownloadComplete(HttpUrlDownloader.this, avoid, null);
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
        this$0 = final_httpurldownloader;
        val$url = s;
        val$context = context1;
        val$callback = nloadercallback;
        val$completion = Runnable.this;
        super();
    }
}
