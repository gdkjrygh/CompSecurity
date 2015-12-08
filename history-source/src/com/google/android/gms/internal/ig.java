// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            if

public class ig
    implements android.os.Parcelable.Creator
{

    public ig()
    {
    }

    static void a(if if1, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, if1.responseCode);
        b.c(parcel, 1000, if1.versionCode);
        b.a(parcel, 2, if1.Ep, false);
        b.a(parcel, 3, if1.Eq, false);
        b.H(parcel, i);
    }

    public if[] U(int i)
    {
        return new if[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return t(parcel);
    }

    public Object[] newArray(int i)
    {
        return U(i);
    }

    public if t(Parcel parcel)
    {
        byte abyte0[] = null;
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        android.os.Bundle bundle = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, l);
                    break;

                case 3: // '\003'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new if(i, j, bundle, abyte0);
            }
        } while (true);
    }
}
