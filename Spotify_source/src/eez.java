// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.AdEvent;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.model.Image;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class eez
    implements dmx, dzw
{

    public Context a;
    public boolean b;
    public boolean c;
    public long d;
    public Timer e;
    public Ad f;
    public efa g;
    private Handler h;
    private efe i;

    public eez(Context context)
    {
        d = TimeUnit.MINUTES.toMillis(5L);
        a = context;
        c = true;
        h = new Handler();
        i = new efe();
    }

    static Handler a(eez eez1)
    {
        return eez1.h;
    }

    public static boolean a(Ad ad)
    {
        return ad.getImages().isEmpty();
    }

    public final void a()
    {
        if (e == null)
        {
            return;
        } else
        {
            e.cancel();
            e = null;
            return;
        }
    }

    public final void a(AdEvent adevent, Context context)
    {
        if (com.spotify.mobile.android.spotlets.ads.model.AdEvent.Event.AVAILABLE.equals(adevent.getEvent()))
        {
            f = adevent.getAd();
            adevent = f;
            if (!a(((Ad) (adevent))))
            {
                b(adevent).e();
            }
        } else
        if (com.spotify.mobile.android.spotlets.ads.model.AdEvent.Event.DISCARD.equals(adevent.getEvent()))
        {
            boolean flag = b();
            f = null;
            if (flag)
            {
                ((AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter)).f(AdSlot.MOBILE_SCREENSAVER);
                return;
            }
        }
    }

    public final gwb b(Ad ad)
    {
        ad = Uri.parse(((Image)ad.getImages().get(0)).getUrl());
        return ((gft)dmz.a(gft)).a().a(ad).a(i).a();
    }

    public final boolean b()
    {
        return f != null;
    }

    public final boolean c()
    {
        return a.getResources().getConfiguration().orientation == 1;
    }

    public final boolean d()
    {
        return g != null;
    }

    // Unreferenced inner class eez$1

/* anonymous class */
    public final class _cls1 extends TimerTask
    {

        private eez a;

        public final void run()
        {
            eez.a(a).post(new Runnable() {

                public final void run()
                {
                    ((AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter)).f(AdSlot.MOBILE_SCREENSAVER);
                }

            });
        }

            public 
            {
                a = eez.this;
                super();
            }
    }

}
