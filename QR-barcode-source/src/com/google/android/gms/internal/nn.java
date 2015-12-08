// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            nm

public class nn
    implements android.os.Parcelable.Creator
{

    public nn()
    {
    }

    static void a(nm nm1, Parcel parcel, int i)
    {
        i = b.D(parcel);
        b.c(parcel, 1, nm1.versionCode);
        b.a(parcel, 2, nm1.packageName, false);
        b.c(parcel, 3, nm1.akR);
        b.c(parcel, 4, nm1.akS);
        b.a(parcel, 5, nm1.akT, false);
        b.a(parcel, 6, nm1.akU, false);
        b.a(parcel, 7, nm1.akV);
        b.H(parcel, i);
    }

    public nm cY(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        boolean flag = true;
        String s1 = null;
        int j = 0;
        String s2 = null;
        int k = 0;
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
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new nm(k, s2, j, i, s1, s, flag);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cY(parcel);
    }

    public nm[] eP(int i)
    {
        return new nm[i];
    }

    public Object[] newArray(int i)
    {
        return eP(i);
    }
}
