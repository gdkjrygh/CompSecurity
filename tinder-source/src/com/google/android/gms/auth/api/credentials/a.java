// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            Credential, IdToken

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(Credential credential, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, credential.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, credential.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, credential.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, credential.d, i);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 4, credential.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, credential.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, credential.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, credential.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, credential.i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = zza.a(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        java.util.ArrayList arraylist = null;
        Uri uri = null;
        String s4 = null;
        String s5 = null;
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
                    s5 = zza.l(parcel, k);
                    break;

                case 1000: 
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    s4 = zza.l(parcel, k);
                    break;

                case 3: // '\003'
                    uri = (Uri)zza.a(parcel, k, Uri.CREATOR);
                    break;

                case 4: // '\004'
                    arraylist = zza.c(parcel, k, IdToken.CREATOR);
                    break;

                case 5: // '\005'
                    s3 = zza.l(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = zza.l(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = zza.l(parcel, k);
                    break;

                case 8: // '\b'
                    s = zza.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new Credential(i, s5, s4, uri, arraylist, s3, s2, s1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new Credential[i];
    }
}
