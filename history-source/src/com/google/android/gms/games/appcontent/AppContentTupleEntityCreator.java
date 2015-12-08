// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentTupleEntity

public class AppContentTupleEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentTupleEntityCreator()
    {
    }

    static void a(AppContentTupleEntity appcontenttupleentity, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.a(parcel, 1, appcontenttupleentity.getName(), false);
        b.c(parcel, 1000, appcontenttupleentity.getVersionCode());
        b.a(parcel, 2, appcontenttupleentity.getValue(), false);
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cs(parcel);
    }

    public AppContentTupleEntity cs(Parcel parcel)
    {
        String s1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new AppContentTupleEntity(i, s, s1);
            }
        } while (true);
    }

    public AppContentTupleEntity[] dN(int i)
    {
        return new AppContentTupleEntity[i];
    }

    public Object[] newArray(int i)
    {
        return dN(i);
    }
}
