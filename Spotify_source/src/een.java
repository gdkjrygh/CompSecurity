// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.AdEvent;
import com.spotify.mobile.android.spotlets.ads.model.Video;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.Iterator;
import java.util.List;

public final class een
{

    public static final dzw a = new dzw() {

        public final void a(AdEvent adevent, Context context)
        {
            if (een.a(adevent))
            {
                return;
            } else
            {
                een.a(adevent, context);
                return;
            }
        }

    };
    public static final dzw b = new dzw() {

        public final void a(AdEvent adevent, Context context)
        {
            een.a(adevent, context);
        }

    };

    static void a(AdEvent adevent, Context context)
    {
        Object obj = null;
        if (!com.spotify.mobile.android.spotlets.ads.model.AdEvent.Event.AVAILABLE.equals(adevent.getEvent())) goto _L2; else goto _L1
_L1:
        obj = "com.spotify.music.service.video.action.player.LOAD_VIDEO";
_L4:
        obj = flb.a(context, ((String) (obj)));
        ((Intent) (obj)).putExtra(".extra.ID", adevent.getAd());
        context.startService(((Intent) (obj)));
        return;
_L2:
        if (com.spotify.mobile.android.spotlets.ads.model.AdEvent.Event.PLAY.equals(adevent.getEvent()))
        {
            obj = "com.spotify.music.service.video.action.player.START_VIDEO";
        } else
        if (com.spotify.mobile.android.spotlets.ads.model.AdEvent.Event.DISCARD.equals(adevent.getEvent()))
        {
            obj = "com.spotify.music.service.video.action.player.DISCARD_VIDEO";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean a(AdEvent adevent)
    {
        if (adevent == null || adevent.getAd() == null || adevent.getAd().getVideos() == null || adevent.getAd().getVideos().size() == 0)
        {
            return false;
        }
        for (adevent = adevent.getAd().getVideos().iterator(); adevent.hasNext();)
        {
            Video video = (Video)adevent.next();
            Logger.c(video.toString(), new Object[0]);
            if (!TextUtils.isEmpty(video.getVideoHexId()))
            {
                return true;
            }
        }

        return false;
    }

}
