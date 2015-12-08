// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.common.internal:
//            ResolveAccountResponse

public final class w
    implements android.os.Parcelable.Creator
{

    public w()
    {
    }

    static void a(ResolveAccountResponse resolveaccountresponse, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, resolveaccountresponse.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, resolveaccountresponse.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, resolveaccountresponse.c, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, resolveaccountresponse.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, resolveaccountresponse.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        ConnectionResult connectionresult = null;
        boolean flag = false;
        int j = zza.a(parcel);
        boolean flag1 = false;
        android.os.IBinder ibinder = null;
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
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = zza.m(parcel, k);
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
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ResolveAccountResponse(i, ibinder, connectionresult, flag1, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ResolveAccountResponse[i];
    }
}
