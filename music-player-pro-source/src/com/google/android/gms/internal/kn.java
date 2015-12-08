// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            km, ko

public class kn
    implements android.os.Parcelable.Creator
{

    public kn()
    {
    }

    static void a(km km1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, km1.getVersionCode());
        b.a(parcel, 2, km1.hF(), i, false);
        b.H(parcel, j);
    }

    public km J(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        ko ko1 = null;
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
                    ko1 = (ko)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ko.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new km(i, ko1);
            }
        } while (true);
    }

    public km[] aK(int i)
    {
        return new km[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return J(parcel);
    }

    public Object[] newArray(int i)
    {
        return aK(i);
    }
}
