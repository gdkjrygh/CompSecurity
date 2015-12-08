// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.sdk;

import android.webkit.WebView;
import android.widget.RelativeLayout;

// Referenced classes of package com.pinterest.sdk:
//            PinterestOauthActivity

public class 
{

    public static void inject(butterknife.ector ector, PinterestOauthActivity pinterestoauthactivity, Object obj)
    {
        pinterestoauthactivity.a = (WebView)ector.ector(obj, 0x7f0f0093, "field '_webView'");
        pinterestoauthactivity.b = (RelativeLayout)ector.ector(obj, 0x7f0f0092, "field '_containerView'");
    }

    public static void reset(PinterestOauthActivity pinterestoauthactivity)
    {
        pinterestoauthactivity.a = null;
        pinterestoauthactivity.b = null;
    }

    public ()
    {
    }
}
