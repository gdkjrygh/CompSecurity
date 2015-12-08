// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.webkit.WebView;
import p.cp.a;
import p.cp.b;

// Referenced classes of package p.ca:
//            ac

private static class <init> extends a
{

    private ac a;

    public void onReceivedTitle(WebView webview, String s)
    {
label0:
        {
            webview = a.x();
            if (webview != null)
            {
                if (!"Webpage not available".equalsIgnoreCase(s))
                {
                    break label0;
                }
                webview.a("");
            }
            return;
        }
        if (p.cp.b.h(s))
        {
            webview.a("");
            return;
        } else
        {
            webview.a(s);
            return;
        }
    }

    private String(ac ac1)
    {
        a = ac1;
    }

    a(ac ac1, a a1)
    {
        this(ac1);
    }
}
