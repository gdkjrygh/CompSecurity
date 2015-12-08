// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Map;

public final class fet
{

    public fet()
    {
    }

    public static long a(PlayerTrack playertrack)
    {
        playertrack = (String)playertrack.metadata().get("duration");
        if (playertrack != null)
        {
            return Long.parseLong(playertrack);
        } else
        {
            return -1L;
        }
    }
}
