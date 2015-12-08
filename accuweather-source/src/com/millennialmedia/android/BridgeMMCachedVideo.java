// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Callable;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.json.JSONArray;

// Referenced classes of package com.millennialmedia.android:
//            MMJSObject, MMWebView, MMActivity, VideoPlayerActivity, 
//            AdCache, MMJSResponse, HttpGetRequest, MMLog, 
//            VideoAd, CachedAd

class BridgeMMCachedVideo extends MMJSObject
    implements AdCache.AdCacheTaskListener
{

    private static final String AVAILABLE_CACHED_VIDEOS = "availableCachedVideos";
    private static final String CACHE_VIDEO = "cacheVideo";
    private static final String END_VIDEO = "endVideo";
    private static final String PAUSE_VIDEO = "pauseVideo";
    private static final String PLAY_CACHED_VIDEO = "playCachedVideo";
    private static final String PLAY_VIDEO = "playVideo";
    private static final String RESTART_VIDEO = "restartVideo";
    private static final String TAG = "BridgeMMCachedVideo";
    private static final String VIDEO_ID_EXISTS = "videoIdExists";
    private boolean success;

    BridgeMMCachedVideo()
    {
    }

    private VideoPlayerActivity getVPA()
    {
        Object obj = null;
        VideoPlayerActivity videoplayeractivity = obj;
        if (mmWebViewRef != null)
        {
            videoplayeractivity = obj;
            if (mmWebViewRef.get() != null)
            {
                videoplayeractivity = obj;
                if (((MMWebView)mmWebViewRef.get()).getActivity() instanceof MMActivity)
                {
                    Object obj1 = (MMWebView)mmWebViewRef.get();
                    videoplayeractivity = obj;
                    if (obj1 != null)
                    {
                        obj1 = ((MMWebView) (obj1)).getActivity();
                        videoplayeractivity = obj;
                        if (obj1 != null)
                        {
                            videoplayeractivity = obj;
                            if (obj1 instanceof MMActivity)
                            {
                                obj1 = (MMActivity)obj1;
                                videoplayeractivity = obj;
                                if (((MMActivity) (obj1)).getWrappedActivity() != null)
                                {
                                    videoplayeractivity = obj;
                                    if (((MMActivity) (obj1)).getWrappedActivity() instanceof VideoPlayerActivity)
                                    {
                                        videoplayeractivity = (VideoPlayerActivity)((MMActivity) (obj1)).getWrappedActivity();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return videoplayeractivity;
    }

    public MMJSResponse availableCachedVideos(final Map array)
    {
        final Context context = (Context)contextRef.get();
        if (context != null)
        {
            array = new JSONArray();
            AdCache.iterateCachedAds(context, 2, new AdCache.Iterator() {

                final BridgeMMCachedVideo this$0;
                final JSONArray val$array;
                final Context val$context;

                boolean callback(CachedAd cachedad)
                {
                    if ((cachedad instanceof VideoAd) && cachedad.isOnDisk(context) && !cachedad.isExpired())
                    {
                        array.put(cachedad.getId());
                    }
                    return true;
                }

            
            {
                this$0 = BridgeMMCachedVideo.this;
                context = context1;
                array = jsonarray;
                super();
            }
            });
            context = new MMJSResponse();
            context.result = 1;
            context.response = array;
            return context;
        } else
        {
            return null;
        }
    }

    public MMJSResponse cacheVideo(Map map)
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        Context context;
        String s;
        context = (Context)contextRef.get();
        s = (String)map.get("url");
        map = obj;
        if (s == null) goto _L2; else goto _L1
_L1:
        map = obj;
        if (context == null) goto _L2; else goto _L3
_L3:
        map = (new HttpGetRequest()).get(s);
        if (map != null) goto _L5; else goto _L4
_L4:
        MMLog.i("BridgeMMCachedVideo", "HTTP response is null");
        map = obj;
_L2:
        this;
        JVM INSTR monitorexit ;
        return map;
_L5:
        Object obj1 = map.getEntity();
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        MMLog.d("BridgeMMCachedVideo", "Null HTTP entity");
        map = obj;
          goto _L2
        map;
        throw map;
        map;
        MMLog.e("BridgeMMCachedVideo", "HTTP error: ", map);
        map = obj;
          goto _L2
        if (((HttpEntity) (obj1)).getContentLength() != 0L)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        MMLog.d("BridgeMMCachedVideo", "Millennial ad return failed. Zero content length returned.");
        map = obj;
          goto _L2
        Header header = ((HttpEntity) (obj1)).getContentType();
        map = obj;
        if (header == null) goto _L2; else goto _L6
_L6:
        map = obj;
        if (header.getValue() == null) goto _L2; else goto _L7
_L7:
        boolean flag = header.getValue().equalsIgnoreCase("application/json");
        map = obj;
        if (!flag) goto _L2; else goto _L8
_L8:
        obj1 = new VideoAd(HttpGetRequest.convertStreamToString(((HttpEntity) (obj1)).getContent()));
        map = obj;
        if (obj1 == null) goto _L2; else goto _L9
_L9:
        map = obj;
        if (!((VideoAd) (obj1)).isValid()) goto _L2; else goto _L10
_L10:
        obj1.downloadPriority = 3;
        flag = AdCache.startDownloadTask(context, null, ((CachedAd) (obj1)), this);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_343;
        }
        wait();
        if (!success)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        map = MMJSResponse.responseWithSuccess(String.format("Cached video(%s)", new Object[] {
            s
        }));
        notify();
          goto _L2
        map;
        MMLog.e("BridgeMMCachedVideo", "Millennial ad return failed. Invalid response data.", map);
        map = obj;
          goto _L2
        map;
        MMLog.e("BridgeMMCachedVideo", "Millennial ad return failed. Invalid response data.", map);
        map = obj;
          goto _L2
        notify();
        map = obj;
          goto _L2
        map;
        MMLog.e("BridgeMMCachedVideo", "Caching interrupted: ", map);
        notify();
        map = obj;
          goto _L2
        map;
        notify();
        throw map;
        map = MMJSResponse.responseWithError(String.format("Unable to start download for Cached video(%s)", new Object[] {
            s
        }));
          goto _L2
    }

    public void downloadCompleted(CachedAd cachedad, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Context context = (Context)contextRef.get();
        if (!flag || context == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        AdCache.save(context, cachedad);
        success = flag;
        notify();
        this;
        JVM INSTR monitorexit ;
        return;
        cachedad;
        this;
        JVM INSTR monitorexit ;
        throw cachedad;
    }

    public void downloadStart(CachedAd cachedad)
    {
    }

    public MMJSResponse endVideo(final Map vpa)
    {
        vpa = getVPA();
        if (vpa != null)
        {
            return runOnUiThreadFuture(new Callable() {

                final BridgeMMCachedVideo this$0;
                final VideoPlayerActivity val$vpa;

                public MMJSResponse call()
                {
                    vpa.endVideo();
                    return MMJSResponse.responseWithSuccess();
                }

                public volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = BridgeMMCachedVideo.this;
                vpa = videoplayeractivity;
                super();
            }
            });
        } else
        {
            return null;
        }
    }

    MMJSResponse executeCommand(String s, Map map)
    {
        MMJSResponse mmjsresponse = null;
        if ("availableCachedVideos".equals(s))
        {
            mmjsresponse = availableCachedVideos(map);
        } else
        {
            if ("cacheVideo".equals(s))
            {
                return cacheVideo(map);
            }
            if ("endVideo".equals(s))
            {
                return endVideo(map);
            }
            if ("pauseVideo".equals(s))
            {
                return pauseVideo(map);
            }
            if ("playCachedVideo".equals(s))
            {
                return playCachedVideo(map);
            }
            if ("playVideo".equals(s))
            {
                return playVideo(map);
            }
            if ("restartVideo".equals(s))
            {
                return restartVideo(map);
            }
            if ("videoIdExists".equals(s))
            {
                return videoIdExists(map);
            }
        }
        return mmjsresponse;
    }

    public MMJSResponse pauseVideo(final Map vpa)
    {
        vpa = getVPA();
        if (vpa != null)
        {
            return runOnUiThreadFuture(new Callable() {

                final BridgeMMCachedVideo this$0;
                final VideoPlayerActivity val$vpa;

                public MMJSResponse call()
                {
                    vpa.pauseVideoByUser();
                    return MMJSResponse.responseWithSuccess();
                }

                public volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = BridgeMMCachedVideo.this;
                vpa = videoplayeractivity;
                super();
            }
            });
        } else
        {
            return null;
        }
    }

    public MMJSResponse playCachedVideo(Map map)
    {
        Object obj = null;
        Context context = (Context)contextRef.get();
        String s = (String)map.get("videoId");
        MMJSResponse mmjsresponse = obj;
        if (s != null)
        {
            mmjsresponse = obj;
            if (context != null)
            {
                VideoAd videoad = (VideoAd)AdCache.load(context, s);
                mmjsresponse = obj;
                if (videoad != null)
                {
                    mmjsresponse = obj;
                    if (videoad.canShow(context, null, false))
                    {
                        videoad.show(context, getAdImplId((String)map.get("PROPERTY_EXPANDING")));
                        mmjsresponse = MMJSResponse.responseWithSuccess(String.format("Playing Video(%s)", new Object[] {
                            s
                        }));
                    }
                }
            }
        }
        return mmjsresponse;
    }

    public MMJSResponse playVideo(final Map vpa)
    {
        vpa = getVPA();
        if (vpa != null)
        {
            return runOnUiThreadFuture(new Callable() {

                final BridgeMMCachedVideo this$0;
                final VideoPlayerActivity val$vpa;

                public MMJSResponse call()
                {
                    vpa.resumeVideo();
                    return MMJSResponse.responseWithSuccess();
                }

                public volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = BridgeMMCachedVideo.this;
                vpa = videoplayeractivity;
                super();
            }
            });
        } else
        {
            return null;
        }
    }

    public MMJSResponse restartVideo(final Map vpa)
    {
        vpa = getVPA();
        if (vpa != null)
        {
            return runOnUiThreadFuture(new Callable() {

                final BridgeMMCachedVideo this$0;
                final VideoPlayerActivity val$vpa;

                public MMJSResponse call()
                {
                    vpa.restartVideo();
                    return MMJSResponse.responseWithSuccess();
                }

                public volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = BridgeMMCachedVideo.this;
                vpa = videoplayeractivity;
                super();
            }
            });
        } else
        {
            return null;
        }
    }

    public MMJSResponse videoIdExists(Map map)
    {
        Context context = (Context)contextRef.get();
        map = (String)map.get("videoId");
        if (map != null && context != null)
        {
            VideoAd videoad = (VideoAd)AdCache.load(context, map);
            if (videoad != null && videoad.isOnDisk(context) && !videoad.isExpired())
            {
                return MMJSResponse.responseWithSuccess(map);
            }
        }
        return null;
    }
}
