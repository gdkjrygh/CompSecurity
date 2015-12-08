// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet.firstparty:
//            GetInstrumentsRequest

public class zzd
    implements android.os.Parcelable.Creator
{

    public zzd()
    {
    }

    static void a(GetInstrumentsRequest getinstrumentsrequest, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, getinstrumentsrequest.a());
        zzb.a(parcel, 2, getinstrumentsrequest.a, false);
        zzb.a(parcel, i);
    }

    public GetInstrumentsRequest a(Parcel parcel)
    {
        int j = zza.b(parcel);
        int i = 0;
        int ai[] = null;
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
                    ai = zza.s(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new GetInstrumentsRequest(i, ai);
            }
        } while (true);
    }

    public GetInstrumentsRequest[] a(int i)
    {
        return new GetInstrumentsRequest[i];
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
