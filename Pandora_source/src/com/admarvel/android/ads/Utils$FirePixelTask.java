// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.admarvel.android.ads:
//            Utils

private class urlString extends AsyncTask
{

    final Utils this$0;
    private String urlString;

    protected transient Boolean doInBackground(Void avoid[])
    {
        avoid = (Context)Utils.access$0(Utils.this).get();
        if (avoid != null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        return Boolean.valueOf(false);
        if (!((ConnectivityManager)avoid.getSystemService("connectivity")).getActiveNetworkInfo().isConnected())
        {
            break MISSING_BLOCK_LABEL_102;
        }
        avoid = (HttpURLConnection)(new URL(urlString)).openConnection();
        avoid.setReadTimeout(10000);
        avoid.setConnectTimeout(5000);
        avoid.connect();
        if (avoid.getResponseCode() == 200)
        {
            return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
        avoid;
        avoid.printStackTrace();
        return Boolean.valueOf(false);
    }

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    public (String s)
    {
        this$0 = Utils.this;
        super();
        urlString = s;
    }
}
