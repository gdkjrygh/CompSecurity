// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.webkit.WebView;

// Referenced classes of package com.pandora.android.activity:
//            InterstitialBaseActivity

class <init> extends <init>
{

    final InterstitialBaseActivity a;

    public void d()
    {
        a.finish();
    }

    (InterstitialBaseActivity interstitialbaseactivity, Activity activity, WebView webview)
    {
        a = interstitialbaseactivity;
        super(interstitialbaseactivity, activity, webview);
    }
}
