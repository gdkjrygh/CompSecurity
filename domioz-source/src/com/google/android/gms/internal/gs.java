// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            zziz, zzit

public final class gs
    implements android.os.Parcelable.Creator
{

    public gs()
    {
    }

    static void a(zziz zziz1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, zziz1.b);
        c.a(parcel, 1000, zziz1.a);
        c.a(parcel, 2, zziz1.c);
        c.a(parcel, 3, zziz1.d);
        c.a(parcel, 4, zziz1.e);
        c.a(parcel, 5, zziz1.f);
        c.a(parcel, 6, zziz1.g);
        c.a(parcel, 7, zziz1.h, i);
        c.a(parcel, 8, zziz1.i);
        c.a(parcel, 11, zziz1.j);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 1;
        int ai[] = null;
        zzit azzit[] = null;
        String s1 = null;
        boolean flag1 = false;
        String s2 = null;
        String s3 = null;
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
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 7: // '\007'
                    azzit = (zzit[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, zzit.CREATOR);
                    break;

                case 8: // '\b'
                    ai = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 11: // '\013'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new zziz(j, s3, s2, flag1, i, flag, s1, azzit, ai, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zziz[i];
    }
}
