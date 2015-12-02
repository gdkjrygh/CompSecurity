// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.auth.e.a;
import com.facebook.c.u;
import com.facebook.debug.log.b;
import com.facebook.inject.t;
import com.facebook.orca.auth.c;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;

// Referenced classes of package com.facebook.orca.prefs:
//            OrcaPartialUserUpgradeActivity

class ak extends WebViewClient
{

    final OrcaPartialUserUpgradeActivity a;

    ak(OrcaPartialUserUpgradeActivity orcapartialuserupgradeactivity)
    {
        a = orcapartialuserupgradeactivity;
        super();
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        b.e("PartialUpgrade", (new StringBuilder()).append("Started loading page:").append(s).toString());
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        b.e("PartialUpgrade", (new StringBuilder()).append("Error in Upgrade Code:").append(i).append(" Description:").append(s).toString());
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s.startsWith("fb://upgrade_complete"))
        {
            webview = Uri.parse(s);
            s = webview.getQueryParameter("status");
            if (s.equalsIgnoreCase("success"))
            {
                com.facebook.orca.prefs.OrcaPartialUserUpgradeActivity.a(a).b().a(a.g, false).a();
                com.facebook.orca.prefs.OrcaPartialUserUpgradeActivity.b(a);
            } else
            {
                if (s.equalsIgnoreCase("logout"))
                {
                    ((c)a.i().a(com/facebook/orca/auth/c)).a();
                    return true;
                }
                b.e("PartialUpgrade", (new StringBuilder()).append("Error with upgrading:").append(webview.getQueryParameter("status_message")).toString());
            }
            return true;
        } else
        {
            ((u)a.i().a(com/facebook/c/u)).a(webview, s);
            return false;
        }
    }
}
