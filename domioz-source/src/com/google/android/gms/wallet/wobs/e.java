// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzg

public final class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(zzg zzg1, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, zzg1.a());
        c.a(parcel, 2, zzg1.a);
        c.a(parcel, 3, zzg1.b);
        c.a(parcel, 4, zzg1.c);
        c.a(parcel, 5, zzg1.d);
        c.a(parcel, 6, zzg1.e);
        c.a(parcel, 7, zzg1.f);
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        double d = 0.0D;
        long l1 = 0L;
        int i = -1;
        String s1 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 4: // '\004'
                    d = com.google.android.gms.common.internal.safeparcel.a.j(parcel, i1);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 6: // '\006'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new zzg(k, j, s1, d, s, l1, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzg[i];
    }
}
