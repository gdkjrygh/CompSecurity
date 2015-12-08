// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.signin.internal:
//            AuthAccountResult

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void a(AuthAccountResult authaccountresult, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, authaccountresult.a);
        zzb.a(parcel, i);
    }

    public AuthAccountResult a(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.b(parcel);
        int i = 0;
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
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new AuthAccountResult(i);
            }
        } while (true);
    }

    public AuthAccountResult[] a(int i)
    {
        return new AuthAccountResult[i];
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
