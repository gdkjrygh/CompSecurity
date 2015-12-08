// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ValueChangedDetails

public class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(ValueChangedDetails valuechangeddetails, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, valuechangeddetails.CK);
        b.c(parcel, 2, valuechangeddetails.Tj);
        b.H(parcel, i);
    }

    public ValueChangedDetails bm(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ValueChangedDetails(i, j);
            }
        } while (true);
    }

    public ValueChangedDetails[] cC(int i)
    {
        return new ValueChangedDetails[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bm(parcel);
    }

    public Object[] newArray(int i)
    {
        return cC(i);
    }
}
