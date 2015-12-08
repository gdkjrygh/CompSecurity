// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.view;


// Referenced classes of package com.pinterest.activity.web.view:
//            WebViewOpeninAppBar

public class 
{

    public static void inject(butterknife.ppBar ppbar, WebViewOpeninAppBar webviewopeninappbar, Object obj)
    {
        webviewopeninappbar._openButton = ppbar._openButton(obj, 0x7f0f030a, "field '_openButton'");
        webviewopeninappbar._removeButton = ppbar._removeButton(obj, 0x7f0f0309, "field '_removeButton'");
    }

    public static void reset(WebViewOpeninAppBar webviewopeninappbar)
    {
        webviewopeninappbar._openButton = null;
        webviewopeninappbar._removeButton = null;
    }

    public ()
    {
    }
}
