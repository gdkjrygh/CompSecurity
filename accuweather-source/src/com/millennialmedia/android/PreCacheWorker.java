// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

// Referenced classes of package com.millennialmedia.android:
//            HttpGetRequest, VideoAd, AdCache, MMLog, 
//            DTOCachedVideo, CachedAd

class PreCacheWorker extends Thread
{

    private static final String TAG = "PreCacheWorker";
    private static boolean busy;
    private Context appContext;
    private DTOCachedVideo cachedVideos[];
    private volatile boolean downloadedNewVideos;
    private String noVideosToCacheURL;

    private PreCacheWorker(DTOCachedVideo adtocachedvideo[], Context context, String s)
    {
        downloadedNewVideos = false;
        cachedVideos = adtocachedvideo;
        noVideosToCacheURL = s;
        appContext = context.getApplicationContext();
    }

    private void handleContent(DTOCachedVideo dtocachedvideo, HttpEntity httpentity)
    {
        Object obj = httpentity.getContentType();
        if (obj != null)
        {
            obj = ((Header) (obj)).getValue();
            if (obj != null && ((String) (obj)).equalsIgnoreCase("application/json"))
            {
                handleJson(dtocachedvideo, httpentity);
            } else
            if (obj != null && ((String) (obj)).startsWith("video/"))
            {
                handleVideoFile(dtocachedvideo, httpentity);
                return;
            }
        }
    }

    private void handleJson(final DTOCachedVideo cachedVideo, HttpEntity httpentity)
    {
        Object obj = null;
        String s;
        try
        {
            s = HttpGetRequest.convertStreamToString(httpentity.getContent());
        }
        // Misplaced declaration of an exception variable
        catch (final DTOCachedVideo cachedVideo)
        {
            cachedVideo.printStackTrace();
            MMLog.d("PreCacheWorker", "Pre cache worker: Millennial ad return failed. Invalid response data.");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final DTOCachedVideo cachedVideo)
        {
            cachedVideo.printStackTrace();
            MMLog.d("PreCacheWorker", "Pre cache worker: Millennial ad return failed. Invalid response data.");
            return;
        }
        httpentity = obj;
        if (!TextUtils.isEmpty(s))
        {
            httpentity = new VideoAd(s);
        }
        if (httpentity == null || !httpentity.isValid())
        {
            break MISSING_BLOCK_LABEL_74;
        }
        httpentity.downloadPriority = 1;
        if (!AdCache.startDownloadTask(appContext, null, httpentity, new AdCache.AdCacheTaskListener() {

        final PreCacheWorker this$0;
        final DTOCachedVideo val$cachedVideo;

        public void downloadCompleted(CachedAd cachedad, boolean flag)
        {
            this;
            JVM INSTR monitorenter ;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            AdCache.save(appContext, cachedad);
            downloadedNewVideos = true;
            MMSDK.Event.logEvent(cachedVideo.preCacheCompleteURL);
_L1:
            notify();
            this;
            JVM INSTR monitorexit ;
            return;
            MMSDK.Event.logEvent(cachedVideo.preCacheFailedURL);
              goto _L1
            cachedad;
            throw cachedad;
        }

        public void downloadStart(CachedAd cachedad)
        {
            MMSDK.Event.logEvent(cachedVideo.preCacheStartURL);
        }

            
            {
                this$0 = PreCacheWorker.this;
                cachedVideo = dtocachedvideo;
                super();
            }
    }))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        wait();
        return;
        try
        {
            MMSDK.Event.logEvent(cachedVideo.preCacheStartURL);
            MMSDK.Event.logEvent(cachedVideo.preCacheFailedURL);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final DTOCachedVideo cachedVideo)
        {
            cachedVideo.printStackTrace();
        }
        MMLog.e("PreCacheWorker", "Pre cache worker interrupted: ", cachedVideo);
        return;
    }

    private void handleVideoFile(DTOCachedVideo dtocachedvideo, HttpEntity httpentity)
    {
label0:
        {
            if (!TextUtils.isEmpty(dtocachedvideo.videoFileId))
            {
                MMSDK.Event.logEvent(dtocachedvideo.preCacheStartURL);
                if (!AdCache.downloadComponentInternalCache(dtocachedvideo.url, (new StringBuilder()).append(dtocachedvideo.videoFileId).append("video.dat").toString(), appContext))
                {
                    break label0;
                }
                MMSDK.Event.logEvent(dtocachedvideo.preCacheCompleteURL);
            }
            return;
        }
        MMSDK.Event.logEvent(dtocachedvideo.preCacheFailedURL);
    }

    static void preCacheVideos(DTOCachedVideo adtocachedvideo[], Context context, String s)
    {
        com/millennialmedia/android/PreCacheWorker;
        JVM INSTR monitorenter ;
        if (!busy)
        {
            busy = true;
            (new PreCacheWorker(adtocachedvideo, context, s)).start();
        }
        com/millennialmedia/android/PreCacheWorker;
        JVM INSTR monitorexit ;
        return;
        adtocachedvideo;
        throw adtocachedvideo;
    }

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        if (cachedVideos == null) goto _L2; else goto _L1
_L1:
        DTOCachedVideo adtocachedvideo[];
        int j;
        adtocachedvideo = cachedVideos;
        j = adtocachedvideo.length;
        int i = 0;
_L12:
        if (i >= j) goto _L2; else goto _L3
_L3:
        Object obj = adtocachedvideo[i];
        Object obj1 = (new HttpGetRequest()).get(((DTOCachedVideo) (obj)).url);
        if (obj1 != null) goto _L5; else goto _L4
_L4:
        MMLog.d("PreCacheWorker", "Pre cache worker: HTTP response is null");
          goto _L6
_L5:
        obj1 = ((HttpResponse) (obj1)).getEntity();
        if (obj1 != null) goto _L8; else goto _L7
_L7:
        MMLog.d("PreCacheWorker", "Pre cache worker: Null HTTP entity");
          goto _L6
        Exception exception;
        exception;
        com/millennialmedia/android/PreCacheWorker;
        JVM INSTR monitorenter ;
        busy = false;
        if (!downloadedNewVideos && !TextUtils.isEmpty(noVideosToCacheURL) && cachedVideos == null)
        {
            MMSDK.Event.logEvent(noVideosToCacheURL);
        }
        com/millennialmedia/android/PreCacheWorker;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        MMLog.d("PreCacheWorker", String.format("Pre cache worker HTTP error: %s", new Object[] {
            obj
        }));
          goto _L6
_L8:
        if (((HttpEntity) (obj1)).getContentLength() != 0L) goto _L10; else goto _L9
_L9:
        MMLog.d("PreCacheWorker", "Pre cache worker: Millennial ad return failed. Zero content length returned.");
          goto _L6
_L10:
        handleContent(((DTOCachedVideo) (obj)), ((HttpEntity) (obj1)));
          goto _L6
_L2:
        com/millennialmedia/android/PreCacheWorker;
        JVM INSTR monitorenter ;
        busy = false;
        if (!downloadedNewVideos && !TextUtils.isEmpty(noVideosToCacheURL) && cachedVideos == null)
        {
            MMSDK.Event.logEvent(noVideosToCacheURL);
        }
        com/millennialmedia/android/PreCacheWorker;
        JVM INSTR monitorexit ;
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        com/millennialmedia/android/PreCacheWorker;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        com/millennialmedia/android/PreCacheWorker;
        JVM INSTR monitorexit ;
        throw exception;
_L6:
        i++;
        if (true) goto _L12; else goto _L11
_L11:
    }



/*
    static boolean access$102(PreCacheWorker precacheworker, boolean flag)
    {
        precacheworker.downloadedNewVideos = flag;
        return flag;
    }

*/
}
