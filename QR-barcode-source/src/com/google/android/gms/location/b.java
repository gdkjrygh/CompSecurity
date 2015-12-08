// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.location:
//            LocationRequest

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(LocationRequest locationrequest, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.b.D(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, locationrequest.mPriority);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1000, locationrequest.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, locationrequest.aes);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, locationrequest.aet);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, locationrequest.UK);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, locationrequest.aei);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 6, locationrequest.aeu);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, locationrequest.aev);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, locationrequest.aew);
        com.google.android.gms.common.internal.safeparcel.b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cs(parcel);
    }

    public LocationRequest cs(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int k = 0;
        int j = 102;
        long l4 = 0x36ee80L;
        long l3 = 0x927c0L;
        boolean flag = false;
        long l2 = 0x7fffffffffffffffL;
        int i = 0x7fffffff;
        float f = 0.0F;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    l4 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 3: // '\003'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 5: // '\005'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 7: // '\007'
                    f = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 8: // '\b'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new LocationRequest(k, j, l4, l3, flag, l2, i, f, l1);
            }
        } while (true);
    }

    public LocationRequest[] ed(int i)
    {
        return new LocationRequest[i];
    }

    public Object[] newArray(int i)
    {
        return ed(i);
    }
}
