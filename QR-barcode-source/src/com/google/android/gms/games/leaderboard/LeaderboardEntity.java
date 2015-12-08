// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.jv;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            Leaderboard, LeaderboardVariant, LeaderboardVariantEntity

public final class LeaderboardEntity
    implements Leaderboard
{

    private final String NH;
    private final Uri Vh;
    private final String Vs;
    private final String abu;
    private final int abv;
    private final ArrayList abw;
    private final Game abx;

    public LeaderboardEntity(Leaderboard leaderboard)
    {
        abu = leaderboard.getLeaderboardId();
        NH = leaderboard.getDisplayName();
        Vh = leaderboard.getIconImageUri();
        Vs = leaderboard.getIconImageUrl();
        abv = leaderboard.getScoreOrder();
        Object obj = leaderboard.getGame();
        int j;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new GameEntity(((Game) (obj)));
        }
        abx = ((Game) (obj));
        leaderboard = leaderboard.getVariants();
        j = leaderboard.size();
        abw = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            abw.add((LeaderboardVariantEntity)(LeaderboardVariantEntity)((LeaderboardVariant)leaderboard.get(i)).freeze());
        }

    }

    static int a(Leaderboard leaderboard)
    {
        return n.hashCode(new Object[] {
            leaderboard.getLeaderboardId(), leaderboard.getDisplayName(), leaderboard.getIconImageUri(), Integer.valueOf(leaderboard.getScoreOrder()), leaderboard.getVariants()
        });
    }

    static boolean a(Leaderboard leaderboard, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Leaderboard) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (leaderboard == obj) goto _L4; else goto _L3
_L3:
        obj = (Leaderboard)obj;
        if (!n.equal(((Leaderboard) (obj)).getLeaderboardId(), leaderboard.getLeaderboardId()) || !n.equal(((Leaderboard) (obj)).getDisplayName(), leaderboard.getDisplayName()) || !n.equal(((Leaderboard) (obj)).getIconImageUri(), leaderboard.getIconImageUri()) || !n.equal(Integer.valueOf(((Leaderboard) (obj)).getScoreOrder()), Integer.valueOf(leaderboard.getScoreOrder())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(((Leaderboard) (obj)).getVariants(), leaderboard.getVariants())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Leaderboard leaderboard)
    {
        return n.h(leaderboard).a("LeaderboardId", leaderboard.getLeaderboardId()).a("DisplayName", leaderboard.getDisplayName()).a("IconImageUri", leaderboard.getIconImageUri()).a("IconImageUrl", leaderboard.getIconImageUrl()).a("ScoreOrder", Integer.valueOf(leaderboard.getScoreOrder())).a("Variants", leaderboard.getVariants()).toString();
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return lz();
    }

    public String getDisplayName()
    {
        return NH;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        jv.b(NH, chararraybuffer);
    }

    public Game getGame()
    {
        return abx;
    }

    public Uri getIconImageUri()
    {
        return Vh;
    }

    public String getIconImageUrl()
    {
        return Vs;
    }

    public String getLeaderboardId()
    {
        return abu;
    }

    public int getScoreOrder()
    {
        return abv;
    }

    public ArrayList getVariants()
    {
        return new ArrayList(abw);
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public Leaderboard lz()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }
}
