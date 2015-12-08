// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.millennialmedia.android:
//            MMAd, MMLog, BannerWebViewClient, MMSDK, 
//            MMRequest, HandShake, MMAdImplController, MMWebView, 
//            MMWebViewClient, RequestListener

abstract class MMAdImpl
    implements MMAd
{
    static class BasicWebViewClientListener extends MMWebViewClient.MMWebViewClientListener
    {

        WeakReference adImplRef;

        public void onPageFinished(String s)
        {
            MMAdImpl mmadimpl;
            mmadimpl = (MMAdImpl)adImplRef.get();
            if (mmadimpl == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            mmadimpl.setClickable(true);
            if (mmadimpl.controller == null || mmadimpl.controller.webView == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            s = mmadimpl.controller.webView;
            s;
            JVM INSTR monitorenter ;
            if (!mmadimpl.controller.webView.hasWindowFocus())
            {
                break MISSING_BLOCK_LABEL_73;
            }
            mmadimpl.controller.webView.setMraidViewableVisible();
_L2:
            return;
            mmadimpl.controller.webView.setMraidViewableHidden();
            if (true) goto _L2; else goto _L1
_L1:
            Exception exception;
            exception;
            s;
            JVM INSTR monitorexit ;
            throw exception;
        }

        void onPageStarted(String s)
        {
            s = (MMAdImpl)adImplRef.get();
            if (s != null)
            {
                s.setClickable(false);
            }
        }

        BasicWebViewClientListener(MMAdImpl mmadimpl)
        {
            adImplRef = new WeakReference(mmadimpl);
        }
    }

    static class MMAdImplRedirectionListenerImpl extends HttpRedirection.RedirectionListenerImpl
    {

        WeakReference adImplRef;

        public boolean isActivityStartable(Uri uri)
        {
            uri = (MMAdImpl)adImplRef.get();
            if (uri != null)
            {
                uri = uri.getContext();
                if (uri != null && (uri instanceof Activity) && ((Activity)uri).isFinishing())
                {
                    return false;
                }
            }
            return true;
        }

        public void startingActivity(Uri uri)
        {
            super.startingActivity(uri);
            if (uri.getScheme().equalsIgnoreCase("http") || uri.getScheme().equalsIgnoreCase("https"))
            {
                uri = (MMAdImpl)adImplRef.get();
                if (uri != null)
                {
                    MMSDK.Event.overlayOpened(uri);
                }
            }
        }

        public void updateLastVideoViewedTime()
        {
            MMAdImpl mmadimpl = (MMAdImpl)adImplRef.get();
            if (mmadimpl != null && mmadimpl.adType != null)
            {
                HandShake.sharedHandShake(mmadimpl.getContext()).updateLastVideoViewedTime(mmadimpl.getContext(), mmadimpl.adType);
            }
        }

        public MMAdImplRedirectionListenerImpl(MMAdImpl mmadimpl)
        {
            if (mmadimpl != null)
            {
                adImplRef = new WeakReference(mmadimpl);
                creatorAdImplInternalId = mmadimpl.internalId;
            }
        }
    }


    static final String BANNER = "b";
    static final String INTERSTITIAL = "i";
    private static final String TAG = "MMAdImpl";
    private static long nextAdViewId = 1L;
    String adType;
    String apid;
    WeakReference contextRef;
    MMAdImplController controller;
    boolean ignoreDensityScaling;
    long internalId;
    boolean isFinishing;
    boolean isOverlayLaunched;
    long lastAdRequest;
    long linkForExpansionId;
    protected MMRequest mmRequest;
    MMWebViewClient mmWebViewClient;
    MMWebViewClient.MMWebViewClientListener mmWebViewClientListener;
    JSONObject obj;
    RequestListener requestListener;
    String userData;

    public MMAdImpl(Context context)
    {
        ignoreDensityScaling = false;
        apid = "28911";
        isOverlayLaunched = false;
        contextRef = new WeakReference(context);
        mmWebViewClientListener = new BasicWebViewClientListener(this);
        com/millennialmedia/android/MMAdImpl;
        JVM INSTR monitorenter ;
        internalId = nextAdViewId;
        nextAdViewId++;
        MMLog.v("MMAdImpl", String.format("Assigning MMAdImpl internal id: %d", new Object[] {
            Long.valueOf(internalId)
        }));
        com/millennialmedia/android/MMAdImpl;
        JVM INSTR monitorexit ;
        return;
        context;
        com/millennialmedia/android/MMAdImpl;
        JVM INSTR monitorexit ;
        throw context;
    }

    static String[] getAdTypes()
    {
        return (new String[] {
            "b", "i"
        });
    }

    void addView(MMWebView mmwebview, android.widget.RelativeLayout.LayoutParams layoutparams)
    {
    }

    void animateTransition()
    {
    }

    public String getApid()
    {
        return apid;
    }

    String getCachedName()
    {
        if (adType != null && apid != null)
        {
            return (new StringBuilder()).append(adType).append("_").append(apid).toString();
        } else
        {
            return null;
        }
    }

    abstract MMAd getCallingAd();

    Context getContext()
    {
        if (contextRef != null)
        {
            return (Context)contextRef.get();
        } else
        {
            return null;
        }
    }

    int getId()
    {
        return -1;
    }

    public boolean getIgnoresDensityScaling()
    {
        return ignoreDensityScaling;
    }

    public RequestListener getListener()
    {
        return requestListener;
    }

    public MMRequest getMMRequest()
    {
        return mmRequest;
    }

    MMWebViewClient getMMWebViewClient()
    {
        MMLog.d("MMAdImpl", (new StringBuilder()).append("Returning a client for user: DefaultWebViewClient, adimpl=").append(this).toString());
        return new BannerWebViewClient(mmWebViewClientListener, new MMAdImplRedirectionListenerImpl(this));
    }

    String getReqType()
    {
        return "fetch";
    }

    String getRequestCompletedAction()
    {
        return "millennialmedia.action.ACTION_FETCH_SUCCEEDED";
    }

    String getRequestFailedAction()
    {
        return "millennialmedia.action.ACTION_FETCH_FAILED";
    }

    public boolean hasCachedVideoSupport()
    {
        return true;
    }

    void insertUrlAdMetaValues(Map map)
    {
        Context context = getContext();
        map.put("apid", apid);
        map.put("do", MMSDK.getOrientation(context));
        map.put("olock", MMSDK.getOrientationLocked(context));
        if (!hasCachedVideoSupport())
        {
            map.put("cachedvideo", "false");
        }
        map.put("reqtype", getReqType());
        if (mmRequest != null)
        {
            mmRequest.getUrlParams(map);
        }
        if (HandShake.sharedHandShake(context).canRequestVideo(context, adType))
        {
            map.put("video", "true");
        } else
        {
            map.put("video", "false");
        }
        if (adType != null)
        {
            if (adType.equals("b") || adType.equals("i"))
            {
                map.put("at", adType);
                return;
            } else
            {
                MMLog.e("MMAdImpl", (new StringBuilder()).append("******* ERROR: INCORRECT AD TYPE IN MMADVIEW OBJECT PARAMETERS (").append(adType).append(") **********").toString());
                return;
            }
        } else
        {
            MMLog.e("MMAdImpl", "******* SDK DEFAULTED TO MMBannerAdBottom. THIS MAY AFFECT THE ADS YOU RECIEVE!!! **********");
            map.put("at", "b");
            return;
        }
    }

    public boolean isBanner()
    {
        return false;
    }

    boolean isExpandingToUrl()
    {
        return false;
    }

    boolean isLifecycleObservable()
    {
        return false;
    }

    boolean isRefreshable()
    {
        if (MMSDK.disableAdMinRefresh)
        {
            MMLog.d("MMAdImpl", "Minimum adrefresh time ignored");
            return true;
        }
        long l = System.currentTimeMillis();
        int i = (int)((l - lastAdRequest) / 1000L);
        long l1 = HandShake.sharedHandShake(getContext()).adRefreshSecs;
        if ((long)i >= l1)
        {
            lastAdRequest = l;
            return true;
        } else
        {
            MMLog.d("MMAdImpl", String.format("Cannot request ad. Last ad request was %d seconds ago. Next ad can be requested in %d seconds.", new Object[] {
                Integer.valueOf(i), Long.valueOf(l1 - (long)i)
            }));
            return false;
        }
    }

    boolean isTransitionAnimated()
    {
        return false;
    }

    boolean isUpdatingMraid()
    {
        return controller != null && controller.webView != null && !controller.webView.isExpanding;
    }

    void prepareTransition(Bitmap bitmap)
    {
    }

    void removeProgressBar()
    {
    }

    void removeView(MMWebView mmwebview)
    {
    }

    void requestAd()
    {
        MMAdImplController.assignAdViewController(this);
        if (controller != null)
        {
            controller.requestAd();
        }
    }

    public void setApid(String s)
    {
        if (s != null && !s.isEmpty())
        {
            HandShake.apid = s;
        }
        apid = s;
    }

    void setClickable(boolean flag)
    {
    }

    public void setIgnoresDensityScaling(boolean flag)
    {
        ignoreDensityScaling = flag;
    }

    public void setListener(RequestListener requestlistener)
    {
        requestListener = requestlistener;
    }

    public void setMMRequest(MMRequest mmrequest)
    {
        mmRequest = mmrequest;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AdType[(").append(adType).append(") InternalId(").append(internalId).append(") LinkedId(").append(linkForExpansionId).append(") isFinishing(").append(isFinishing).append(")]").toString();
    }

    void unresizeToDefault()
    {
        if (controller != null)
        {
            controller.unresizeToDefault();
        }
    }

}
