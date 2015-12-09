// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            zzqm

public final class kp
    implements android.os.Parcelable.Creator
{

    public kp()
    {
    }

    static void a(zzqm zzqm1, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, zzqm1.a());
        c.a(parcel, 1000, zzqm1.a);
        c.c(parcel, 2, zzqm1.b());
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, zzqm.zza.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new zzqm(i, s, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzqm[i];
    }
}
