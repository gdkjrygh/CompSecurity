// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Map;

public final class ezr
{

    public static String a(PlayerState playerstate, String s)
    {
        return a(playerstate.track(), s);
    }

    public static String a(PlayerTrack playertrack, String s)
    {
        if (playertrack == null)
        {
            return "";
        }
        playertrack = ((PlayerTrack) (playertrack.metadata().get(s)));
        if (playertrack == null)
        {
            playertrack = "";
        }
        return (String)playertrack;
    }

    public static String b(PlayerState playerstate, String s)
    {
        playerstate = ((PlayerState) (playerstate.contextMetadata().get(s)));
        if (playerstate == null)
        {
            playerstate = "";
        }
        return (String)playerstate;
    }
}
