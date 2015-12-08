// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.service.sync;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class NotificationImageDownloader extends AsyncTask
{

    private static final int CONNECT_TIMEOUT = 10000;
    private static final int READ_TIMEOUT = 10000;

    public NotificationImageDownloader()
    {
    }

    protected transient Bitmap doInBackground(String as[])
    {
        Object obj = null;
        as = (HttpURLConnection)(new URL(as[0])).openConnection();
        as.setConnectTimeout(10000);
        as.setReadTimeout(10000);
        obj = BitmapFactory.decodeStream(as.getInputStream());
        if (as != null)
        {
            as.disconnect();
        }
        return ((Bitmap) (obj));
        obj;
        as = null;
_L4:
        ((IOException) (obj)).printStackTrace();
        if (as != null)
        {
            as.disconnect();
        }
        return null;
        as;
_L2:
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw as;
        Exception exception;
        exception;
        obj = as;
        as = exception;
        continue; /* Loop/switch isn't completed */
        exception;
        obj = as;
        as = exception;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }
}
