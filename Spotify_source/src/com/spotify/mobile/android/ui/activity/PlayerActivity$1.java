// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import ctz;
import efa;
import gms;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            PlayerActivity

final class a
    implements efa
{

    private PlayerActivity a;

    public final void a(Ad ad)
    {
        Context context = a.getApplicationContext();
        Intent intent = new Intent("com.spotify.mobile.android.ui.action.ads.screensaver.SHOW");
        intent.putExtra("screensaver_ad", (Parcelable)ctz.a(ad));
        ad = (new gms((Context)ctz.a(context), intent)).a;
        a.startActivity(ad);
    }

    (PlayerActivity playeractivity)
    {
        a = playeractivity;
        super();
    }
}
