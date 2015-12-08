// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model.internal;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;

// Referenced classes of package com.google.android.m4b.maps.model.internal:
//            CameraUpdateParcelable

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(CameraUpdateParcelable cameraupdateparcelable, Parcel parcel)
    {
        int i = com.google.android.m4b.maps.k.b.a(parcel, 20293);
        com.google.android.m4b.maps.k.b.b(parcel, 1, cameraupdateparcelable.a);
        com.google.android.m4b.maps.k.b.b(parcel, 2, cameraupdateparcelable.b);
        com.google.android.m4b.maps.k.b.a(parcel, 3, cameraupdateparcelable.c);
        com.google.android.m4b.maps.k.b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.m4b.maps.k.a.a(parcel);
        android.os.Bundle bundle = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;

                case 3: // '\003'
                    bundle = com.google.android.m4b.maps.k.a.k(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new CameraUpdateParcelable(i, j, bundle);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new CameraUpdateParcelable[i];
    }
}
