// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            CapabilityParcel

public class zzi
    implements android.os.Parcelable.Creator
{

    public zzi()
    {
    }

    static void a(CapabilityParcel capabilityparcel, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, capabilityparcel.versionCode);
        c.a(parcel, 2, capabilityparcel.zzFa);
        c.a(parcel, 3, capabilityparcel.zzFb);
        c.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzk(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzF(i);
    }

    public CapabilityParcel[] zzF(int i)
    {
        return new CapabilityParcel[i];
    }

    public CapabilityParcel zzk(Parcel parcel)
    {
        boolean flag1 = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        boolean flag = false;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 2: // '\002'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CapabilityParcel(i, flag, flag1);
            }
        } while (true);
    }
}
