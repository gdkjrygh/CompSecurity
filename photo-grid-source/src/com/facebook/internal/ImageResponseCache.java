// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.facebook.internal:
//            FileLruCache, Logger

class ImageResponseCache
{

    static final String TAG = com/facebook/internal/ImageResponseCache.getSimpleName();
    private static volatile FileLruCache imageCache;

    ImageResponseCache()
    {
    }

    static void clearCache(Context context)
    {
        try
        {
            getCache(context).clearCache();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.log(LoggingBehavior.CACHE, 5, TAG, (new StringBuilder("clearCache failed ")).append(context.getMessage()).toString());
        }
    }

    static FileLruCache getCache(Context context)
    {
        com/facebook/internal/ImageResponseCache;
        JVM INSTR monitorenter ;
        if (imageCache == null)
        {
            imageCache = new FileLruCache(TAG, new FileLruCache.Limits());
        }
        context = imageCache;
        com/facebook/internal/ImageResponseCache;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static InputStream getCachedImageStream(Uri uri, Context context)
    {
        Object obj = null;
        InputStream inputstream = obj;
        if (uri != null)
        {
            inputstream = obj;
            if (isCDNURL(uri))
            {
                try
                {
                    inputstream = getCache(context).get(uri.toString());
                }
                // Misplaced declaration of an exception variable
                catch (Uri uri)
                {
                    Logger.log(LoggingBehavior.CACHE, 5, TAG, uri.toString());
                    return null;
                }
            }
        }
        return inputstream;
    }

    static InputStream interceptAndCacheImageStream(Context context, HttpURLConnection httpurlconnection)
    {
        InputStream inputstream = null;
        if (httpurlconnection.getResponseCode() == 200)
        {
            Uri uri = Uri.parse(httpurlconnection.getURL().toString());
            InputStream inputstream1 = httpurlconnection.getInputStream();
            inputstream = inputstream1;
            try
            {
                if (isCDNURL(uri))
                {
                    inputstream = getCache(context).interceptAndPut(uri.toString(), new BufferedHttpInputStream(inputstream1, httpurlconnection));
                }
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return inputstream1;
            }
        }
        return inputstream;
    }

    private static boolean isCDNURL(Uri uri)
    {
        if (uri != null)
        {
            for (uri = uri.getHost(); uri.endsWith("fbcdn.net") || uri.startsWith("fbcdn") && uri.endsWith("akamaihd.net");)
            {
                return true;
            }

        }
        return false;
    }


    private class BufferedHttpInputStream extends BufferedInputStream
    {

        HttpURLConnection connection;

        public void close()
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

}
