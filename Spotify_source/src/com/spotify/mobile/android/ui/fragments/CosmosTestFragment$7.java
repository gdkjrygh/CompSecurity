// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.fragments;

import android.os.Handler;
import com.spotify.cosmos.router.Response;

// Referenced classes of package com.spotify.mobile.android.ui.fragments:
//            CosmosTestFragment

final class a extends com.spotify.cosmos.android.iver
{

    private CosmosTestFragment a;

    protected final void onError(Throwable throwable)
    {
        CosmosTestFragment.a(a, throwable);
    }

    protected final void onResolved(Response response)
    {
        CosmosTestFragment.a(a, "sp://echo", new String(response.getBody()));
    }

    (CosmosTestFragment cosmostestfragment, Handler handler)
    {
        a = cosmostestfragment;
        super(handler);
    }
}
