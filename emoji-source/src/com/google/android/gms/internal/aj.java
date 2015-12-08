// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ai, aw

public class aj
    implements android.os.Parcelable.Creator
{

    public aj()
    {
    }

    static void a(ai ai1, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.C(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, ai1.versionCode);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, ai1.lS);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, ai1.extras, false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 4, ai1.lT);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, ai1.lU, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, ai1.lV);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 7, ai1.lW);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, ai1.lX);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, ai1.lY, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, ai1.lZ, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, ai1.ma, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 12, ai1.mb, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 13, ai1.mc, false);
        com.google.android.gms.common.internal.safeparcel.b.G(parcel, j);
    }

    public ai b(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int k = 0;
        long l1 = 0L;
        android.os.Bundle bundle1 = null;
        int j = 0;
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        int i = 0;
        boolean flag = false;
        String s1 = null;
        aw aw1 = null;
        Location location = null;
        String s = null;
        android.os.Bundle bundle = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(i1))
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.B(parcel, i1);
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
                    aw1 = (aw)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, aw.CREATOR);
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
                return new ai(k, l1, bundle1, j, arraylist, flag1, i, flag, s1, aw1, location, s, bundle);
            }
        } while (true);
    }

    public ai[] c(int i)
    {
        return new ai[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return b(parcel);
    }

    public Object[] newArray(int i)
    {
        return c(i);
    }
}
