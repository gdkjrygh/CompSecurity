// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzaz, zzaq

public final class af
    implements android.os.Parcelable.Creator
{

    public af()
    {
    }

    static void a(zzaz zzaz1, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, zzaz1.a);
        c.a(parcel, 2, zzaz1.b);
        c.a(parcel, 3, zzaz1.c);
        c.c(parcel, 4, zzaz1.d);
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        long l1 = 0L;
        java.util.ArrayList arraylist = null;
        int j = 0;
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
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, zzaq.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new zzaz(j, i, l1, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzaz[i];
    }
}
