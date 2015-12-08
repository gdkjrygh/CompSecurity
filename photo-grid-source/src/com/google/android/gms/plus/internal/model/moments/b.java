// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.moments:
//            MomentEntity, ItemScopeEntity

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(MomentEntity momententity, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        Set set = momententity.a;
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, momententity.b);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            c.a(parcel, 2, momententity.c, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            c.a(parcel, 4, momententity.d, i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            c.a(parcel, 5, momententity.e, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            c.a(parcel, 6, momententity.f, i, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            c.a(parcel, 7, momententity.g, true);
        }
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        ItemScopeEntity itemscopeentity = null;
        String s1 = null;
        ItemScopeEntity itemscopeentity1 = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 3: // '\003'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 4: // '\004'
                    itemscopeentity1 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    itemscopeentity = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new MomentEntity(hashset, i, s2, itemscopeentity1, s1, itemscopeentity, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new MomentEntity[i];
    }
}
