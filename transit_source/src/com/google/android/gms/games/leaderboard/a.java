// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.b;
import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.dl;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            Leaderboard, e

public final class a extends b
    implements Leaderboard
{

    private final int nu;

    a(d d, int i, int j)
    {
        super(d, i);
        nu = j;
    }

    public String getDisplayName()
    {
        return getString("name");
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        a("name", chararraybuffer);
    }

    public Uri getIconImageUri()
    {
        return u("board_icon_image_uri");
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
        ArrayList arraylist = new ArrayList(nu);
        for (int i = 0; i < nu; i++)
        {
            arraylist.add(new e(jf, ji + i));
        }

        return arraylist;
    }

    public String toString()
    {
        return dl.d(this).a("ID", getLeaderboardId()).a("DisplayName", getDisplayName()).a("IconImageURI", getIconImageUri()).a("ScoreOrder", Integer.valueOf(getScoreOrder())).toString();
    }
}
