// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            zzqd

public final class kk
    implements android.os.Parcelable.Creator
{

    public kk()
    {
    }

    static void a(zzqd zzqd1, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, zzqd1.b);
        c.a(parcel, 1000, zzqd1.a);
        c.a(parcel, 2, zzqd1.c);
        c.a(parcel, 3, zzqd1.d);
        c.a(parcel, 4, zzqd1.e);
        c.b(parcel, 5, zzqd1.f);
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
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
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 5: // '\005'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.t(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new zzqd(i, s3, s2, s1, s, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzqd[i];
    }
}
