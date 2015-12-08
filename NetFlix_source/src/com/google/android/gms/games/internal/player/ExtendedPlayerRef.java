// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.b;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            ExtendedPlayer, ExtendedPlayerEntity

public final class ExtendedPlayerRef extends b
    implements ExtendedPlayer
{

    private final PlayerRef LL;

    ExtendedPlayerRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        LL = new PlayerRef(dataholder, i);
    }

    public Object freeze()
    {
        return hy();
    }

    public Player getPlayer()
    {
        return LL;
    }

    public String hu()
    {
        return getString("most_recent_external_game_id");
    }

    public long hv()
    {
        return getLong("most_recent_activity_timestamp");
    }

    public Uri hw()
    {
        return ah("game_icon_image_uri");
    }

    public ExtendedPlayer hy()
    {
        return new ExtendedPlayerEntity(this);
    }
}
