// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

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

    static void cacheUriRedirect(Uri uri, Uri uri1)
    {
        Object obj;
        if (uri == null || uri1 == null)
        {
            return;
        }
        obj = null;
        try
        {
            uri = getCache().openPutStream(uri.toString(), REDIRECT_CONTENT_TAG);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Utility.closeQuietly(((java.io.Closeable) (obj)));
            return;
        }
        finally
        {
            obj = null;
        }
        obj = uri;
        uri.write(uri1.toString().getBytes());
        Utility.closeQuietly(uri);
        return;
        uri1 = uri;
_L2:
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        throw uri1;
        uri1;
        obj = uri;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static void clearCache()
    {
        try
        {
            getCache().clearCache();
            return;
        }
        catch (IOException ioexception)
        {
            Logger.log(LoggingBehavior.CACHE, 5, TAG, (new StringBuilder()).append("clearCache failed ").append(ioexception.getMessage()).toString());
        }
    }

    static FileLruCache getCache()
        throws IOException
    {
        com/facebook/internal/UrlRedirectCache;
        JVM INSTR monitorenter ;
        FileLruCache filelrucache;
        if (urlRedirectCache == null)
        {
            urlRedirectCache = new FileLruCache(TAG, new FileLruCache.Limits());
        }
        filelrucache = urlRedirectCache;
        com/facebook/internal/UrlRedirectCache;
        JVM INSTR monitorexit ;
        return filelrucache;
        Exception exception;
        exception;
        throw exception;
    }

    static Uri getRedirectedUri(Uri uri)
    {
        Object obj;
        int i;
        i = 0;
        if (uri == null)
        {
            return null;
        }
        obj = uri.toString();
        FileLruCache filelrucache = getCache();
        uri = null;
_L6:
        Object obj1 = filelrucache.get(((String) (obj)), REDIRECT_CONTENT_TAG);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj = new InputStreamReader(((java.io.InputStream) (obj1)));
        uri = new char[128];
        obj1 = new StringBuilder();
_L5:
        i = ((InputStreamReader) (obj)).read(uri, 0, uri.length);
        if (i <= 0) goto _L4; else goto _L3
_L3:
        ((StringBuilder) (obj1)).append(uri, 0, i);
          goto _L5
        uri;
_L9:
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        return null;
_L4:
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        obj1 = ((StringBuilder) (obj1)).toString();
        uri = ((Uri) (obj));
        i = 1;
        obj = obj1;
          goto _L6
_L2:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        obj = Uri.parse(((String) (obj)));
        Utility.closeQuietly(uri);
        return ((Uri) (obj));
        Utility.closeQuietly(uri);
        return null;
        uri;
        obj = null;
_L8:
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        throw uri;
        uri;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        obj = uri;
        uri = exception;
        if (true) goto _L8; else goto _L7
_L7:
        uri;
        obj = null;
          goto _L9
        IOException ioexception;
        ioexception;
        ioexception = uri;
          goto _L9
    }

}
