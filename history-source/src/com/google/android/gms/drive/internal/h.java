// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CreateContentsRequest

public class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(CreateContentsRequest createcontentsrequest, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, createcontentsrequest.CK);
        b.c(parcel, 2, createcontentsrequest.Oi);
        b.H(parcel, i);
    }

    public CreateContentsRequest af(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        int j = 0x20000000;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new CreateContentsRequest(i, j);
            }
        } while (true);
    }

    public CreateContentsRequest[] bp(int i)
    {
        return new CreateContentsRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return af(parcel);
    }

    public Object[] newArray(int i)
    {
        return bp(i);
    }
}
