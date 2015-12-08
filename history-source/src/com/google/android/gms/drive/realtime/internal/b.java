// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            EndCompoundOperationRequest

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(EndCompoundOperationRequest endcompoundoperationrequest, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.b.H(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, endcompoundoperationrequest.CK);
        com.google.android.gms.common.internal.safeparcel.b.H(parcel, i);
    }

    public EndCompoundOperationRequest bd(Parcel parcel)
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
                return new EndCompoundOperationRequest(i);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bd(parcel);
    }

    public EndCompoundOperationRequest[] cs(int i)
    {
        return new EndCompoundOperationRequest[i];
    }

    public Object[] newArray(int i)
    {
        return cs(i);
    }
}
