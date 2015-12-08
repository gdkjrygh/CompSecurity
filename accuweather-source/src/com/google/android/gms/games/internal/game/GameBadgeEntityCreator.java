// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameBadgeEntity

public class GameBadgeEntityCreator
    implements android.os.Parcelable.Creator
{

    public GameBadgeEntityCreator()
    {
    }

    static void a(GameBadgeEntity gamebadgeentity, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, gamebadgeentity.getType());
        b.c(parcel, 1000, gamebadgeentity.getVersionCode());
        b.a(parcel, 2, gamebadgeentity.getTitle(), false);
        b.a(parcel, 3, gamebadgeentity.getDescription(), false);
        b.a(parcel, 4, gamebadgeentity.getIconImageUri(), i, false);
        b.G(parcel, j);
    }

    public GameBadgeEntity bh(Parcel parcel)
    {
        int i = 0;
        Uri uri = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        String s = null;
        String s1 = null;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 4: // '\004'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new GameBadgeEntity(j, i, s1, s, uri);
            }
        } while (true);
    }

    public GameBadgeEntity[] cq(int i)
    {
        return new GameBadgeEntity[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bh(parcel);
    }

    public Object[] newArray(int i)
    {
        return cq(i);
    }
}
