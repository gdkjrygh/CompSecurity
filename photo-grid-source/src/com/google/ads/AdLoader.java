// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

// Referenced classes of package com.google.ads:
//            b, h

public class AdLoader
{

    static final long a;
    private final AdListener b;
    private final com.google.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener c;
    private final com.google.ads.formats.NativeContentAd.OnContentAdLoadedListener d;
    private final Context e;
    private final String f;
    private final h g;
    private final b h;

    AdLoader(Context context, h h1, b b1, String s, AdListener adlistener, com.google.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener onappinstalladloadedlistener, com.google.ads.formats.NativeContentAd.OnContentAdLoadedListener oncontentadloadedlistener)
    {
        e = context;
        g = h1;
        h = b1;
        f = s;
        b = adlistener;
        c = onappinstalladloadedlistener;
        d = oncontentadloadedlistener;
        a();
    }

    static com.google.ads.formats.NativeContentAd.OnContentAdLoadedListener a(AdLoader adloader)
    {
        return adloader.d;
    }

    private void a()
    {
        try
        {
            (new com.google.android.gms.ads.AdRequest.Builder()).build().getNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter);
            return;
        }
        catch (Throwable throwable)
        {
            throw new IllegalStateException("The Google native ads addon requires Google Play Services 4.4.52 or later.");
        }
    }

    private void a(Bundle bundle, com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder builder)
    {
        if (!a(bundle))
        {
            if (b != null)
            {
                b.onAdFailedToLoad(1);
            }
            return;
        } else
        {
            PublisherAdView publisheradview = new PublisherAdView(e);
            publisheradview.setAdSizes(new AdSize[] {
                AdSize.BANNER
            });
            publisheradview.setAdUnitId(f);
            RequestListener requestlistener = new RequestListener(publisheradview);
            publisheradview.setAppEventListener(requestlistener);
            publisheradview.setAdListener(requestlistener);
            builder.addNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter, bundle);
            publisheradview.loadAd(builder.build());
            return;
        }
    }

    static Context b(AdLoader adloader)
    {
        return adloader.e;
    }

    private Bundle b(Bundle bundle)
    {
        if (bundle == null)
        {
            return new Bundle();
        } else
        {
            return new Bundle(bundle);
        }
    }

    static h c(AdLoader adloader)
    {
        return adloader.g;
    }

    static AdListener d(AdLoader adloader)
    {
        return adloader.b;
    }

    static com.google.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener e(AdLoader adloader)
    {
        return adloader.c;
    }

    protected void a(AsyncTask asynctask, JSONObject jsonobject)
    {
        asynctask.execute(new JSONObject[] {
            jsonobject
        });
    }

    protected boolean a(Bundle bundle)
    {
        ArrayList arraylist = new ArrayList(2);
        if (d != null)
        {
            arraylist.add("1");
        }
        if (c != null)
        {
            arraylist.add("2");
        }
        if (arraylist.size() == 0)
        {
            Log.e("Ads", "No ad format requested.");
            return false;
        } else
        {
            bundle.putString("native_templates", TextUtils.join(",", arraylist));
            bundle.putString("native_version", "1");
            bundle.putString("native_addon", "1.0.2");
            return true;
        }
    }

    public void loadAd(AdRequest adrequest)
    {
        a(b(adrequest.getNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter)), h.a(adrequest));
    }

    public void loadAd(PublisherAdRequest publisheradrequest)
    {
        a(b(publisheradrequest.getNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter)), h.a(publisheradrequest));
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(5L);
    }

    private class RequestListener extends AdListener
        implements AppEventListener, Runnable
    {

        final AdLoader a;
        private final Object b = new Object();
        private PublisherAdView c;

        private boolean a()
        {
label0:
            {
                synchronized (b)
                {
                    if (c != null)
                    {
                        break label0;
                    }
                }
                return false;
            }
            c.destroy();
            c = null;
            obj;
            JVM INSTR monitorexit ;
            return true;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void onAdFailedToLoad(int i)
        {
            Log.e("Ads", (new StringBuilder(29)).append("Error loading ad: ").append(i).toString());
            a();
            if (AdLoader.d(a) != null)
            {
                AdLoader.d(a).onAdFailedToLoad(i);
            }
        }

        public void onAdLoaded()
        {
            (new Handler(Looper.getMainLooper())).postDelayed(this, AdLoader.a);
        }

        public void onAppEvent(String s, String s1)
        {
            if (!a())
            {
                return;
            }
            if ("native_ad_failure".equals(s))
            {
                Log.e("Ads", "Received malformed native ad response.");
                onAdFailedToLoad(0);
                return;
            }
            if (!"native_ad_content".equals(s))
            {
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = "Received an unexpected app event: ".concat(s);
                } else
                {
                    s = new String("Received an unexpected app event: ");
                }
                Log.e("Ads", s);
                onAdFailedToLoad(0);
                return;
            }
            if (s1.indexOf("\u2713") != -1)
            {
                break MISSING_BLOCK_LABEL_162;
            }
            s = new JSONObject(new String(s1.getBytes("iso8859_1"), "utf-8"));
_L1:
            s = s.getJSONArray("ads");
            if (s.length() <= 0)
            {
                Log.w("Ads", "No ads in ad response.");
                onAdFailedToLoad(0);
                return;
            }
            break MISSING_BLOCK_LABEL_190;
            try
            {
                s = new JSONObject(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("Ads", "Unsupported encoding..", s);
                onAdFailedToLoad(0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("Ads", "Malformed native ad response.", s);
                onAdFailedToLoad(0);
                return;
            }
              goto _L1
            s1 = s.getJSONObject(0);
            s = s1.getString("template_id");
            if (!"1".equals(s) || AdLoader.a(a) == null)
            {
                break MISSING_BLOCK_LABEL_268;
            }
            s = new k(AdLoader.b(a), AdLoader.c(a), AdLoader.d(a), AdLoader.a(a));
_L3:
            a.a(s, s1);
            return;
label0:
            {
                if (!"2".equals(s) || AdLoader.e(a) == null)
                {
                    break label0;
                }
                s = new j(AdLoader.b(a), AdLoader.c(a), AdLoader.d(a), AdLoader.e(a));
            }
            if (true) goto _L3; else goto _L2
_L2:
            s = String.valueOf(s);
            if (s.length() == 0)
            {
                break MISSING_BLOCK_LABEL_358;
            }
            s = "Unknown ad type: ".concat(s);
_L5:
            Log.e("Ads", s);
            onAdFailedToLoad(0);
            return;
            s = new String("Unknown ad type: ");
            if (true) goto _L5; else goto _L4
_L4:
        }

        public void run()
        {
            if (!a())
            {
                return;
            } else
            {
                Log.e("Ads", "Ad loaded, but no app event was fired.");
                onAdFailedToLoad(0);
                return;
            }
        }

        public RequestListener(PublisherAdView publisheradview)
        {
            a = AdLoader.this;
            super();
            c = publisheradview;
        }
    }

}
