// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet.firstparty:
//            GetInstrumentsResponse

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void a(GetInstrumentsResponse getinstrumentsresponse, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, getinstrumentsresponse.a());
        zzb.a(parcel, 2, getinstrumentsresponse.a, false);
        zzb.a(parcel, 3, getinstrumentsresponse.b, false);
        zzb.a(parcel, i);
    }

    public GetInstrumentsResponse a(Parcel parcel)
    {
        String as[] = null;
        int j = zza.b(parcel);
        int i = 0;
        byte abyte0[][] = (byte[][])null;
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
                    as = zza.y(parcel, k);
                    break;

                case 3: // '\003'
                    abyte0 = zza.q(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new GetInstrumentsResponse(i, as, abyte0);
            }
        } while (true);
    }

    public GetInstrumentsResponse[] a(int i)
    {
        return new GetInstrumentsResponse[i];
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
