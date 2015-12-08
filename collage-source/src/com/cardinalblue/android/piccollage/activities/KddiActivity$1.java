// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.support.v7.app.ActionBar;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            KddiActivity

class a extends WebChromeClient
{

    final KddiActivity a;

    public void onProgressChanged(WebView webview, int i)
    {
        if (i == 100)
        {
            a.getSupportActionBar().setTitle(a.getString(0x7f070100));
            return;
        } else
        {
            a.getSupportActionBar().setTitle((new StringBuilder()).append(a.getString(0x7f0701fa)).append(" ").append(i).append("%").toString());
            return;
        }
    }

    (KddiActivity kddiactivity)
    {
        a = kddiactivity;
        super();
    }
}
