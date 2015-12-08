// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.webkit.WebView;

// Referenced classes of package com.pandora.android.activity:
//            InterstitialAnnouncementActivity

class a extends a
{

    final InterstitialAnnouncementActivity a;

    public void c()
    {
        a.onBackPressed();
    }

    (InterstitialAnnouncementActivity interstitialannouncementactivity, Activity activity, WebView webview)
    {
        a = interstitialannouncementactivity;
        super(interstitialannouncementactivity, activity, webview);
    }
}
