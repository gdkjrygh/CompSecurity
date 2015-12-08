// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            v

public class w
    implements android.os.Parcelable.Creator
{

    public w()
    {
    }

    static void a(v v1, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.b.k(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, v1.versionCode);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, v1.es);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, v1.extras, false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 4, v1.et);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, v1.eu, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, v1.ev);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 7, v1.tagForChildDirectedTreatment);
        com.google.android.gms.common.internal.safeparcel.b.C(parcel, i);
    }

    public v a(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        long l1 = 0L;
        boolean flag = false;
        int j = 0;
        android.os.Bundle bundle = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(i1))
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
                    bundle = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 5: // '\005'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.x(parcel, i1);
                    break;

                case 6: // '\006'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new v(k, l1, bundle, j, arraylist, flag, i);
            }
        } while (true);
    }

    public v[] b(int i)
    {
        return new v[i];
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
