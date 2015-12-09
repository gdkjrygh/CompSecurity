// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            ah, av

public class ai
    implements android.os.Parcelable.Creator
{

    public ai()
    {
    }

    static void a(ah ah1, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.p(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, ah1.versionCode);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, ah1.lH);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, ah1.extras, false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 4, ah1.lI);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, ah1.lJ, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, ah1.lK);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 7, ah1.lL);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, ah1.lM);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, ah1.lN, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, ah1.lO, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, ah1.lP, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 12, ah1.lQ, false);
        com.google.android.gms.common.internal.safeparcel.b.F(parcel, j);
    }

    public ah a(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int k = 0;
        long l1 = 0L;
        android.os.Bundle bundle = null;
        int j = 0;
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        int i = 0;
        boolean flag = false;
        String s1 = null;
        av av1 = null;
        Location location = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(i1))
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
                    bundle = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 5: // '\005'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.A(parcel, i1);
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 10: // '\n'
                    av1 = (av)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, av.CREATOR);
                    break;

                case 11: // '\013'
                    location = (Location)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Location.CREATOR);
                    break;

                case 12: // '\f'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new ah(k, l1, bundle, j, arraylist, flag1, i, flag, s1, av1, location, s);
            }
        } while (true);
    }

    public ah[] b(int i)
    {
        return new ah[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return b(i);
    }
}
