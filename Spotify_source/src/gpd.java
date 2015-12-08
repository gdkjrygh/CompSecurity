// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.common.datasource.CosmosError;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel;
import java.util.Locale;

public final class gpd
{

    public final eov a;
    public final eov b;
    public final eov c;
    public final eov d;
    public final eot e;

    public gpd(Resolver resolver)
    {
        ctz.a(resolver);
        geh.b();
        Handler handler = new Handler();
        a = eou.a(com/spotify/music/spotlets/radio/model/TracksAndRadioStationModel, resolver, handler);
        b = eou.a(com/spotify/music/spotlets/radio/model/RadioStationTracksModel, resolver, handler);
        c = eou.a(com/spotify/music/spotlets/radio/model/RadioStationModel, resolver, handler);
        d = eou.a(com/spotify/music/spotlets/radio/model/RadioStationsModel, resolver, handler);
        e = eot.a(resolver, handler);
    }

    public static eqn a(gpf gpf, String s)
    {
        return new eqn(gpf, s) {

            private gpf a;
            private String b;

            public final void a(Object obj)
            {
                obj = (CosmosError)obj;
                Logger.b("Failed to call uri '%s'. Error was: '%s'", new Object[] {
                    b, obj
                });
                a.a();
            }

            public final void b(Object obj)
            {
                a.a(obj);
            }

            
            {
                a = gpf1;
                b = s;
                super();
            }
        };
    }

    public final void a(String s, gpf gpf)
    {
        geh.a(s, "stationUri can not be empty.");
        ctz.a(gpf);
        s = String.format(Locale.US, "hm://radio-apollo/v3/tracks/%s", new Object[] {
            s
        });
        b.a(RequestBuilder.get(s).build(), 15000L).a(a(gpf, s));
    }

    // Unreferenced inner class gpd$2

/* anonymous class */
    public final class _cls2
    {

        public static final int a[];

        static 
        {
            a = new int[ThumbState.values().length];
            try
            {
                a[ThumbState.b.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[ThumbState.c.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
