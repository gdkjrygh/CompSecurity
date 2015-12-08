// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.ConnectionConfiguration;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetConfigResponse

public final class p
    implements android.os.Parcelable.Creator
{

    public p()
    {
    }

    static void a(GetConfigResponse getconfigresponse, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getconfigresponse.a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, getconfigresponse.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, getconfigresponse.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = zza.a(parcel);
        ConnectionConfiguration connectionconfiguration = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = zza.e(parcel, l);
                    break;

                case 3: // '\003'
                    connectionconfiguration = (ConnectionConfiguration)zza.a(parcel, l, ConnectionConfiguration.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GetConfigResponse(i, j, connectionconfiguration);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GetConfigResponse[i];
    }
}
