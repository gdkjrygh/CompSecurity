// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ReferenceShiftedDetails

public class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(ReferenceShiftedDetails referenceshifteddetails, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, referenceshifteddetails.CK);
        b.a(parcel, 2, referenceshifteddetails.Te, false);
        b.a(parcel, 3, referenceshifteddetails.Tf, false);
        b.c(parcel, 4, referenceshifteddetails.Tg);
        b.c(parcel, 5, referenceshifteddetails.Th);
        b.H(parcel, i);
    }

    public ReferenceShiftedDetails bj(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int j = 0;
        String s1 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new ReferenceShiftedDetails(k, s1, s, j, i);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bj(parcel);
    }

    public ReferenceShiftedDetails[] cz(int i)
    {
        return new ReferenceShiftedDetails[i];
    }

    public Object[] newArray(int i)
    {
        return cz(i);
    }
}
