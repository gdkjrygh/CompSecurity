// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            DataItemAssetParcelable

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(DataItemAssetParcelable dataitemassetparcelable, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, dataitemassetparcelable.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, dataitemassetparcelable.b());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, dataitemassetparcelable.c());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new DataItemAssetParcelable(i, s, s1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new DataItemAssetParcelable[i];
    }
}
