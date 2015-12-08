// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import com.appboy.d.a;
import com.appboy.d.c;
import com.appboy.d.h;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageHtmlBaseView;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageHtmlFullView;

// Referenced classes of package com.appboy.ui.inappmessage:
//            s, F, a

final class n
    implements s
{

    final com.appboy.ui.inappmessage.a a;

    n(com.appboy.ui.inappmessage.a a1)
    {
        a = a1;
        super();
    }

    public final View a(Activity activity, a a1)
    {
        Object obj = (h)a1;
        activity = (AppboyInAppMessageHtmlFullView)activity.getLayoutInflater().inflate(com.appboy.ui.d.com_appboy_inappmessage_html_full, null);
        String s1 = a1.a();
        obj = ((c) (obj)).b;
        activity.a().loadDataWithBaseURL(((String) (obj)), s1, "text/html", "utf-8", null);
        a1 = new F(a1, com.appboy.ui.inappmessage.a.e(a));
        activity.a().setWebViewClient(a1);
        return activity;
    }
}
