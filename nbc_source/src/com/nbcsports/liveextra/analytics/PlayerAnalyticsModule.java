// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import com.adobe.mediacore.MediaPlayer;
import com.conviva.streamerProxies.adobe.PrimeTimeDefaultMediaPlayerProxy;
import com.nbcsports.liveextra.analytics.conviva.ConvivaAnalytics;
import dagger.Lazy;

// Referenced classes of package com.nbcsports.liveextra.analytics:
//            PlayerAnalytics, OmniturePlayerAnalytics, StreamSenseAnalytics

public class PlayerAnalyticsModule
{

    public PlayerAnalyticsModule()
    {
    }

    private PlayerAnalytics nullAnalytics()
    {
        return new PlayerAnalytics() {

            final PlayerAnalyticsModule this$0;

            public void attachPlayer(MediaPlayer mediaplayer)
            {
            }

            public void onDestroy()
            {
            }

            public void onPause()
            {
            }

            
            {
                this$0 = PlayerAnalyticsModule.this;
                super();
            }
        };
    }

    PlayerAnalytics akamai(Lazy lazy)
    {
        if (android.os.Build.VERSION.RELEASE.startsWith("5"))
        {
            return nullAnalytics();
        } else
        {
            return (PlayerAnalytics)lazy.get();
        }
    }

    PlayerAnalytics conviva(ConvivaAnalytics convivaanalytics)
    {
        return convivaanalytics;
    }

    PrimeTimeDefaultMediaPlayerProxy convivaProxy(MediaPlayer mediaplayer)
    {
        try
        {
            mediaplayer = new PrimeTimeDefaultMediaPlayerProxy(mediaplayer);
        }
        // Misplaced declaration of an exception variable
        catch (MediaPlayer mediaplayer)
        {
            return null;
        }
        return mediaplayer;
    }

    PlayerAnalytics omniture(OmniturePlayerAnalytics omnitureplayeranalytics)
    {
        return omnitureplayeranalytics;
    }

    PlayerAnalytics streamsense(StreamSenseAnalytics streamsenseanalytics)
    {
        return streamsenseanalytics;
    }
}
