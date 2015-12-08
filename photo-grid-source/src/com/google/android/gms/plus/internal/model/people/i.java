// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.HashSet;
import java.util.Set;

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(PersonEntity.PlacesLivedEntity placeslivedentity, Parcel parcel)
    {
        int j = c.a(parcel);
        Set set = placeslivedentity.a;
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, placeslivedentity.b);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            c.a(parcel, 2, placeslivedentity.c);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            c.a(parcel, 3, placeslivedentity.d, true);
        }
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        HashSet hashset = new HashSet();
        String s = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(3));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != k)
                {
                    throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
                }
                return new PersonEntity.PlacesLivedEntity(hashset, j, flag, s);
            }
        } while (true);
    }

    public final Object[] newArray(int j)
    {
        return new PersonEntity.PlacesLivedEntity[j];
    }
}
