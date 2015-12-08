// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hl;
import com.google.android.gms.internal.hn;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevelInfoCreator, PlayerLevel

public final class PlayerLevelInfo
    implements SafeParcelable
{

    public static final PlayerLevelInfoCreator CREATOR = new PlayerLevelInfoCreator();
    private final long MZ;
    private final long Na;
    private final PlayerLevel Nb;
    private final PlayerLevel Nc;
    private final int xJ;

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
        hn.A(flag);
        hn.f(playerlevel);
        hn.f(playerlevel1);
        xJ = i;
        MZ = l;
        Na = l1;
        Nb = playerlevel;
        Nc = playerlevel1;
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
        if (!hl.equal(Long.valueOf(MZ), Long.valueOf(((PlayerLevelInfo) (obj)).MZ)) || !hl.equal(Long.valueOf(Na), Long.valueOf(((PlayerLevelInfo) (obj)).Na)) || !hl.equal(Nb, ((PlayerLevelInfo) (obj)).Nb))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hl.equal(Nc, ((PlayerLevelInfo) (obj)).Nc)) goto _L4; else goto _L5
_L5:
        return false;
    }

    public PlayerLevel getCurrentLevel()
    {
        return Nb;
    }

    public long getCurrentXpTotal()
    {
        return MZ;
    }

    public long getLastLevelUpTimestamp()
    {
        return Na;
    }

    public PlayerLevel getNextLevel()
    {
        return Nc;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
            Long.valueOf(MZ), Long.valueOf(Na), Nb, Nc
        });
    }

    public boolean isMaxLevel()
    {
        return Nb.equals(Nc);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlayerLevelInfoCreator.a(this, parcel, i);
    }

}
