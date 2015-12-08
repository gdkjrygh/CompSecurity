// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.net.Uri;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.millennialmedia.android:
//            BridgeMMBanner, ComponentRegistry, BridgeMMCachedVideo, BridgeMMCalendar, 
//            BridgeMMDevice, BridgeMMInlineVideo, BridgeMMInterstitial, BridgeMMMedia, 
//            BridgeMMNotification, BridgeMMSpeechkit, MMLog, MMWebView, 
//            MMJSObject, MMJSResponse, MMSDK

class MMCommand
    implements Runnable
{

    private static final String MM_BANNER = "MMBanner";
    private static final String MM_CACHED_VIDEO = "MMCachedVideo";
    private static final String MM_CALENDAR = "MMCalendar";
    private static final String MM_DEVICE = "MMDevice";
    private static final String MM_INLINE_VIDEO = "MMInlineVideo";
    private static final String MM_INTERSTITIAL = "MMInterstitial";
    private static final String MM_MEDIA = "MMMedia";
    private static final String MM_NOTIFICATION = "MMNotification";
    private static final String MM_SPEECHKIT = "MMSpeechkit";
    private static final String TAG = "MMCommand";
    private Map arguments;
    private String bridgeService;
    private String callback;
    private String serviceMethod;
    private WeakReference webViewRef;

    MMCommand(MMWebView mmwebview, String s)
    {
        webViewRef = new WeakReference(mmwebview);
        mmwebview = Uri.parse(s).getHost().split("\\.");
        if (mmwebview.length != 2)
        {
            return;
        }
        int j;
        bridgeService = mmwebview[0];
        serviceMethod = mmwebview[1];
        arguments = new HashMap();
        mmwebview = s.substring(s.indexOf('?') + 1).split("&");
        j = mmwebview.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        String as[] = mmwebview[i].split("=");
        if (as.length >= 2)
        {
            arguments.put(Uri.decode(as[0]), Uri.decode(as[1]));
            if (as[0].equalsIgnoreCase("callback"))
            {
                callback = Uri.decode(as[1]);
            }
        }
        i++;
        if (true) goto _L2; else goto _L1
        mmwebview;
        MMLog.e("MMCommand", String.format("Exception while executing javascript call %s ", new Object[] {
            s
        }), mmwebview);
        mmwebview.printStackTrace();
_L1:
    }

    private MMJSObject getBridgeService(String s)
    {
        Object obj = null;
        BridgeMMBanner bridgemmbanner = obj;
        if (s != null)
        {
            if ("MMBanner".equals(s))
            {
                bridgemmbanner = ComponentRegistry.getBannerBridge();
            } else
            {
                if ("MMCachedVideo".equals(s))
                {
                    return ComponentRegistry.getCachedVideoBridge();
                }
                if ("MMCalendar".equals(s))
                {
                    return ComponentRegistry.getCalendarBridge();
                }
                if ("MMDevice".equals(s))
                {
                    return ComponentRegistry.getDeviceBridge();
                }
                if ("MMInlineVideo".equals(s))
                {
                    return ComponentRegistry.getInlineVideoBridge();
                }
                if ("MMInterstitial".equals(s))
                {
                    return ComponentRegistry.getInterstitialBridge();
                }
                if ("MMMedia".equals(s))
                {
                    return ComponentRegistry.getMediaBridge();
                }
                if ("MMNotification".equals(s))
                {
                    return ComponentRegistry.getNotificationBridge();
                }
                bridgemmbanner = obj;
                if ("MMSpeechkit".equals(s))
                {
                    return ComponentRegistry.getSpeechkitBridge();
                }
            }
        }
        return bridgemmbanner;
    }

    private String getBridgeStrippedClassName()
    {
        return bridgeService.replaceFirst("Bridge", "");
    }

    boolean isResizeCommand()
    {
        if (serviceMethod != null)
        {
            return "resize".equals(serviceMethod);
        } else
        {
            return false;
        }
    }

    public void run()
    {
        Object obj;
        final Object resp;
        resp = null;
        obj = null;
        Object obj1;
        if (bridgeService == null)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        obj1 = serviceMethod;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        obj1 = (MMWebView)webViewRef.get();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj = getBridgeService(bridgeService);
        if (obj == null) goto _L4; else goto _L3
_L3:
        ((MMJSObject) (obj)).setContext(((MMWebView) (obj1)).getContext());
        ((MMJSObject) (obj)).setMMWebView(((MMWebView) (obj1)));
        ((MMWebView) (obj1)).updateArgumentsWithSettings(arguments);
        obj = ((MMJSObject) (obj)).executeCommand(serviceMethod, arguments);
_L2:
        if (!TextUtils.isEmpty(callback))
        {
            final MMWebView webViewCallback = (MMWebView)webViewRef.get();
            if (webViewCallback != null)
            {
                resp = obj;
                if (obj == null)
                {
                    resp = MMJSResponse.responseWithError(serviceMethod);
                }
                if (((MMJSResponse) (resp)).methodName == null)
                {
                    resp.methodName = serviceMethod;
                }
                if (((MMJSResponse) (resp)).className == null)
                {
                    resp.className = getBridgeStrippedClassName();
                }
                MMSDK.runOnUiThread(new Runnable() {

                    final MMCommand this$0;
                    final MMJSResponse val$resp;
                    final MMWebView val$webViewCallback;

                    public void run()
                    {
                        if (serviceMethod.equals("expandWithProperties"))
                        {
                            webViewCallback.isExpanding = true;
                        }
                        String s = String.format("javascript:%s(%s);", new Object[] {
                            callback, resp.toJSONString()
                        });
                        webViewCallback.loadUrl(s);
                    }

            
            {
                this$0 = MMCommand.this;
                webViewCallback = mmwebview;
                resp = mmjsresponse;
                super();
            }
                });
            }
        }
        return;
_L4:
        obj = MMJSResponse.responseWithError((new StringBuilder()).append("Service: ").append(bridgeService).append(" does not exist.").toString());
          goto _L2
        obj;
        MMLog.e("MMCommand", (new StringBuilder()).append("Exception while executing javascript call ").append(serviceMethod).toString(), ((Throwable) (obj)));
        obj = MMJSResponse.responseWithError((new StringBuilder()).append("Unexpected exception, ").append(obj.getClass().getName()).append(" received.").toString());
          goto _L2
        obj = MMJSResponse.responseWithError("The service or service method was not defined.");
          goto _L2
        Exception exception;
        exception;
        if (!TextUtils.isEmpty(callback))
        {
            final MMWebView webViewCallback = (MMWebView)webViewRef.get();
            if (webViewCallback != null)
            {
                final Object resp = resp;
                if (true)
                {
                    resp = MMJSResponse.responseWithError(serviceMethod);
                }
                if (((MMJSResponse) (resp)).methodName == null)
                {
                    resp.methodName = serviceMethod;
                }
                if (((MMJSResponse) (resp)).className == null)
                {
                    resp.className = getBridgeStrippedClassName();
                }
                MMSDK.runOnUiThread(new _cls1());
            }
        }
        throw exception;
    }

    static 
    {
        ComponentRegistry.addBannerBridge(new BridgeMMBanner());
        ComponentRegistry.addCachedVideoBridge(new BridgeMMCachedVideo());
        ComponentRegistry.addCalendarBridge(new BridgeMMCalendar());
        ComponentRegistry.addDeviceBridge(new BridgeMMDevice());
        ComponentRegistry.addInlineVideoBridge(new BridgeMMInlineVideo());
        ComponentRegistry.addInterstitialBridge(new BridgeMMInterstitial());
        ComponentRegistry.addMediaBridge(new BridgeMMMedia());
        ComponentRegistry.addNotificationBridge(new BridgeMMNotification());
        ComponentRegistry.addSpeechkitBridge(new BridgeMMSpeechkit());
    }


}
