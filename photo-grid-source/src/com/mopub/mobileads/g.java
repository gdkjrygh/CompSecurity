// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import com.mopub.network.AdResponse;
import com.mopub.volley.VolleyError;

// Referenced classes of package com.mopub.mobileads:
//            AdViewController

final class g
    implements com.mopub.network.AdRequest.Listener
{

    final AdViewController a;

    g(AdViewController adviewcontroller)
    {
        a = adviewcontroller;
        super();
    }

    public final void onErrorResponse(VolleyError volleyerror)
    {
        a.a(volleyerror);
    }

    public final void onSuccess(AdResponse adresponse)
    {
        a.a(adresponse);
    }
}
