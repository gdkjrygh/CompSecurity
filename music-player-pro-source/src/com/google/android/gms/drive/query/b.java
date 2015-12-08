// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;

// Referenced classes of package com.google.android.gms.drive.query:
//            SortOrder

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(SortOrder sortorder, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.b.H(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1000, sortorder.CK);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, sortorder.Sf, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, sortorder.Sg);
        com.google.android.gms.common.internal.safeparcel.b.H(parcel, i);
    }

    public SortOrder aR(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
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

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 1: // '\001'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, FieldWithSortOrder.CREATOR);
                    break;

                case 2: // '\002'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new SortOrder(i, arraylist, flag);
            }
        } while (true);
    }

    public SortOrder[] cg(int i)
    {
        return new SortOrder[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aR(parcel);
    }

    public Object[] newArray(int i)
    {
        return cg(i);
    }
}
