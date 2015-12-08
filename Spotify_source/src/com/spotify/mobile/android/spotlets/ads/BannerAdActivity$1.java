// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads:
//            BannerAdActivity

final class  extends BroadcastReceiver
{

    public final void onReceive(Context context, Intent intent)
    {
        context.startActivity(new Intent(context, com/spotify/mobile/android/spotlets/ads/BannerAdActivity));
    }

    ()
    {
    }
}
