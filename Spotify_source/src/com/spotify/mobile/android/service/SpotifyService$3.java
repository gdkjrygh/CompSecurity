// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import android.content.Context;
import com.spotify.mobile.android.orbit.OrbitServiceInterface;
import ctz;
import dtk;
import dtw;
import dyz;
import dza;
import dze;
import gfi;

// Referenced classes of package com.spotify.mobile.android.service:
//            SpotifyService

final class a
    implements Runnable
{

    private Context a;
    private SpotifyService b;

    public final void run()
    {
        if (SpotifyService.p(b))
        {
            SpotifyService.a(b, new dza(a, SpotifyService.m(b).getOrbitPushNotifications()));
            dza dza1 = SpotifyService.q(b);
            if (dza1.a != null)
            {
                ctz.a(dza1.b);
                ctz.a(dza1.c);
                dza1.b.a(dtk.a, dyz.a);
                dza1.c.a(dtw.a, dze.a);
                return;
            }
        }
    }

    ce(SpotifyService spotifyservice, Context context)
    {
        b = spotifyservice;
        a = context;
        super();
    }
}
