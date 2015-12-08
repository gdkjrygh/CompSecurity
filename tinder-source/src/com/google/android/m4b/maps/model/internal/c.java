// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model.internal;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.model.internal:
//            GroundOverlayOptionsParcelable, BitmapDescriptorParcelable

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(GroundOverlayOptionsParcelable groundoverlayoptionsparcelable, Parcel parcel, int i)
    {
        int j = b.a(parcel, 20293);
        b.b(parcel, 1, groundoverlayoptionsparcelable.a);
        b.a(parcel, 2, groundoverlayoptionsparcelable.b, i);
        b.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        int i = 0;
        BitmapDescriptorParcelable bitmapdescriptorparcelable = null;
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
                    bitmapdescriptorparcelable = (BitmapDescriptorParcelable)com.google.android.m4b.maps.k.a.a(parcel, k, BitmapDescriptorParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new GroundOverlayOptionsParcelable(i, bitmapdescriptorparcelable);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GroundOverlayOptionsParcelable[i];
    }
}
