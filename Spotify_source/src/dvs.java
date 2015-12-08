// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.video.VideoPlayerMetadata;
import java.util.Map;
import java.util.Set;

final class dvs
{

    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final long f;
    final Uri g;
    final int h;
    final boolean i;
    final boolean j;
    final boolean k;
    final long l;

    dvs(PlayerState playerstate)
    {
        boolean flag1 = true;
        super();
        if (playerstate == null || playerstate.track() == null || dvq.c(playerstate))
        {
            a = "";
            b = "";
            c = "";
            d = "";
            e = "";
            f = 0L;
            g = Uri.EMPTY;
            h = 0;
            i = false;
            j = false;
            k = false;
            l = -1L;
            return;
        }
        a = playerstate.track().uri();
        b = (String)playerstate.track().metadata().get("title");
        c = (String)playerstate.track().metadata().get("album_title");
        d = (String)playerstate.track().metadata().get("artist_name");
        e = (String)playerstate.track().metadata().get("artist_name");
        f = playerstate.duration();
        g = dto.a((String)playerstate.track().metadata().get("image_large_url"));
        i = true;
        boolean flag = "radio".equals(playerstate.playOrigin().featureIdentifier());
        int i1;
        long l1;
        long l2;
        if (playerstate.restrictions().disallowSkippingPrevReasons().isEmpty() && !flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        if (playerstate.restrictions().disallowSkippingNextReasons().isEmpty() && !dvq.d(playerstate))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        k = flag;
        if (!playerstate.isPaused() && playerstate.isPlaying())
        {
            i1 = 3;
        } else
        {
            i1 = 2;
        }
        h = i1;
        l2 = playerstate.currentPlaybackPosition();
        l1 = l2;
        if (l2 == -1L)
        {
            l1 = -1L;
        }
        l = l1;
    }

    dvs(VideoPlayerMetadata videoplayermetadata)
    {
        a = videoplayermetadata.e;
        b = videoplayermetadata.a;
        c = null;
        d = videoplayermetadata.b;
        e = null;
        f = videoplayermetadata.c;
        g = Uri.parse(videoplayermetadata.d);
        i = true;
        j = videoplayermetadata.g;
        k = videoplayermetadata.f;
        int i1;
        if (videoplayermetadata.h)
        {
            i1 = 2;
        } else
        {
            i1 = 3;
        }
        h = i1;
        l = -1L;
    }
}
