// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            zzir, zziz

public final class gm
    implements android.os.Parcelable.Creator
{

    public gm()
    {
    }

    static void a(zzir zzir1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, zzir1.c);
        c.a(parcel, 1000, zzir1.b);
        c.a(parcel, 3, zzir1.d, i);
        c.a(parcel, 4, zzir1.e);
        c.a(parcel, 5, zzir1.f);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        byte abyte0[] = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        int i = -1;
        zziz zziz1 = null;
        String s = null;
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
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 3: // '\003'
                    zziz1 = (zziz)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, zziz.CREATOR);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 5: // '\005'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new zzir(j, s, zziz1, i, abyte0);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzir[i];
    }
}
