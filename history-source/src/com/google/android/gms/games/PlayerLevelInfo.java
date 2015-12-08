// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevelInfoCreator, PlayerLevel

public final class PlayerLevelInfo
    implements SafeParcelable
{

    public static final PlayerLevelInfoCreator CREATOR = new PlayerLevelInfoCreator();
    private final int CK;
    private final long Xr;
    private final long Xs;
    private final PlayerLevel Xt;
    private final PlayerLevel Xu;

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
        jx.K(flag);
        jx.i(playerlevel);
        jx.i(playerlevel1);
        CK = i;
        Xr = l;
        Xs = l1;
        Xt = playerlevel;
        Xu = playerlevel1;
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
        if (!jv.equal(Long.valueOf(Xr), Long.valueOf(((PlayerLevelInfo) (obj)).Xr)) || !jv.equal(Long.valueOf(Xs), Long.valueOf(((PlayerLevelInfo) (obj)).Xs)) || !jv.equal(Xt, ((PlayerLevelInfo) (obj)).Xt))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(Xu, ((PlayerLevelInfo) (obj)).Xu)) goto _L4; else goto _L5
_L5:
        return false;
    }

    public PlayerLevel getCurrentLevel()
    {
        return Xt;
    }

    public long getCurrentXpTotal()
    {
        return Xr;
    }

    public long getLastLevelUpTimestamp()
    {
        return Xs;
    }

    public PlayerLevel getNextLevel()
    {
        return Xu;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Long.valueOf(Xr), Long.valueOf(Xs), Xt, Xu
        });
    }

    public boolean isMaxLevel()
    {
        return Xt.equals(Xu);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlayerLevelInfoCreator.a(this, parcel, i);
    }

}
