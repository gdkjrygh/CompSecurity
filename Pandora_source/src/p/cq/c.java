// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cq;

import android.webkit.WebView;
import com.pandora.android.data.l;
import com.pandora.android.util.s;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p.bz.k;
import p.cp.d;
import p.df.a;
import p.dt.b;

public class c
{

    private WeakReference a;
    private WeakReference b;
    private com.pandora.radio.data.b c;
    private String d;
    private String e;
    private b f;
    private String g;

    public c(d d1, WebView webview, com.pandora.radio.data.b b1, String s1, String s2, String s3)
    {
        f = null;
        a = new WeakReference(d1);
        b = new WeakReference(webview);
        g = s3;
        c = b1;
        e = s2;
        d = s1;
    }

    private void b()
    {
        if (b.get() == null || a.get() == null || f != null)
        {
            f.b(this);
        }
    }

    public void a()
    {
        if (f != null)
        {
            f.b(this);
        }
    }

    public void a(b b1)
    {
        if (b1 != null)
        {
            f = b1;
            f.c(this);
        }
    }

    public void onLandingPageClose(k k1)
    {
        b();
        while (k1 == null || k1.a == null || s.a(e) || !c.equals(k1.a.f())) 
        {
            return;
        }
        k1 = (d)a.get();
        WebView webview = (WebView)b.get();
        HashMap hashmap = new HashMap();
        hashmap.put("success", String.valueOf(true));
        if (webview != null && k1 != null)
        {
            try
            {
                k1.a((WebView)b.get(), e, g, hashmap);
            }
            // Misplaced declaration of an exception variable
            catch (k k1)
            {
                p.df.a.c("LandingPageEventListener", (new StringBuilder()).append("Failed to send response[").append(k1.getLocalizedMessage()).append("]").toString());
            }
        }
        a();
    }

    public void onLandingPageLoad(p.bz.l l1)
    {
        b();
        if (l1 != null && l1.a != null)
        {
            d d1 = (d)a.get();
            WebView webview = (WebView)b.get();
            if (webview != null && d1 != null && !s.a(d) && c.equals(l1.a.f()))
            {
                l1 = new HashMap();
                l1.put("success", String.valueOf(true));
                d1.a(webview, d, g, l1);
                return;
            }
        }
    }
}
