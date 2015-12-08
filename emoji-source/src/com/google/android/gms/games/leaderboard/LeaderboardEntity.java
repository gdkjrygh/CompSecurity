// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.ik;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            Leaderboard, LeaderboardVariant, LeaderboardVariantEntity

public final class LeaderboardEntity
    implements Leaderboard
{

    private final String Ln;
    private final String MC;
    private final Uri Mr;
    private final String Sp;
    private final int Sq;
    private final ArrayList Sr;
    private final Game Ss;

    public LeaderboardEntity(Leaderboard leaderboard)
    {
        Sp = leaderboard.getLeaderboardId();
        Ln = leaderboard.getDisplayName();
        Mr = leaderboard.getIconImageUri();
        MC = leaderboard.getIconImageUrl();
        Sq = leaderboard.getScoreOrder();
        Object obj = leaderboard.getGame();
        int j;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new GameEntity(((Game) (obj)));
        }
        Ss = ((Game) (obj));
        leaderboard = leaderboard.getVariants();
        j = leaderboard.size();
        Sr = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            Sr.add((LeaderboardVariantEntity)(LeaderboardVariantEntity)((LeaderboardVariant)leaderboard.get(i)).freeze());
        }

    }

    static int a(Leaderboard leaderboard)
    {
        return hk.hashCode(new Object[] {
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
        if (!hk.equal(((Leaderboard) (obj)).getLeaderboardId(), leaderboard.getLeaderboardId()) || !hk.equal(((Leaderboard) (obj)).getDisplayName(), leaderboard.getDisplayName()) || !hk.equal(((Leaderboard) (obj)).getIconImageUri(), leaderboard.getIconImageUri()) || !hk.equal(Integer.valueOf(((Leaderboard) (obj)).getScoreOrder()), Integer.valueOf(leaderboard.getScoreOrder())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(((Leaderboard) (obj)).getVariants(), leaderboard.getVariants())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Leaderboard leaderboard)
    {
        return hk.e(leaderboard).a("LeaderboardId", leaderboard.getLeaderboardId()).a("DisplayName", leaderboard.getDisplayName()).a("IconImageUri", leaderboard.getIconImageUri()).a("IconImageUrl", leaderboard.getIconImageUrl()).a("ScoreOrder", Integer.valueOf(leaderboard.getScoreOrder())).a("Variants", leaderboard.getVariants()).toString();
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return iz();
    }

    public String getDisplayName()
    {
        return Ln;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        ik.b(Ln, chararraybuffer);
    }

    public Game getGame()
    {
        return Ss;
    }

    public Uri getIconImageUri()
    {
        return Mr;
    }

    public String getIconImageUrl()
    {
        return MC;
    }

    public String getLeaderboardId()
    {
        return Sp;
    }

    public int getScoreOrder()
    {
        return Sq;
    }

    public ArrayList getVariants()
    {
        return new ArrayList(Sr);
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public Leaderboard iz()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }
}
