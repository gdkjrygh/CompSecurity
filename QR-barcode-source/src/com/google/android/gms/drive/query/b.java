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
        i = com.google.android.gms.common.internal.safeparcel.b.D(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1000, sortorder.BR);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, sortorder.QI, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, sortorder.QJ);
        com.google.android.gms.common.internal.safeparcel.b.H(parcel, i);
    }

    public SortOrder aJ(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(k))
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

    public SortOrder[] bV(int i)
    {
        return new SortOrder[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aJ(parcel);
    }

    public Object[] newArray(int i)
    {
        return bV(i);
    }
}
