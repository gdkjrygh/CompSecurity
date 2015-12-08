// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(PersonEntity.CoverEntity coverentity, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        Set set = coverentity.a;
        if (set.contains(Integer.valueOf(1)))
        {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, coverentity.b);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, coverentity.c, i, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, coverentity.d, i, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, coverentity.e);
        }
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        PersonEntity.CoverEntity.CoverPhotoEntity coverphotoentity = null;
        int i = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        HashSet hashset = new HashSet();
        PersonEntity.CoverEntity.CoverInfoEntity coverinfoentity = null;
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
                    coverinfoentity = (PersonEntity.CoverEntity.CoverInfoEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, PersonEntity.CoverEntity.CoverInfoEntity.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    coverphotoentity = (PersonEntity.CoverEntity.CoverPhotoEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, PersonEntity.CoverEntity.CoverPhotoEntity.CREATOR);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    hashset.add(Integer.valueOf(4));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != k)
                {
                    throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
                }
                return new PersonEntity.CoverEntity(hashset, j, coverinfoentity, coverphotoentity, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PersonEntity.CoverEntity[i];
    }
}
