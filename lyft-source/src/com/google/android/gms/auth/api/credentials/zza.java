// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            Credential, IdToken

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void a(Credential credential, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1001, credential.a(), false);
        zzb.a(parcel, 1, credential.c(), false);
        zzb.a(parcel, 1000, credential.a);
        zzb.a(parcel, 2, credential.d(), false);
        zzb.a(parcel, 3, credential.e(), i, false);
        zzb.a(parcel, 1002, credential.b(), false);
        zzb.c(parcel, 4, credential.f(), false);
        zzb.a(parcel, 5, credential.g(), false);
        zzb.a(parcel, 6, credential.h(), false);
        zzb.a(parcel, j);
    }

    public Credential a(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.b(parcel);
        int i = 0;
        String s1 = null;
        java.util.ArrayList arraylist = null;
        Uri uri = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
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

                case 1001: 
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, k);
                    break;

                case 1: // '\001'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, k);
                    break;

                case 3: // '\003'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.zza.a(parcel, k, Uri.CREATOR);
                    break;

                case 1002: 
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.c(parcel, k, IdToken.CREATOR);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, k);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new Credential(i, s5, s4, s3, s2, uri, arraylist, s1, s);
            }
        } while (true);
    }

    public Credential[] a(int i)
    {
        return new Credential[i];
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
