// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.common.data:
//            a

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(com.google.android.gms.common.data.a a1, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.C(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, a1.xM);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, a1.Ew, i, false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 3, a1.AT);
        com.google.android.gms.common.internal.safeparcel.b.G(parcel, j);
    }

    public com.google.android.gms.common.data.a[] ab(int i)
    {
        return new com.google.android.gms.common.data.a[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return w(parcel);
    }

    public Object[] newArray(int i)
    {
        return ab(i);
    }

    public com.google.android.gms.common.data.a w(Parcel parcel)
    {
        int i = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        ParcelFileDescriptor parcelfiledescriptor = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    parcelfiledescriptor = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ParcelFileDescriptor.CREATOR);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new com.google.android.gms.common.data.a(j, parcelfiledescriptor, i);
            }
        } while (true);
    }
}
