// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import com.spotify.mobile.android.orbit.OrbitServiceInterface;
import com.spotify.mobile.android.util.logging.Logger;
import dmz;
import dtw;
import frc;
import frd;
import fre;
import gbw;
import gfi;
import ggc;

// Referenced classes of package com.spotify.mobile.android.service:
//            SpotifyService

final class a
    implements frd
{

    private getOrbitSession a;

    public final void a(boolean flag)
    {
        if (SpotifyService.n(a.a) != null)
        {
            SpotifyService.n(a.a).a();
            SpotifyService.a(a.a, null);
        }
        if (flag && a.a)
        {
            gbw gbw1 = new gbw(a.a, SpotifyService.m(a.a).getOrbitSession());
            gbw1.c = true;
            gbw1.a();
        }
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/spotify/mobile/android/service/SpotifyService$14

/* anonymous class */
    final class SpotifyService._cls14
        implements Runnable
    {

        final boolean a;
        final SpotifyService b;

        public final void run()
        {
            SpotifyService.a(b, new frc(b, new SpotifyService._cls14._cls1(this)));
            frc frc1 = SpotifyService.n(b);
            boolean flag = a;
            Logger.a("Starting", new Object[0]);
            frc1.a = flag;
            frc1.d.a(dtw.a, fre.a());
            if (flag)
            {
                dmz.a(ggc);
                ggc.a(frc1.b, 0x7f080559, 1, new Object[0]);
            }
        }

            
            {
                b = spotifyservice;
                a = flag;
                super();
            }
    }

}
