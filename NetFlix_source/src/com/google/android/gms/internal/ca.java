// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            cb

public class ca
    implements android.os.Parcelable.Creator
{

    public ca()
    {
    }

    static void a(cb cb1, Parcel parcel, int i)
    {
        i = b.p(parcel);
        b.c(parcel, 1, cb1.versionCode);
        b.a(parcel, 2, cb1.nN, false);
        b.a(parcel, 3, cb1.nO, false);
        b.a(parcel, 4, cb1.mimeType, false);
        b.a(parcel, 5, cb1.packageName, false);
        b.a(parcel, 6, cb1.nP, false);
        b.a(parcel, 7, cb1.nQ, false);
        b.a(parcel, 8, cb1.nR, false);
        b.F(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return d(parcel);
    }

    public cb d(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 3: // '\003'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 4: // '\004'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new cb(i, s6, s5, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public cb[] h(int i)
    {
        return new cb[i];
    }

    public Object[] newArray(int i)
    {
        return h(i);
    }
}
