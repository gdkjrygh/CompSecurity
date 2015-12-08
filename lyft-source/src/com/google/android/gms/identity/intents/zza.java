// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.identity.intents.model.CountrySpecification;

// Referenced classes of package com.google.android.gms.identity.intents:
//            UserAddressRequest

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void a(UserAddressRequest useraddressrequest, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, useraddressrequest.a());
        zzb.c(parcel, 2, useraddressrequest.a, false);
        zzb.a(parcel, i);
    }

    public UserAddressRequest a(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.b(parcel);
        int i = 0;
        java.util.ArrayList arraylist = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.a(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.c(parcel, k, CountrySpecification.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new UserAddressRequest(i, arraylist);
            }
        } while (true);
    }

    public UserAddressRequest[] a(int i)
    {
        return new UserAddressRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
