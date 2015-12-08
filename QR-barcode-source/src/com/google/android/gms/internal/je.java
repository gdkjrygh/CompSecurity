// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            jd, jf

public class je
    implements android.os.Parcelable.Creator
{

    public je()
    {
    }

    static void a(jd jd1, Parcel parcel, int i)
    {
        int j = b.D(parcel);
        b.c(parcel, 1, jd1.getVersionCode());
        b.a(parcel, 2, jd1.ha(), i, false);
        b.H(parcel, j);
    }

    public jd F(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int i = 0;
        jf jf1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    jf1 = (jf)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, jf.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new jd(i, jf1);
            }
        } while (true);
    }

    public jd[] aF(int i)
    {
        return new jd[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return F(parcel);
    }

    public Object[] newArray(int i)
    {
        return aF(i);
    }
}
