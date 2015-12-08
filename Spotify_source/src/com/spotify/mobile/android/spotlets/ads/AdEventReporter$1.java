// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import eds;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads:
//            AdEventReporter

final class a
    implements eds
{

    private AdSlot a;
    private AdEventReporter b;

    public final void a(Response response)
    {
        b.c(a).sendOnResolved(response);
    }

    public final void a(Throwable throwable)
    {
        b.c(a).sendOnError(throwable);
    }

    (AdEventReporter adeventreporter, AdSlot adslot)
    {
        b = adeventreporter;
        a = adslot;
        super();
    }
}
