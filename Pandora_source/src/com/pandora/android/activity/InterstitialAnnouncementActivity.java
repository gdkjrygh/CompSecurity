// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.pandora.android.util.s;
import p.cp.d;

// Referenced classes of package com.pandora.android.activity:
//            InterstitialBaseActivity

public class InterstitialAnnouncementActivity extends InterstitialBaseActivity
{

    public InterstitialAnnouncementActivity()
    {
    }

    protected d a(WebView webview)
    {
        return new InterstitialBaseActivity.a(this, webview) {

            final InterstitialAnnouncementActivity a;

            public void c()
            {
                a.onBackPressed();
            }

            
            {
                a = InterstitialAnnouncementActivity.this;
                super(InterstitialAnnouncementActivity.this, activity, webview);
            }
        };
    }

    public boolean a(com.pandora.android.util.k.a a1)
    {
        return false;
    }

    protected int m()
    {
        return 0x7f040075;
    }

    protected void n()
    {
        if (!s.u())
        {
            super.n();
        }
    }

    public void onBackgroundClicked(View view)
    {
        onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }
}
