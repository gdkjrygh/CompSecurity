// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DisconnectRequest

public class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    static void a(DisconnectRequest disconnectrequest, Parcel parcel, int i)
    {
        i = b.p(parcel);
        b.c(parcel, 1, disconnectrequest.xH);
        b.F(parcel, i);
    }

    public DisconnectRequest K(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
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

    public DisconnectRequest[] ao(int i)
    {
        return new DisconnectRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return K(parcel);
    }

    public Object[] newArray(int i)
    {
        return ao(i);
    }
}
