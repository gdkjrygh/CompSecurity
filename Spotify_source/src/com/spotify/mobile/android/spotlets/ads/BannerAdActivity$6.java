// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.spotlets.ads.model.Targeting;
import com.spotify.mobile.android.util.logging.Logger;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads:
//            BannerAdActivity

final class t> extends JsonCallbackReceiver
{

    private BannerAdActivity a;

    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.iver.ErrorCause errorcause)
    {
        Logger.b(throwable, "Ad Targetings failed to load", new Object[0]);
        BannerAdActivity.f(a);
    }

    protected final void onResolved(Response response, Object obj)
    {
        response = (Targeting)obj;
        if (response != null)
        {
            BannerAdActivity.a(a, response.getCustomTargetings());
        }
        BannerAdActivity.f(a);
    }

    rrorCause(BannerAdActivity banneradactivity, Handler handler, Class class1)
    {
        a = banneradactivity;
        super(handler, class1);
    }
}
