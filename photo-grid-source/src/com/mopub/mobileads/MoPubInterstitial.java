// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.app.Activity;
import android.location.Location;
import com.mopub.common.MoPub;
import java.util.Map;

// Referenced classes of package com.mopub.mobileads:
//            q, x, CustomEventInterstitialAdapter, MoPubErrorCode, 
//            w

public class MoPubInterstitial
    implements q
{

    private MoPubInterstitialView a;
    private CustomEventInterstitialAdapter b;
    private InterstitialAdListener c;
    private Activity d;
    private String e;
    private int f;
    private boolean g;
    private MoPubInterstitialListener h;

    public MoPubInterstitial(Activity activity, String s)
    {
        d = activity;
        e = s;
        a = new MoPubInterstitialView(d);
        a.setAdUnitId(e);
        f = x.NOT_READY$414e0682;
    }

    static CustomEventInterstitialAdapter a(MoPubInterstitial mopubinterstitial)
    {
        return mopubinterstitial.b;
    }

    static CustomEventInterstitialAdapter a(MoPubInterstitial mopubinterstitial, CustomEventInterstitialAdapter customeventinterstitialadapter)
    {
        mopubinterstitial.b = customeventinterstitialadapter;
        return customeventinterstitialadapter;
    }

    static InterstitialAdListener b(MoPubInterstitial mopubinterstitial)
    {
        return mopubinterstitial.c;
    }

    private void b()
    {
        f = x.NOT_READY$414e0682;
        if (b != null)
        {
            b.c();
            b = null;
        }
        g = false;
    }

    final Integer a()
    {
        return a.b();
    }

    public void customEventActionWillBegin()
    {
        if (a != null)
        {
            a.c();
        }
    }

    public void customEventDidFailToLoadAd()
    {
        if (a != null)
        {
            a.b(MoPubErrorCode.UNSPECIFIED);
        }
    }

    public void customEventDidLoadAd()
    {
        if (a != null)
        {
            a.a();
        }
    }

    public void destroy()
    {
        g = true;
        if (b != null)
        {
            b.c();
            b = null;
        }
        a.setBannerAdListener(null);
        a.destroy();
    }

    public void forceRefresh()
    {
        b();
        a.forceRefresh();
    }

    public Activity getActivity()
    {
        return d;
    }

    public InterstitialAdListener getInterstitialAdListener()
    {
        return c;
    }

    public String getKeywords()
    {
        return a.getKeywords();
    }

    public MoPubInterstitialListener getListener()
    {
        return h;
    }

    public Map getLocalExtras()
    {
        return a.getLocalExtras();
    }

    public Location getLocation()
    {
        return a.getLocation();
    }

    public com.mopub.common.LocationService.LocationAwareness getLocationAwareness()
    {
        return com.mopub.common.LocationService.LocationAwareness.fromMoPubLocationAwareness(MoPub.getLocationAwareness());
    }

    public int getLocationPrecision()
    {
        return MoPub.getLocationPrecision();
    }

    public boolean getTesting()
    {
        return a.getTesting();
    }

    public boolean isFacebookSupported()
    {
        return false;
    }

    public boolean isReady()
    {
        return f != x.NOT_READY$414e0682;
    }

    public void load()
    {
        b();
        a.loadAd();
    }

    public void onCustomEventInterstitialClicked()
    {
        if (!g)
        {
            a.c();
            if (c != null)
            {
                c.onInterstitialClicked(this);
                return;
            }
        }
    }

    public void onCustomEventInterstitialDismissed()
    {
        if (!g)
        {
            f = x.NOT_READY$414e0682;
            if (c != null)
            {
                c.onInterstitialDismissed(this);
                return;
            }
        }
    }

    public void onCustomEventInterstitialFailed(MoPubErrorCode mopuberrorcode)
    {
        if (g)
        {
            return;
        } else
        {
            f = x.NOT_READY$414e0682;
            a.b(mopuberrorcode);
            return;
        }
    }

    public void onCustomEventInterstitialLoaded()
    {
        if (!g)
        {
            f = x.CUSTOM_EVENT_AD_READY$414e0682;
            if (c != null)
            {
                c.onInterstitialLoaded(this);
                return;
            }
            if (h != null)
            {
                h.OnInterstitialLoaded();
                return;
            }
        }
    }

    public void onCustomEventInterstitialShown()
    {
        if (!g)
        {
            a.a();
            if (c != null)
            {
                c.onInterstitialShown(this);
                return;
            }
        }
    }

    public void setFacebookSupported(boolean flag)
    {
    }

    public void setInterstitialAdListener(InterstitialAdListener interstitialadlistener)
    {
        c = interstitialadlistener;
    }

    public void setKeywords(String s)
    {
        a.setKeywords(s);
    }

    public void setListener(MoPubInterstitialListener mopubinterstitiallistener)
    {
        h = mopubinterstitiallistener;
    }

    public void setLocalExtras(Map map)
    {
        a.setLocalExtras(map);
    }

    public void setLocationAwareness(com.mopub.common.LocationService.LocationAwareness locationawareness)
    {
        MoPub.setLocationAwareness(locationawareness.getNewLocationAwareness());
    }

    public void setLocationPrecision(int i)
    {
        MoPub.setLocationPrecision(i);
    }

    public void setTesting(boolean flag)
    {
        a.setTesting(flag);
    }

    public boolean show()
    {
        switch (w.a[f - 1])
        {
        default:
            return false;

        case 1: // '\001'
            break;
        }
        if (b != null)
        {
            b.b();
        }
        return true;
    }

    private class MoPubInterstitialView extends MoPubView
    {

        final MoPubInterstitial a;

        protected final void a()
        {
            MoPubLog.d("Tracking impression for interstitial.");
            if (b != null)
            {
                b.g();
            }
        }

        protected final void a(MoPubErrorCode mopuberrorcode)
        {
            if (MoPubInterstitial.b(a) != null)
            {
                MoPubInterstitial.b(a).onInterstitialFailed(a, mopuberrorcode);
            }
        }

        protected final void a(String s, Map map)
        {
            if (b == null)
            {
                return;
            }
            if (TextUtils.isEmpty(s))
            {
                MoPubLog.d("Couldn't invoke custom event because the server did not specify one.");
                b(MoPubErrorCode.ADAPTER_NOT_FOUND);
                return;
            }
            if (MoPubInterstitial.a(a) != null)
            {
                MoPubInterstitial.a(a).c();
            }
            MoPubLog.d("Loading custom event interstitial adapter.");
            MoPubInterstitial.a(a, CustomEventInterstitialAdapterFactory.create(a, s, map, b.getBroadcastIdentifier(), b.getAdReport()));
            MoPubInterstitial.a(a).a(a);
            MoPubInterstitial.a(a).a();
        }

        public AdFormat getAdFormat()
        {
            return AdFormat.INTERSTITIAL;
        }

        public MoPubInterstitialView(Context context)
        {
            a = MoPubInterstitial.this;
            super(context);
            setAutorefreshEnabled(false);
        }
    }


    private class InterstitialAdListener
    {

        public abstract void onInterstitialClicked(MoPubInterstitial mopubinterstitial);

        public abstract void onInterstitialDismissed(MoPubInterstitial mopubinterstitial);

        public abstract void onInterstitialFailed(MoPubInterstitial mopubinterstitial, MoPubErrorCode mopuberrorcode);

        public abstract void onInterstitialLoaded(MoPubInterstitial mopubinterstitial);

        public abstract void onInterstitialShown(MoPubInterstitial mopubinterstitial);
    }


    private class MoPubInterstitialListener
    {

        public abstract void OnInterstitialFailed();

        public abstract void OnInterstitialLoaded();
    }

}
