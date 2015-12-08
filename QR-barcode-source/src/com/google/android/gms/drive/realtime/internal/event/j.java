// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ValuesSetDetails

public class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(ValuesSetDetails valuessetdetails, Parcel parcel, int i)
    {
        i = b.D(parcel);
        b.c(parcel, 1, valuessetdetails.BR);
        b.c(parcel, 2, valuessetdetails.mIndex);
        b.c(parcel, 3, valuessetdetails.Rr);
        b.c(parcel, 4, valuessetdetails.Rs);
        b.H(parcel, i);
    }

    public ValuesSetDetails bh(Parcel parcel)
    {
        int i1 = 0;
        int j1 = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int l = 0;
        int k = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(k1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 4: // '\004'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j1).toString(), parcel);
            } else
            {
                return new ValuesSetDetails(i, k, l, i1);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bh(parcel);
    }

    public ValuesSetDetails[] cu(int i)
    {
        return new ValuesSetDetails[i];
    }

    public Object[] newArray(int i)
    {
        return cu(i);
    }
}
