// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package com.facebook.internal:
//            FileLruCache, Utility, Logger

class UrlRedirectCache
{

    private static final String REDIRECT_CONTENT_TAG = (new StringBuilder()).append(TAG).append("_Redirect").toString();
    static final String TAG = com/facebook/internal/UrlRedirectCache.getSimpleName();
    private static volatile FileLruCache urlRedirectCache;

    UrlRedirectCache()
    {
    }

    static void cacheUriRedirect(Context context, URI uri, URI uri1)
    {
        if (uri == null || uri1 == null)
        {
            return;
        }
        Context context1 = null;
        try
        {
            context = getCache(context).openPutStream(uri.toString(), REDIRECT_CONTENT_TAG);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Utility.closeQuietly(context1);
            return;
        }
        finally
        {
            uri1 = null;
        }
        context1 = context;
        context.write(uri1.toString().getBytes());
        Utility.closeQuietly(context);
        return;
        uri = context;
_L2:
        Utility.closeQuietly(uri1);
        throw uri;
        uri;
        uri1 = context;
        if (true) goto _L2; else goto _L1
_L1:
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
        com/facebook/internal/UrlRedirectCache;
        JVM INSTR monitorenter ;
        if (urlRedirectCache == null)
        {
            urlRedirectCache = new FileLruCache(context.getApplicationContext(), TAG, new FileLruCache.Limits());
        }
        context = urlRedirectCache;
        com/facebook/internal/UrlRedirectCache;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static URI getRedirectedUri(Context context, URI uri)
    {
        int i;
        i = 0;
        if (uri == null)
        {
            return null;
        }
        uri = uri.toString();
        FileLruCache filelrucache = getCache(context);
        context = null;
_L6:
        Object obj = filelrucache.get(uri, REDIRECT_CONTENT_TAG);
        if (obj == null) goto _L2; else goto _L1
_L1:
        uri = new InputStreamReader(((java.io.InputStream) (obj)));
        context = new char[128];
        obj = new StringBuilder();
_L5:
        i = uri.read(context, 0, 128);
        if (i <= 0) goto _L4; else goto _L3
_L3:
        ((StringBuilder) (obj)).append(context, 0, i);
          goto _L5
        context;
_L11:
        Utility.closeQuietly(uri);
        return null;
_L4:
        Utility.closeQuietly(uri);
        obj = ((StringBuilder) (obj)).toString();
        context = uri;
        i = 1;
        uri = ((URI) (obj));
          goto _L6
_L2:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        uri = new URI(uri);
        Utility.closeQuietly(context);
        return uri;
        Utility.closeQuietly(context);
        return null;
        context;
        uri = null;
_L10:
        Utility.closeQuietly(uri);
        return null;
        context;
        uri = null;
_L8:
        Utility.closeQuietly(uri);
        throw context;
        context;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        uri = context;
        context = exception;
        if (true) goto _L8; else goto _L7
_L7:
        context;
        continue; /* Loop/switch isn't completed */
        uri;
        uri = context;
        if (true) goto _L10; else goto _L9
_L9:
        context;
        uri = null;
          goto _L11
        uri;
        uri = context;
          goto _L11
    }

}
