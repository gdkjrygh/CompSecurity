// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            MostRecentGameInfoEntity

public class MostRecentGameInfoEntityCreator
    implements android.os.Parcelable.Creator
{

    public MostRecentGameInfoEntityCreator()
    {
    }

    static void a(MostRecentGameInfoEntity mostrecentgameinfoentity, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.a(parcel, 1, mostrecentgameinfoentity.ip(), false);
        b.c(parcel, 1000, mostrecentgameinfoentity.getVersionCode());
        b.a(parcel, 2, mostrecentgameinfoentity.iq(), false);
        b.a(parcel, 3, mostrecentgameinfoentity.ir());
        b.a(parcel, 4, mostrecentgameinfoentity.is(), i, false);
        b.a(parcel, 5, mostrecentgameinfoentity.it(), i, false);
        b.a(parcel, 6, mostrecentgameinfoentity.iu(), i, false);
        b.G(parcel, j);
    }

    public MostRecentGameInfoEntity bj(Parcel parcel)
    {
        Uri uri = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        long l = 0L;
        Uri uri1 = null;
        Uri uri2 = null;
        String s = null;
        String s1 = null;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 4: // '\004'
                    uri2 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Uri.CREATOR);
                    break;

                case 6: // '\006'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new MostRecentGameInfoEntity(i, s1, s, l, uri2, uri1, uri);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bj(parcel);
    }

    public MostRecentGameInfoEntity[] cu(int i)
    {
        return new MostRecentGameInfoEntity[i];
    }

    public Object[] newArray(int i)
    {
        return cu(i);
    }
}
