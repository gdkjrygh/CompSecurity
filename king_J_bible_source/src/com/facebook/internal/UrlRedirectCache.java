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

    private static final String REDIRECT_CONTENT_TAG = (new StringBuilder(String.valueOf(TAG))).append("_Redirect").toString();
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
        Context context2 = null;
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
            Utility.closeQuietly(context2);
        }
        context1 = context;
        context2 = context;
        context.write(uri1.toString().getBytes());
        Utility.closeQuietly(context);
        return;
        throw context;
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
        throws IOException
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
        Object obj;
        Object obj1;
        Object obj2;
        if (uri == null)
        {
            return null;
        }
        uri = uri.toString();
        obj1 = null;
        obj2 = null;
        obj = null;
        FileLruCache filelrucache = getCache(context);
        boolean flag;
        flag = false;
        context = null;
_L14:
        obj = filelrucache.get(uri, REDIRECT_CONTENT_TAG);
        if (obj != null) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        uri = new URI(uri);
        Utility.closeQuietly(context);
        return uri;
_L2:
        flag = true;
        uri = new InputStreamReader(((java.io.InputStream) (obj)));
        obj = uri;
        obj1 = uri;
        obj2 = uri;
        context = new char[128];
        obj = uri;
        obj1 = uri;
        obj2 = uri;
        Object obj3 = new StringBuilder();
_L6:
        obj = uri;
        obj1 = uri;
        obj2 = uri;
        int i = uri.read(context, 0, context.length);
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        obj = uri;
        obj1 = uri;
        obj2 = uri;
        Utility.closeQuietly(uri);
        obj = uri;
        obj1 = uri;
        obj2 = uri;
        obj3 = ((StringBuilder) (obj3)).toString();
        context = uri;
        uri = ((URI) (obj3));
        continue; /* Loop/switch isn't completed */
        obj = uri;
        obj1 = uri;
        obj2 = uri;
        ((StringBuilder) (obj3)).append(context, 0, i);
        if (true) goto _L6; else goto _L5
_L5:
        context;
_L12:
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        return null;
        context;
_L10:
        Utility.closeQuietly(((java.io.Closeable) (obj1)));
        return null;
        context;
_L8:
        Utility.closeQuietly(((java.io.Closeable) (obj2)));
        throw context;
_L4:
        Utility.closeQuietly(context);
        return null;
        uri;
        obj2 = context;
        context = uri;
        if (true) goto _L8; else goto _L7
_L7:
        uri;
        obj1 = context;
        if (true) goto _L10; else goto _L9
_L9:
        uri;
        obj = context;
        if (true) goto _L12; else goto _L11
_L11:
        if (true) goto _L14; else goto _L13
_L13:
    }

}
