// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            aw, an

public class ax
    implements android.os.Parcelable.Creator
{

    public ax()
    {
    }

    static void a(aw aw1, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, aw1.versionCode);
        b.c(parcel, 2, aw1.statusCode);
        b.a(parcel, 3, aw1.ayc);
        b.c(parcel, 4, aw1.aye, false);
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return eE(parcel);
    }

    public aw eE(Parcel parcel)
    {
        int i = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        long l1 = 0L;
        java.util.ArrayList arraylist = null;
        int j = 0;
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
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, an.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new aw(j, i, l1, arraylist);
            }
        } while (true);
    }

    public aw[] gO(int i)
    {
        return new aw[i];
    }

    public Object[] newArray(int i)
    {
        return gO(i);
    }
}
