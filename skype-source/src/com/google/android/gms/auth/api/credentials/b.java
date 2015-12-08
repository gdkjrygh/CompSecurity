// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            CredentialPickerConfig

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(CredentialPickerConfig credentialpickerconfig, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, credentialpickerconfig.a());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, credentialpickerconfig.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, credentialpickerconfig.b());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
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
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CredentialPickerConfig(i, flag, flag1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new CredentialPickerConfig[i];
    }
}
