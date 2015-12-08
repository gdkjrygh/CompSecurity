// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            Leaderboard, LeaderboardVariant, LeaderboardVariantEntity

public final class LeaderboardEntity
    implements Leaderboard
{

    private final String mDisplayName;
    private final Game mGame;
    private final Uri mIconImageUri;
    private final String mIconImageUrl;
    private final String mLeaderboardId;
    private final int mScoreOrder;
    private final ArrayList mVariants;

    public LeaderboardEntity(Leaderboard leaderboard)
    {
        mLeaderboardId = leaderboard.getLeaderboardId();
        mDisplayName = leaderboard.getDisplayName();
        mIconImageUri = leaderboard.getIconImageUri();
        mIconImageUrl = leaderboard.getIconImageUrl();
        mScoreOrder = leaderboard.getScoreOrder();
        Object obj = leaderboard.getGame();
        int j;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new GameEntity(((Game) (obj)));
        }
        mGame = ((Game) (obj));
        leaderboard = leaderboard.getVariants();
        j = leaderboard.size();
        mVariants = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            mVariants.add((LeaderboardVariantEntity)((LeaderboardVariant)leaderboard.get(i)).freeze());
        }

    }

    static boolean equals(Leaderboard leaderboard, Object obj)
    {
        if (obj instanceof Leaderboard)
        {
            if (leaderboard == obj)
            {
                return true;
            }
            obj = (Leaderboard)obj;
            if (Objects.equal(((Leaderboard) (obj)).getLeaderboardId(), leaderboard.getLeaderboardId()) && Objects.equal(((Leaderboard) (obj)).getDisplayName(), leaderboard.getDisplayName()) && Objects.equal(((Leaderboard) (obj)).getIconImageUri(), leaderboard.getIconImageUri()) && Objects.equal(Integer.valueOf(((Leaderboard) (obj)).getScoreOrder()), Integer.valueOf(leaderboard.getScoreOrder())) && Objects.equal(((Leaderboard) (obj)).getVariants(), leaderboard.getVariants()))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(Leaderboard leaderboard)
    {
        return Arrays.hashCode(new Object[] {
            leaderboard.getLeaderboardId(), leaderboard.getDisplayName(), leaderboard.getIconImageUri(), Integer.valueOf(leaderboard.getScoreOrder()), leaderboard.getVariants()
        });
    }

    static String toString(Leaderboard leaderboard)
    {
        return Objects.toStringHelper(leaderboard).add("LeaderboardId", leaderboard.getLeaderboardId()).add("DisplayName", leaderboard.getDisplayName()).add("IconImageUri", leaderboard.getIconImageUri()).add("IconImageUrl", leaderboard.getIconImageUrl()).add("ScoreOrder", Integer.valueOf(leaderboard.getScoreOrder())).add("Variants", leaderboard.getVariants()).toString();
    }

    public final boolean equals(Object obj)
    {
        return equals(((Leaderboard) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final String getDisplayName()
    {
        return mDisplayName;
    }

    public final void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        DataUtils.copyStringToBuffer(mDisplayName, chararraybuffer);
    }

    public final Game getGame()
    {
        return mGame;
    }

    public final Uri getIconImageUri()
    {
        return mIconImageUri;
    }

    public final String getIconImageUrl()
    {
        return mIconImageUrl;
    }

    public final String getLeaderboardId()
    {
        return mLeaderboardId;
    }

    public final int getScoreOrder()
    {
        return mScoreOrder;
    }

    public final ArrayList getVariants()
    {
        return new ArrayList(mVariants);
    }

    public final int hashCode()
    {
        return hashCode(((Leaderboard) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return toString(((Leaderboard) (this)));
    }
}
