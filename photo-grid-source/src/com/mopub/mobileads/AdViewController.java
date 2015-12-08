// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.mopub.common.AdReport;
import com.mopub.common.AdUrlGenerator;
import com.mopub.common.ClientMetadata;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.DeviceUtils;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Utils;
import com.mopub.mraid.MraidNativeCommandHandler;
import com.mopub.network.AdRequest;
import com.mopub.network.AdResponse;
import com.mopub.network.MoPubNetworkError;
import com.mopub.network.Networking;
import com.mopub.network.TrackingRequest;
import com.mopub.volley.NetworkResponse;
import com.mopub.volley.RequestQueue;
import com.mopub.volley.VolleyError;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

// Referenced classes of package com.mopub.mobileads:
//            WebViewAdUrlGenerator, g, h, MoPubView, 
//            i, MoPubErrorCode, d, c, 
//            j

public class AdViewController
{

    private static final android.widget.FrameLayout.LayoutParams b = new android.widget.FrameLayout.LayoutParams(-2, -2, 17);
    private static final WeakHashMap c = new WeakHashMap();
    int a;
    private final long d = Utils.generateUniqueId();
    private Context e;
    private MoPubView f;
    private WebViewAdUrlGenerator g;
    private AdResponse h;
    private final Runnable i = new h(this);
    private final com.mopub.network.AdRequest.Listener j = new g(this);
    private boolean k;
    private Handler l;
    private boolean m;
    private String n;
    private Map o;
    private boolean p;
    private boolean q;
    private String r;
    private Location s;
    private boolean t;
    private boolean u;
    private String v;
    private int w;
    private AdRequest x;
    private Integer y;

    public AdViewController(Context context, MoPubView mopubview)
    {
        a = 1;
        o = new HashMap();
        p = true;
        q = true;
        e = context;
        f = mopubview;
        w = -1;
        g = new WebViewAdUrlGenerator(e.getApplicationContext(), MraidNativeCommandHandler.isStorePictureSupported(e));
        y = Integer.valueOf(60000);
        l = new Handler();
    }

    static android.widget.FrameLayout.LayoutParams a(AdViewController adviewcontroller, View view)
    {
        Integer integer;
        Integer integer1;
        if (adviewcontroller.h != null)
        {
            integer = adviewcontroller.h.getWidth();
            integer1 = adviewcontroller.h.getHeight();
        } else
        {
            integer1 = null;
            integer = null;
        }
        if (integer != null && integer1 != null)
        {
            boolean flag;
            if (c.get(view) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && integer.intValue() > 0 && integer1.intValue() > 0)
            {
                return new android.widget.FrameLayout.LayoutParams(Dips.asIntPixels(integer.intValue(), adviewcontroller.e), Dips.asIntPixels(integer1.intValue(), adviewcontroller.e), 17);
            }
        }
        return b;
    }

    static void a(AdViewController adviewcontroller)
    {
        adviewcontroller.l();
    }

    private void a(String s1)
    {
        if (s1 != null)
        {
            MoPubLog.d((new StringBuilder("Loading url: ")).append(s1).toString());
            if (m)
            {
                if (!TextUtils.isEmpty(v))
                {
                    MoPubLog.i((new StringBuilder("Already loading an ad for ")).append(v).append(", wait to finish.").toString());
                    return;
                }
            } else
            {
                n = s1;
                m = true;
                s1 = n;
                MoPubView mopubview = getMoPubView();
                if (mopubview == null || e == null)
                {
                    MoPubLog.d("Can't load an ad in this ad view because it was destroyed.");
                    a();
                    return;
                } else
                {
                    s1 = new AdRequest(s1, mopubview.getAdFormat(), v, e, j);
                    Networking.getRequestQueue(e).add(s1);
                    x = s1;
                    return;
                }
            }
        }
    }

    private void b(MoPubErrorCode mopuberrorcode)
    {
        MoPubLog.i("Ad failed to load.");
        a();
        MoPubView mopubview = getMoPubView();
        if (mopubview == null)
        {
            return;
        } else
        {
            j();
            mopubview.a(mopuberrorcode);
            return;
        }
    }

    private void b(boolean flag)
    {
        boolean flag1;
        if (u && p != flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            String s1;
            if (flag)
            {
                s1 = "enabled";
            } else
            {
                s1 = "disabled";
            }
            MoPubLog.d((new StringBuilder("Refresh ")).append(s1).append(" for ad unit (").append(v).append(").").toString());
        }
        p = flag;
        if (u && p)
        {
            j();
        } else
        if (!p)
        {
            m();
            return;
        }
    }

    private void l()
    {
        u = true;
        if (TextUtils.isEmpty(v))
        {
            MoPubLog.d("Can't load an ad in this ad view because the ad unit ID is not set. Did you forget to call setAdUnitId()?");
            return;
        }
        if (e == null) goto _L2; else goto _L1
_L1:
        if (e.checkCallingPermission("android.permission.ACCESS_NETWORK_STATE") != -1) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        if (!flag)
        {
            MoPubLog.d("Can't load an ad because there is no network connectivity.");
            j();
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        NetworkInfo networkinfo = ((ConnectivityManager)e.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo != null && networkinfo.isConnected())
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        String s1;
        if (g == null)
        {
            s1 = null;
        } else
        {
            s1 = g.withAdUnitId(v).withKeywords(r).withLocation(s).generateUrlString("ads.mopub.com");
        }
        a(s1);
        return;
    }

    private void m()
    {
        l.removeCallbacks(i);
    }

    public static void setShouldHonorServerDimensions(View view)
    {
        c.put(view, Boolean.valueOf(true));
    }

    final void a()
    {
        m = false;
        if (x != null)
        {
            if (!x.isCanceled())
            {
                x.cancel();
            }
            x = null;
        }
    }

    final void a(View view)
    {
        l.post(new i(this, view));
    }

    final void a(MoPubErrorCode mopuberrorcode)
    {
        m = false;
        StringBuilder stringbuilder = new StringBuilder("MoPubErrorCode: ");
        if (mopuberrorcode == null)
        {
            mopuberrorcode = "";
        } else
        {
            mopuberrorcode = mopuberrorcode.toString();
        }
        stringbuilder.append(mopuberrorcode);
        if (h == null)
        {
            mopuberrorcode = "";
        } else
        {
            mopuberrorcode = h.getFailoverUrl();
        }
        if (!TextUtils.isEmpty(mopuberrorcode))
        {
            MoPubLog.d((new StringBuilder("Loading failover url: ")).append(mopuberrorcode).toString());
            a(((String) (mopuberrorcode)));
            return;
        } else
        {
            b(MoPubErrorCode.NO_FILL);
            return;
        }
    }

    final void a(AdResponse adresponse)
    {
        a = 1;
        h = adresponse;
        String s1;
        int i1;
        if (h.getAdTimeoutMillis() == null)
        {
            i1 = w;
        } else
        {
            i1 = h.getAdTimeoutMillis().intValue();
        }
        w = i1;
        y = h.getRefreshTimeMillis();
        a();
        adresponse = h;
        MoPubLog.i("Performing custom event.");
        s1 = adresponse.getCustomEventClassName();
        if (s1 != null)
        {
            adresponse = new d(this, s1, adresponse.getServerExtras());
        } else
        {
            MoPubLog.i("Failed to create custom event.");
            adresponse = null;
        }
        if (adresponse != null)
        {
            adresponse.a();
        }
        j();
    }

    final void a(VolleyError volleyerror)
    {
        Context context;
        NetworkResponse networkresponse;
        if (volleyerror instanceof MoPubNetworkError)
        {
            MoPubNetworkError mopubnetworkerror = (MoPubNetworkError)volleyerror;
            if (mopubnetworkerror.getRefreshTimeMillis() != null)
            {
                y = mopubnetworkerror.getRefreshTimeMillis();
            }
        }
        context = e;
        networkresponse = volleyerror.networkResponse;
        if (!(volleyerror instanceof MoPubNetworkError)) goto _L2; else goto _L1
_L1:
        j.a[((MoPubNetworkError)volleyerror).getReason().ordinal()];
        JVM INSTR tableswitch 1 2: default 80
    //                   1 111
    //                   2 118;
           goto _L3 _L4 _L5
_L3:
        volleyerror = MoPubErrorCode.UNSPECIFIED;
_L7:
        if (volleyerror == MoPubErrorCode.SERVER_ERROR)
        {
            a = a + 1;
        }
        a();
        b(volleyerror);
        return;
_L4:
        volleyerror = MoPubErrorCode.WARMUP;
        continue; /* Loop/switch isn't completed */
_L5:
        volleyerror = MoPubErrorCode.NO_FILL;
        continue; /* Loop/switch isn't completed */
_L2:
        if (networkresponse == null)
        {
            if (!DeviceUtils.isNetworkAvailable(context))
            {
                volleyerror = MoPubErrorCode.NO_CONNECTION;
            } else
            {
                volleyerror = MoPubErrorCode.UNSPECIFIED;
            }
        } else
        if (volleyerror.networkResponse.statusCode >= 400)
        {
            volleyerror = MoPubErrorCode.SERVER_ERROR;
        } else
        {
            volleyerror = MoPubErrorCode.UNSPECIFIED;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    final void a(Map map)
    {
        if (map != null)
        {
            map = new TreeMap(map);
        } else
        {
            map = new TreeMap();
        }
        o = map;
    }

    final void a(boolean flag)
    {
        q = flag;
        b(flag);
    }

    final void b()
    {
        q = p;
        b(false);
    }

    final void c()
    {
        b(q);
    }

    public void customEventActionWillBegin()
    {
        h();
    }

    public void customEventDidFailToLoadAd()
    {
        a(MoPubErrorCode.UNSPECIFIED);
    }

    public void customEventDidLoadAd()
    {
        a();
        g();
        j();
    }

    final boolean d()
    {
        return k;
    }

    final void e()
    {
        if (k)
        {
            return;
        }
        if (x != null)
        {
            x.cancel();
            x = null;
        }
        b(false);
        m();
        f = null;
        e = null;
        g = null;
        k = true;
    }

    final Integer f()
    {
        if (h == null)
        {
            return null;
        } else
        {
            return h.getAdTimeoutMillis();
        }
    }

    final void g()
    {
        if (h != null)
        {
            TrackingRequest.makeTrackingHttpRequest(h.getImpressionTrackingUrl(), e, com.mopub.common.event.BaseEvent.Name.IMPRESSION_REQUEST);
        }
    }

    public int getAdHeight()
    {
        if (h != null && h.getHeight() != null)
        {
            return h.getHeight().intValue();
        } else
        {
            return 0;
        }
    }

    public AdReport getAdReport()
    {
        if (v != null && h != null)
        {
            return new AdReport(v, ClientMetadata.getInstance(e), h);
        } else
        {
            return null;
        }
    }

    public String getAdUnitId()
    {
        return v;
    }

    public int getAdWidth()
    {
        if (h != null && h.getWidth() != null)
        {
            return h.getWidth().intValue();
        } else
        {
            return 0;
        }
    }

    public boolean getAutorefreshEnabled()
    {
        return p;
    }

    public long getBroadcastIdentifier()
    {
        return d;
    }

    public String getClickTrackingUrl()
    {
        if (h == null)
        {
            return null;
        } else
        {
            return h.getClickTrackingUrl();
        }
    }

    public String getKeywords()
    {
        return r;
    }

    public Location getLocation()
    {
        return s;
    }

    public MoPubView getMoPubView()
    {
        return f;
    }

    public String getRedirectUrl()
    {
        if (h == null)
        {
            return null;
        } else
        {
            return h.getRedirectUrl();
        }
    }

    public String getResponseString()
    {
        if (h == null)
        {
            return null;
        } else
        {
            return h.getStringBody();
        }
    }

    public boolean getTesting()
    {
        return t;
    }

    final void h()
    {
        if (h != null)
        {
            TrackingRequest.makeTrackingHttpRequest(h.getClickTrackingUrl(), e, com.mopub.common.event.BaseEvent.Name.CLICK_REQUEST);
        }
    }

    final void i()
    {
        a();
        loadAd();
    }

    public boolean isFacebookSupported()
    {
        return false;
    }

    final void j()
    {
        m();
        if (p && y != null && y.intValue() > 0)
        {
            l.postDelayed(i, Math.min(0x927c0L, (long)y.intValue() * (long)Math.pow(1.5D, a)));
        }
    }

    final Map k()
    {
        if (o != null)
        {
            return new TreeMap(o);
        } else
        {
            return new TreeMap();
        }
    }

    public void loadAd()
    {
        a = 1;
        l();
    }

    public void reload()
    {
        MoPubLog.d((new StringBuilder("Reload ad: ")).append(n).toString());
        a(n);
    }

    public void setAdUnitId(String s1)
    {
        v = s1;
    }

    public void setClickthroughUrl(String s1)
    {
    }

    public void setFacebookSupported(boolean flag)
    {
    }

    public void setKeywords(String s1)
    {
        r = s1;
    }

    public void setLocation(Location location)
    {
        s = location;
    }

    public void setTesting(boolean flag)
    {
        t = flag;
    }

    public void setTimeout(int i1)
    {
        w = i1;
    }

}
