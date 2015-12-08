// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.internal:
//            ResolveAccountResponse

public class zzw
    implements android.os.Parcelable.Creator
{

    public zzw()
    {
    }

    static void a(ResolveAccountResponse resolveaccountresponse, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, resolveaccountresponse.a);
        zzb.a(parcel, 2, resolveaccountresponse.b, false);
        zzb.a(parcel, 3, resolveaccountresponse.b(), i, false);
        zzb.a(parcel, 4, resolveaccountresponse.c());
        zzb.a(parcel, 5, resolveaccountresponse.d());
        zzb.a(parcel, j);
    }

    public ResolveAccountResponse a(Parcel parcel)
    {
        ConnectionResult connectionresult = null;
        boolean flag = false;
        int j = zza.b(parcel);
        boolean flag1 = false;
        android.os.IBinder ibinder = null;
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
                    ibinder = zza.n(parcel, k);
                    break;

                case 3: // '\003'
                    connectionresult = (ConnectionResult)zza.a(parcel, k, ConnectionResult.CREATOR);
                    break;

                case 4: // '\004'
                    flag1 = zza.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag = zza.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ResolveAccountResponse(i, ibinder, connectionresult, flag1, flag);
            }
        } while (true);
    }

    public ResolveAccountResponse[] a(int i)
    {
        return new ResolveAccountResponse[i];
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
