// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevelInfoCreator, PlayerLevel

public final class PlayerLevelInfo
    implements SafeParcelable
{

    public static final PlayerLevelInfoCreator CREATOR = new PlayerLevelInfoCreator();
    private final int BR;
    private final long VU;
    private final long VV;
    private final PlayerLevel VW;
    private final PlayerLevel VX;

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
        o.I(flag);
        o.i(playerlevel);
        o.i(playerlevel1);
        BR = i;
        VU = l;
        VV = l1;
        VW = playerlevel;
        VX = playerlevel1;
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
        if (!n.equal(Long.valueOf(VU), Long.valueOf(((PlayerLevelInfo) (obj)).VU)) || !n.equal(Long.valueOf(VV), Long.valueOf(((PlayerLevelInfo) (obj)).VV)) || !n.equal(VW, ((PlayerLevelInfo) (obj)).VW))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(VX, ((PlayerLevelInfo) (obj)).VX)) goto _L4; else goto _L5
_L5:
        return false;
    }

    public PlayerLevel getCurrentLevel()
    {
        return VW;
    }

    public long getCurrentXpTotal()
    {
        return VU;
    }

    public long getLastLevelUpTimestamp()
    {
        return VV;
    }

    public PlayerLevel getNextLevel()
    {
        return VX;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Long.valueOf(VU), Long.valueOf(VV), VW, VX
        });
    }

    public boolean isMaxLevel()
    {
        return VW.equals(VX);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlayerLevelInfoCreator.a(this, parcel, i);
    }

}
