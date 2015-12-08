// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CreateContentsRequest

public class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(CreateContentsRequest createcontentsrequest, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, createcontentsrequest.xM);
        b.G(parcel, i);
    }

    public CreateContentsRequest W(Parcel parcel)
    {
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
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new CreateContentsRequest(i);
            }
        } while (true);
    }

    public CreateContentsRequest[] aR(int i)
    {
        return new CreateContentsRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return W(parcel);
    }

    public Object[] newArray(int i)
    {
        return aR(i);
    }
}
