// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ValuesAddedDetails

public class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(ValuesAddedDetails valuesaddeddetails, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, valuesaddeddetails.xM);
        b.c(parcel, 2, valuesaddeddetails.mIndex);
        b.c(parcel, 3, valuesaddeddetails.LF);
        b.c(parcel, 4, valuesaddeddetails.LG);
        b.a(parcel, 5, valuesaddeddetails.LN, false);
        b.c(parcel, 6, valuesaddeddetails.LO);
        b.G(parcel, i);
    }

    public ValuesAddedDetails[] bX(int i)
    {
        return new ValuesAddedDetails[i];
    }

    public ValuesAddedDetails ba(Parcel parcel)
    {
        int i = 0;
        int j1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        String s = null;
        int j = 0;
        int k = 0;
        int l = 0;
        int i1 = 0;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 2: // '\002'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k1);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j1).toString(), parcel);
            } else
            {
                return new ValuesAddedDetails(i1, l, k, j, s, i);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ba(parcel);
    }

    public Object[] newArray(int i)
    {
        return bX(i);
    }
}
