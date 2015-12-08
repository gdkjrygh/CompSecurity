// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetCloudSyncOptInStatusResponse

public final class m
    implements android.os.Parcelable.Creator
{

    public m()
    {
    }

    static void a(GetCloudSyncOptInStatusResponse getcloudsyncoptinstatusresponse, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, getcloudsyncoptinstatusresponse.a);
        b.a(parcel, 2, getcloudsyncoptinstatusresponse.b);
        b.a(parcel, 3, getcloudsyncoptinstatusresponse.c);
        b.a(parcel, 4, getcloudsyncoptinstatusresponse.d);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag1 = false;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 4: // '\004'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
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
