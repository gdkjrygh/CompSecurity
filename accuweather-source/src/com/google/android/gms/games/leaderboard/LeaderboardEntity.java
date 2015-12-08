// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.hl;
import com.google.android.gms.internal.il;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            Leaderboard, LeaderboardVariant, LeaderboardVariantEntity

public final class LeaderboardEntity
    implements Leaderboard
{

    private final String Lk;
    private final Uri Mo;
    private final String Mz;
    private final String Sm;
    private final int Sn;
    private final ArrayList So;
    private final Game Sp;

    public LeaderboardEntity(Leaderboard leaderboard)
    {
        Sm = leaderboard.getLeaderboardId();
        Lk = leaderboard.getDisplayName();
        Mo = leaderboard.getIconImageUri();
        Mz = leaderboard.getIconImageUrl();
        Sn = leaderboard.getScoreOrder();
        Object obj = leaderboard.getGame();
        int j;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new GameEntity(((Game) (obj)));
        }
        Sp = ((Game) (obj));
        leaderboard = leaderboard.getVariants();
        j = leaderboard.size();
        So = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            So.add((LeaderboardVariantEntity)(LeaderboardVariantEntity)((LeaderboardVariant)leaderboard.get(i)).freeze());
        }

    }

    static int a(Leaderboard leaderboard)
    {
        return hl.hashCode(new Object[] {
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
        if (!hl.equal(((Leaderboard) (obj)).getLeaderboardId(), leaderboard.getLeaderboardId()) || !hl.equal(((Leaderboard) (obj)).getDisplayName(), leaderboard.getDisplayName()) || !hl.equal(((Leaderboard) (obj)).getIconImageUri(), leaderboard.getIconImageUri()) || !hl.equal(Integer.valueOf(((Leaderboard) (obj)).getScoreOrder()), Integer.valueOf(leaderboard.getScoreOrder())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hl.equal(((Leaderboard) (obj)).getVariants(), leaderboard.getVariants())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Leaderboard leaderboard)
    {
        return hl.e(leaderboard).a("LeaderboardId", leaderboard.getLeaderboardId()).a("DisplayName", leaderboard.getDisplayName()).a("IconImageUri", leaderboard.getIconImageUri()).a("IconImageUrl", leaderboard.getIconImageUrl()).a("ScoreOrder", Integer.valueOf(leaderboard.getScoreOrder())).a("Variants", leaderboard.getVariants()).toString();
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return iu();
    }

    public String getDisplayName()
    {
        return Lk;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        il.b(Lk, chararraybuffer);
    }

    public Game getGame()
    {
        return Sp;
    }

    public Uri getIconImageUri()
    {
        return Mo;
    }

    public String getIconImageUrl()
    {
        return Mz;
    }

    public String getLeaderboardId()
    {
        return Sm;
    }

    public int getScoreOrder()
    {
        return Sn;
    }

    public ArrayList getVariants()
    {
        return new ArrayList(So);
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public Leaderboard iu()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }
}
