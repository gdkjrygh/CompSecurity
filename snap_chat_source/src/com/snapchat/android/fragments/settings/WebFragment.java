// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Bt;
import Iu;
import Ll;
import Pi;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mA;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EncodingUtils;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            LeftSwipeSettingFragment

public class WebFragment extends LeftSwipeSettingFragment
{

    private String a;
    public WebView b;
    public Iu c;
    private String d;
    private String e;
    private boolean f;
    private View g;

    public WebFragment()
    {
    }

    public WebFragment(String s, String s1)
    {
        this(s, s1, false, null);
    }

    public WebFragment(String s, String s1, boolean flag, String s2)
    {
        String s3 = s;
        if (s == null)
        {
            Pi.a();
            s3 = Pi.e();
        }
        a = s3;
        d = s1;
        f = flag;
        e = s2;
        SnapchatApplication.getDIComponent().a(this);
    }

    static View a(WebFragment webfragment)
    {
        return webfragment.g;
    }

    private static String a(List list)
    {
        if (list.isEmpty())
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        try
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Object obj = (BasicNameValuePair)list.next();
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append("&");
                }
                String s = ((BasicNameValuePair) (obj)).getName();
                obj = ((BasicNameValuePair) (obj)).getValue();
                if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    stringbuilder.append(s).append("=").append(URLEncoder.encode(((String) (obj)), "UTF-8"));
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (List list) { }
        return stringbuilder.toString();
    }

    private static String b(String s)
    {
        s = mA.a(Bt.R(), s);
        return s;
        s;
_L2:
        return "Unknown";
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String m()
    {
        Object obj = getActivity().getPackageManager();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        obj = ((PackageManager) (obj)).getPackageInfo(getActivity().getPackageName(), 0).versionName;
        return ((String) (obj));
        Exception exception;
        exception;
        return "Unknown";
    }

    public final void a(Bundle bundle)
    {
        d(0x7f0d0080).setOnClickListener(new android.view.View.OnClickListener() {

            private WebFragment a;

            public final void onClick(View view)
            {
                a.h();
            }

            
            {
                a = WebFragment.this;
                super();
            }
        });
        g = d(0x7f0d009a);
        b = (WebView)d(0x7f0d04bf);
        WebSettings websettings = b.getSettings();
        websettings.setJavaScriptEnabled(false);
        websettings.setAllowFileAccess(false);
        websettings.setSaveFormData(false);
        websettings.setSavePassword(false);
        if (d != null)
        {
            ((TextView)d(0x7f0d0081)).setText(d);
        }
        b.setWebViewClient(new WebViewClient() {

            private WebFragment a;

            public final boolean shouldOverrideUrlLoading(WebView webview, String s1)
            {
                webview = Uri.parse(s1);
                s1 = webview.getScheme();
                String s2 = webview.getHost();
                if (TextUtils.equals(s1, "https") && (TextUtils.equals(s2, "support.snapchat.com") || TextUtils.equals(s2, "accounts.snapchat.com") || TextUtils.equals(s2, "accounts-dot-devsnapchat.appspot.com") || TextUtils.equals(s2, "www.snapchat.com")))
                {
                    return false;
                } else
                {
                    webview = new Intent("android.intent.action.VIEW", webview);
                    a.startActivity(webview);
                    return true;
                }
            }

            
            {
                a = WebFragment.this;
                super();
            }
        });
        b.setWebChromeClient(new WebChromeClient() {

            private WebFragment a;

            public final void onProgressChanged(WebView webview, int i)
            {
                if (WebFragment.a(a) != null)
                {
                    webview = WebFragment.a(a);
                    if (i < 100)
                    {
                        i = 0;
                    } else
                    {
                        i = 8;
                    }
                    webview.setVisibility(i);
                }
            }

            
            {
                a = WebFragment.this;
                super();
            }
        });
        b.setClickable(true);
        b.requestFocus(130);
        b.setOnTouchListener(new android.view.View.OnTouchListener() {

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                motionevent.getAction();
                JVM INSTR tableswitch 0 1: default 28
            //                           0 30
            //                           1 30;
                   goto _L1 _L2 _L2
_L1:
                return false;
_L2:
                if (!view.hasFocus())
                {
                    view.requestFocus();
                }
                if (true) goto _L1; else goto _L3
_L3:
            }

        });
        b.getSettings().setJavaScriptEnabled(true);
        b.getSettings().setAllowFileAccess(false);
        if (bundle != null)
        {
            b.restoreState(bundle);
            return;
        }
        if (f)
        {
            Object obj = Long.toString((new Date()).getTime());
            bundle = new ArrayList();
            bundle.add(new BasicNameValuePair("username", Bt.q()));
            bundle.add(new BasicNameValuePair("req_token", b(((String) (obj)))));
            bundle.add(new BasicNameValuePair("timestamp", ((String) (obj))));
            obj = new HashMap();
            ((Map) (obj)).put("device", (new StringBuilder()).append(Build.MANUFACTURER).append(" ").append(Build.MODEL).toString());
            ((Map) (obj)).put("os_version", "Android");
            ((Map) (obj)).put("api_version", android.os.Build.VERSION.RELEASE);
            ((Map) (obj)).put("sc_version", m());
            bundle.add(new BasicNameValuePair("device", c.a(obj)));
            obj = GLES20.glGetString(7936);
            String s = GLES20.glGetString(7937);
            if (obj != null && s != null)
            {
                bundle.add(new BasicNameValuePair("gpu_arch", (new StringBuilder()).append(((String) (obj))).append(" ").append(s).toString()));
            }
            if (e != null)
            {
                bundle.add(new BasicNameValuePair("next", e));
            }
            Timber.c("WebFragment", "AppAuth POST: %s", new Object[] {
                a(((List) (bundle)))
            });
            bundle = a(((List) (bundle)));
            b.postUrl((new StringBuilder()).append(a).append("/accounts/client_native_auth").toString(), EncodingUtils.getBytes(bundle, "UTF-8"));
            return;
        } else
        {
            b.loadUrl(a);
            return;
        }
    }

    public void a(String s)
    {
        a = s;
    }

    public boolean f()
    {
        if (b != null && b.canGoBack())
        {
            b.goBack();
            return true;
        } else
        {
            return false;
        }
    }

    public void h()
    {
        if (b != null && b.canGoBack())
        {
            b.goBack();
            return;
        } else
        {
            getActivity().onBackPressed();
            return;
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            Pi.a();
            a = bundle.getString("url", Pi.e());
            d = bundle.getString("page_title", "Snapchat");
            f = bundle.getBoolean("user_app_auth", false);
            e = bundle.getString("forward_url", null);
            SnapchatApplication.getDIComponent().a(this);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040112, viewgroup, false);
        a(bundle);
        return mFragmentLayout;
    }

    public void onPause()
    {
        b.stopLoading();
        b.clearCache(true);
        b.clearFormData();
        b.clearHistory();
        super.onPause();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (b != null)
        {
            b.saveState(bundle);
        }
    }
}
