// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.cleanmaster.common.a;

// Referenced classes of package com.cleanmaster.ui.app.market:
//            p, r, q

public class o
{

    private WebView a;
    private boolean b;
    private Handler c;
    private r d;
    private String e;
    private String f;
    private String g;
    private String h;

    public o(Context context)
    {
        d = null;
        if (!com.cleanmaster.common.a.b(context))
        {
            try
            {
                a = new WebView(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (a != null)
        {
            c = new p(this, Looper.getMainLooper());
            a.getSettings().setJavaScriptEnabled(true);
            a.getSettings().setCacheMode(2);
            if (android.os.Build.VERSION.SDK_INT < 18)
            {
                a.getSettings().setSavePassword(false);
                return;
            }
        }
    }

    static WebView a(o o1)
    {
        return o1.a;
    }

    static void a(o o1, String s)
    {
        o1.a(s);
    }

    private void a(String s)
    {
        if (a != null)
        {
            a.destroy();
            a = null;
        }
        if (d != null)
        {
            d.a(s);
        }
    }

    static boolean a(o o1, boolean flag)
    {
        o1.b = flag;
        return flag;
    }

    static boolean b(o o1)
    {
        return o1.b;
    }

    static Handler c(o o1)
    {
        return o1.c;
    }

    public void a(r r1)
    {
        d = r1;
    }

    public void a(String s, String s1, String s2, String s3)
    {
        if (a == null)
        {
            return;
        } else
        {
            e = s;
            f = s1;
            g = s2;
            h = s3;
            a.setWebViewClient(new q(this));
            a.loadUrl(s);
            return;
        }
    }
}
