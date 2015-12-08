// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonHttpCallbackReceiver;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.model.AdState;
import com.spotify.mobile.android.spotlets.ads.model.State;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.HashMap;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads:
//            AdEventReporter

final class  extends JsonHttpCallbackReceiver
{

    private AdSlot a;
    private AdEventReporter b;

    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.eiver.ErrorCause errorcause)
    {
        if (errorcause == com.spotify.mobile.android.cosmos.eiver.ErrorCause.PARSING)
        {
            errorcause = "parsing";
        } else
        if (errorcause == com.spotify.mobile.android.cosmos.eiver.ErrorCause.RESOLVING)
        {
            errorcause = "resolving";
        } else
        {
            errorcause = "unknown";
        }
        Logger.b(throwable, "problem in cosmos call during reenableAdSlotConfiguration ({}): {}", new Object[] {
            a.getSlotId(), errorcause
        });
    }

    protected final void onResolved(Response response, Object obj)
    {
        if (((AdState)obj).getState().isAdsEnabled())
        {
            response = new HashMap();
            response.put("op", "replace");
            response.put("path", "/inventory_enabled");
            response.put("value", Boolean.toString(true));
            response = b.a("PATCH", (new StringBuilder("sp://ads/v1/settings/")).append(a.getSlotId()).toString(), response);
            AdEventReporter.a(b, response, "getState");
        }
    }

    ErrorCause(AdEventReporter adeventreporter, Handler handler, Class class1, AdSlot adslot)
    {
        b = adeventreporter;
        a = adslot;
        super(handler, class1);
    }
}
