// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import com.facebook.FacebookException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.internal:
//            WorkQueue, ImageRequest, ImageResponseCache, UrlRedirectCache, 
//            Utility, ImageResponse

public class ImageDownloader
{
    private static class CacheReadWorkItem
        implements Runnable
    {

        private boolean allowCachedRedirects;
        private Context context;
        private RequestKey key;

        public void run()
        {
            ImageDownloader.readFromCache(key, context, allowCachedRedirects);
        }

        CacheReadWorkItem(Context context1, RequestKey requestkey, boolean flag)
        {
            context = context1;
            key = requestkey;
            allowCachedRedirects = flag;
        }
    }

    private static class DownloadImageWorkItem
        implements Runnable
    {

        private Context context;
        private RequestKey key;

        public void run()
        {
            ImageDownloader.download(key, context);
        }

        DownloadImageWorkItem(Context context1, RequestKey requestkey)
        {
            context = context1;
            key = requestkey;
        }
    }

    private static class DownloaderContext
    {

        boolean isCancelled;
        ImageRequest request;
        WorkQueue.WorkItem workItem;

        private DownloaderContext()
        {
        }

    }

    private static class RequestKey
    {

        private static final int HASH_MULTIPLIER = 37;
        private static final int HASH_SEED = 29;
        Object tag;
        URI uri;

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (obj instanceof RequestKey)
                {
                    obj = (RequestKey)obj;
                    flag = flag1;
                    if (((RequestKey) (obj)).uri == uri)
                    {
                        flag = flag1;
                        if (((RequestKey) (obj)).tag == tag)
                        {
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return (uri.hashCode() + 1073) * 37 + tag.hashCode();
        }

        RequestKey(URI uri1, Object obj)
        {
            uri = uri1;
            tag = obj;
        }
    }


    private static final int CACHE_READ_QUEUE_MAX_CONCURRENT = 2;
    private static final int DOWNLOAD_QUEUE_MAX_CONCURRENT = 8;
    private static WorkQueue cacheReadQueue = new WorkQueue(2);
    private static WorkQueue downloadQueue = new WorkQueue(8);
    private static Handler handler;
    private static final Map pendingRequests = new HashMap();

    public ImageDownloader()
    {
    }

    public static boolean cancelRequest(ImageRequest imagerequest)
    {
        RequestKey requestkey = new RequestKey(imagerequest.getImageUri(), imagerequest.getCallerTag());
        imagerequest = pendingRequests;
        imagerequest;
        JVM INSTR monitorenter ;
        DownloaderContext downloadercontext = (DownloaderContext)pendingRequests.get(requestkey);
        if (downloadercontext == null) goto _L2; else goto _L1
_L1:
        if (!downloadercontext.workItem.cancel()) goto _L4; else goto _L3
_L3:
        pendingRequests.remove(requestkey);
        boolean flag = true;
_L6:
        imagerequest;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        downloadercontext.isCancelled = true;
        flag = true;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        imagerequest;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void clearCache(Context context)
    {
        ImageResponseCache.clearCache(context);
        UrlRedirectCache.clearCache(context);
    }

    private static void download(RequestKey requestkey, Context context)
    {
        Context context1;
        Object obj2;
        Bitmap bitmap;
        boolean flag;
        boolean flag1;
        boolean flag2;
        bitmap = null;
        context1 = null;
        obj2 = null;
        flag1 = true;
        flag2 = true;
        flag = true;
        HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(requestkey.uri.toString())).openConnection();
        httpurlconnection.setInstanceFollowRedirects(false);
        httpurlconnection.getResponseCode();
        JVM INSTR lookupswitch 3: default 505
    //                   200: 306
    //                   301: 214
    //                   302: 214;
           goto _L1 _L2 _L3 _L3
_L1:
        context = httpurlconnection.getErrorStream();
        Object obj;
        Object obj1;
        obj = context;
        obj1 = context;
        context1 = context;
        Object obj3 = new InputStreamReader(context);
        obj = context;
        obj1 = context;
        context1 = context;
        char ac[] = new char[128];
        obj = context;
        obj1 = context;
        context1 = context;
        StringBuilder stringbuilder = new StringBuilder();
_L5:
        obj = context;
        obj1 = context;
        context1 = context;
        int i = ((InputStreamReader) (obj3)).read(ac, 0, ac.length);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = context;
        obj1 = context;
        context1 = context;
        stringbuilder.append(ac, 0, i);
        if (true) goto _L5; else goto _L4
        context;
_L15:
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        Utility.disconnectQuietly(httpurlconnection);
        obj1 = obj2;
_L10:
        if (flag)
        {
            issueResponse(requestkey, context, ((Bitmap) (obj1)), false);
        }
        return;
_L3:
        obj = httpurlconnection.getHeaderField("location");
        if (Utility.isNullOrEmpty(((String) (obj)))) goto _L7; else goto _L6
_L6:
        obj = new URI(((String) (obj)));
        UrlRedirectCache.cacheUriRedirect(context, requestkey.uri, ((URI) (obj)));
        context = removePendingRequest(requestkey);
        if (context == null) goto _L9; else goto _L8
_L8:
        if (!((DownloaderContext) (context)).isCancelled)
        {
            enqueueCacheRead(((DownloaderContext) (context)).request, new RequestKey(((URI) (obj)), requestkey.tag), false);
        }
_L9:
        flag = false;
        obj = null;
        context = null;
        obj1 = bitmap;
_L11:
        Utility.closeQuietly(context);
        Utility.disconnectQuietly(httpurlconnection);
        context = ((Context) (obj));
          goto _L10
_L2:
        context = ImageResponseCache.interceptAndCacheImageStream(context, httpurlconnection);
        obj = context;
        obj1 = context;
        context1 = context;
        bitmap = BitmapFactory.decodeStream(context);
        obj = null;
        obj1 = bitmap;
        flag = flag1;
          goto _L11
_L4:
        obj = context;
        obj1 = context;
        context1 = context;
        Utility.closeQuietly(((java.io.Closeable) (obj3)));
        obj = context;
        obj1 = context;
        context1 = context;
        obj3 = new FacebookException(stringbuilder.toString());
        flag = flag1;
        obj1 = bitmap;
        obj = obj3;
          goto _L11
        context;
        obj = obj1;
        flag = flag2;
_L14:
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        Utility.disconnectQuietly(httpurlconnection);
        obj1 = obj2;
          goto _L10
        requestkey;
        context = null;
_L13:
        Utility.closeQuietly(context1);
        Utility.disconnectQuietly(context);
        throw requestkey;
        requestkey;
        context = httpurlconnection;
        continue; /* Loop/switch isn't completed */
        requestkey;
        context = httpurlconnection;
        if (true) goto _L13; else goto _L12
_L12:
        context;
        obj = null;
        httpurlconnection = null;
        flag = flag2;
          goto _L14
        context;
        obj = null;
        flag = flag2;
          goto _L14
        context;
        obj = null;
        flag = false;
          goto _L14
        context;
        obj = null;
        httpurlconnection = null;
          goto _L15
        context;
        obj = null;
          goto _L15
        context;
        obj = null;
        flag = false;
          goto _L15
_L7:
        flag = false;
        obj = null;
        context = null;
        obj1 = bitmap;
          goto _L11
    }

    public static void downloadAsync(ImageRequest imagerequest)
    {
        RequestKey requestkey;
        if (imagerequest == null)
        {
            return;
        }
        requestkey = new RequestKey(imagerequest.getImageUri(), imagerequest.getCallerTag());
        Map map = pendingRequests;
        map;
        JVM INSTR monitorenter ;
        DownloaderContext downloadercontext = (DownloaderContext)pendingRequests.get(requestkey);
        if (downloadercontext == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        downloadercontext.request = imagerequest;
        downloadercontext.isCancelled = false;
        downloadercontext.workItem.moveToFront();
_L1:
        map;
        JVM INSTR monitorexit ;
        return;
        imagerequest;
        map;
        JVM INSTR monitorexit ;
        throw imagerequest;
        enqueueCacheRead(imagerequest, requestkey, imagerequest.isCachedRedirectAllowed());
          goto _L1
    }

    private static void enqueueCacheRead(ImageRequest imagerequest, RequestKey requestkey, boolean flag)
    {
        enqueueRequest(imagerequest, requestkey, cacheReadQueue, new CacheReadWorkItem(imagerequest.getContext(), requestkey, flag));
    }

    private static void enqueueDownload(ImageRequest imagerequest, RequestKey requestkey)
    {
        enqueueRequest(imagerequest, requestkey, downloadQueue, new DownloadImageWorkItem(imagerequest.getContext(), requestkey));
    }

    private static void enqueueRequest(ImageRequest imagerequest, RequestKey requestkey, WorkQueue workqueue, Runnable runnable)
    {
        synchronized (pendingRequests)
        {
            DownloaderContext downloadercontext = new DownloaderContext();
            downloadercontext.request = imagerequest;
            pendingRequests.put(requestkey, downloadercontext);
            downloadercontext.workItem = workqueue.addActiveWorkItem(runnable);
        }
        return;
        imagerequest;
        map;
        JVM INSTR monitorexit ;
        throw imagerequest;
    }

    private static Handler getHandler()
    {
        com/facebook/internal/ImageDownloader;
        JVM INSTR monitorenter ;
        Handler handler1;
        if (handler == null)
        {
            handler = new Handler(Looper.getMainLooper());
        }
        handler1 = handler;
        com/facebook/internal/ImageDownloader;
        JVM INSTR monitorexit ;
        return handler1;
        Exception exception;
        exception;
        throw exception;
    }

    private static void issueResponse(RequestKey requestkey, Exception exception, Bitmap bitmap, boolean flag)
    {
        requestkey = removePendingRequest(requestkey);
        if (requestkey != null && !((DownloaderContext) (requestkey)).isCancelled)
        {
            requestkey = ((DownloaderContext) (requestkey)).request;
            ImageRequest.Callback callback = requestkey.getCallback();
            if (callback != null)
            {
                getHandler().post(new Runnable(requestkey, exception, flag, bitmap, callback) {

                    final Bitmap val$bitmap;
                    final ImageRequest.Callback val$callback;
                    final Exception val$error;
                    final boolean val$isCachedRedirect;
                    final ImageRequest val$request;

                    public void run()
                    {
                        ImageResponse imageresponse = new ImageResponse(request, error, isCachedRedirect, bitmap);
                        callback.onCompleted(imageresponse);
                    }

            
            {
                request = imagerequest;
                error = exception;
                isCachedRedirect = flag;
                bitmap = bitmap1;
                callback = callback1;
                super();
            }
                });
            }
        }
    }

    public static void prioritizeRequest(ImageRequest imagerequest)
    {
        Object obj = new RequestKey(imagerequest.getImageUri(), imagerequest.getCallerTag());
        imagerequest = pendingRequests;
        imagerequest;
        JVM INSTR monitorenter ;
        obj = (DownloaderContext)pendingRequests.get(obj);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        ((DownloaderContext) (obj)).workItem.moveToFront();
        imagerequest;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        imagerequest;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static void readFromCache(RequestKey requestkey, Context context, boolean flag)
    {
        boolean flag1 = false;
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj = UrlRedirectCache.getRedirectedUri(context, requestkey.uri);
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = ImageResponseCache.getCachedImageStream(((URI) (obj)), context);
        flag = flag1;
        if (obj != null)
        {
            flag = true;
        }
_L9:
        if (!flag)
        {
            obj = ImageResponseCache.getCachedImageStream(requestkey.uri, context);
        }
        if (obj == null) goto _L5; else goto _L4
_L4:
        context = BitmapFactory.decodeStream(((java.io.InputStream) (obj)));
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        issueResponse(requestkey, null, context, flag);
_L7:
        return;
_L5:
        context = removePendingRequest(requestkey);
        if (context == null || ((DownloaderContext) (context)).isCancelled) goto _L7; else goto _L6
_L6:
        enqueueDownload(((DownloaderContext) (context)).request, requestkey);
        return;
_L2:
        flag = false;
        obj = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static DownloaderContext removePendingRequest(RequestKey requestkey)
    {
        synchronized (pendingRequests)
        {
            requestkey = (DownloaderContext)pendingRequests.remove(requestkey);
        }
        return requestkey;
        requestkey;
        map;
        JVM INSTR monitorexit ;
        throw requestkey;
    }



}
