// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import com.facebook.internal.FileLruCache;
import com.facebook.internal.Utility;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

class UrlRedirectCache
{

    private static final String REDIRECT_CONTENT_TAG = (new StringBuilder()).append(TAG).append("_Redirect").toString();
    static final String TAG = com/facebook/widget/UrlRedirectCache.getSimpleName();
    private static volatile FileLruCache urlRedirectCache;

    UrlRedirectCache()
    {
    }

    static void cacheUrlRedirect(Context context, URL url, URL url1)
    {
        if (url == null || url1 == null)
        {
            return;
        }
        Context context2 = null;
        Context context1 = null;
        try
        {
            context = getCache(context).openPutStream(url.toString(), REDIRECT_CONTENT_TAG);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Utility.closeQuietly(context1);
            return;
        }
        finally
        {
            Utility.closeQuietly(context2);
        }
        context1 = context;
        context2 = context;
        context.write(url1.toString().getBytes());
        Utility.closeQuietly(context);
        return;
        throw context;
    }

    static FileLruCache getCache(Context context)
        throws IOException
    {
        com/facebook/widget/UrlRedirectCache;
        JVM INSTR monitorenter ;
        if (urlRedirectCache == null)
        {
            urlRedirectCache = new FileLruCache(context.getApplicationContext(), TAG, new com.facebook.internal.FileLruCache.Limits());
        }
        context = urlRedirectCache;
        com/facebook/widget/UrlRedirectCache;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static URL getRedirectedUrl(Context context, URL url)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        if (url == null)
        {
            return null;
        }
        url = url.toString();
        obj3 = null;
        obj1 = null;
        obj2 = null;
        obj = null;
        FileLruCache filelrucache = getCache(context);
        boolean flag;
        flag = false;
        context = null;
_L5:
        obj = filelrucache.get(url, REDIRECT_CONTENT_TAG);
        if (obj == null) goto _L2; else goto _L1
_L1:
        flag = true;
        url = new InputStreamReader(((java.io.InputStream) (obj)));
        obj = url;
        obj1 = url;
        obj2 = url;
        context = new char[128];
        obj = url;
        obj1 = url;
        obj2 = url;
        StringBuilder stringbuilder = new StringBuilder();
_L4:
        obj = url;
        obj1 = url;
        obj2 = url;
        int i = url.read(context, 0, context.length);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = url;
        obj1 = url;
        obj2 = url;
        stringbuilder.append(context, 0, i);
        if (true) goto _L4; else goto _L3
        context;
_L10:
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        return null;
_L3:
        obj = url;
        obj1 = url;
        obj2 = url;
        Utility.closeQuietly(url);
        obj = url;
        obj1 = url;
        obj2 = url;
        context = stringbuilder.toString();
        obj = context;
        context = url;
        url = ((URL) (obj));
          goto _L5
_L2:
        obj = obj3;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        obj = new URL(url);
        Utility.closeQuietly(context);
        return ((URL) (obj));
        context;
_L9:
        Utility.closeQuietly(((java.io.Closeable) (obj1)));
        return null;
        context;
_L7:
        Utility.closeQuietly(((java.io.Closeable) (obj2)));
        throw context;
        url;
        obj2 = context;
        context = url;
        if (true) goto _L7; else goto _L6
_L6:
        url;
        obj1 = context;
        if (true) goto _L9; else goto _L8
_L8:
        url;
        obj = context;
          goto _L10
    }

}
