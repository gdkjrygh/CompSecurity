// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import p.cp.d;

// Referenced classes of package p.ca:
//            bg

class p.Activity extends d
{

    final int a;
    final bg b;

    protected void b()
    {
        b.dismiss();
    }

    protected void c()
    {
        b.dismiss();
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        bg.b(b).removeCallbacks(bg.a(b));
        if (b.getView() != null)
        {
            webview.setBackgroundColor(a);
            b.getView().findViewById(0x7f100300).setVisibility(8);
        }
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        webview.loadDataWithBaseURL(null, b.a(s1), "text/html", "utf-8", null);
    }

    bkit.WebView(bg bg1, Activity activity, WebView webview, int i)
    {
        b = bg1;
        a = i;
        super(activity, webview);
    }
}
