// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            CapabilityParcel

public class zzi
    implements android.os.Parcelable.Creator
{

    public zzi()
    {
    }

    static void zza(CapabilityParcel capabilityparcel, Parcel parcel, int i)
    {
        i = b.a(parcel);
        b.a(parcel, 1, capabilityparcel.versionCode);
        b.a(parcel, 2, capabilityparcel.zzEm);
        b.a(parcel, 3, capabilityparcel.zzEn);
        b.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzl(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzE(i);
    }

    public CapabilityParcel[] zzE(int i)
    {
        return new CapabilityParcel[i];
    }

    public CapabilityParcel zzl(Parcel parcel)
    {
        boolean flag1 = false;
        int j = a.b(parcel);
        boolean flag = false;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = a.a(parcel);
                switch (a.a(k))
                {
                default:
                    a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = a.d(parcel, k);
                    break;

                case 2: // '\002'
                    flag = a.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new CapabilityParcel(i, flag, flag1);
            }
        } while (true);
    }
}
