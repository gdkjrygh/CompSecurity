// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.ads:
//            AdLoader, k, j

class c extends AdListener
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

    public ublisherAdView(AdLoader adloader, PublisherAdView publisheradview)
    {
        a = adloader;
        super();
        c = publisheradview;
    }
}
