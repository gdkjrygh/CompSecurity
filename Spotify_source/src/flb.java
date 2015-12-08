// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.Display;
import com.google.android.exoplayer.AspectRatioFrameLayout;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.CompanionAd;
import com.spotify.mobile.android.spotlets.ads.model.Video;
import com.spotify.mobile.android.spotlets.video.LegacyAdsVideoPlayerService;
import com.spotify.mobile.android.spotlets.video.VideoPlayerMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class flb extends Service
    implements fle
{

    public static final Set a = new HashSet(Arrays.asList(new String[] {
        "video/webm", "video/mp4", "video/3gpp"
    }));
    public final Object b = new Object();
    public Set c;
    public fll d;

    public flb()
    {
        c = new HashSet();
    }

    public static Intent a(Context context, String s)
    {
        s = new Intent(s);
        s.setClass(context, com/spotify/mobile/android/spotlets/video/LegacyAdsVideoPlayerService);
        return s;
    }

    public static boolean a(Context context, ServiceConnection serviceconnection)
    {
        return dvk.a(context, new Intent(context, com/spotify/mobile/android/spotlets/video/LegacyAdsVideoPlayerService), serviceconnection, dvk.getSimpleName());
    }

    public final void a(Intent intent)
    {
        boolean flag = false;
        Ad ad = (Ad)intent.getParcelableExtra(".extra.ID");
        int i = PreferenceManager.getDefaultSharedPreferences(this).getInt("video_ad_skip_time", 30000);
        dmz.a(eem);
        Object obj = eem.a(ad.getId(), i, (AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter), (dwg)dmz.a(dwg), ad.getNielsenOcrTag(), true);
        a(((fli) (obj)));
        d = ((fll) (obj));
        boolean flag1 = intent.getBooleanExtra("com.spotify.music.service.video.extra.START_REQUESTED", false);
        intent = ad.getTitle();
        obj = ad.getAdvertiser();
        long l = ad.getDuration();
        Object obj1 = ad.getCompanionAd().getUrl();
        String s = ad.getClickUrl();
        if (i <= 0)
        {
            flag = true;
        }
        intent = new VideoPlayerMetadata(intent, ((String) (obj)), l, ((String) (obj1)), s, flag);
        obj1 = ad.getVideos();
        obj = new ArrayList(((List) (obj1)).size());
        Video video;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(new flh(video.getUrl(), video.getBitrate(), video.getMimeType())))
        {
            video = (Video)((Iterator) (obj1)).next();
        }

        if (ad.getFeatureData() != null)
        {
            ad.getFeatureData().get("videoPlaylistID");
        }
        a(((VideoPlayerMetadata) (intent)), new flg(((List) (obj))), i, flag1);
    }

    public abstract void a(AspectRatioFrameLayout aspectratioframelayout, Display display);

    public abstract void a(VideoPlayerMetadata videoplayermetadata, flg flg1, int i, boolean flag);

    public final void a(fli fli)
    {
        synchronized (b)
        {
            c.add(fli);
        }
        return;
        fli;
        obj;
        JVM INSTR monitorexit ;
        throw fli;
    }

    public abstract void a(boolean flag, AspectRatioFrameLayout aspectratioframelayout, Display display);

    public abstract boolean a();

    public abstract void b();

    public final void b(fli fli)
    {
        synchronized (b)
        {
            c.remove(fli);
        }
        return;
        fli;
        obj;
        JVM INSTR monitorexit ;
        throw fli;
    }

    public abstract void c();

}
