// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.fitness.request:
//            ah

public class ai
    implements android.os.Parcelable.Creator
{

    public ai()
    {
    }

    static void a(ah ah1, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1000, ah1.getVersionCode());
        b.a(parcel, 2, ah1.getDeviceAddress(), false);
        b.H(parcel, i);
    }

    public ah cb(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        String s = null;
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

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ah(i, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cb(parcel);
    }

    public ah[] dw(int i)
    {
        return new ah[i];
    }

    public Object[] newArray(int i)
    {
        return dw(i);
    }
}
