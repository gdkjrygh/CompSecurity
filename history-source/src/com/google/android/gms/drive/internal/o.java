// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DisconnectRequest

public class o
    implements android.os.Parcelable.Creator
{

    public o()
    {
    }

    static void a(DisconnectRequest disconnectrequest, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, disconnectrequest.CK);
        b.H(parcel, i);
    }

    public DisconnectRequest ak(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new DisconnectRequest(i);
            }
        } while (true);
    }

    public DisconnectRequest[] bv(int i)
    {
        return new DisconnectRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ak(parcel);
    }

    public Object[] newArray(int i)
    {
        return bv(i);
    }
}
