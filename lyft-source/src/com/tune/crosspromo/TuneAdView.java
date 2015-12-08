// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;

import android.webkit.WebView;
import java.net.URLEncoder;

// Referenced classes of package com.tune.crosspromo:
//            TuneAdMetadata

public class TuneAdView
{

    public String a;
    public TuneAdMetadata b;
    public String c;
    public WebView d;
    public boolean e;
    public boolean f;

    public TuneAdView(String s, TuneAdMetadata tuneadmetadata, WebView webview)
    {
        a = s;
        b = tuneadmetadata;
        d = webview;
    }

    public void a(String s)
    {
        try
        {
            d.loadData(URLEncoder.encode(s, "utf-8").replaceAll("\\+", " "), "text/html", "utf-8");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }
}
