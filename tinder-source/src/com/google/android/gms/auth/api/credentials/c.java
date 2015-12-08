// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            CredentialRequest, CredentialPickerConfig

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(CredentialRequest credentialrequest, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, credentialrequest.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, credentialrequest.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, credentialrequest.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, credentialrequest.d, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, credentialrequest.e, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        CredentialPickerConfig credentialpickerconfig = null;
        int j = zza.a(parcel);
        CredentialPickerConfig credentialpickerconfig1 = null;
        String as[] = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    flag = zza.c(parcel, k);
                    break;

                case 1000: 
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    as = zza.r(parcel, k);
                    break;

                case 3: // '\003'
                    credentialpickerconfig1 = (CredentialPickerConfig)zza.a(parcel, k, CredentialPickerConfig.CREATOR);
                    break;

                case 4: // '\004'
                    credentialpickerconfig = (CredentialPickerConfig)zza.a(parcel, k, CredentialPickerConfig.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CredentialRequest(i, flag, as, credentialpickerconfig1, credentialpickerconfig);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new CredentialRequest[i];
    }
}
