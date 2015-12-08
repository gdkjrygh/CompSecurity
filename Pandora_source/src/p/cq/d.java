// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cq;

import android.webkit.WebView;
import com.pandora.android.data.o;
import com.pandora.android.data.r;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p.bz.aa;

public class d
{

    private p.dt.b a;
    private WeakReference b;
    private WeakReference c;
    private String d;
    private String e;
    private String f;
    private HashMap g;
    private boolean h;

    private d(p.cp.d d1, WebView webview, String s1, String s2, String s3)
    {
        b = new WeakReference(d1);
        c = new WeakReference(webview);
        d = s1;
        e = s2;
        f = s3;
        g = new HashMap();
    }

    private void a()
    {
        if (b())
        {
            p.cp.d d1 = (p.cp.d)b.get();
            if (d1 != null && !s.a(e))
            {
                try
                {
                    d1.a((WebView)c.get(), e, f, g);
                }
                catch (Exception exception) { }
                c();
                return;
            }
            if (d1 == null || s.a(e))
            {
                c();
                return;
            }
        }
    }

    public static void a(p.cp.d d1, WebView webview, String s1, String s2, String s3)
    {
        p.dt.b b1 = b.a.e();
        if (!s.a(s1))
        {
            d1 = new d(d1, webview, s1, s2, s3);
            b1.c(d1);
            d1.a = b1;
        }
    }

    private boolean b()
    {
        if (b.get() == null)
        {
            c();
            return false;
        } else
        {
            return true;
        }
    }

    private void c()
    {
        if (a != null)
        {
            a.b(this);
        }
    }

    public void onStartValueExchangeResult(p.bz.s s1)
    {
        if (!h)
        {
            return;
        } else
        {
            g.put("valueExchangeSuccess", String.valueOf(s1.a));
            a();
            return;
        }
    }

    public void onVideoCompleted(aa aa1)
    {
        if (aa1.b instanceof o)
        {
            if ((aa1.b instanceof r) && aa1.f == p.bz.aa.a.b)
            {
                h = true;
            }
            if (!s.a(e) && d.equalsIgnoreCase(aa1.b.d()))
            {
                g.put("epochAtLaunch", String.valueOf(aa1.c));
                g.put("epochAtDismiss", String.valueOf(aa1.d));
                g.put("viewingDuration", String.valueOf(aa1.e));
                if (!h)
                {
                    g.put("valueExchangeSuccess", Boolean.FALSE.toString());
                    a();
                    return;
                }
            }
        }
    }
}
