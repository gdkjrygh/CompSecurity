// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            CredentialRequest

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void a(CredentialRequest credentialrequest, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.zzb.a(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1, credentialrequest.a());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1000, credentialrequest.a);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 2, credentialrequest.b(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, i);
    }

    public CredentialRequest a(Parcel parcel)
    {
        boolean flag = false;
        int j = zza.b(parcel);
        String as[] = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = zza.a(parcel);
                switch (zza.a(k))
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    flag = zza.c(parcel, k);
                    break;

                case 1000: 
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    as = zza.y(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new CredentialRequest(i, flag, as);
            }
        } while (true);
    }

    public CredentialRequest[] a(int i)
    {
        return new CredentialRequest[i];
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
