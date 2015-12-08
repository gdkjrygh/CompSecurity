// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetCloudSyncOptInOutDoneResponse

public final class l
    implements android.os.Parcelable.Creator
{

    public l()
    {
    }

    static void a(GetCloudSyncOptInOutDoneResponse getcloudsyncoptinoutdoneresponse, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, getcloudsyncoptinoutdoneresponse.a);
        b.a(parcel, 2, getcloudsyncoptinoutdoneresponse.b);
        b.a(parcel, 3, getcloudsyncoptinoutdoneresponse.c);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GetCloudSyncOptInOutDoneResponse(i, j, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GetCloudSyncOptInOutDoneResponse[i];
    }
}
