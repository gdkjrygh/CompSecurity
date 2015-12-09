// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.ads.InterstitialAdActivity;

// Referenced classes of package com.facebook.ads.internal.view:
//            h, g

public class m
    implements h
{

    private InterstitialAdActivity a;
    private h.a b;
    private String c;
    private String d;
    private String e;
    private g f;

    public m(InterstitialAdActivity interstitialadactivity, h.a a1)
    {
        a = interstitialadactivity;
        b = a1;
        f = new g(interstitialadactivity);
        interstitialadactivity = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        interstitialadactivity.addRule(15);
        f.setLayoutParams(interstitialadactivity);
        a1.a(f);
    }

    public void a()
    {
    }

    public void a(Intent intent, Bundle bundle)
    {
        c = intent.getStringExtra("videoURL");
        d = intent.getStringExtra("videoPlayReportURL");
        e = intent.getStringExtra("videoTimeReportURL");
        f.setVideoPlayReportURI(d);
        f.setVideoTimeReportURI(e);
        f.setVideoURI(c);
        f.a();
    }

    public void a(Bundle bundle)
    {
    }

    public void b()
    {
    }

    public void c()
    {
    }
}
