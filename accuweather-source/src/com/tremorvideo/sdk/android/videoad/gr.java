// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.webkit.WebSettings;
import android.webkit.WebView;

class gr extends WebView
{

    public boolean a;
    public boolean b;

    gr(Activity activity)
    {
        super(activity);
        a = false;
        b = false;
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSaveFormData(false);
        getSettings().setSavePassword(false);
        getSettings().setPluginsEnabled(true);
    }
}
