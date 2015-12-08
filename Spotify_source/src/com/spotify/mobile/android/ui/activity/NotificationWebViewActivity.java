// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import aa;
import ah;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import fou;
import fyc;
import fyw;
import ggn;

public class NotificationWebViewActivity extends fou
{

    public NotificationWebViewActivity()
    {
    }

    public static Intent a(Context context, SpotifyLink spotifylink, Flags flags)
    {
        Intent intent;
        intent = new Intent(context, com/spotify/mobile/android/ui/activity/NotificationWebViewActivity);
        fyw.a(intent, flags);
        com.spotify.mobile.android.util.SpotifyLink._cls1.a[spotifylink.c.ordinal()];
        JVM INSTR tableswitch 22 22: default 44
    //                   22 54;
           goto _L1 _L2
_L1:
        context = null;
_L4:
        intent.setData(context);
        return intent;
_L2:
        context = Uri.parse(spotifylink.a(2));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onBackPressed()
    {
        fyc fyc1 = (fyc)a_().a("notification_webview");
        if (fyc1 != null && fyc1.y_())
        {
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030028);
        if (bundle == null)
        {
            a_().a().a(0x7f1102bd, fyc.a(fyw.a(this)), "notification_webview").c();
        }
        super.e = ggn.a(this, ViewUri.bF);
    }
}
