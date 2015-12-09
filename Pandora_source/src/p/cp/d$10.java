// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cp;

import android.webkit.WebView;

// Referenced classes of package p.cp:
//            d, c

class Object
    implements Runnable
{

    final WebView a;
    final c b;
    final d c;

    public void run()
    {
        c.a(a, b.a(), null);
    }

    bkit.WebView(d d1, WebView webview, c c1)
    {
        c = d1;
        a = webview;
        b = c1;
        super();
    }
}
