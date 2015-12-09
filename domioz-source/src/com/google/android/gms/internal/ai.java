// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs

public final class ai
    implements android.os.Parcelable.Creator
{

    public ai()
    {
    }

    static void a(zzbs zzbs1, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, zzbs1.a);
        c.a(parcel, 2, zzbs1.b);
        c.a(parcel, 3, zzbs1.c);
        c.a(parcel, 4, zzbs1.d);
        c.a(parcel, 5, zzbs1.e);
        c.a(parcel, 6, zzbs1.f);
        c.a(parcel, 7, zzbs1.g);
        c.a(parcel, 8, zzbs1.h);
        c.a(parcel, 9, zzbs1.i);
        c.a(parcel, 10, zzbs1.j);
        c.a(parcel, 11, zzbs1.k);
        c.a(parcel, 12, zzbs1.l);
        c.a(parcel, 13, zzbs1.m);
        c.a(parcel, 14, zzbs1.n);
        c.a(parcel, 15, zzbs1.o);
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i3 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int l2 = 0;
        int k2 = 0;
        int j2 = 0;
        int i2 = 0;
        int l1 = 0;
        int k1 = 0;
        int j1 = 0;
        int i1 = 0;
        int l = 0;
        String s2 = null;
        int k = 0;
        String s1 = null;
        int j = 0;
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < i3)
            {
                int j3 = parcel.readInt();
                switch (0xffff & j3)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j3);
                    break;

                case 1: // '\001'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j3);
                    break;

                case 2: // '\002'
                    k2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j3);
                    break;

                case 3: // '\003'
                    j2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j3);
                    break;

                case 4: // '\004'
                    i2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j3);
                    break;

                case 5: // '\005'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j3);
                    break;

                case 6: // '\006'
                    k1 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j3);
                    break;

                case 7: // '\007'
                    j1 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j3);
                    break;

                case 8: // '\b'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j3);
                    break;

                case 9: // '\t'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j3);
                    break;

                case 10: // '\n'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j3);
                    break;

                case 11: // '\013'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j3);
                    break;

                case 12: // '\f'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j3);
                    break;

                case 13: // '\r'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j3);
                    break;

                case 14: // '\016'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j3);
                    break;

                case 15: // '\017'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j3);
                    break;
                }
            } else
            if (parcel.dataPosition() != i3)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(i3).toString(), parcel);
            } else
            {
                return new zzbs(l2, k2, j2, i2, l1, k1, j1, i1, l, s2, k, s1, j, i, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzbs[i];
    }
}
