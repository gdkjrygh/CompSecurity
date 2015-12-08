// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ValuesRemovedDetails

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(ValuesRemovedDetails valuesremoveddetails, Parcel parcel, int j)
    {
        j = b.H(parcel);
        b.c(parcel, 1, valuesremoveddetails.CK);
        b.c(parcel, 2, valuesremoveddetails.mIndex);
        b.c(parcel, 3, valuesremoveddetails.SO);
        b.c(parcel, 4, valuesremoveddetails.SP);
        b.a(parcel, 5, valuesremoveddetails.Tm, false);
        b.c(parcel, 6, valuesremoveddetails.Tn);
        b.H(parcel, j);
    }

    public ValuesRemovedDetails bo(Parcel parcel)
    {
        int j = 0;
        int k1 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        String s = null;
        int k = 0;
        int l = 0;
        int i1 = 0;
        int j1 = 0;
        do
        {
            if (parcel.dataPosition() < k1)
            {
                int l1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l1);
                    break;

                case 1: // '\001'
                    j1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 2: // '\002'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    break;

                case 6: // '\006'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;
                }
            } else
            if (parcel.dataPosition() != k1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k1).toString(), parcel);
            } else
            {
                return new ValuesRemovedDetails(j1, i1, l, k, s, j);
            }
        } while (true);
    }

    public ValuesRemovedDetails[] cE(int j)
    {
        return new ValuesRemovedDetails[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bo(parcel);
    }

    public Object[] newArray(int j)
    {
        return cE(j);
    }
}
