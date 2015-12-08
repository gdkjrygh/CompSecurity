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

public final class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(PersonEntity.OrganizationsEntity organizationsentity, Parcel parcel)
    {
        int i = c.a(parcel);
        Set set = organizationsentity.a;
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, organizationsentity.b);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            c.a(parcel, 2, organizationsentity.c, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            c.a(parcel, 3, organizationsentity.d, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            c.a(parcel, 4, organizationsentity.e, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            c.a(parcel, 5, organizationsentity.f, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            c.a(parcel, 6, organizationsentity.g, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            c.a(parcel, 7, organizationsentity.h);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            c.a(parcel, 8, organizationsentity.i, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            c.a(parcel, 9, organizationsentity.j, true);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            c.a(parcel, 10, organizationsentity.k);
        }
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        HashSet hashset = new HashSet();
        String s1 = null;
        boolean flag = false;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
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
                    s6 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    hashset.add(Integer.valueOf(10));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != k)
                {
                    throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
                }
                return new PersonEntity.OrganizationsEntity(hashset, j, s6, s5, s4, s3, s2, flag, s1, s, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PersonEntity.OrganizationsEntity[i];
    }
}
