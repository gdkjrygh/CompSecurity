// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevelCreator

public final class PlayerLevel
    implements SafeParcelable
{

    public static final PlayerLevelCreator CREATOR = new PlayerLevelCreator();
    private final int BR;
    private final int VR;
    private final long VS;
    private final long VT;

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
        o.a(flag, "Min XP must be positive!");
        if (l1 > l)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.a(flag, "Max XP must be more than min XP!");
        BR = i;
        VR = j;
        VS = l;
        VT = l1;
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
        if (!n.equal(Integer.valueOf(((PlayerLevel) (obj)).getLevelNumber()), Integer.valueOf(getLevelNumber())) || !n.equal(Long.valueOf(((PlayerLevel) (obj)).getMinXp()), Long.valueOf(getMinXp())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(Long.valueOf(((PlayerLevel) (obj)).getMaxXp()), Long.valueOf(getMaxXp()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int getLevelNumber()
    {
        return VR;
    }

    public long getMaxXp()
    {
        return VT;
    }

    public long getMinXp()
    {
        return VS;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Integer.valueOf(VR), Long.valueOf(VS), Long.valueOf(VT)
        });
    }

    public String toString()
    {
        return n.h(this).a("LevelNumber", Integer.valueOf(getLevelNumber())).a("MinXp", Long.valueOf(getMinXp())).a("MaxXp", Long.valueOf(getMaxXp())).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlayerLevelCreator.a(this, parcel, i);
    }

}
