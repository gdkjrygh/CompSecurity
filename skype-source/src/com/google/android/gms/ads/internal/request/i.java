// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            CapabilityParcel

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(CapabilityParcel capabilityparcel, Parcel parcel)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, capabilityparcel.a);
        b.a(parcel, 2, capabilityparcel.b);
        b.a(parcel, 3, capabilityparcel.c);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag1 = false;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        boolean flag = false;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new CapabilityParcel(j, flag, flag1);
            }
        } while (true);
    }

    public final Object[] newArray(int j)
    {
        return new CapabilityParcel[j];
    }
}
