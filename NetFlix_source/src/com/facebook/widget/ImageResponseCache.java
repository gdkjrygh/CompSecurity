// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FileLruCache;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

class ImageResponseCache
{
    private static class BufferedHttpInputStream extends BufferedInputStream
    {

        HttpURLConnection connection;

        public void close()
            throws IOException
        {
            super.close();
            Utility.disconnectQuietly(connection);
        }

        BufferedHttpInputStream(InputStream inputstream, HttpURLConnection httpurlconnection)
        {
            super(inputstream, 8192);
            connection = httpurlconnection;
        }
    }


    static final String TAG = com/facebook/widget/ImageResponseCache.getSimpleName();
    private static volatile FileLruCache imageCache;

    ImageResponseCache()
    {
    }

    static FileLruCache getCache(Context context)
        throws IOException
    {
        com/facebook/widget/ImageResponseCache;
        JVM INSTR monitorenter ;
        if (imageCache == null)
        {
            imageCache = new FileLruCache(context.getApplicationContext(), TAG, new com.facebook.internal.FileLruCache.Limits());
        }
        context = imageCache;
        com/facebook/widget/ImageResponseCache;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static InputStream getCachedImageStream(URL url, Context context)
    {
        Object obj = null;
        InputStream inputstream = obj;
        if (url != null)
        {
            inputstream = obj;
            if (isCDNURL(url))
            {
                try
                {
                    inputstream = getCache(context).get(url.toString());
                }
                // Misplaced declaration of an exception variable
                catch (URL url)
                {
                    Logger.log(LoggingBehavior.CACHE, 5, TAG, url.toString());
                    return null;
                }
            }
        }
        return inputstream;
    }

    static InputStream interceptAndCacheImageStream(Context context, HttpURLConnection httpurlconnection)
        throws IOException
    {
        InputStream inputstream = null;
        if (httpurlconnection.getResponseCode() == 200)
        {
            URL url = httpurlconnection.getURL();
            InputStream inputstream1 = httpurlconnection.getInputStream();
            inputstream = inputstream1;
            if (isCDNURL(url))
            {
                try
                {
                    inputstream = getCache(context).interceptAndPut(url.toString(), new BufferedHttpInputStream(inputstream1, httpurlconnection));
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return inputstream1;
                }
            }
        }
        return inputstream;
    }

    private static boolean isCDNURL(URL url)
    {
        if (url != null)
        {
            for (url = url.getHost(); url.endsWith("fbcdn.net") || url.startsWith("fbcdn") && url.endsWith("akamaihd.net");)
            {
                return true;
            }

        }
        return false;
    }

}
