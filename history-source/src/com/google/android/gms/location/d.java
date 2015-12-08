// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location:
//            LocationRequest

public class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(LocationRequest locationrequest, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, locationrequest.mPriority);
        b.c(parcel, 1000, locationrequest.getVersionCode());
        b.a(parcel, 2, locationrequest.agr);
        b.a(parcel, 3, locationrequest.ags);
        b.a(parcel, 4, locationrequest.Wg);
        b.a(parcel, 5, locationrequest.age);
        b.c(parcel, 6, locationrequest.agt);
        b.a(parcel, 7, locationrequest.agu);
        b.a(parcel, 8, locationrequest.agv);
        b.H(parcel, i);
    }

    public LocationRequest cJ(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
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
                int i1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(i1))
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

    public Object createFromParcel(Parcel parcel)
    {
        return cJ(parcel);
    }

    public LocationRequest[] eA(int i)
    {
        return new LocationRequest[i];
    }

    public Object[] newArray(int i)
    {
        return eA(i);
    }
}
