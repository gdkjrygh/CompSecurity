// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;

import android.app.ActionBar;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tune.crosspromo:
//            TuneAdClient, TuneAdUtils, TuneAdOrientation, TuneAdView, 
//            TuneCloseButton

public class TuneAdActivity extends Activity
{

    public TuneAdView a;
    protected JSONObject b;
    protected TuneAdUtils c;
    protected TuneCloseButton d;
    protected WebView e;
    private boolean f;

    public TuneAdActivity()
    {
    }

    protected void a(Uri uri)
    {
        uri = uri.getQuery();
        try
        {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format("market://details?%s", new Object[] {
                uri
            }))));
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format("http://play.google.com/store/apps/details?%s", new Object[] {
                uri
            }))));
        }
    }

    protected void b(Uri uri)
    {
        uri = uri.getQuery();
        try
        {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format("amzn://apps/android?%s", new Object[] {
                uri
            }))));
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format("http://www.amazon.com/gp/mas/dl/android?%s", new Object[] {
                uri
            }))));
        }
    }

    protected boolean c(Uri uri)
    {
        String s = uri.getScheme();
        uri = uri.getHost();
        if (s != null)
        {
            boolean flag1 = s.equals("market");
            boolean flag;
            if ((s.equals("http") || s.equals("https")) && (uri.equals("play.google.com") || uri.equals("market.android.com")))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag1 || flag)
            {
                return true;
            }
        }
        return false;
    }

    protected boolean d(Uri uri)
    {
        String s = uri.getScheme();
        uri = uri.getHost();
        if (s != null)
        {
            boolean flag1 = s.equals("amzn");
            boolean flag;
            if ((s.equals("http") || s.equals("https")) && uri.equals("www.amazon.com"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag1 || flag)
            {
                return true;
            }
        }
        return false;
    }

    public void onBackPressed()
    {
        if (a != null)
        {
            TuneAdClient.c(a, b);
        }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        c = TuneAdUtils.a();
        if (getIntent().getBooleanExtra("INTERSTITIAL", false))
        {
            bundle = TuneAdOrientation.a(getIntent().getStringExtra("ORIENTATION"));
            if (bundle == TuneAdOrientation.b)
            {
                setRequestedOrientation(1);
            } else
            if (bundle == TuneAdOrientation.c)
            {
                setRequestedOrientation(0);
            }
            bundle = getIntent().getStringExtra("PLACEMENT");
            a = c.e(bundle);
            e = a.d;
            c.a(this);
            a.c = getIntent().getStringExtra("REQUESTID");
            try
            {
                b = new JSONObject(getIntent().getStringExtra("ADPARAMS"));
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                bundle.printStackTrace();
            }
            bundle = (ViewGroup)getWindow().getDecorView();
            bundle.setBackgroundColor(0);
            f = getIntent().getBooleanExtra("NATIVECLOSEBUTTON", false);
            if (f)
            {
                d = new TuneCloseButton(this);
                android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                d.setLayoutParams(layoutparams);
                bundle.addView(d);
            }
            setContentView(e);
            return;
        } else
        {
            bundle = getIntent().getStringExtra("REDIRECT_URI");
            getWindow().requestFeature(2);
            getWindow().setFeatureInt(2, -1);
            if (bundle != null)
            {
                bundle = Uri.parse(bundle);
                if (c(bundle))
                {
                    a(bundle);
                } else
                if (d(bundle))
                {
                    b(bundle);
                } else
                {
                    try
                    {
                        startActivity(new Intent("android.intent.action.VIEW", bundle));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Bundle bundle)
                    {
                        bundle.printStackTrace();
                    }
                }
            }
            finish();
            return;
        }
    }

    public void onDestroy()
    {
        ViewGroup viewgroup = (ViewGroup)getWindow().getDecorView();
        if (f)
        {
            viewgroup.removeView(d);
        }
        if (e != null && e.getParent() != null)
        {
            ((ViewGroup)e.getParent()).removeView(e);
            e.loadUrl("about:blank");
        }
        c.a(null);
        super.onDestroy();
    }

    public void onResume()
    {
        super.onResume();
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            getWindow().setFlags(1024, 1024);
        } else
        {
            getWindow().getDecorView().setSystemUiVisibility(1028);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            ActionBar actionbar = getActionBar();
            if (actionbar != null)
            {
                actionbar.hide();
            }
        }
    }
}
