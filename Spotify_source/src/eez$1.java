// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import java.util.TimerTask;

public final class til.TimerTask extends TimerTask
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

    public (eez eez1)
    {
        a = eez1;
        super();
    }
}
