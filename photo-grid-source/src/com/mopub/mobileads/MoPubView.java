// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebViewDatabase;
import android.widget.FrameLayout;
import com.mopub.common.AdFormat;
import com.mopub.common.MoPub;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.ManifestUtils;
import com.mopub.common.util.Visibility;
import com.mopub.mobileads.factories.AdViewControllerFactory;
import com.mopub.mobileads.factories.CustomEventBannerAdapterFactory;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.mopub.mobileads:
//            ai, AdViewController, MoPubErrorCode, CustomEventBannerAdapter

public class MoPubView extends FrameLayout
{

    public static final int DEFAULT_LOCATION_PRECISION = 6;
    private Context a;
    protected AdViewController b;
    protected CustomEventBannerAdapter c;
    private int d;
    private BroadcastReceiver e;
    private BannerAdListener f;
    private OnAdWillLoadListener g;
    private OnAdLoadedListener h;
    private OnAdFailedListener i;
    private OnAdPresentedOverlayListener j;
    private OnAdClosedListener k;
    private OnAdClickedListener l;

    public MoPubView(Context context)
    {
        this(context, null);
    }

    public MoPubView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ManifestUtils.checkWebViewActivitiesDeclared(context);
        a = context;
        d = getVisibility();
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        if (WebViewDatabase.getInstance(context) == null)
        {
            MoPubLog.e("Disabling MoPub. Local cache file is inaccessible so MoPub will fail if we try to create a WebView. Details of this Android bug found at:http://code.google.com/p/android/issues/detail?id=10789");
            return;
        }
        b = AdViewControllerFactory.create(context, this);
        e = new ai(this);
        context = new IntentFilter("android.intent.action.SCREEN_OFF");
        context.addAction("android.intent.action.USER_PRESENT");
        try
        {
            a.registerReceiver(e, context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    static int a(MoPubView mopubview)
    {
        return mopubview.d;
    }

    private void a(int i1)
    {
        if (b == null)
        {
            return;
        }
        if (Visibility.isScreenVisible(i1))
        {
            b.c();
            return;
        } else
        {
            b.b();
            return;
        }
    }

    static void a(MoPubView mopubview, int i1)
    {
        mopubview.a(i1);
    }

    protected void a(MoPubErrorCode mopuberrorcode)
    {
        if (f != null)
        {
            f.onBannerFailed(this, mopuberrorcode);
        } else
        if (i != null)
        {
            i.OnAdFailed(this);
            return;
        }
    }

    protected void a(String s, Map map)
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
        if (c != null)
        {
            c.b();
        }
        MoPubLog.d("Loading custom event adapter.");
        c = CustomEventBannerAdapterFactory.create(this, s, map, b.getBroadcastIdentifier(), b.getAdReport());
        c.a();
    }

    final Integer b()
    {
        if (b != null)
        {
            return b.f();
        } else
        {
            return null;
        }
    }

    protected final void b(MoPubErrorCode mopuberrorcode)
    {
        if (b != null)
        {
            b.a(mopuberrorcode);
        }
    }

    protected final void c()
    {
        if (b != null)
        {
            b.h();
            if (f != null)
            {
                f.onBannerClicked(this);
            } else
            if (l != null)
            {
                l.OnAdClicked(this);
                return;
            }
        }
    }

    public void customEventActionWillBegin()
    {
        if (b != null)
        {
            b.customEventActionWillBegin();
        }
    }

    public void customEventDidFailToLoadAd()
    {
        if (b != null)
        {
            b.customEventDidFailToLoadAd();
        }
    }

    public void customEventDidLoadAd()
    {
        if (b != null)
        {
            b.customEventDidLoadAd();
        }
    }

    protected final void d()
    {
        MoPubLog.d("Tracking impression for native adapter.");
        if (b != null)
        {
            b.g();
        }
    }

    public void destroy()
    {
        try
        {
            a.unregisterReceiver(e);
        }
        catch (Exception exception)
        {
            MoPubLog.d("Failed to unregister screen state broadcast receiver (never registered).");
        }
        removeAllViews();
        if (b != null)
        {
            b.e();
            b = null;
        }
        if (c != null)
        {
            c.b();
            c = null;
        }
    }

    protected final void e()
    {
        if (f != null)
        {
            f.onBannerExpanded(this);
        } else
        if (j != null)
        {
            j.OnAdPresentedOverlay(this);
            return;
        }
    }

    protected final void f()
    {
        if (f != null)
        {
            f.onBannerCollapsed(this);
        } else
        if (k != null)
        {
            k.OnAdClosed(this);
            return;
        }
    }

    public void forceRefresh()
    {
        if (c != null)
        {
            c.b();
            c = null;
        }
        if (b != null)
        {
            b.i();
        }
    }

    protected final void g()
    {
        if (b != null)
        {
            b.j();
        }
        MoPubLog.d("adLoaded");
        if (f != null)
        {
            f.onBannerLoaded(this);
        } else
        if (h != null)
        {
            h.OnAdLoaded(this);
            return;
        }
    }

    public Activity getActivity()
    {
        return (Activity)a;
    }

    public AdFormat getAdFormat()
    {
        return AdFormat.BANNER;
    }

    public int getAdHeight()
    {
        if (b != null)
        {
            return b.getAdHeight();
        } else
        {
            return 0;
        }
    }

    public String getAdUnitId()
    {
        if (b != null)
        {
            return b.getAdUnitId();
        } else
        {
            return null;
        }
    }

    public int getAdWidth()
    {
        if (b != null)
        {
            return b.getAdWidth();
        } else
        {
            return 0;
        }
    }

    public boolean getAutorefreshEnabled()
    {
        if (b != null)
        {
            return b.getAutorefreshEnabled();
        } else
        {
            MoPubLog.d("Can't get autorefresh status for destroyed MoPubView. Returning false.");
            return false;
        }
    }

    public BannerAdListener getBannerAdListener()
    {
        return f;
    }

    public String getClickTrackingUrl()
    {
        if (b != null)
        {
            return b.getClickTrackingUrl();
        } else
        {
            return null;
        }
    }

    public String getClickthroughUrl()
    {
        return getClickTrackingUrl();
    }

    public String getKeywords()
    {
        if (b != null)
        {
            return b.getKeywords();
        } else
        {
            return null;
        }
    }

    public Map getLocalExtras()
    {
        if (b != null)
        {
            return b.k();
        } else
        {
            return new TreeMap();
        }
    }

    public Location getLocation()
    {
        if (b != null)
        {
            return b.getLocation();
        } else
        {
            return null;
        }
    }

    public com.mopub.common.LocationService.LocationAwareness getLocationAwareness()
    {
        return com.mopub.common.LocationService.LocationAwareness.fromMoPubLocationAwareness(MoPub.getLocationAwareness());
    }

    public int getLocationPrecision()
    {
        return MoPub.getLocationPrecision();
    }

    public String getResponseString()
    {
        if (b != null)
        {
            return b.getResponseString();
        } else
        {
            return null;
        }
    }

    public boolean getTesting()
    {
        if (b != null)
        {
            return b.getTesting();
        } else
        {
            MoPubLog.d("Can't get testing status for destroyed MoPubView. Returning false.");
            return false;
        }
    }

    public boolean isFacebookSupported()
    {
        return false;
    }

    public void loadAd()
    {
        if (b != null)
        {
            b.loadAd();
        }
    }

    protected void onWindowVisibilityChanged(int i1)
    {
        if (Visibility.hasScreenVisibilityChanged(d, i1))
        {
            d = i1;
            a(d);
        }
    }

    public void setAdContentView(View view)
    {
        if (b != null)
        {
            b.a(view);
        }
    }

    public void setAdUnitId(String s)
    {
        if (b != null)
        {
            b.setAdUnitId(s);
        }
    }

    public void setAutorefreshEnabled(boolean flag)
    {
        if (b != null)
        {
            b.a(flag);
        }
    }

    public void setBannerAdListener(BannerAdListener banneradlistener)
    {
        f = banneradlistener;
    }

    public void setClickthroughUrl(String s)
    {
    }

    public void setFacebookSupported(boolean flag)
    {
    }

    public void setKeywords(String s)
    {
        if (b != null)
        {
            b.setKeywords(s);
        }
    }

    public void setLocalExtras(Map map)
    {
        if (b != null)
        {
            b.a(map);
        }
    }

    public void setLocation(Location location)
    {
        if (b != null)
        {
            b.setLocation(location);
        }
    }

    public void setLocationAwareness(com.mopub.common.LocationService.LocationAwareness locationawareness)
    {
        MoPub.setLocationAwareness(locationawareness.getNewLocationAwareness());
    }

    public void setLocationPrecision(int i1)
    {
        MoPub.setLocationPrecision(i1);
    }

    public void setOnAdClickedListener(OnAdClickedListener onadclickedlistener)
    {
        l = onadclickedlistener;
    }

    public void setOnAdClosedListener(OnAdClosedListener onadclosedlistener)
    {
        k = onadclosedlistener;
    }

    public void setOnAdFailedListener(OnAdFailedListener onadfailedlistener)
    {
        i = onadfailedlistener;
    }

    public void setOnAdLoadedListener(OnAdLoadedListener onadloadedlistener)
    {
        h = onadloadedlistener;
    }

    public void setOnAdPresentedOverlayListener(OnAdPresentedOverlayListener onadpresentedoverlaylistener)
    {
        j = onadpresentedoverlaylistener;
    }

    public void setOnAdWillLoadListener(OnAdWillLoadListener onadwillloadlistener)
    {
        g = onadwillloadlistener;
    }

    public void setTesting(boolean flag)
    {
        if (b != null)
        {
            b.setTesting(flag);
        }
    }

    public void setTimeout(int i1)
    {
        if (b != null)
        {
            b.setTimeout(i1);
        }
    }

    private class BannerAdListener
    {

        public abstract void onBannerClicked(MoPubView mopubview);

        public abstract void onBannerCollapsed(MoPubView mopubview);

        public abstract void onBannerExpanded(MoPubView mopubview);

        public abstract void onBannerFailed(MoPubView mopubview, MoPubErrorCode mopuberrorcode);

        public abstract void onBannerLoaded(MoPubView mopubview);
    }


    private class OnAdFailedListener
    {

        public abstract void OnAdFailed(MoPubView mopubview);
    }


    private class OnAdClickedListener
    {

        public abstract void OnAdClicked(MoPubView mopubview);
    }


    private class OnAdPresentedOverlayListener
    {

        public abstract void OnAdPresentedOverlay(MoPubView mopubview);
    }


    private class OnAdClosedListener
    {

        public abstract void OnAdClosed(MoPubView mopubview);
    }


    private class OnAdLoadedListener
    {

        public abstract void OnAdLoaded(MoPubView mopubview);
    }

}
