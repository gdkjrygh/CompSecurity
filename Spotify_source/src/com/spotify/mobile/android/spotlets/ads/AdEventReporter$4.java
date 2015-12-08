// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.util.logging.Logger;
import dmz;
import eds;
import fos;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads:
//            AdEventReporter

final class a
    implements eds
{

    private AdEventReporter a;

    public final void a(Response response)
    {
        dmz.a(fos);
        fos.b(AdEventReporter.a(a));
    }

    public final void a(Throwable throwable)
    {
        Logger.b(throwable, "unable to resolve during acceptMidrollOffer (video)", new Object[0]);
    }

    (AdEventReporter adeventreporter)
    {
        a = adeventreporter;
        super();
    }
}
