// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.model.internal:
//            BitmapDescriptorParcelable

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(BitmapDescriptorParcelable bitmapdescriptorparcelable, Parcel parcel, int i)
    {
        int j = b.a(parcel, 20293);
        b.b(parcel, 1, bitmapdescriptorparcelable.a);
        b.a(parcel, 2, bitmapdescriptorparcelable.b);
        b.a(parcel, 3, bitmapdescriptorparcelable.c);
        b.a(parcel, 4, bitmapdescriptorparcelable.d, i);
        b.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Bitmap bitmap = null;
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        byte byte0 = 0;
        int i = 0;
        android.os.Bundle bundle = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.m4b.maps.k.a.e(parcel, k);
                    break;

                case 2: // '\002'
                    byte0 = com.google.android.m4b.maps.k.a.d(parcel, k);
                    break;

                case 3: // '\003'
                    bundle = com.google.android.m4b.maps.k.a.k(parcel, k);
                    break;

                case 4: // '\004'
                    bitmap = (Bitmap)com.google.android.m4b.maps.k.a.a(parcel, k, Bitmap.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new BitmapDescriptorParcelable(i, byte0, bundle, bitmap);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new BitmapDescriptorParcelable[i];
    }
}
