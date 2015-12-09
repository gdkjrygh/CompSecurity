// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.video.model.TrackWithPlayOrigin;
import com.spotify.mobile.android.video.stats.Reason;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class efo extends gkh
{

    private int c;
    private gkd d;
    private eel e;
    private efp f;
    private boolean g;

    public efo(Context context, gkd gkd1)
    {
        super(context, gkd1);
        c = PreferenceManager.getDefaultSharedPreferences(context).getInt("video_ad_skip_time", 30000);
        d = gkd1;
        dmz.a(efq);
        f = efq.a(Executors.newSingleThreadScheduledExecutor(), d);
    }

    private static HashMap a(gma gma1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("ms_latency", String.valueOf(gma1.t));
        hashmap.put("ms_initial_buffering", String.valueOf(gma1.J));
        hashmap.put("ms_stalled", String.valueOf(gma1.H));
        hashmap.put("max_ms_stalled", String.valueOf(gma1.M));
        hashmap.put("n_stalls", String.valueOf(gma1.C));
        hashmap.put("ms_played", String.valueOf(gma1.m));
        hashmap.put("time_weighted_bitrate", String.valueOf(gma1.D));
        return hashmap;
    }

    public final void a()
    {
        super.a();
        ctz.a(e);
        e.a(false);
        efp efp1 = f;
        if (efp1.d)
        {
            efp1.d = false;
            efp1.c.cancel(false);
        }
    }

    public final void a(TrackWithPlayOrigin trackwithplayorigin, String s, String s1, long l, long l1, 
            String s2)
    {
        super.a(trackwithplayorigin, s, s1, l, l1, s2);
        trackwithplayorigin.track.uid();
        s = (String)trackwithplayorigin.track.metadata().get("nielsenOCRTag");
        dmz.a(eem);
        trackwithplayorigin = (String)trackwithplayorigin.track.metadata().get("ad_id");
        ctz.a(trackwithplayorigin);
        e = eem.a(trackwithplayorigin, c, (AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter), (dwg)dmz.a(dwg), s, false);
    }

    public final void a(Reason reason, boolean flag)
    {
        String s = reason.mReason;
        ctz.a(e);
        if (!g)
        {
            g = true;
            e.a(a(d()));
        }
        f.a();
        super.a(reason, flag);
    }

    public final void a(glp glp, boolean flag)
    {
        glp.toString();
        ctz.a(e);
        e.b(a(d()));
        f.a();
        super.a(glp, flag);
    }

    public final void b()
    {
        super.b();
        ctz.a(e);
    }

    public final void c()
    {
        super.c();
        if (!d.n())
        {
            return;
        } else
        {
            ctz.a(e);
            f.a(e);
            e.a(true);
            return;
        }
    }
}
