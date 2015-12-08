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
//            UrlDownloader, UrlImageViewHelper

public class HttpUrlDownloader
    implements UrlDownloader
{

    private UrlImageViewHelper.RequestPropertiesCallback mRequestPropertiesCallback;

    public HttpUrlDownloader()
    {
    }

    public boolean allowCache()
    {
        return true;
    }

    public boolean canDownloadUrl(String s)
    {
        return s.startsWith("http");
    }

    public void download(final Context context, final String url, String s, final UrlDownloader.UrlDownloaderCallback callback, final Runnable completion)
    {
        UrlImageViewHelper.executeTask(new AsyncTask() {

            final HttpUrlDownloader this$0;
            final UrlDownloader.UrlDownloaderCallback val$callback;
            final Runnable val$completion;
            final Context val$context;
            final String val$url;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Void[])aobj);
            }

            protected transient Void doInBackground(Void avoid[])
            {
                avoid = url;
_L3:
                avoid = (HttpURLConnection)(new URL(avoid)).openConnection();
                avoid.setInstanceFollowRedirects(true);
                if (mRequestPropertiesCallback == null) goto _L2; else goto _L1
_L1:
                Object obj = mRequestPropertiesCallback.getHeadersForRequest(context, url);
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
                callback.onDownloadComplete(HttpUrlDownloader.this, avoid, null);
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
                this$0 = HttpUrlDownloader.this;
                url = s;
                context = context1;
                callback = urldownloadercallback;
                completion = runnable;
                super();
            }
        });
    }

    public UrlImageViewHelper.RequestPropertiesCallback getRequestPropertiesCallback()
    {
        return mRequestPropertiesCallback;
    }

    public void setRequestPropertiesCallback(UrlImageViewHelper.RequestPropertiesCallback requestpropertiescallback)
    {
        mRequestPropertiesCallback = requestpropertiescallback;
    }

}
