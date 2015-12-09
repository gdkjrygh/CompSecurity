// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import dmz;
import ggc;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            ShareToSpotifyActivity

final class a extends com.spotify.cosmos.android.
{

    private ShareToSpotifyActivity a;

    protected final void onError(Throwable throwable)
    {
        dmz.a(ggc);
        ggc.a(a, 0x7f08056c, 1, new Object[0]);
        a.finish();
    }

    protected final void onResolved(Response response)
    {
        dmz.a(ggc);
        ggc.g(a);
        a.finish();
    }

    (ShareToSpotifyActivity sharetospotifyactivity, Handler handler)
    {
        a = sharetospotifyactivity;
        super(handler);
    }
}
