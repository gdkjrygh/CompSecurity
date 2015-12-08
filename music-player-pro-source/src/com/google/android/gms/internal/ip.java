// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            io

public class ip
    implements android.os.Parcelable.Creator
{

    public ip()
    {
    }

    static void a(io io1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, io1.getVersionCode());
        b.a(parcel, 2, io1.fZ());
        b.a(parcel, 3, io1.gi());
        b.c(parcel, 4, io1.gj());
        b.a(parcel, 5, io1.getApplicationMetadata(), i, false);
        b.c(parcel, 6, io1.gk());
        b.H(parcel, j);
    }

    public io[] ai(int i)
    {
        return new io[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return y(parcel);
    }

    public Object[] newArray(int i)
    {
        return ai(i);
    }

    public io y(Parcel parcel)
    {
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        double d = 0.0D;
        ApplicationMetadata applicationmetadata = null;
        int j = 0;
        boolean flag = false;
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
                    d = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 5: // '\005'
                    applicationmetadata = (ApplicationMetadata)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, ApplicationMetadata.CREATOR);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new io(k, d, flag, j, applicationmetadata, i);
            }
        } while (true);
    }
}
