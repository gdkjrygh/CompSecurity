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
        i = b.C(parcel);
        b.c(parcel, 1, referenceshifteddetails.xM);
        b.a(parcel, 2, referenceshifteddetails.LH, false);
        b.a(parcel, 3, referenceshifteddetails.LI, false);
        b.c(parcel, 4, referenceshifteddetails.LJ);
        b.c(parcel, 5, referenceshifteddetails.LK);
        b.G(parcel, i);
    }

    public ReferenceShiftedDetails aW(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int j = 0;
        String s1 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(i1))
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

    public ReferenceShiftedDetails[] bT(int i)
    {
        return new ReferenceShiftedDetails[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aW(parcel);
    }

    public Object[] newArray(int i)
    {
        return bT(i);
    }
}
