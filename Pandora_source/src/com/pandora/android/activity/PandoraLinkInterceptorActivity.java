// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.af;
import java.net.URLEncoder;
import p.cg.a;
import p.cg.c;
import p.dm.n;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, a, c, AndroidLinkActivity

public class PandoraLinkInterceptorActivity extends BaseFragmentActivity
{

    private a o;
    private WebView p;

    public PandoraLinkInterceptorActivity()
    {
    }

    private void n()
    {
        p = new WebView(this);
        try
        {
            o = new a(this, p);
            p.getSettings().setJavaScriptEnabled(true);
            p.addJavascriptInterface(o, "Bridge");
            p.setWebViewClient(new c(o));
            p.setWebChromeClient(new p.cp.a());
            String s1 = b.a.d().b();
            p.loadUrl((new StringBuilder()).append("https://developer.pandora.com/pandoralink/tool/interceptor.vm?token=").append(URLEncoder.encode(s1)).toString());
            setContentView(p);
            return;
        }
        catch (n n1)
        {
            p = null;
        }
        o = null;
        s.a(getApplicationContext(), "Unable to initialize Interceptor, try again later.");
        finish();
    }

    protected void a(Context context, Intent intent, String s1)
    {
    }

    protected IntentFilter l()
    {
        return null;
    }

    public void m()
    {
        n();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        n();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        com.pandora.android.activity.a.c(menu, getMenuInflater());
        super.onCreateOptionsMenu(menu);
        return true;
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            if (p.cx.c.a().G())
            {
                com.pandora.android.activity.c.a().a(this, com/pandora/android/activity/AndroidLinkActivity);
            } else
            {
                com.pandora.android.activity.a.a(this, null);
            }
            p.cx.c.a().M();
            finish();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public void onPause()
    {
        super.onPause();
        o.b();
    }

    public void onResume()
    {
        super.onResume();
        o.c();
    }

    public void onStop()
    {
        super.onStop();
    }
}
