// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            oa

public class ob
    implements android.os.Parcelable.Creator
{

    public ob()
    {
    }

    static void a(oa oa1, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.a(parcel, 1, oa1.vc, false);
        b.c(parcel, 1000, oa1.CK);
        b.H(parcel, i);
    }

    public oa cT(Parcel parcel)
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

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new oa(i, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cT(parcel);
    }

    public oa[] eP(int i)
    {
        return new oa[i];
    }

    public Object[] newArray(int i)
    {
        return eP(i);
    }
}
