// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import android.text.TextUtils;
import com.spotify.mobile.android.util.SpotifyLink;
import cvp;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            PlayerTrack

public class PlayerTrackUtil
{

    private static final String ARTISTS_KEY_FORMAT = "artist_name:%d";

    public PlayerTrackUtil()
    {
    }

    public static boolean areTitlesEqual(PlayerTrack playertrack, PlayerTrack playertrack1)
    {
        return playertrack == playertrack1 || playertrack != null && playertrack1 != null && TextUtils.equals((CharSequence)playertrack.metadata().get("title"), (CharSequence)playertrack1.metadata().get("title"));
    }

    public static boolean areUidsEqual(PlayerTrack playertrack, PlayerTrack playertrack1)
    {
        return playertrack == playertrack1 || playertrack != null && playertrack1 != null && (canUseUids(playertrack, playertrack1) ? playertrack.uid().equals(playertrack1.uid()) : playertrack.uri().equals(playertrack1.uri()));
    }

    private static boolean canUseUids(PlayerTrack playertrack, PlayerTrack playertrack1)
    {
        return !TextUtils.isEmpty(playertrack.uid()) && !TextUtils.isEmpty(playertrack1.uid());
    }

    public static String getArtists(PlayerTrack playertrack)
    {
        cvp.a(playertrack);
        ArrayDeque arraydeque = new ArrayDeque();
        String s = (String)playertrack.metadata().get("artist_name");
        for (int i = 1; s != null; i++)
        {
            arraydeque.add(s);
            s = String.format(Locale.getDefault(), "artist_name:%d", new Object[] {
                Integer.valueOf(i)
            });
            s = (String)playertrack.metadata().get(s);
        }

        return TextUtils.join(", ", arraydeque);
    }

    public static boolean hasAdId(PlayerTrack playertrack)
    {
        if (playertrack == null)
        {
            return false;
        }
        return !TextUtils.isEmpty((String)playertrack.metadata().get("ad_id"));
    }

    public static boolean hasIncompleteMetadata(PlayerTrack playertrack)
    {
        return playertrack != null && playertrack.metadata().get("title") == null;
    }

    public static boolean isAd(PlayerTrack playertrack)
    {
        if (playertrack == null)
        {
            return false;
        } else
        {
            return Boolean.valueOf((String)playertrack.metadata().get("is_advertisement")).booleanValue();
        }
    }

    public static boolean isBackgroundable(PlayerTrack playertrack)
    {
        return isAd(playertrack);
    }

    public static boolean isEpisode(String s)
    {
        while (s == null || (new SpotifyLink(s)).c != com.spotify.mobile.android.util.SpotifyLink.LinkType.P) 
        {
            return false;
        }
        return true;
    }

    public static boolean isSuggestedTrack(PlayerTrack playertrack)
    {
        if (playertrack == null)
        {
            return false;
        }
        playertrack = (String)playertrack.metadata().get("mft.injection_source");
        return playertrack != null && playertrack.trim().toLowerCase(Locale.ENGLISH).equals("fallback");
    }

    public static boolean isVideo(PlayerTrack playertrack)
    {
        if (playertrack == null)
        {
            return false;
        } else
        {
            return "video".equals((String)playertrack.metadata().get("media.type"));
        }
    }
}
