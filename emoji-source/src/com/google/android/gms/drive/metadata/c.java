// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.metadata:
//            CustomPropertyKey

public class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(CustomPropertyKey custompropertykey, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, custompropertykey.xM);
        b.a(parcel, 2, custompropertykey.JL, false);
        b.c(parcel, 3, custompropertykey.JM);
        b.G(parcel, i);
    }

    public CustomPropertyKey az(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        String s = null;
        int i = 0;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new CustomPropertyKey(i, s, j);
            }
        } while (true);
    }

    public CustomPropertyKey[] bv(int i)
    {
        return new CustomPropertyKey[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return az(parcel);
    }

    public Object[] newArray(int i)
    {
        return bv(i);
    }
}
