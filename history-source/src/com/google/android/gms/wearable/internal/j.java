// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            DataItemAssetParcelable

public class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(DataItemAssetParcelable dataitemassetparcelable, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, dataitemassetparcelable.CK);
        b.a(parcel, 2, dataitemassetparcelable.getId(), false);
        b.a(parcel, 3, dataitemassetparcelable.getDataItemKey(), false);
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ep(parcel);
    }

    public DataItemAssetParcelable ep(Parcel parcel)
    {
        String s1 = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new DataItemAssetParcelable(i, s, s1);
            }
        } while (true);
    }

    public DataItemAssetParcelable[] gy(int i)
    {
        return new DataItemAssetParcelable[i];
    }

    public Object[] newArray(int i)
    {
        return gy(i);
    }
}
