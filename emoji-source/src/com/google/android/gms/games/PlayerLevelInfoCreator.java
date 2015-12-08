// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevelInfo, PlayerLevel

public class PlayerLevelInfoCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public PlayerLevelInfoCreator()
    {
    }

    static void a(PlayerLevelInfo playerlevelinfo, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.a(parcel, 1, playerlevelinfo.getCurrentXpTotal());
        b.c(parcel, 1000, playerlevelinfo.getVersionCode());
        b.a(parcel, 2, playerlevelinfo.getLastLevelUpTimestamp());
        b.a(parcel, 3, playerlevelinfo.getCurrentLevel(), i, false);
        b.a(parcel, 4, playerlevelinfo.getNextLevel(), i, false);
        b.G(parcel, j);
    }

    public PlayerLevelInfo createFromParcel(Parcel parcel)
    {
        long l = 0L;
        PlayerLevel playerlevel = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        PlayerLevel playerlevel1 = null;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 3: // '\003'
                    playerlevel1 = (PlayerLevel)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, PlayerLevel.CREATOR);
                    break;

                case 4: // '\004'
                    playerlevel = (PlayerLevel)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, PlayerLevel.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PlayerLevelInfo(i, l1, l, playerlevel1, playerlevel);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public PlayerLevelInfo[] newArray(int i)
    {
        return new PlayerLevelInfo[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
