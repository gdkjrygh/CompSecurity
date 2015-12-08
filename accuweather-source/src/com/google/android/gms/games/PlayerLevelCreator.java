// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevel

public class PlayerLevelCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public PlayerLevelCreator()
    {
    }

    static void a(PlayerLevel playerlevel, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, playerlevel.getLevelNumber());
        b.c(parcel, 1000, playerlevel.getVersionCode());
        b.a(parcel, 2, playerlevel.getMinXp());
        b.a(parcel, 3, playerlevel.getMaxXp());
        b.G(parcel, i);
    }

    public PlayerLevel createFromParcel(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        long l2 = 0L;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new PlayerLevel(j, i, l2, l1);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public PlayerLevel[] newArray(int i)
    {
        return new PlayerLevel[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
