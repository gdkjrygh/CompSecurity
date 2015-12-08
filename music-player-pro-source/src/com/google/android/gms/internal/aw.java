// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            av, bj

public class aw
    implements android.os.Parcelable.Creator
{

    public aw()
    {
    }

    static void a(av av1, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.H(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, av1.versionCode);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, av1.od);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, av1.extras, false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 4, av1.oe);
        com.google.android.gms.common.internal.safeparcel.b.b(parcel, 5, av1.of, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, av1.og);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 7, av1.oh);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, av1.oi);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, av1.oj, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, av1.ok, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, av1.ol, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 12, av1.om, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 13, av1.on, false);
        com.google.android.gms.common.internal.safeparcel.b.H(parcel, j);
    }

    public av b(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int k = 0;
        long l1 = 0L;
        android.os.Bundle bundle1 = null;
        int j = 0;
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        int i = 0;
        boolean flag = false;
        String s1 = null;
        bj bj1 = null;
        Location location = null;
        String s = null;
        android.os.Bundle bundle = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 3: // '\003'
                    bundle1 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, i1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 5: // '\005'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.C(parcel, i1);
                    break;

                case 6: // '\006'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 9: // '\t'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 10: // '\n'
                    bj1 = (bj)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, bj.CREATOR);
                    break;

                case 11: // '\013'
                    location = (Location)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Location.CREATOR);
                    break;

                case 12: // '\f'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 13: // '\r'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new av(k, l1, bundle1, j, arraylist, flag1, i, flag, s1, bj1, location, s, bundle);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return b(parcel);
    }

    public av[] f(int i)
    {
        return new av[i];
    }

    public Object[] newArray(int i)
    {
        return f(i);
    }
}
