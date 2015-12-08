// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzp, zzl, zzn

public final class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(zzp zzp1, Parcel parcel, int i)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, zzp1.a());
        c.a(parcel, 2, zzp1.a);
        c.a(parcel, 3, zzp1.b);
        c.a(parcel, 4, zzp1.c, i);
        c.a(parcel, 5, zzp1.d, i);
        c.a(parcel, 6, zzp1.e, i);
        c.a(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        zzn zzn1 = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        zzn zzn2 = null;
        zzl zzl1 = null;
        String s = null;
        String s1 = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 4: // '\004'
                    zzl1 = (zzl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, zzl.CREATOR);
                    break;

                case 5: // '\005'
                    zzn2 = (zzn)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, zzn.CREATOR);
                    break;

                case 6: // '\006'
                    zzn1 = (zzn)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, zzn.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new zzp(i, s1, s, zzl1, zzn2, zzn1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzp[i];
    }
}
