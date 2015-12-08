// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wearable.ConnectionConfiguration;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetConfigResponse

public class zzak
    implements android.os.Parcelable.Creator
{

    public zzak()
    {
    }

    static void a(GetConfigResponse getconfigresponse, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, getconfigresponse.a);
        zzb.a(parcel, 2, getconfigresponse.b);
        zzb.a(parcel, 3, getconfigresponse.c, i, false);
        zzb.a(parcel, j);
    }

    public GetConfigResponse a(Parcel parcel)
    {
        int j = 0;
        int k = zza.b(parcel);
        ConnectionConfiguration connectionconfiguration = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = zza.a(parcel);
                switch (zza.a(l))
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    j = zza.f(parcel, l);
                    break;

                case 3: // '\003'
                    connectionconfiguration = (ConnectionConfiguration)zza.a(parcel, l, ConnectionConfiguration.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new GetConfigResponse(i, j, connectionconfiguration);
            }
        } while (true);
    }

    public GetConfigResponse[] a(int i)
    {
        return new GetConfigResponse[i];
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
