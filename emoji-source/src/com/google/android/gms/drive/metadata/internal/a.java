// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            AppVisibleCustomProperties, CustomProperty

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(AppVisibleCustomProperties appvisiblecustomproperties, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, appvisiblecustomproperties.xM);
        b.b(parcel, 2, appvisiblecustomproperties.JO, false);
        b.G(parcel, i);
    }

    public AppVisibleCustomProperties aA(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        java.util.ArrayList arraylist = null;
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, CustomProperty.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new AppVisibleCustomProperties(i, arraylist);
            }
        } while (true);
    }

    public AppVisibleCustomProperties[] bw(int i)
    {
        return new AppVisibleCustomProperties[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aA(parcel);
    }

    public Object[] newArray(int i)
    {
        return bw(i);
    }
}
