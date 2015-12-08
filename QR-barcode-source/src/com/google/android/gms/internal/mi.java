// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            mh, mj

public class mi
    implements android.os.Parcelable.Creator
{

    public mi()
    {
    }

    static void a(mh mh1, Parcel parcel, int i)
    {
        int j = b.D(parcel);
        b.c(parcel, 1, mh1.mc());
        b.c(parcel, 1000, mh1.getVersionCode());
        b.c(parcel, 2, mh1.mg());
        b.a(parcel, 3, mh1.mh(), i, false);
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cy(parcel);
    }

    public mh cy(Parcel parcel)
    {
        int j = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int k = -1;
        mj mj1 = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    mj1 = (mj)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, mj.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new mh(i, j, k, mj1);
            }
        } while (true);
    }

    public mh[] eo(int i)
    {
        return new mh[i];
    }

    public Object[] newArray(int i)
    {
        return eo(i);
    }
}
