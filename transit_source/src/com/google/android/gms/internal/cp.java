// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            co

public class cp
    implements android.os.Parcelable.Creator
{

    public cp()
    {
    }

    static void a(co co1, Parcel parcel, int i)
    {
        i = b.k(parcel);
        b.c(parcel, 1, co1.versionCode);
        b.a(parcel, 2, co1.hP, false);
        b.c(parcel, 3, co1.hQ);
        b.c(parcel, 4, co1.hR);
        b.a(parcel, 5, co1.hS);
        b.C(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return g(parcel);
    }

    public co g(Parcel parcel)
    {
        boolean flag = false;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        String s = null;
        int i = 0;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new co(k, s, j, i, flag);
            }
        } while (true);
    }

    public co[] l(int i)
    {
        return new co[i];
    }

    public Object[] newArray(int i)
    {
        return l(i);
    }
}
