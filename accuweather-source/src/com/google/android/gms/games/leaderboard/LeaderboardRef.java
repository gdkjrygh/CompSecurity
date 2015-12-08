// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            Leaderboard, LeaderboardEntity, LeaderboardVariantRef

public final class LeaderboardRef extends d
    implements Leaderboard
{

    private final int RD;
    private final Game Sp;

    LeaderboardRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        RD = j;
        Sp = new GameRef(dataholder, i);
    }

    public boolean equals(Object obj)
    {
        return LeaderboardEntity.a(this, obj);
    }

    public Object freeze()
    {
        return iu();
    }

    public String getDisplayName()
    {
        return getString("name");
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        a("name", chararraybuffer);
    }

    public Game getGame()
    {
        return Sp;
    }

    public Uri getIconImageUri()
    {
        return aw("board_icon_image_uri");
    }

    public String getIconImageUrl()
    {
        return getString("board_icon_image_url");
    }

    public String getLeaderboardId()
    {
        return getString("external_leaderboard_id");
    }

    public int getScoreOrder()
    {
        return getInteger("score_order");
    }

    public ArrayList getVariants()
    {
        ArrayList arraylist = new ArrayList(RD);
        for (int i = 0; i < RD; i++)
        {
            arraylist.add(new LeaderboardVariantRef(DD, Ez + i));
        }

        return arraylist;
    }

    public int hashCode()
    {
        return LeaderboardEntity.a(this);
    }

    public Leaderboard iu()
    {
        return new LeaderboardEntity(this);
    }

    public String toString()
    {
        return LeaderboardEntity.b(this);
    }
}
