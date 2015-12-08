// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.query.internal.LogicalFilter;

// Referenced classes of package com.google.android.gms.drive.query:
//            Query, SortOrder

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(Query query, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1000, query.xM);
        b.a(parcel, 1, query.KE, i, false);
        b.a(parcel, 3, query.KF, false);
        b.a(parcel, 4, query.KG, i, false);
        b.G(parcel, j);
    }

    public Query aD(Parcel parcel)
    {
        SortOrder sortorder;
        Object obj;
        Object obj1;
        int i;
        int j;
        sortorder = null;
        j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        i = 0;
        obj1 = null;
        obj = null;
_L7:
        int k;
        if (parcel.dataPosition() >= j)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
        com.google.android.gms.common.internal.safeparcel.a.ar(k);
        JVM INSTR lookupswitch 4: default 80
    //                   1: 130
    //                   3: 154
    //                   4: 171
    //                   1000: 109;
           goto _L1 _L2 _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_171;
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
        Object obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L8:
        Object obj3 = obj1;
        obj1 = obj;
        obj = obj3;
        if (true) goto _L7; else goto _L6
_L6:
        i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
        Object obj4 = obj;
        obj = obj1;
        obj1 = obj4;
          goto _L8
_L2:
        LogicalFilter logicalfilter = (LogicalFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LogicalFilter.CREATOR);
        obj = obj1;
        obj1 = logicalfilter;
          goto _L8
_L3:
        String s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
        obj1 = obj;
        obj = s;
          goto _L8
        sortorder = (SortOrder)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, SortOrder.CREATOR);
        Object obj5 = obj;
        obj = obj1;
        obj1 = obj5;
          goto _L8
        if (parcel.dataPosition() != j)
        {
            throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            return new Query(i, ((LogicalFilter) (obj)), ((String) (obj1)), sortorder);
        }
    }

    public Query[] bz(int i)
    {
        return new Query[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aD(parcel);
    }

    public Object[] newArray(int i)
    {
        return bz(i);
    }
}
