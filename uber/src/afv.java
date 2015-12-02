// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class afv
    implements aft
{

    final Set a = Collections.synchronizedSet(new HashSet());
    private final Context b;

    public afv(Context context)
    {
        b = context;
    }

    public final WebView a()
    {
        WebView webview = new WebView(b);
        webview.getSettings().setJavaScriptEnabled(true);
        return webview;
    }

    public final void a(String s, String s1)
    {
        of.a("Fetching assets for the given html");
        ajc.a.post(new _cls1(s, s1));
    }

    /* member class not found */
    class _cls1 {}

}
