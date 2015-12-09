// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.webkit.WebView;
import java.util.HashMap;
import p.cp.d;
import p.cq.b;

// Referenced classes of package com.pandora.android.activity:
//            InterstitialBaseActivity, a

protected class b extends d
{

    final InterstitialBaseActivity b;

    public HashMap a(String s, b b1)
    {
        InterstitialBaseActivity.a(b, s);
        InterstitialBaseActivity.a(b, b1);
        InterstitialBaseActivity.a(b, System.currentTimeMillis());
        com.pandora.android.activity.a.b(b, s);
        return j;
    }

    public void a(int i)
    {
    }

    public boolean a(boolean flag)
    {
        return false;
    }

    public void e()
    {
    }

    public void f()
    {
        b.d(104);
    }

    public (InterstitialBaseActivity interstitialbaseactivity, Activity activity, WebView webview)
    {
        b = interstitialbaseactivity;
        super(activity, webview);
    }
}
