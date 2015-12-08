// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevelInfoCreator, PlayerLevel

public final class PlayerLevelInfo
    implements SafeParcelable
{

    public static final PlayerLevelInfoCreator CREATOR = new PlayerLevelInfoCreator();
    private final long Nc;
    private final long Nd;
    private final PlayerLevel Ne;
    private final PlayerLevel Nf;
    private final int xM;

    PlayerLevelInfo(int i, long l, long l1, PlayerLevel playerlevel, PlayerLevel playerlevel1)
    {
        boolean flag;
        if (l != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.A(flag);
        hm.f(playerlevel);
        hm.f(playerlevel1);
        xM = i;
        Nc = l;
        Nd = l1;
        Ne = playerlevel;
        Nf = playerlevel1;
    }

    public PlayerLevelInfo(long l, long l1, PlayerLevel playerlevel, PlayerLevel playerlevel1)
    {
        this(1, l, l1, playerlevel, playerlevel1);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof PlayerLevelInfo) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == this) goto _L4; else goto _L3
_L3:
        obj = (PlayerLevelInfo)obj;
        if (!hk.equal(Long.valueOf(Nc), Long.valueOf(((PlayerLevelInfo) (obj)).Nc)) || !hk.equal(Long.valueOf(Nd), Long.valueOf(((PlayerLevelInfo) (obj)).Nd)) || !hk.equal(Ne, ((PlayerLevelInfo) (obj)).Ne))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(Nf, ((PlayerLevelInfo) (obj)).Nf)) goto _L4; else goto _L5
_L5:
        return false;
    }

    public PlayerLevel getCurrentLevel()
    {
        return Ne;
    }

    public long getCurrentXpTotal()
    {
        return Nc;
    }

    public long getLastLevelUpTimestamp()
    {
        return Nd;
    }

    public PlayerLevel getNextLevel()
    {
        return Nf;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public int hashCode()
    {
        return hk.hashCode(new Object[] {
            Long.valueOf(Nc), Long.valueOf(Nd), Ne, Nf
        });
    }

    public boolean isMaxLevel()
    {
        return Ne.equals(Nf);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlayerLevelInfoCreator.a(this, parcel, i);
    }

}
