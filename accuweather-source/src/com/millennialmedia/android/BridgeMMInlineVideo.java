// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.millennialmedia.android:
//            MMJSObject, MMJSResponse, MMWebView, MMLayout

class BridgeMMInlineVideo extends MMJSObject
{

    private static final String ADJUST_VIDEO = "adjustVideo";
    private static final String INSERT_VIDEO = "insertVideo";
    private static final String PAUSE_VIDEO = "pauseVideo";
    private static final String PLAY_VIDEO = "playVideo";
    private static final String REMOVE_VIDEO = "removeVideo";
    private static final String RESUME_VIDEO = "resumeVideo";
    private static final String SET_STREAM_VIDEO_SOURCE = "setStreamVideoSource";
    private static final String STOP_VIDEO = "stopVideo";

    BridgeMMInlineVideo()
    {
    }

    public MMJSResponse adjustVideo(final Map parameters)
    {
        return runOnUiThreadFuture(new Callable() {

            final BridgeMMInlineVideo this$0;
            final Map val$parameters;

            public MMJSResponse call()
            {
                MMWebView mmwebview = (MMWebView)mmWebViewRef.get();
                if (mmwebview != null && mmwebview != null && mmwebview.getMMLayout().adjustVideo(new InlineVideoView.InlineParams(parameters, mmwebview.getContext())))
                {
                    return MMJSResponse.responseWithSuccess();
                } else
                {
                    return MMJSResponse.responseWithError();
                }
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = BridgeMMInlineVideo.this;
                parameters = map;
                super();
            }
        });
    }

    MMJSResponse executeCommand(String s, Map map)
    {
        MMJSResponse mmjsresponse = null;
        if ("adjustVideo".equals(s))
        {
            mmjsresponse = adjustVideo(map);
        } else
        {
            if ("insertVideo".equals(s))
            {
                return insertVideo(map);
            }
            if ("pauseVideo".equals(s))
            {
                return pauseVideo(map);
            }
            if ("playVideo".equals(s))
            {
                return playVideo(map);
            }
            if ("removeVideo".equals(s))
            {
                return removeVideo(map);
            }
            if ("resumeVideo".equals(s))
            {
                return resumeVideo(map);
            }
            if ("setStreamVideoSource".equals(s))
            {
                return setStreamVideoSource(map);
            }
            if ("stopVideo".equals(s))
            {
                return stopVideo(map);
            }
        }
        return mmjsresponse;
    }

    public MMJSResponse insertVideo(final Map parameters)
    {
        return runOnUiThreadFuture(new Callable() {

            final BridgeMMInlineVideo this$0;
            final Map val$parameters;

            public MMJSResponse call()
            {
                MMWebView mmwebview = (MMWebView)mmWebViewRef.get();
                if (mmwebview != null)
                {
                    MMLayout mmlayout = mmwebview.getMMLayout();
                    mmlayout.initInlineVideo(new InlineVideoView.InlineParams(parameters, mmwebview.getContext()));
                    return MMJSResponse.responseWithSuccess((new StringBuilder()).append("usingStreaming=").append(mmlayout.isVideoPlayingStreaming()).toString());
                } else
                {
                    return MMJSResponse.responseWithError();
                }
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = BridgeMMInlineVideo.this;
                parameters = map;
                super();
            }
        });
    }

    public MMJSResponse pauseVideo(Map map)
    {
        return runOnUiThreadFuture(new Callable() {

            final BridgeMMInlineVideo this$0;

            public MMJSResponse call()
            {
                Object obj = (MMWebView)mmWebViewRef.get();
                if (obj != null)
                {
                    obj = ((MMWebView) (obj)).getMMLayout();
                    if (obj != null)
                    {
                        ((MMLayout) (obj)).pauseVideo();
                        return MMJSResponse.responseWithSuccess();
                    }
                }
                return MMJSResponse.responseWithError();
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = BridgeMMInlineVideo.this;
                super();
            }
        });
    }

    public MMJSResponse playVideo(Map map)
    {
        return runOnUiThreadFuture(new Callable() {

            final BridgeMMInlineVideo this$0;

            public MMJSResponse call()
            {
                Object obj = (MMWebView)mmWebViewRef.get();
                if (obj != null)
                {
                    obj = ((MMWebView) (obj)).getMMLayout();
                    if (obj != null)
                    {
                        ((MMLayout) (obj)).playVideo();
                        return MMJSResponse.responseWithSuccess();
                    }
                }
                return MMJSResponse.responseWithError();
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = BridgeMMInlineVideo.this;
                super();
            }
        });
    }

    public MMJSResponse removeVideo(Map map)
    {
        return runOnUiThreadFuture(new Callable() {

            final BridgeMMInlineVideo this$0;

            public MMJSResponse call()
            {
                Object obj = (MMWebView)mmWebViewRef.get();
                if (obj != null)
                {
                    obj = ((MMWebView) (obj)).getMMLayout();
                    if (obj != null)
                    {
                        ((MMLayout) (obj)).removeVideo();
                        return MMJSResponse.responseWithSuccess();
                    }
                }
                return MMJSResponse.responseWithError();
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = BridgeMMInlineVideo.this;
                super();
            }
        });
    }

    public MMJSResponse resumeVideo(Map map)
    {
        return runOnUiThreadFuture(new Callable() {

            final BridgeMMInlineVideo this$0;

            public MMJSResponse call()
            {
                Object obj = (MMWebView)mmWebViewRef.get();
                if (obj != null)
                {
                    obj = ((MMWebView) (obj)).getMMLayout();
                    if (obj != null)
                    {
                        ((MMLayout) (obj)).resumeVideo();
                        return MMJSResponse.responseWithSuccess();
                    }
                }
                return MMJSResponse.responseWithError();
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = BridgeMMInlineVideo.this;
                super();
            }
        });
    }

    public MMJSResponse setStreamVideoSource(final Map parameters)
    {
        return runOnUiThreadFuture(new Callable() {

            final BridgeMMInlineVideo this$0;
            final Map val$parameters;

            public MMJSResponse call()
            {
                Object obj = (MMWebView)mmWebViewRef.get();
                if (obj != null)
                {
                    obj = ((MMWebView) (obj)).getMMLayout();
                    String s = (String)parameters.get("streamVideoURI");
                    if (obj != null && s != null)
                    {
                        ((MMLayout) (obj)).setVideoSource(s);
                        return MMJSResponse.responseWithSuccess();
                    }
                }
                return MMJSResponse.responseWithError();
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = BridgeMMInlineVideo.this;
                parameters = map;
                super();
            }
        });
    }

    public MMJSResponse stopVideo(Map map)
    {
        return runOnUiThreadFuture(new Callable() {

            final BridgeMMInlineVideo this$0;

            public MMJSResponse call()
            {
                Object obj = (MMWebView)mmWebViewRef.get();
                if (obj != null)
                {
                    obj = ((MMWebView) (obj)).getMMLayout();
                    if (obj != null)
                    {
                        ((MMLayout) (obj)).stopVideo();
                        return MMJSResponse.responseWithSuccess();
                    }
                }
                return MMJSResponse.responseWithError();
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = BridgeMMInlineVideo.this;
                super();
            }
        });
    }
}
