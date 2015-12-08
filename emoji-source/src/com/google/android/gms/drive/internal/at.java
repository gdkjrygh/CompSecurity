// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.query.Query;

// Referenced classes of package com.google.android.gms.drive.internal:
//            QueryRequest

public class at
    implements android.os.Parcelable.Creator
{

    public at()
    {
    }

    static void a(QueryRequest queryrequest, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, queryrequest.xM);
        b.a(parcel, 2, queryrequest.JE, i, false);
        b.G(parcel, j);
    }

    public QueryRequest au(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        Query query = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    query = (Query)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Query.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new QueryRequest(i, query);
            }
        } while (true);
    }

    public QueryRequest[] bq(int i)
    {
        return new QueryRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return au(parcel);
    }

    public Object[] newArray(int i)
    {
        return bq(i);
    }
}
