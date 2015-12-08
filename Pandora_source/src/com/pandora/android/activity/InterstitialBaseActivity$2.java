// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import com.pandora.android.data.l;
import com.pandora.android.util.s;
import java.util.HashMap;
import p.cp.d;
import p.cq.c;
import p.df.a;

// Referenced classes of package com.pandora.android.activity:
//            InterstitialBaseActivity, c

class a extends d
{

    final InterstitialBaseActivity a;

    protected HashMap a(l l1, c c1)
    {
        if (l1 == null || s.a(l1.a()))
        {
            p.df.a.c("InterstitialBaseActivity", "handleOpenLandingPage url is missing");
            return null;
        } else
        {
            c1 = new Bundle(1);
            c1.putSerializable("LANDING_PAGE_DATA", l1);
            com.pandora.android.activity.c.a().a(a, com/pandora/android/activity/InterstitialBaseActivity, 0, c1, 123);
            return null;
        }
    }

    protected HashMap a(HashMap hashmap)
    {
        a.d(101);
        return null;
    }

    public boolean a()
    {
        return true;
    }

    public void d()
    {
        a.finish();
    }

    (InterstitialBaseActivity interstitialbaseactivity, Activity activity, WebView webview)
    {
        a = interstitialbaseactivity;
        super(activity, webview);
    }
}
