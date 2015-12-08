// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebView;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdActivity;
import com.facebook.ads.internal.util.f;
import com.facebook.ads.internal.util.h;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            InterstitialAdapter, l, InterstitialAdapterListener, d

public class j extends InterstitialAdapter
{

    private final String a = UUID.randomUUID().toString();
    private Context b;
    private boolean c;
    private int d;
    private int e;
    private boolean f;
    private d g;
    private InterstitialAdapterListener h;
    private boolean i;
    private l j;
    private WebView k;

    public j()
    {
        i = false;
    }

    static InterstitialAdapterListener a(j j1)
    {
        return j1.h;
    }

    private void a(l l1)
    {
        if (l1 == null)
        {
            return;
        } else
        {
            k = new WebView(b);
            k.setWebChromeClient(new _cls1());
            k.loadDataWithBaseURL(com.facebook.ads.internal.util.h.a(), l1.d(), "text/html", "utf-8", null);
            return;
        }
    }

    public void loadInterstitialAd(Context context, InterstitialAdapterListener interstitialadapterlistener, Map map)
    {
        b = context;
        h = interstitialadapterlistener;
        j = l.a((JSONObject)map.get("data"));
        if (com.facebook.ads.internal.util.f.a(context, j))
        {
            interstitialadapterlistener.onInterstitialError(this, AdError.NO_FILL);
        } else
        {
            g = new d(context, a, this, h);
            g.a();
            i = true;
            context = j.h();
            if (context.containsKey("is_tablet"))
            {
                c = Boolean.parseBoolean((String)context.get("is_tablet"));
            }
            if (context.containsKey("ad_height"))
            {
                d = Integer.parseInt((String)context.get("ad_height"));
            }
            if (context.containsKey("ad_width"))
            {
                e = Integer.parseInt((String)context.get("ad_width"));
            }
            if (context.containsKey("native_close"))
            {
                f = Boolean.valueOf((String)context.get("native_close")).booleanValue();
            }
            if (context.containsKey("preloadMarkup") && Boolean.parseBoolean((String)context.get("preloadMarkup")))
            {
                a(j);
                return;
            }
            if (h != null)
            {
                h.onInterstitialAdLoaded(this);
                return;
            }
        }
    }

    public void onDestroy()
    {
        if (g != null)
        {
            g.b();
        }
        if (k != null)
        {
            com.facebook.ads.internal.util.h.a(k);
            k.destroy();
            k = null;
        }
    }

    public boolean show()
    {
        if (!i)
        {
            if (h != null)
            {
                h.onInterstitialError(this, AdError.INTERNAL_ERROR);
            }
            return false;
        } else
        {
            Intent intent = new Intent(b, com/facebook/ads/InterstitialAdActivity);
            j.a(intent);
            Display display = ((WindowManager)b.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displaymetrics = new DisplayMetrics();
            display.getMetrics(displaymetrics);
            intent.putExtra("displayRotation", display.getRotation());
            intent.putExtra("displayWidth", displaymetrics.widthPixels);
            intent.putExtra("displayHeight", displaymetrics.heightPixels);
            intent.putExtra("isTablet", c);
            intent.putExtra("adHeight", d);
            intent.putExtra("adWidth", e);
            intent.putExtra("adInterstitialUniqueId", a);
            intent.putExtra("useNativeCloseButton", f);
            intent.addFlags(0x10000000);
            b.startActivity(intent);
            return true;
        }
    }

    private class _cls1 extends WebChromeClient
    {

        final j a;

        public void onProgressChanged(WebView webview, int i1)
        {
            if (i1 == 100 && j.a(a) != null)
            {
                j.a(a).onInterstitialAdLoaded(a);
            }
        }

        _cls1()
        {
            a = j.this;
            super();
        }
    }

}
