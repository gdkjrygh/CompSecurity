// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            UsageInfo

public final class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(GetRecentContextCall.Response response, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, response.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, response.a, i);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 2, response.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, response.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = zza.a(parcel);
        java.util.ArrayList arraylist = null;
        Status status = null;
        int i = 0;
        String as[] = null;
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

                case 1000: 
                    i = zza.e(parcel, k);
                    break;

                case 1: // '\001'
                    status = (Status)zza.a(parcel, k, Status.CREATOR);
                    break;

                case 2: // '\002'
                    arraylist = zza.c(parcel, k, UsageInfo.CREATOR);
                    break;

                case 3: // '\003'
                    as = zza.r(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GetRecentContextCall.Response(i, status, arraylist, as);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GetRecentContextCall.Response[i];
    }
}
