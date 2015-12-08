// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnSyncMoreResponse

public class aq
    implements android.os.Parcelable.Creator
{

    public aq()
    {
    }

    static void a(OnSyncMoreResponse onsyncmoreresponse, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, onsyncmoreresponse.xM);
        b.a(parcel, 2, onsyncmoreresponse.IP);
        b.G(parcel, i);
    }

    public OnSyncMoreResponse ar(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new OnSyncMoreResponse(i, flag);
            }
        } while (true);
    }

    public OnSyncMoreResponse[] bn(int i)
    {
        return new OnSyncMoreResponse[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ar(parcel);
    }

    public Object[] newArray(int i)
    {
        return bn(i);
    }
}
