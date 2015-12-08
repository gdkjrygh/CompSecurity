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

public final class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(PersonEntity.UrlsEntity urlsentity, Parcel parcel)
    {
        int i = c.a(parcel);
        Set set = urlsentity.a;
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, urlsentity.b);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            c.a(parcel, 3, PersonEntity.UrlsEntity.d());
        }
        if (set.contains(Integer.valueOf(4)))
        {
            c.a(parcel, 4, urlsentity.e, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            c.a(parcel, 5, urlsentity.c, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            c.a(parcel, 6, urlsentity.d);
        }
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        HashSet hashset = new HashSet();
        String s1 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                case 2: // '\002'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.d(parcel, i1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 3: // '\003'
                    com.google.android.gms.common.internal.safeparcel.a.d(parcel, i1);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, i1);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, i1);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, i1);
                    hashset.add(Integer.valueOf(6));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != l)
                {
                    throw new b((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
                }
                return new PersonEntity.UrlsEntity(hashset, k, s1, i, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PersonEntity.UrlsEntity[i];
    }
}
