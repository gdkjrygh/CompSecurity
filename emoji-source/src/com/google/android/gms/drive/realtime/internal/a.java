// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            BeginCompoundOperationRequest

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(BeginCompoundOperationRequest begincompoundoperationrequest, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, begincompoundoperationrequest.xM);
        b.a(parcel, 2, begincompoundoperationrequest.Lj);
        b.a(parcel, 3, begincompoundoperationrequest.mName, false);
        b.G(parcel, i);
    }

    public BeginCompoundOperationRequest aP(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        String s = null;
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

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new BeginCompoundOperationRequest(i, flag, s);
            }
        } while (true);
    }

    public BeginCompoundOperationRequest[] bL(int i)
    {
        return new BeginCompoundOperationRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aP(parcel);
    }

    public Object[] newArray(int i)
    {
        return bL(i);
    }
}
