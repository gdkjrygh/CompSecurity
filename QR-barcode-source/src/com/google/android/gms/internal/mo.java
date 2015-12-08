// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            mn, mj

public class mo
    implements android.os.Parcelable.Creator
{

    public mo()
    {
    }

    static void a(mn mn1, Parcel parcel, int i)
    {
        int j = b.D(parcel);
        b.c(parcel, 1000, mn1.BR);
        b.a(parcel, 2, mn1.mh(), i, false);
        b.a(parcel, 3, mn1.getInterval());
        b.c(parcel, 4, mn1.getPriority());
        b.H(parcel, j);
    }

    public mn cB(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int j = 0;
        mj mj1 = null;
        long l1 = mn.afA;
        int i = 102;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    mj1 = (mj)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, mj.CREATOR);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new mn(j, mj1, l1, i);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cB(parcel);
    }

    public mn[] er(int i)
    {
        return new mn[i];
    }

    public Object[] newArray(int i)
    {
        return er(i);
    }
}
