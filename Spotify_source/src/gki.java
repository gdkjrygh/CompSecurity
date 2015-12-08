// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

public class gki
    implements dmx
{

    public gki()
    {
    }

    public static gkh a(Context context, gkd gkd, PlayerTrack playertrack)
    {
        if (PlayerTrackUtil.isAd(playertrack) && PlayerTrackUtil.hasAdId(playertrack))
        {
            return new efo(context, gkd);
        } else
        {
            return new gkh(context, gkd);
        }
    }
}
