// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hl;
import com.google.android.gms.internal.hn;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevelCreator

public final class PlayerLevel
    implements SafeParcelable
{

    public static final PlayerLevelCreator CREATOR = new PlayerLevelCreator();
    private final int MW;
    private final long MX;
    private final long MY;
    private final int xJ;

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
        hn.a(flag, "Min XP must be positive!");
        if (l1 > l)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        hn.a(flag, "Max XP must be more than min XP!");
        xJ = i;
        MW = j;
        MX = l;
        MY = l1;
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
        if (!hl.equal(Integer.valueOf(((PlayerLevel) (obj)).getLevelNumber()), Integer.valueOf(getLevelNumber())) || !hl.equal(Long.valueOf(((PlayerLevel) (obj)).getMinXp()), Long.valueOf(getMinXp())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hl.equal(Long.valueOf(((PlayerLevel) (obj)).getMaxXp()), Long.valueOf(getMaxXp()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int getLevelNumber()
    {
        return MW;
    }

    public long getMaxXp()
    {
        return MY;
    }

    public long getMinXp()
    {
        return MX;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
            Integer.valueOf(MW), Long.valueOf(MX), Long.valueOf(MY)
        });
    }

    public String toString()
    {
        return hl.e(this).a("LevelNumber", Integer.valueOf(getLevelNumber())).a("MinXp", Long.valueOf(getMinXp())).a("MaxXp", Long.valueOf(getMaxXp())).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlayerLevelCreator.a(this, parcel, i);
    }

}
