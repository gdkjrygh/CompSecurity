// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            CustomProperty

public class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(CustomProperty customproperty, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, customproperty.xM);
        b.a(parcel, 2, customproperty.JQ, i, false);
        b.a(parcel, 3, customproperty.mValue, false);
        b.G(parcel, j);
    }

    public CustomProperty aB(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        CustomPropertyKey custompropertykey = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    custompropertykey = (CustomPropertyKey)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, CustomPropertyKey.CREATOR);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new CustomProperty(i, custompropertykey, s);
            }
        } while (true);
    }

    public CustomProperty[] bx(int i)
    {
        return new CustomProperty[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aB(parcel);
    }

    public Object[] newArray(int i)
    {
        return bx(i);
    }
}
