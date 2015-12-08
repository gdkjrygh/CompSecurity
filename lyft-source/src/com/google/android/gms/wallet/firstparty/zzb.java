// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wallet.firstparty:
//            GetBuyFlowInitializationTokenRequest

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void a(GetBuyFlowInitializationTokenRequest getbuyflowinitializationtokenrequest, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.zzb.a(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1, getbuyflowinitializationtokenrequest.a());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 2, getbuyflowinitializationtokenrequest.a, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, i);
    }

    public GetBuyFlowInitializationTokenRequest a(Parcel parcel)
    {
        int j = zza.b(parcel);
        int i = 0;
        byte abyte0[] = null;
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
                    abyte0 = zza.p(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new GetBuyFlowInitializationTokenRequest(i, abyte0);
            }
        } while (true);
    }

    public GetBuyFlowInitializationTokenRequest[] a(int i)
    {
        return new GetBuyFlowInitializationTokenRequest[i];
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
