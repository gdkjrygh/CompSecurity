// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            CredentialRequest, CredentialPickerConfig

public final class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(CredentialRequest credentialrequest, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, credentialrequest.a());
        c.a(parcel, 1000, credentialrequest.a);
        c.a(parcel, 2, credentialrequest.b());
        c.a(parcel, 3, credentialrequest.c(), i, false);
        c.a(parcel, 4, credentialrequest.d(), i, false);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        CredentialPickerConfig credentialpickerconfig = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 2: // '\002'
                    as = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 3: // '\003'
                    credentialpickerconfig1 = (CredentialPickerConfig)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, CredentialPickerConfig.CREATOR);
                    break;

                case 4: // '\004'
                    credentialpickerconfig = (CredentialPickerConfig)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, CredentialPickerConfig.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
