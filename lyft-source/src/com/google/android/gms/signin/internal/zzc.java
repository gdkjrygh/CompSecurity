// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.signin.internal:
//            CheckServerAuthResult

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void a(CheckServerAuthResult checkserverauthresult, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, checkserverauthresult.a);
        zzb.a(parcel, 2, checkserverauthresult.b);
        zzb.c(parcel, 3, checkserverauthresult.c, false);
        zzb.a(parcel, i);
    }

    public CheckServerAuthResult a(Parcel parcel)
    {
        boolean flag = false;
        int j = zza.b(parcel);
        java.util.ArrayList arraylist = null;
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
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    flag = zza.c(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist = zza.c(parcel, k, Scope.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new CheckServerAuthResult(i, flag, arraylist);
            }
        } while (true);
    }

    public CheckServerAuthResult[] a(int i)
    {
        return new CheckServerAuthResult[i];
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
