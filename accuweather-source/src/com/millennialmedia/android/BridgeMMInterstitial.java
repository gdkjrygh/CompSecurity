// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.millennialmedia.android:
//            MMJSObject, OverlaySettings, MMJSResponse, AdViewOverlayActivity, 
//            MMWebView, MMLayout, MMAdImplController, MMLog, 
//            MMAdImpl, AdViewOverlayView

class BridgeMMInterstitial extends MMJSObject
{

    private static final String CLOSE = "close";
    private static final String EXPAND_TO_EXTERNAL_BROWSER = "expandToExternalBrowser";
    private static final String EXPAND_WITH_PROPERTIES = "expandWithProperties";
    private static final String OPEN = "open";
    private static final String SET_ORIENTATION = "setOrientation";
    private static final String TAG = com/millennialmedia/android/BridgeMMInterstitial.getName();
    private static final String USE_CUSTOM_CLOSE = "useCustomClose";

    BridgeMMInterstitial()
    {
    }

    private Intent getExpandExtrasIntent(String s, OverlaySettings overlaysettings)
    {
        Intent intent = new Intent();
        if (s != null)
        {
            intent.setData(Uri.parse(s));
        }
        intent.putExtra("settings", overlaysettings);
        intent.putExtra("internalId", overlaysettings.creatorAdImplId);
        return intent;
    }

    private boolean isForcingOrientation(MMJSResponse mmjsresponse)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (mmjsresponse.result != 1)
            {
                break label0;
            }
            flag = flag1;
            if (!(mmjsresponse.response instanceof String))
            {
                break label0;
            }
            mmjsresponse = (String)mmjsresponse.response;
            if (!mmjsresponse.contains("portrait"))
            {
                flag = flag1;
                if (!mmjsresponse.contains("landscape"))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    private MMJSResponse setAllowOrientationChange(Map map)
    {
        map = (String)map.get("allowOrientationChange");
        if (map != null)
        {
            AdViewOverlayActivity adviewoverlayactivity = getBaseActivity();
            if (adviewoverlayactivity != null)
            {
                adviewoverlayactivity.setAllowOrientationChange(Boolean.parseBoolean(map));
                return MMJSResponse.responseWithSuccess();
            }
        }
        return null;
    }

    private MMJSResponse setForceOrientation(Map map)
    {
        map = (String)map.get("forceOrientation");
        AdViewOverlayActivity adviewoverlayactivity = getBaseActivity();
        if (adviewoverlayactivity != null)
        {
            if (!"none".equals(map))
            {
                if ("portrait".equals(map))
                {
                    adviewoverlayactivity.setRequestedOrientationPortrait();
                    return MMJSResponse.responseWithSuccess("portrait");
                }
                if ("landscape".equals(map))
                {
                    adviewoverlayactivity.setRequestedOrientationLandscape();
                    return MMJSResponse.responseWithSuccess("landscape");
                }
            } else
            if ("none".equals(map))
            {
                adviewoverlayactivity.setAllowOrientationChange(true);
                return MMJSResponse.responseWithSuccess("none");
            }
        }
        return null;
    }

    public MMJSResponse close(Map map)
    {
        map = (MMWebView)mmWebViewRef.get();
        if (map != null)
        {
            map.getMMLayout().closeAreaTouched();
            return MMJSResponse.responseWithSuccess();
        } else
        {
            return null;
        }
    }

    MMJSResponse executeCommand(String s, Map map)
    {
        MMJSResponse mmjsresponse = null;
        if ("close".equals(s))
        {
            mmjsresponse = close(map);
        } else
        {
            if ("expandToExternalBrowser".equals(s))
            {
                return expandToExternalBrowser(map);
            }
            if ("expandWithProperties".equals(s))
            {
                return expandWithProperties(map);
            }
            if ("open".equals(s))
            {
                return open(map);
            }
            if ("setOrientation".equals(s))
            {
                return setOrientation(map);
            }
            if ("useCustomClose".equals(s))
            {
                return useCustomClose(map);
            }
        }
        return mmjsresponse;
    }

    public MMJSResponse expandToExternalBrowser(Map map)
    {
        return open(map);
    }

    public MMJSResponse expandWithProperties(Map map)
    {
        String s = (String)map.get("PROPERTY_BANNER_TYPE");
        if (s != null && !Boolean.parseBoolean(s))
        {
            return MMJSResponse.responseWithError("Cannot expand a non banner ad");
        }
        String s2 = (String)map.get("url");
        s = (String)map.get("transparent");
        String s7 = (String)map.get("useCustomClose");
        String s8 = (String)map.get("transition");
        String s1 = (String)map.get("orientation");
        String s3 = (String)map.get("transitionDuration");
        String s4 = (String)map.get("height");
        String s5 = (String)map.get("width");
        String s6 = (String)map.get("modal");
        String s9 = (String)map.get("PROPERTY_EXPANDING");
        String s10 = (String)map.get("allowOrientationChange");
        Context context = (Context)contextRef.get();
        if (context != null)
        {
            OverlaySettings overlaysettings = new OverlaySettings();
            if (s2 != null)
            {
                overlaysettings.urlToLoad = s2;
            }
            if (s9 != null)
            {
                overlaysettings.creatorAdImplId = (int)Float.parseFloat(s9);
            }
            if (s != null)
            {
                overlaysettings.setIsTransparent(Boolean.parseBoolean(s));
            }
            if (s7 != null)
            {
                overlaysettings.setUseCustomClose(Boolean.parseBoolean(s7));
            }
            if (s8 != null)
            {
                overlaysettings.setTransition(s8);
            }
            if (s10 != null)
            {
                overlaysettings.allowOrientationChange = Boolean.parseBoolean(s10);
            }
            s = s1;
            if (s1 == null)
            {
                s = (String)map.get("forceOrientation");
            }
            if (s != null)
            {
                overlaysettings.orientation = s;
            }
            if (s4 != null)
            {
                overlaysettings.height = (int)Float.parseFloat(s4);
            }
            if (s5 != null)
            {
                overlaysettings.width = (int)Float.parseFloat(s5);
            }
            if (s6 != null)
            {
                overlaysettings.modal = Boolean.parseBoolean(s6);
            }
            long l;
            if (s3 != null)
            {
                try
                {
                    overlaysettings.setTransitionDurationInMillis(Long.parseLong(s3) * 1000L);
                }
                catch (Exception exception)
                {
                    MMLog.e(TAG, "Problem converting transitionDuration", exception);
                }
            }
            Utils.IntentUtils.startAdViewOverlayActivity(context, getExpandExtrasIntent(s2, overlaysettings));
            l = getAdImplId((String)map.get("PROPERTY_EXPANDING"));
            MMSDK.Event.overlayOpenedBroadCast(context, l);
            if (MMAdImplController.getAdImplWithId(l) != null)
            {
                MMSDK.Event.overlayOpened(MMAdImplController.getAdImplWithId(l));
            }
            return MMJSResponse.responseWithSuccess();
        } else
        {
            return null;
        }
    }

    public MMJSResponse open(Map map)
    {
        Object obj = (String)map.get("url");
        Context context = (Context)contextRef.get();
        if (obj != null && context != null)
        {
            obj = new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj))));
            long l = getAdImplId((String)map.get("PROPERTY_EXPANDING"));
            MMSDK.Event.intentStarted(context, "browser", l);
            Utils.IntentUtils.startActivity(context, ((Intent) (obj)));
            map = MMAdImplController.getAdImplWithId(l);
            if (map != null && !((MMAdImpl) (map)).isOverlayLaunched)
            {
                MMSDK.Event.overlayOpened(map);
            }
            return MMJSResponse.responseWithSuccess();
        } else
        {
            return null;
        }
    }

    public MMJSResponse setOrientation(Map map)
    {
        MMJSResponse mmjsresponse;
label0:
        {
            MMJSResponse mmjsresponse1 = setForceOrientation(map);
            if (mmjsresponse1 != null)
            {
                mmjsresponse = mmjsresponse1;
                if (isForcingOrientation(mmjsresponse1))
                {
                    break label0;
                }
            }
            mmjsresponse = setAllowOrientationChange(map);
        }
        return mmjsresponse;
    }

    public MMJSResponse useCustomClose(Map map)
    {
        Object obj = (MMWebView)mmWebViewRef.get();
        map = (String)map.get("useCustomClose");
        if (map != null && obj != null)
        {
            obj = ((MMWebView) (obj)).getAdViewOverlayView();
            if (obj != null)
            {
                ((AdViewOverlayView) (obj)).setUseCustomClose(Boolean.parseBoolean(map));
                return MMJSResponse.responseWithSuccess();
            }
        }
        return null;
    }

}
