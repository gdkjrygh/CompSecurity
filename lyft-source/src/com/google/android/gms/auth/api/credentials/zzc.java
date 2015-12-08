// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            IdToken

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void a(IdToken idtoken, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, idtoken.a(), false);
        zzb.a(parcel, 1000, idtoken.a);
        zzb.a(parcel, 2, idtoken.b(), false);
        zzb.a(parcel, i);
    }

    public IdToken a(Parcel parcel)
    {
        String s1 = null;
        int j = zza.b(parcel);
        int i = 0;
        String s = null;
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
                    s = zza.m(parcel, k);
                    break;

                case 1000: 
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = zza.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new IdToken(i, s, s1);
            }
        } while (true);
    }

    public IdToken[] a(int i)
    {
        return new IdToken[i];
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
