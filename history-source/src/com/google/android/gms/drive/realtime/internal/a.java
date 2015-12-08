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
        i = b.H(parcel);
        b.c(parcel, 1, begincompoundoperationrequest.CK);
        b.a(parcel, 2, begincompoundoperationrequest.SF);
        b.a(parcel, 3, begincompoundoperationrequest.mName, false);
        b.a(parcel, 4, begincompoundoperationrequest.SG);
        b.H(parcel, i);
    }

    public BeginCompoundOperationRequest bc(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        String s = null;
        boolean flag1 = true;
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

                case 2: // '\002'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 4: // '\004'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new BeginCompoundOperationRequest(i, flag, s, flag1);
            }
        } while (true);
    }

    public BeginCompoundOperationRequest[] cr(int i)
    {
        return new BeginCompoundOperationRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bc(parcel);
    }

    public Object[] newArray(int i)
    {
        return cr(i);
    }
}
