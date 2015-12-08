// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevelCreator

public final class PlayerLevel
    implements SafeParcelable
{

    public static final PlayerLevelCreator CREATOR = new PlayerLevelCreator();
    private final int MZ;
    private final long Na;
    private final long Nb;
    private final int xM;

    PlayerLevel(int i, int j, long l, long l1)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.a(flag, "Min XP must be positive!");
        if (l1 > l)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        hm.a(flag, "Max XP must be more than min XP!");
        xM = i;
        MZ = j;
        Na = l;
        Nb = l1;
    }

    public PlayerLevel(int i, long l, long l1)
    {
        this(1, i, l, l1);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof PlayerLevel) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (this == obj) goto _L4; else goto _L3
_L3:
        obj = (PlayerLevel)obj;
        if (!hk.equal(Integer.valueOf(((PlayerLevel) (obj)).getLevelNumber()), Integer.valueOf(getLevelNumber())) || !hk.equal(Long.valueOf(((PlayerLevel) (obj)).getMinXp()), Long.valueOf(getMinXp())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(Long.valueOf(((PlayerLevel) (obj)).getMaxXp()), Long.valueOf(getMaxXp()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int getLevelNumber()
    {
        return MZ;
    }

    public long getMaxXp()
    {
        return Nb;
    }

    public long getMinXp()
    {
        return Na;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public int hashCode()
    {
        return hk.hashCode(new Object[] {
            Integer.valueOf(MZ), Long.valueOf(Na), Long.valueOf(Nb)
        });
    }

    public String toString()
    {
        return hk.e(this).a("LevelNumber", Integer.valueOf(getLevelNumber())).a("MinXp", Long.valueOf(getMinXp())).a("MaxXp", Long.valueOf(getMaxXp())).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlayerLevelCreator.a(this, parcel, i);
    }

}
