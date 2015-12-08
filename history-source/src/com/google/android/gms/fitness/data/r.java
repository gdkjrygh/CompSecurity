// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.fitness.data:
//            q, Session, DataSet

public class r
    implements android.os.Parcelable.Creator
{

    public r()
    {
    }

    static void a(q q1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, q1.getSession(), i, false);
        b.c(parcel, 1000, q1.CK);
        b.a(parcel, 2, q1.jH(), i, false);
        b.H(parcel, j);
    }

    public q bD(Parcel parcel)
    {
        DataSet dataset = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        Session session = null;
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
                    session = (Session)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Session.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    dataset = (DataSet)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DataSet.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new q(i, session, dataset);
            }
        } while (true);
    }

    public q[] cX(int i)
    {
        return new q[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bD(parcel);
    }

    public Object[] newArray(int i)
    {
        return cX(i);
    }
}
