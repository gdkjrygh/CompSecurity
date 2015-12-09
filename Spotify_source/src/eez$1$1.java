// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import java.util.TimerTask;

final class ask
    implements Runnable
{

    public final void run()
    {
        ((AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter)).f(AdSlot.MOBILE_SCREENSAVER);
    }

    ask()
    {
    }

    // Unreferenced inner class eez$1

/* anonymous class */
    public final class eez._cls1 extends TimerTask
    {

        private eez a;

        public final void run()
        {
            eez.a(a).post(new eez._cls1._cls1());
        }

            public 
            {
                a = eez1;
                super();
            }
    }

}
