// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mobileapptracker.MATParameters;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tune.crosspromo:
//            TuneAd, TuneAdActivity, TuneAdView, TuneAdParams, 
//            TuneAdOrientation, TuneAdClient, TuneAdUtils, TuneBadRequestException, 
//            TuneServerErrorException, TuneAdViewSet, TuneAdListener, TuneAdMetadata

public class TuneInterstitial
    implements TuneAd
{

    private TuneAdUtils a;
    private Context b;
    private TuneAdParams c;
    private Handler d;
    private TuneAdListener e;
    private TuneAdOrientation f;
    private int g;
    private boolean h;
    private boolean i;

    private WebView a(Context context, String s)
    {
        context = new WebView(context);
        Object obj = new android.widget.FrameLayout.LayoutParams(-1, -1);
        obj.gravity = 17;
        context.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        context.setBackgroundColor(0);
        context.setScrollBarStyle(0);
        obj = context.getSettings();
        ((WebSettings) (obj)).setJavaScriptEnabled(true);
        ((WebSettings) (obj)).setLoadWithOverviewMode(true);
        ((WebSettings) (obj)).setUseWideViewPort(true);
        context.setWebViewClient(new WebViewClient(s) {

            final String a;
            final TuneInterstitial b;

            public void onPageFinished(WebView webview, String s1)
            {
                if (!s1.equals("about:blank"))
                {
                    TuneInterstitial.a(b, a);
                }
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s1)
            {
                ((ViewGroup)webview.getParent()).removeView(webview);
                TuneInterstitial.a(b, s1, a);
                ((Activity)TuneInterstitial.a(b).b()).finish();
                return true;
            }

            
            {
                b = TuneInterstitial.this;
                a = s;
                super();
            }
        });
        return context;
    }

    static TuneAdUtils a(TuneInterstitial tuneinterstitial)
    {
        return tuneinterstitial.a;
    }

    private void a()
    {
        d.post(new Runnable() {

            final TuneInterstitial a;

            public void run()
            {
                if (TuneInterstitial.b(a) != null)
                {
                    TuneInterstitial.b(a).b(a);
                }
            }

            
            {
                a = TuneInterstitial.this;
                super();
            }
        });
    }

    private void a(TuneAdView tuneadview)
    {
        Activity activity = (Activity)b;
        Intent intent = new Intent(b, com/tune/crosspromo/TuneAdActivity);
        intent.putExtra("INTERSTITIAL", true);
        intent.putExtra("REQUESTID", tuneadview.c);
        intent.putExtra("ADPARAMS", c.a().toString());
        intent.putExtra("NATIVECLOSEBUTTON", h);
        intent.putExtra("PLACEMENT", tuneadview.a);
        intent.putExtra("ORIENTATION", f.a());
        activity.startActivity(intent);
        activity.overridePendingTransition(0x10a0000, 0x10a0001);
        TuneAdClient.a(tuneadview, c.a());
        a.c(tuneadview.a);
        a();
        a(tuneadview.a, tuneadview.b);
    }

    static void a(TuneInterstitial tuneinterstitial, String s)
    {
        tuneinterstitial.a(s);
    }

    static void a(TuneInterstitial tuneinterstitial, String s, TuneAdMetadata tuneadmetadata)
    {
        tuneinterstitial.b(s, tuneadmetadata);
    }

    static void a(TuneInterstitial tuneinterstitial, String s, String s1)
    {
        tuneinterstitial.c(s, s1);
    }

    private void a(String s)
    {
        s = b(s);
        s.e = true;
        s.f = false;
        if (i)
        {
            i = false;
            a(((TuneAdView) (s)));
        }
        d.post(new Runnable() {

            final TuneInterstitial a;

            public void run()
            {
                if (TuneInterstitial.b(a) != null)
                {
                    TuneInterstitial.b(a).a(a);
                }
            }

            
            {
                a = TuneInterstitial.this;
                super();
            }
        });
    }

    private void a(String s, int j)
    {
        if (c.a)
        {
            Log.d("TUNE", (new StringBuilder()).append("Requesting interstitial with: ").append(c.a().toString()).toString());
        }
        Object obj = TuneAdClient.a(c);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_347;
        }
        boolean flag = ((String) (obj)).equals("");
        if (flag)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        obj = new JSONObject(((String) (obj)));
        if (((JSONObject) (obj)).has("error") && ((JSONObject) (obj)).has("message"))
        {
            Log.d("TUNE", (new StringBuilder()).append(((JSONObject) (obj)).optString("error")).append(": ").append(((JSONObject) (obj)).optString("message")).toString());
            if (c.a)
            {
                Log.d("TUNE", (new StringBuilder()).append("Debug request url: ").append(((JSONObject) (obj)).optString("requestUrl")).toString());
            }
            b(s, ((JSONObject) (obj)).optString("message"));
            return;
        }
        String s1 = ((JSONObject) (obj)).optString("html");
        if (!s1.equals(""))
        {
            b(s).c = ((JSONObject) (obj)).optString("requestId");
            c.a(((JSONObject) (obj)).optJSONObject("refs"));
            if (((JSONObject) (obj)).has("close"))
            {
                h = ((JSONObject) (obj)).optString("close").equals("native");
            }
            a(s, s1);
            return;
        }
        break MISSING_BLOCK_LABEL_299;
        JSONException jsonexception;
        jsonexception;
        try
        {
            jsonexception.printStackTrace();
            return;
        }
        catch (Object obj1)
        {
            if (j == 4)
            {
                b(s, "Bad request");
                return;
            } else
            {
                a(s, j + 1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            if (j == 4)
            {
                b(s, "Server error");
                return;
            } else
            {
                a(s, j + 1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        break MISSING_BLOCK_LABEL_333;
        b(s, "Unknown error");
        return;
        b(s, "Unknown error");
        return;
        if (j == 4)
        {
            b(s, "Request timed out");
            return;
        } else
        {
            a(s, j + 1);
            return;
        }
        b(s, "Network error");
        return;
    }

    private void a(String s, String s1)
    {
        d.post(new Runnable(s, s1) {

            final String a;
            final String b;
            final TuneInterstitial c;

            public void run()
            {
                TuneInterstitial.b(c, a).a(b);
            }

            
            {
                c = TuneInterstitial.this;
                a = s;
                b = s1;
                super();
            }
        });
    }

    static TuneAdListener b(TuneInterstitial tuneinterstitial)
    {
        return tuneinterstitial.e;
    }

    static TuneAdView b(TuneInterstitial tuneinterstitial, String s)
    {
        return tuneinterstitial.b(s);
    }

    private TuneAdView b(String s)
    {
        return a.d(s);
    }

    private void b()
    {
        d.post(new Runnable() {

            final TuneInterstitial a;

            public void run()
            {
                if (TuneInterstitial.b(a) != null)
                {
                    TuneInterstitial.b(a).c(a);
                }
            }

            
            {
                a = TuneInterstitial.this;
                super();
            }
        });
    }

    private void b(String s, TuneAdMetadata tuneadmetadata)
    {
        long l = System.currentTimeMillis();
        do
        {
            if (a.f().C() != null && a.f().g() != null || System.currentTimeMillis() - l > 500L)
            {
                c = new TuneAdParams(s, a.f(), tuneadmetadata, f, g);
                a(s, 0);
                return;
            }
            try
            {
                Thread.sleep(50L);
            }
            catch (InterruptedException interruptedexception)
            {
                interruptedexception.printStackTrace();
            }
        } while (true);
    }

    private void b(String s, String s1)
    {
        b(s).f = false;
        d.post(new Runnable(s1) {

            final String a;
            final TuneInterstitial b;

            public void run()
            {
                if (TuneInterstitial.b(b) != null)
                {
                    TuneInterstitial.b(b).a(b, a);
                }
            }

            
            {
                b = TuneInterstitial.this;
                a = s;
                super();
            }
        });
    }

    private void c(String s, TuneAdMetadata tuneadmetadata)
    {
        s = new TuneAdViewSet(s, new TuneAdView(s, tuneadmetadata, a(b, s)), new TuneAdView(s, tuneadmetadata, a(b, s)));
        a.a(s);
    }

    private void c(String s, String s1)
    {
        s1 = a.e(s1);
        if (s.contains("#close"))
        {
            TuneAdClient.c(s1, c.a());
            return;
        } else
        {
            Intent intent = new Intent(b, com/tune/crosspromo/TuneAdActivity);
            intent.putExtra("INTERSTITIAL", false);
            intent.putExtra("REDIRECT_URI", s);
            ((Activity)b).startActivity(intent);
            b();
            TuneAdClient.b(s1, c.a());
            return;
        }
    }

    public void a(String s, TuneAdMetadata tuneadmetadata)
    {
        if (s == null || s.isEmpty() || s.equals("null"))
        {
            throw new IllegalArgumentException("Placement must not be null or empty");
        }
        if (!a.b(s))
        {
            c(s, tuneadmetadata);
        }
        TuneAdView tuneadview = b(s);
        tuneadview.b = tuneadmetadata;
        tuneadview.e = false;
        tuneadview.f = true;
        a.d().execute(new Runnable(s, tuneadmetadata) {

            final String a;
            final TuneAdMetadata b;
            final TuneInterstitial c;

            public void run()
            {
                TuneInterstitial.a(c, a, b);
            }

            
            {
                c = TuneInterstitial.this;
                a = s;
                b = tuneadmetadata;
                super();
            }
        });
    }
}
