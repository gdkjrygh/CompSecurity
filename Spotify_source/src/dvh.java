// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Map;

public final class dvh
{

    public static Intent a(Intent intent, PlayerState playerstate)
    {
        boolean flag1 = true;
        b(intent, playerstate);
        boolean flag;
        if (!playerstate.isPaused() && playerstate.isPlaying())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        intent.putExtra("playing", flag);
        if (!playerstate.isPaused() && playerstate.isPlaying())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        intent.putExtra("playstate", flag);
        return intent;
    }

    static void b(Intent intent, PlayerState playerstate)
    {
        PlayerTrack playertrack = playerstate.track();
        String s;
        if (playertrack != null)
        {
            s = playertrack.uri();
        } else
        {
            s = "";
        }
        intent.putExtra("id", s);
        if (playertrack != null)
        {
            s = (String)playertrack.metadata().get("title");
        } else
        {
            s = "";
        }
        intent.putExtra("track", s);
        if (playertrack != null)
        {
            s = (String)playertrack.metadata().get("artist_name");
        } else
        {
            s = "";
        }
        intent.putExtra("artist", s);
        if (playertrack != null)
        {
            s = (String)playertrack.metadata().get("album_title");
        } else
        {
            s = "";
        }
        intent.putExtra("album", s);
        if (playertrack != null)
        {
            s = (String)playertrack.metadata().get("album_uri");
        } else
        {
            s = "";
        }
        intent.putExtra("albumId", s);
        intent.putExtra("duration", playerstate.duration());
        intent.putExtra("position", playerstate.currentPlaybackPosition());
        intent.putExtra("length", (int)playerstate.duration());
        intent.putExtra("playbackPosition", (int)playerstate.currentPlaybackPosition());
    }
}
