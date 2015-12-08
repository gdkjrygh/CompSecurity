// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            zzqa, zzpy

public final class kj
    implements android.os.Parcelable.Creator
{

    public kj()
    {
    }

    static void a(zzqa zzqa1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, zzqa1.b, i);
        c.a(parcel, 1000, zzqa1.a);
        c.a(parcel, 2, zzqa1.c);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        zzpy zzpy1 = null;
        float f = 0.0F;
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
                    zzpy1 = (zzpy)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, zzpy.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    f = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new zzqa(i, zzpy1, f);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzqa[i];
    }
}
