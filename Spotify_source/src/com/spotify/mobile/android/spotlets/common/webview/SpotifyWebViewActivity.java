// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.common.webview;

import aa;
import ah;
import android.os.Bundle;
import android.view.View;
import com.spotify.android.paste.widget.SpotifyIconView;
import eqy;
import eqz;
import era;
import ers;
import fou;
import fyw;

public class SpotifyWebViewActivity extends fou
    implements eqy
{

    private View d;
    private View i;
    private eqz j;

    public SpotifyWebViewActivity()
    {
    }

    private void f()
    {
        d.setActivated(j.F());
        i.setActivated(j.G());
    }

    public final void a()
    {
        f();
    }

    public void onBackPressed()
    {
        era.a(j);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030032);
        d = findViewById(0x7f1102d6);
        i = findViewById(0x7f1102d7);
        bundle = (SpotifyIconView)d;
        getResources();
        era.a(bundle);
        bundle = (SpotifyIconView)i;
        getResources();
        era.a(bundle);
        j = (eqz)a_().a(ers.a);
        if (j == null)
        {
            j = eqz.a(fyw.a(this));
            a_().a().a(0x7f1102d8, j, ers.a).c();
        }
        findViewById(0x7f1102b9).setOnClickListener(new era._cls3(this));
        d.setOnClickListener(new era._cls1(j));
        i.setOnClickListener(new era._cls2(j));
    }

    public void onStart()
    {
        super.onStart();
        f();
    }
}
