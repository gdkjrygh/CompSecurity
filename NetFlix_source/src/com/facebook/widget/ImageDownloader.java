// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.widget:
//            WorkQueue, ImageRequest, UrlRedirectCache, ImageResponseCache, 
//            ImageResponse

class ImageDownloader
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
        URL url;

        public boolean equals(Object obj)
        {
label0:
            {
                boolean flag1 = false;
                boolean flag = flag1;
                if (obj != null)
                {
                    flag = flag1;
                    if (obj instanceof RequestKey)
                    {
                        obj = (RequestKey)obj;
                        if (((RequestKey) (obj)).url != url || ((RequestKey) (obj)).tag != tag)
                        {
                            break label0;
                        }
                        flag = true;
                    }
                }
                return flag;
            }
            return false;
        }

        public int hashCode()
        {
            return (url.hashCode() + 1073) * 37 + tag.hashCode();
        }

        RequestKey(URL url1, Object obj)
        {
            url = url1;
            tag = obj;
        }
    }


    private static final int CACHE_READ_QUEUE_MAX_CONCURRENT = 2;
    private static final int DOWNLOAD_QUEUE_MAX_CONCURRENT = 8;
    private static WorkQueue cacheReadQueue = new WorkQueue(2);
    private static WorkQueue downloadQueue = new WorkQueue(8);
    private static final Handler handler = new Handler();
    private static final Map pendingRequests = new HashMap();

    ImageDownloader()
    {
    }

    static boolean cancelRequest(ImageRequest imagerequest)
    {
        RequestKey requestkey;
        boolean flag;
        flag = false;
        requestkey = new RequestKey(imagerequest.getImageUrl(), imagerequest.getCallerTag());
        imagerequest = pendingRequests;
        imagerequest;
        JVM INSTR monitorenter ;
        DownloaderContext downloadercontext = (DownloaderContext)pendingRequests.get(requestkey);
        if (downloadercontext == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        flag = true;
        if (!downloadercontext.workItem.cancel())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        pendingRequests.remove(requestkey);
_L1:
        imagerequest;
        JVM INSTR monitorexit ;
        return flag;
        downloadercontext.isCancelled = true;
          goto _L1
        Exception exception;
        exception;
        imagerequest;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static void download(RequestKey requestkey, Context context)
    {
        Object obj;
        Object obj1;
        HttpURLConnection httpurlconnection;
        HttpURLConnection httpurlconnection1;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        boolean flag;
        boolean flag1;
        boolean flag2;
        httpurlconnection1 = null;
        httpurlconnection = null;
        obj8 = null;
        obj9 = null;
        obj7 = null;
        obj6 = null;
        obj5 = null;
        obj4 = null;
        flag2 = true;
        flag1 = true;
        flag = flag1;
        obj = obj7;
        obj1 = obj9;
        HttpURLConnection httpurlconnection2 = (HttpURLConnection)requestkey.url.openConnection();
        httpurlconnection = httpurlconnection2;
        flag = flag1;
        obj = obj7;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj9;
        httpurlconnection2.setInstanceFollowRedirects(false);
        httpurlconnection = httpurlconnection2;
        flag = flag1;
        obj = obj7;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj9;
        httpurlconnection2.getResponseCode();
        JVM INSTR lookupswitch 3: default 762
    //                   200: 623
    //                   301: 332
    //                   302: 332;
           goto _L1 _L2 _L3 _L3
_L1:
        httpurlconnection = httpurlconnection2;
        flag = flag1;
        obj = obj7;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj9;
        Object obj3 = httpurlconnection2.getErrorStream();
        httpurlconnection = httpurlconnection2;
        flag = flag1;
        obj = obj3;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj3;
        context = new InputStreamReader(((java.io.InputStream) (obj3)));
        httpurlconnection = httpurlconnection2;
        flag = flag1;
        obj = obj3;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj3;
        char ac[] = new char[128];
        httpurlconnection = httpurlconnection2;
        flag = flag1;
        obj = obj3;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj3;
        Object obj2 = new StringBuilder();
_L5:
        httpurlconnection = httpurlconnection2;
        flag = flag1;
        obj = obj3;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj3;
        int i = context.read(ac, 0, ac.length);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        httpurlconnection = httpurlconnection2;
        flag = flag1;
        obj = obj3;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj3;
        ((StringBuilder) (obj2)).append(ac, 0, i);
        if (true) goto _L5; else goto _L4
        context;
        Bitmap bitmap;
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        Utility.disconnectQuietly(httpurlconnection);
        bitmap = obj4;
_L6:
        if (flag)
        {
            issueResponse(requestkey, context, bitmap, false);
        }
        return;
_L3:
        i = 0;
        flag2 = false;
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = obj7;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj9;
        Object obj10 = httpurlconnection2.getHeaderField("location");
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = obj7;
        bitmap = obj5;
        obj2 = obj6;
        flag1 = i;
        obj3 = obj8;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj9;
        if (Utility.isNullOrEmpty(((String) (obj10))))
        {
            break MISSING_BLOCK_LABEL_603;
        }
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = obj7;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj9;
        obj10 = new URL(((String) (obj10)));
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = obj7;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj9;
        UrlRedirectCache.cacheUrlRedirect(context, requestkey.url, ((URL) (obj10)));
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = obj7;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj9;
        context = removePendingRequest(requestkey);
        bitmap = obj5;
        obj2 = obj6;
        flag1 = i;
        obj3 = obj8;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_603;
        }
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = obj7;
        bitmap = obj5;
        obj2 = obj6;
        flag1 = i;
        obj3 = obj8;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj9;
        if (((DownloaderContext) (context)).isCancelled)
        {
            break MISSING_BLOCK_LABEL_603;
        }
        httpurlconnection = httpurlconnection2;
        flag = flag2;
        obj = obj7;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj9;
        enqueueCacheRead(((DownloaderContext) (context)).request, new RequestKey(((URL) (obj10)), requestkey.tag), false);
        obj3 = obj8;
        flag1 = i;
        obj2 = obj6;
        bitmap = obj5;
_L7:
        Utility.closeQuietly(((java.io.Closeable) (obj3)));
        Utility.disconnectQuietly(httpurlconnection2);
        context = ((Context) (obj2));
        flag = flag1;
          goto _L6
_L2:
        httpurlconnection = httpurlconnection2;
        flag = flag1;
        obj = obj7;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj9;
        obj3 = ImageResponseCache.interceptAndCacheImageStream(context, httpurlconnection2);
        httpurlconnection = httpurlconnection2;
        flag = flag1;
        obj = obj3;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj3;
        bitmap = BitmapFactory.decodeStream(((java.io.InputStream) (obj3)));
        obj2 = obj6;
        flag1 = flag2;
          goto _L7
_L4:
        httpurlconnection = httpurlconnection2;
        flag = flag1;
        obj = obj3;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj3;
        Utility.closeQuietly(context);
        httpurlconnection = httpurlconnection2;
        flag = flag1;
        obj = obj3;
        httpurlconnection1 = httpurlconnection2;
        obj1 = obj3;
        obj2 = new FacebookException(((StringBuilder) (obj2)).toString());
        bitmap = obj5;
        flag1 = flag2;
          goto _L7
        requestkey;
        Utility.closeQuietly(((java.io.Closeable) (obj1)));
        Utility.disconnectQuietly(httpurlconnection1);
        throw requestkey;
    }

    static void downloadAsync(ImageRequest imagerequest)
    {
        RequestKey requestkey;
        if (imagerequest == null)
        {
            return;
        }
        requestkey = new RequestKey(imagerequest.getImageUrl(), imagerequest.getCallerTag());
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

    private static void issueResponse(RequestKey requestkey, Exception exception, Bitmap bitmap, boolean flag)
    {
        requestkey = removePendingRequest(requestkey);
        if (requestkey != null && !((DownloaderContext) (requestkey)).isCancelled)
        {
            requestkey = ((DownloaderContext) (requestkey)).request;
            ImageRequest.Callback callback = requestkey.getCallback();
            if (callback != null)
            {
                handler.post(new Runnable(requestkey, exception, flag, bitmap, callback) {

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

    static void prioritizeRequest(ImageRequest imagerequest)
    {
        Object obj = new RequestKey(imagerequest.getImageUrl(), imagerequest.getCallerTag());
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
        Object obj = null;
        boolean flag2 = false;
        java.io.InputStream inputstream = obj;
        boolean flag1 = flag2;
        if (flag)
        {
            URL url = UrlRedirectCache.getRedirectedUrl(context, requestkey.url);
            inputstream = obj;
            flag1 = flag2;
            if (url != null)
            {
                inputstream = ImageResponseCache.getCachedImageStream(url, context);
                if (inputstream != null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
            }
        }
        if (!flag1)
        {
            inputstream = ImageResponseCache.getCachedImageStream(requestkey.url, context);
        }
        if (inputstream != null)
        {
            context = BitmapFactory.decodeStream(inputstream);
            Utility.closeQuietly(inputstream);
            issueResponse(requestkey, null, context, flag1);
        } else
        {
            context = removePendingRequest(requestkey);
            if (context != null && !((DownloaderContext) (context)).isCancelled)
            {
                enqueueDownload(((DownloaderContext) (context)).request, requestkey);
                return;
            }
        }
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
