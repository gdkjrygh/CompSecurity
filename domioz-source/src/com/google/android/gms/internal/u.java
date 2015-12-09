// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzax

public final class u
    implements android.os.Parcelable.Creator
{

    public u()
    {
    }

    public static zzax a(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int k = 0;
        long l1 = 0L;
        android.os.Bundle bundle2 = null;
        int j = 0;
        java.util.ArrayList arraylist1 = null;
        boolean flag1 = false;
        int i = 0;
        boolean flag = false;
        String s2 = null;
        zzbs zzbs1 = null;
        Location location = null;
        String s1 = null;
        android.os.Bundle bundle1 = null;
        android.os.Bundle bundle = null;
        java.util.ArrayList arraylist = null;
        String s = null;
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
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    bundle2 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 5: // '\005'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.t(parcel, i1);
                    break;

                case 6: // '\006'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 9: // '\t'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 10: // '\n'
                    zzbs1 = (zzbs)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, zzbs.CREATOR);
                    break;

                case 11: // '\013'
                    location = (Location)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Location.CREATOR);
                    break;

                case 12: // '\f'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 13: // '\r'
                    bundle1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 14: // '\016'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 15: // '\017'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.t(parcel, i1);
                    break;

                case 16: // '\020'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new zzax(k, l1, bundle2, j, arraylist1, flag1, i, flag, s2, zzbs1, location, s1, bundle1, bundle, arraylist, s);
            }
        } while (true);
    }

    static void a(zzax zzax1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, zzax1.a);
        c.a(parcel, 2, zzax1.b);
        c.a(parcel, 3, zzax1.c);
        c.a(parcel, 4, zzax1.d);
        c.b(parcel, 5, zzax1.e);
        c.a(parcel, 6, zzax1.f);
        c.a(parcel, 7, zzax1.g);
        c.a(parcel, 8, zzax1.h);
        c.a(parcel, 9, zzax1.i);
        c.a(parcel, 10, zzax1.j, i);
        c.a(parcel, 11, zzax1.k, i);
        c.a(parcel, 12, zzax1.l);
        c.a(parcel, 13, zzax1.m);
        c.a(parcel, 14, zzax1.n);
        c.b(parcel, 15, zzax1.o);
        c.a(parcel, 16, zzax1.p);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new zzax[i];
    }
}
