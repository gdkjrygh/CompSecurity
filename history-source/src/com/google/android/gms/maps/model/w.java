// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            TileOverlayOptions

public class w
    implements android.os.Parcelable.Creator
{

    public w()
    {
    }

    static void a(TileOverlayOptions tileoverlayoptions, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, tileoverlayoptions.getVersionCode());
        b.a(parcel, 2, tileoverlayoptions.og(), false);
        b.a(parcel, 3, tileoverlayoptions.isVisible());
        b.a(parcel, 4, tileoverlayoptions.getZIndex());
        b.a(parcel, 5, tileoverlayoptions.getFadeIn());
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dn(parcel);
    }

    public TileOverlayOptions dn(Parcel parcel)
    {
        boolean flag1 = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        android.os.IBinder ibinder = null;
        float f = 0.0F;
        boolean flag = true;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
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
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new TileOverlayOptions(i, ibinder, flag1, f, flag);
            }
        } while (true);
    }

    public TileOverlayOptions[] fj(int i)
    {
        return new TileOverlayOptions[i];
    }

    public Object[] newArray(int i)
    {
        return fj(i);
    }
}
