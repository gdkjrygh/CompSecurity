// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.location.places:
//            zzj

public final class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(zzj zzj1, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, zzj1.f);
        c.a(parcel, 1000, zzj1.e);
        c.a(parcel, 2, zzj1.g);
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new zzj(i, s, j);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzj[i];
    }
}
