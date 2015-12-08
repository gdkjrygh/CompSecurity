// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            Leaderboard, LeaderboardEntity, LeaderboardVariantRef

public final class LeaderboardRef extends DataBufferRef
    implements Leaderboard
{

    private final Game mGame;
    private final int mNumChildren;

    LeaderboardRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        mNumChildren = j;
        mGame = new GameRef(dataholder, i);
    }

    public final boolean equals(Object obj)
    {
        return LeaderboardEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return new LeaderboardEntity(this);
    }

    public final String getDisplayName()
    {
        return getString("name");
    }

    public final void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        copyToBuffer("name", chararraybuffer);
    }

    public final Game getGame()
    {
        return mGame;
    }

    public final Uri getIconImageUri()
    {
        return parseUri("board_icon_image_uri");
    }

    public final String getIconImageUrl()
    {
        return getString("board_icon_image_url");
    }

    public final String getLeaderboardId()
    {
        return getString("external_leaderboard_id");
    }

    public final int getScoreOrder()
    {
        return getInteger("score_order");
    }

    public final ArrayList getVariants()
    {
        ArrayList arraylist = new ArrayList(mNumChildren);
        for (int i = 0; i < mNumChildren; i++)
        {
            arraylist.add(new LeaderboardVariantRef(mDataHolder, mDataRow + i));
        }

        return arraylist;
    }

    public final int hashCode()
    {
        return LeaderboardEntity.hashCode(this);
    }

    public final String toString()
    {
        return LeaderboardEntity.toString(this);
    }
}
