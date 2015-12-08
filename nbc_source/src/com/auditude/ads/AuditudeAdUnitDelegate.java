// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads;

import com.auditude.ads.core.APIBridge;
import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.event.AdClickThroughEvent;
import com.auditude.ads.event.AdPluginErrorEvent;
import com.auditude.ads.event.AdPluginEvent;
import com.auditude.ads.event.AdProgressEvent;
import com.auditude.ads.event.AuditudePluginEventListener;
import com.auditude.ads.event.LinearAdEvent;
import com.auditude.ads.event.NonLinearAdEvent;
import com.auditude.ads.event.OnPageEvent;
import com.auditude.ads.event.PlayerErrorEvent;
import com.auditude.ads.exception.AssetException;
import com.auditude.ads.loader.AdRequest;
import com.auditude.ads.reporting.ReportingHelper;
import com.auditude.ads.response.AdResponse;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.event.IEventListener;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class AuditudeAdUnitDelegate
    implements com.auditude.ads.response.AdResponse.AdResponseListener, IEventListener
{

    private static final int MIN_INIT_REQUEST_INTERVAL = 1000;
    private AdRequest adRequest;
    private AdResponse adResponse;
    private com.auditude.ads.response.AdResponse.AdResponseListener adResponseListener;
    private AdSettings adSettings;
    private APIBridge apiBridge;
    private long creationTime;
    private Throwable error;
    private AuditudePluginEventListener listener;
    private ReportingHelper reporting;

    public AuditudeAdUnitDelegate()
    {
        creationTime = 0L;
        AuditudeEnv.setEnvironment(new AuditudeEnv());
        apiBridge = new APIBridge();
        reporting = new ReportingHelper(apiBridge);
        adSettings = new AdSettings();
        apiBridge.addEventListener("apiEvent", this, 100);
        AuditudeEnv.getInstance().init(apiBridge, reporting, adSettings);
    }

    private void reset()
    {
        if (adResponse != null)
        {
            adResponse.cancel();
        }
    }

    public final void cancel()
    {
        reset();
    }

    public final void dispose()
    {
        cancel();
    }

    final APIBridge getAPIBridge()
    {
        return apiBridge;
    }

    public final AdResponse getAdResponse()
    {
        return adResponse;
    }

    final AdSettings getAdSettings()
    {
        return adSettings;
    }

    public final Object getProperty(String s)
    {
        return adSettings.getProperty(s);
    }

    public final ReportingHelper getReportingEngine()
    {
        return reporting;
    }

    public final void init(String s, Object obj, int i, HashMap hashmap, int j)
    {
        reset();
        if (StringUtil.isNullOrEmpty(s))
        {
            apiBridge.dispatchEvent("apiEvent", new AdPluginErrorEvent("initFailed", new RuntimeException("invalid domain")));
            return;
        }
        if (obj == null)
        {
            apiBridge.dispatchEvent("apiEvent", new AdPluginErrorEvent("initFailed", new RuntimeException("invalid media id")));
            return;
        }
        if (i <= 0)
        {
            apiBridge.dispatchEvent("apiEvent", new AdPluginErrorEvent("initFailed", new RuntimeException("invalid zone")));
            return;
        }
        adSettings.setDomain(s);
        adSettings.setZoneId(i);
        adSettings.setCustomParams(hashmap);
        if (adRequest != null)
        {
            adRequest = null;
        }
        adRequest = new AdRequest(obj, i, s, hashmap, j);
        obj = adRequest;
        long l;
        if (adSettings.hasProperty("useSSL"))
        {
            s = adSettings.getProperty("useSSL").toString();
        } else
        {
            s = "false";
        }
        ((AdRequest) (obj)).setUseSSL(Boolean.getBoolean(s));
        l = (new Date()).getTime();
        if (l - creationTime < 1000L)
        {
            error = new RuntimeException("Ad Requested too soon. Requests must be at least 1000ms apart.");
            onRequestFailed(error);
            return;
        } else
        {
            creationTime = l;
            adResponse = new AdResponse(adSettings);
            adResponse.setAdResponseListener(this);
            adResponse.loadAdRequest(adRequest, j);
            return;
        }
    }

    final void logError(int i, String s)
    {
        s = new AssetException(i, s);
        AuditudeEnv.getInstance().getAPI().dispatchEvent("playerError", new PlayerErrorEvent(null, s));
    }

    public final void notify(String s)
    {
        notify(s, null);
    }

    public final void notify(String s, HashMap hashmap)
    {
        if ("breakBegin".equalsIgnoreCase(s))
        {
            apiBridge.breakEnd(null);
        }
    }

    public void onEvent(String s, Object obj)
    {
        if (listener == null || s == null || !s.equalsIgnoreCase("apiEvent") || !(obj instanceof AdPluginEvent))
        {
            return;
        }
        if (obj instanceof AdPluginErrorEvent)
        {
            listener.onAdPluginErrorEvent((AdPluginErrorEvent)obj);
            return;
        }
        if (obj instanceof LinearAdEvent)
        {
            listener.onLinearAdEvent((LinearAdEvent)obj);
            return;
        }
        if (obj instanceof NonLinearAdEvent)
        {
            listener.onNonLinearAdEvent((NonLinearAdEvent)obj);
            return;
        }
        if (obj instanceof OnPageEvent)
        {
            listener.onOnPageAdEvent((OnPageEvent)obj);
            return;
        }
        if (obj instanceof AdProgressEvent)
        {
            listener.onAdProgressEvent((AdProgressEvent)obj);
            return;
        }
        if (obj instanceof AdClickThroughEvent)
        {
            listener.onAdClickEvent((AdClickThroughEvent)obj);
            return;
        }
        if (obj instanceof AdPluginErrorEvent)
        {
            listener.onAdPluginErrorEvent((AdPluginErrorEvent)obj);
            return;
        } else
        {
            listener.onAdPluginEvent((AdPluginEvent)obj);
            return;
        }
    }

    public void onRequestComplete(ArrayList arraylist)
    {
        HashMap hashmap;
        if (adResponseListener != null)
        {
            adResponseListener.onRequestComplete(arraylist);
        }
        reporting.init();
        hashmap = new HashMap();
        if (adResponse == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist1;
        reporting.setSubmissions(adResponse.getSubmissions());
        hashmap.put("breaks", adResponse.GetBreakData());
        arraylist1 = new ArrayList();
        arraylist = arraylist.iterator();
_L6:
        if (arraylist.hasNext()) goto _L4; else goto _L3
_L3:
        hashmap.put("errors", arraylist1);
        apiBridge.dispatchEvent("apiEvent", new AdPluginEvent("initComplete", hashmap));
_L2:
        return;
_L4:
        AssetException assetexception = (AssetException)arraylist.next();
        if (assetexception != null)
        {
            HashMap hashmap1 = new HashMap();
            hashmap1.put("AdId", assetexception.adId);
            hashmap1.put("InternalErrorId", Integer.valueOf(assetexception.id));
            hashmap1.put("Description", assetexception.getMessage());
            arraylist1.add(hashmap1);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onRequestFailed(Throwable throwable)
    {
        if (adResponseListener != null)
        {
            adResponseListener.onRequestFailed(throwable);
        }
        reporting.init();
        if (adResponse != null)
        {
            reporting.setSubmissions(adResponse.getSubmissions());
        }
        apiBridge.dispatchEvent("apiEvent", new AdPluginErrorEvent("initFailed", throwable));
        if (throwable instanceof SocketTimeoutException)
        {
            logError(1100, "");
        } else
        {
            logError(1101, "");
        }
        adResponse = null;
    }

    public void setAdResponseListener(com.auditude.ads.response.AdResponse.AdResponseListener adresponselistener)
    {
        adResponseListener = adresponselistener;
    }

    public final void setAuditudeHandlesChapterBreaks(boolean flag)
    {
        adSettings.setProperty("auditudeHandlesChapterBreaks", Boolean.valueOf(flag));
    }

    public final void setBitRate(int i)
    {
        adSettings.setBitRate(i);
    }

    public void setPluginEventListener(AuditudePluginEventListener auditudeplugineventlistener)
    {
        listener = auditudeplugineventlistener;
    }

    public final void setProperty(String s, Object obj)
    {
        adSettings.setProperty(s, obj);
    }

    public final void setPublisherVersion(String s)
    {
        adSettings.setPublisherVersion(s);
    }

    public final void setSize(double d, double d1)
    {
        adSettings.setWidth(d);
        adSettings.setHeight(d1);
    }

    public void setSize(int i, int j)
    {
    }

    public final void setVolume(float f, float f1)
    {
        adSettings.setVolume(f, f1);
    }
}
