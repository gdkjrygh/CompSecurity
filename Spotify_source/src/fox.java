// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.nielsen.app.sdk.AppSdk;
import com.spotify.mobile.android.util.logging.Logger;
import java.net.URI;

public final class fox extends WebViewClient
{

    private Activity a;
    private dwg b;

    public fox(Activity activity, dwg dwg1)
    {
        a = activity;
        b = dwg1;
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (s != null)
        {
            flag = flag1;
            if (s.indexOf("nielsen") == 0)
            {
                if (!"close".equals(URI.create(s).getHost()))
                {
                    webview = b;
                    if (webview.b())
                    {
                        if (((dwg) (webview)).c)
                        {
                            ((dwg) (webview)).b.userOptOut(s);
                        } else
                        {
                            Logger.c("SDK not ready yet", new Object[0]);
                        }
                    } else
                    {
                        Logger.a("Called when not enabled", new Object[0]);
                    }
                }
                a.finish();
                flag = true;
            }
        }
        return flag;
    }
}
