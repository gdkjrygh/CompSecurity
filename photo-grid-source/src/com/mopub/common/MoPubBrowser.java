// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Drawables;
import com.mopub.mobileads.BaseWebView;
import com.mopub.mobileads.util.WebViews;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.mopub.common:
//            k, l, m, n, 
//            o

public class MoPubBrowser extends Activity
{

    public static final String DESTINATION_URL_KEY = "URL";
    private WebView a;
    private ImageButton b;
    private ImageButton c;
    private ImageButton d;
    private ImageButton e;

    public MoPubBrowser()
    {
    }

    private ImageButton a(Drawable drawable)
    {
        ImageButton imagebutton = new ImageButton(this);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2, 1.0F);
        layoutparams.gravity = 16;
        imagebutton.setLayoutParams(layoutparams);
        imagebutton.setImageDrawable(drawable);
        return imagebutton;
    }

    static ImageButton a(MoPubBrowser mopubbrowser)
    {
        return mopubbrowser.c;
    }

    private List a(Intent intent)
    {
        PackageManager packagemanager = getPackageManager();
        if (packagemanager != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if ((intent = packagemanager.queryIntentActivities(intent, 0)) == null) goto _L1; else goto _L3
_L3:
        return intent;
        intent;
        intent = null;
        if (true) goto _L3; else goto _L4
_L4:
    }

    private void a(Intent intent, String s)
    {
        List list = a(intent);
        if (list != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (list == null) goto _L4; else goto _L3
_L3:
        Iterator iterator1 = list.iterator();
_L7:
        if (!iterator1.hasNext()) goto _L4; else goto _L5
_L5:
        ResolveInfo resolveinfo = (ResolveInfo)iterator1.next();
        if (resolveinfo == null || !resolveinfo.isDefault) goto _L7; else goto _L6
_L6:
        if (resolveinfo != null)
        {
            intent.setClassName(resolveinfo.activityInfo.packageName, resolveinfo.activityInfo.name);
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        resolveinfo = null;
        if (true) goto _L6; else goto _L8
_L8:
        boolean flag;
        Iterator iterator = list.iterator();
        ResolveInfo resolveinfo1;
        do
        {
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            resolveinfo1 = (ResolveInfo)iterator.next();
        } while (resolveinfo1.activityInfo == null || !resolveinfo1.activityInfo.packageName.equalsIgnoreCase(s));
        intent.setClassName(resolveinfo1.activityInfo.packageName, resolveinfo1.activityInfo.name);
        flag = true;
_L10:
        if (!flag)
        {
            s = (ResolveInfo)list.get(0);
            intent.setClassName(((ResolveInfo) (s)).activityInfo.packageName, ((ResolveInfo) (s)).activityInfo.name);
            return;
        }
        if (true) goto _L1; else goto _L9
_L9:
        flag = false;
          goto _L10
        if (true) goto _L1; else goto _L11
_L11:
    }

    static ImageButton b(MoPubBrowser mopubbrowser)
    {
        return mopubbrowser.b;
    }

    static WebView c(MoPubBrowser mopubbrowser)
    {
        return mopubbrowser.a;
    }

    public static void open(Context context, String s)
    {
        MoPubLog.d((new StringBuilder("Opening url in MoPubBrowser: ")).append(s).toString());
        Intent intent = new Intent(context, com/mopub/common/MoPubBrowser);
        intent.putExtra("URL", s);
        intent.addFlags(0x10000000);
        context.startActivity(intent);
    }

    public void finish()
    {
        ((ViewGroup)getWindow().getDecorView()).removeAllViews();
        super.finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setResult(-1);
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        bundle = new LinearLayout(this);
        bundle.setBackgroundColor(0xff000000);
        bundle.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        bundle.setOrientation(1);
        RelativeLayout relativelayout = new RelativeLayout(this);
        relativelayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        bundle.addView(relativelayout);
        Object obj = new LinearLayout(this);
        ((LinearLayout) (obj)).setId(1);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutparams.addRule(12);
        ((LinearLayout) (obj)).setLayoutParams(layoutparams);
        ((LinearLayout) (obj)).setBackgroundDrawable(Drawables.BACKGROUND.createDrawable(this));
        relativelayout.addView(((android.view.View) (obj)));
        b = a(Drawables.LEFT_ARROW.createDrawable(this));
        c = a(Drawables.RIGHT_ARROW.createDrawable(this));
        d = a(Drawables.REFRESH.createDrawable(this));
        e = a(Drawables.CLOSE.createDrawable(this));
        ((LinearLayout) (obj)).addView(b);
        ((LinearLayout) (obj)).addView(c);
        ((LinearLayout) (obj)).addView(d);
        ((LinearLayout) (obj)).addView(e);
        a = new BaseWebView(this);
        obj = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(2, 1);
        a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        relativelayout.addView(a);
        setContentView(bundle);
        bundle = a.getSettings();
        bundle.setJavaScriptEnabled(true);
        bundle.setSupportZoom(true);
        bundle.setBuiltInZoomControls(true);
        bundle.setUseWideViewPort(true);
        a.loadUrl(getIntent().getStringExtra("URL"));
        a.setWebViewClient(new _cls1());
        a.setWebChromeClient(new k(this));
        b.setBackgroundColor(0);
        b.setOnClickListener(new l(this));
        c.setBackgroundColor(0);
        c.setOnClickListener(new m(this));
        d.setBackgroundColor(0);
        d.setOnClickListener(new n(this));
        e.setBackgroundColor(0);
        e.setOnClickListener(new o(this));
        CookieSyncManager.createInstance(this);
        CookieSyncManager.getInstance().startSync();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        a.destroy();
        a = null;
    }

    protected void onPause()
    {
        super.onPause();
        CookieSyncManager.getInstance().stopSync();
        WebViews.onPause(a, isFinishing());
    }

    protected void onResume()
    {
        super.onResume();
        CookieSyncManager.getInstance().startSync();
        WebViews.onResume(a);
    }

    public void startActivity(Intent intent)
    {
        Intent intent1;
        Object obj;
        if (intent == null)
        {
            super.startActivity(intent);
            return;
        }
        Log.i("MoPubBrowser", (new StringBuilder("intent ")).append(intent).toString());
        obj = intent.getData();
        intent.addFlags(0x10000000);
        intent.addFlags(0x10000);
        intent1 = new Intent(intent);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if (((Uri) (obj)).toString() != null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        throw new Exception("null uri");
        obj = ((Uri) (obj)).toString().toLowerCase(Locale.getDefault());
        if (!intent.getAction().equals("android.intent.action.VIEW"))
        {
            throw new Exception("not view action");
        }
        if (!((String) (obj)).startsWith("http://") && !((String) (obj)).startsWith("https://")) goto _L2; else goto _L1
_L1:
        if (!((String) (obj)).startsWith("https://play.google.com/store/apps/details") && !((String) (obj)).startsWith("http://play.google.com/store/apps/details")) goto _L4; else goto _L3
_L3:
        a(intent, "com.android.vending");
_L5:
        super.startActivity(intent);
        return;
_L4:
        try
        {
            a(intent, "com.android.browser");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            super.startActivity(intent1);
            return;
        }
          goto _L5
_L2:
        if (!((String) (obj)).startsWith("market://")) goto _L5; else goto _L6
_L6:
        a(intent, "com.android.vending");
          goto _L5
    }

    private class _cls1 extends WebViewClient
    {

        final MoPubBrowser a;

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            if (webview.canGoBack())
            {
                s = Drawables.LEFT_ARROW.createDrawable(a);
            } else
            {
                s = Drawables.UNLEFT_ARROW.createDrawable(a);
            }
            MoPubBrowser.b(a).setImageDrawable(s);
            if (webview.canGoForward())
            {
                webview = Drawables.RIGHT_ARROW.createDrawable(a);
            } else
            {
                webview = Drawables.UNRIGHT_ARROW.createDrawable(a);
            }
            MoPubBrowser.a(a).setImageDrawable(webview);
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            super.onPageStarted(webview, s, bitmap);
            MoPubBrowser.a(a).setImageDrawable(Drawables.UNRIGHT_ARROW.createDrawable(a));
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            MoPubLog.d((new StringBuilder("MoPubBrowser error: ")).append(s).toString());
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            if (s != null)
            {
                webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
                if (Intents.isDeepLink(s) && Intents.deviceCanHandleIntent(a, webview))
                {
                    a.startActivity(webview);
                    a.finish();
                    return true;
                }
            }
            return false;
        }

        _cls1()
        {
            a = MoPubBrowser.this;
            super();
        }
    }

}
