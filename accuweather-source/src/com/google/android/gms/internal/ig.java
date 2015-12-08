// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            if, ic

public class ig
    implements android.os.Parcelable.Creator
{

    public ig()
    {
    }

    static void a(if if1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, if1.getVersionCode());
        b.a(parcel, 2, if1.fT(), false);
        b.a(parcel, 3, if1.fU(), i, false);
        b.G(parcel, j);
    }

    public if L(Parcel parcel)
    {
        ic ic1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        Parcel parcel1 = null;
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
                    parcel1 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, k);
                    break;

                case 3: // '\003'
                    ic1 = (ic)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ic.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new if(i, parcel1, ic1);
            }
        } while (true);
    }

    public if[] aA(int i)
    {
        return new if[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return L(parcel);
    }

    public Object[] newArray(int i)
    {
        return aA(i);
    }
}
