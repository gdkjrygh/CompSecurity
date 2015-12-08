// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.util;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.cleanmaster.common.a;

// Referenced classes of package com.cleanmaster.util:
//            m

public class l
{

    private WebView a;
    private String b;
    private String c;

    public l(Context context, String s, String s1)
    {
        c = s;
        b = s1;
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
            a.getSettings().setJavaScriptEnabled(true);
            if (android.os.Build.VERSION.SDK_INT > 7)
            {
                a.getSettings().setPluginState(android.webkit.WebSettings.PluginState.ON);
            }
            a.getSettings().setCacheMode(2);
            if (android.os.Build.VERSION.SDK_INT < 18)
            {
                a.getSettings().setSavePassword(false);
                return;
            }
        }
    }

    static String a(l l1)
    {
        return l1.b;
    }

    static WebView b(l l1)
    {
        return l1.a;
    }

    public void a()
    {
        if (a == null)
        {
            return;
        } else
        {
            a.setWebViewClient(new m(this));
            a.loadData(c, "text/html", "UTF\2558");
            return;
        }
    }
}
