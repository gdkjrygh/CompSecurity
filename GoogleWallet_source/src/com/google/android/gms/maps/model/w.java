// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            TileOverlayOptions

public final class w
    implements android.os.Parcelable.Creator
{

    public w()
    {
    }

    static void a(TileOverlayOptions tileoverlayoptions, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, tileoverlayoptions.getVersionCode());
        b.a(parcel, 2, tileoverlayoptions.qu(), false);
        b.a(parcel, 3, tileoverlayoptions.isVisible());
        b.a(parcel, 4, tileoverlayoptions.getZIndex());
        b.a(parcel, 5, tileoverlayoptions.getFadeIn());
        b.J(parcel, i);
    }

    public static TileOverlayOptions gz(Parcel parcel)
    {
        boolean flag1 = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        android.os.IBinder ibinder = null;
        float f = 0.0F;
        boolean flag = true;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.q(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    f = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new TileOverlayOptions(i, ibinder, flag1, f, flag);
            }
        } while (true);
    }

    private static TileOverlayOptions[] iY(int i)
    {
        return new TileOverlayOptions[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return gz(parcel);
    }

    public final Object[] newArray(int i)
    {
        return iY(i);
    }
}
