// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetCloudSyncOptInStatusResponse

public final class n
    implements android.os.Parcelable.Creator
{

    public n()
    {
    }

    static void a(GetCloudSyncOptInStatusResponse getcloudsyncoptinstatusresponse, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getcloudsyncoptinstatusresponse.a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, getcloudsyncoptinstatusresponse.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, getcloudsyncoptinstatusresponse.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, getcloudsyncoptinstatusresponse.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag1 = false;
        int k = zza.a(parcel);
        boolean flag = false;
        int j = 0;
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
                    flag = zza.c(parcel, l);
                    break;

                case 4: // '\004'
                    flag1 = zza.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GetCloudSyncOptInStatusResponse(i, j, flag, flag1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GetCloudSyncOptInStatusResponse[i];
    }
}
