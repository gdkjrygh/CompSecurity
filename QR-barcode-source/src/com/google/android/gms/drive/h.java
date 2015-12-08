// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive:
//            UserMetadata

public class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(UserMetadata usermetadata, Parcel parcel, int i)
    {
        i = b.D(parcel);
        b.c(parcel, 1, usermetadata.BR);
        b.a(parcel, 2, usermetadata.NG, false);
        b.a(parcel, 3, usermetadata.NH, false);
        b.a(parcel, 4, usermetadata.NI, false);
        b.a(parcel, 5, usermetadata.NJ);
        b.a(parcel, 6, usermetadata.NK, false);
        b.H(parcel, i);
    }

    public UserMetadata S(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        String s1 = null;
        String s2 = null;
        String s3 = null;
        int i = 0;
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
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new UserMetadata(i, s3, s2, s1, flag, s);
            }
        } while (true);
    }

    public UserMetadata[] aZ(int i)
    {
        return new UserMetadata[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return S(parcel);
    }

    public Object[] newArray(int i)
    {
        return aZ(i);
    }
}
