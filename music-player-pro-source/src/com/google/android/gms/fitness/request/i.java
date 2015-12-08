// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.Field;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataTypeCreateRequest

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(DataTypeCreateRequest datatypecreaterequest, Parcel parcel, int j)
    {
        j = b.H(parcel);
        b.a(parcel, 1, datatypecreaterequest.getName(), false);
        b.c(parcel, 1000, datatypecreaterequest.getVersionCode());
        b.c(parcel, 2, datatypecreaterequest.getFields(), false);
        b.H(parcel, j);
    }

    public DataTypeCreateRequest bN(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int j = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, Field.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new DataTypeCreateRequest(j, s, arraylist);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bN(parcel);
    }

    public DataTypeCreateRequest[] dh(int j)
    {
        return new DataTypeCreateRequest[j];
    }

    public Object[] newArray(int j)
    {
        return dh(j);
    }
}
