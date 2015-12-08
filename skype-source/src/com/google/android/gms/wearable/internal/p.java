// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.wearable.ConnectionConfiguration;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetConfigsResponse

public final class p
    implements android.os.Parcelable.Creator
{

    public p()
    {
    }

    static void a(GetConfigsResponse getconfigsresponse, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, getconfigsresponse.a);
        b.a(parcel, 2, getconfigsresponse.b);
        b.a(parcel, 3, getconfigsresponse.c, i);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        ConnectionConfiguration aconnectionconfiguration[] = null;
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
                    aconnectionconfiguration = (ConnectionConfiguration[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, ConnectionConfiguration.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GetConfigsResponse(i, j, aconnectionconfiguration);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GetConfigsResponse[i];
    }
}
