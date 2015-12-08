// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnListParentsResponse

public class al
    implements android.os.Parcelable.Creator
{

    public al()
    {
    }

    static void a(OnListParentsResponse onlistparentsresponse, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, onlistparentsresponse.xM);
        b.a(parcel, 2, onlistparentsresponse.JB, i, false);
        b.G(parcel, j);
    }

    public OnListParentsResponse am(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        DataHolder dataholder = null;
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
                    dataholder = (DataHolder)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DataHolder.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new OnListParentsResponse(i, dataholder);
            }
        } while (true);
    }

    public OnListParentsResponse[] bi(int i)
    {
        return new OnListParentsResponse[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return am(parcel);
    }

    public Object[] newArray(int i)
    {
        return bi(i);
    }
}
