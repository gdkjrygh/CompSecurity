// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ov

public class ow
    implements android.os.Parcelable.Creator
{

    public ow()
    {
    }

    static void a(ov ov1, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, ov1.versionCode);
        b.a(parcel, 2, ov1.packageName, false);
        b.c(parcel, 3, ov1.ang);
        b.c(parcel, 4, ov1.anh);
        b.a(parcel, 5, ov1.ani, false);
        b.a(parcel, 6, ov1.anj, false);
        b.a(parcel, 7, ov1.ank);
        b.a(parcel, 8, ov1.anl, false);
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return du(parcel);
    }

    public ov du(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        boolean flag = true;
        String s1 = null;
        String s2 = null;
        int j = 0;
        String s3 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new ov(k, s3, j, i, s2, s1, flag, s);
            }
        } while (true);
    }

    public ov[] fr(int i)
    {
        return new ov[i];
    }

    public Object[] newArray(int i)
    {
        return fr(i);
    }
}
