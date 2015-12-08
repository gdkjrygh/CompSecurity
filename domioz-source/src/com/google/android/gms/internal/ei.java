// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Messenger;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            zzgo, zzax, zzba, zzhy

public final class ei
    implements android.os.Parcelable.Creator
{

    public ei()
    {
    }

    static void a(zzgo zzgo1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, zzgo1.a);
        c.a(parcel, 2, zzgo1.b);
        c.a(parcel, 3, zzgo1.c, i);
        c.a(parcel, 4, zzgo1.d, i);
        c.a(parcel, 5, zzgo1.e);
        c.a(parcel, 6, zzgo1.f, i);
        c.a(parcel, 7, zzgo1.g, i);
        c.a(parcel, 8, zzgo1.h);
        c.a(parcel, 9, zzgo1.i);
        c.a(parcel, 10, zzgo1.j);
        c.a(parcel, 11, zzgo1.k, i);
        c.a(parcel, 12, zzgo1.l);
        c.a(parcel, 13, zzgo1.m);
        c.b(parcel, 14, zzgo1.n);
        c.a(parcel, 15, zzgo1.o);
        c.a(parcel, 17, zzgo1.q, i);
        c.a(parcel, 16, zzgo1.p);
        c.a(parcel, 19, zzgo1.s);
        c.a(parcel, 18, zzgo1.r);
        c.a(parcel, 21, zzgo1.u);
        c.a(parcel, 20, zzgo1.t);
        c.a(parcel, 23, zzgo1.w);
        c.a(parcel, 22, zzgo1.v);
        c.a(parcel, 25, zzgo1.y);
        c.a(parcel, 24, zzgo1.x);
        c.a(parcel, 26, zzgo1.z);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i1 = 0;
        android.os.Bundle bundle2 = null;
        zzax zzax1 = null;
        zzba zzba1 = null;
        String s6 = null;
        ApplicationInfo applicationinfo = null;
        PackageInfo packageinfo = null;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        zzhy zzhy1 = null;
        android.os.Bundle bundle1 = null;
        int l = 0;
        java.util.ArrayList arraylist = null;
        android.os.Bundle bundle = null;
        boolean flag1 = false;
        Messenger messenger = null;
        int k = 0;
        int j = 0;
        float f = 0.0F;
        String s2 = null;
        boolean flag = false;
        int i = 0;
        String s1 = null;
        long l1 = 0L;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = parcel.readInt();
                switch (0xffff & k1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 2: // '\002'
                    bundle2 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k1);
                    break;

                case 3: // '\003'
                    zzax1 = (zzax)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, zzax.CREATOR);
                    break;

                case 4: // '\004'
                    zzba1 = (zzba)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, zzba.CREATOR);
                    break;

                case 5: // '\005'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
                    break;

                case 6: // '\006'
                    applicationinfo = (ApplicationInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, ApplicationInfo.CREATOR);
                    break;

                case 7: // '\007'
                    packageinfo = (PackageInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, PackageInfo.CREATOR);
                    break;

                case 8: // '\b'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
                    break;

                case 9: // '\t'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
                    break;

                case 10: // '\n'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
                    break;

                case 11: // '\013'
                    zzhy1 = (zzhy)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, zzhy.CREATOR);
                    break;

                case 12: // '\f'
                    bundle1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k1);
                    break;

                case 13: // '\r'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 14: // '\016'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.t(parcel, k1);
                    break;

                case 15: // '\017'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k1);
                    break;

                case 17: // '\021'
                    messenger = (Messenger)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, Messenger.CREATOR);
                    break;

                case 16: // '\020'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k1);
                    break;

                case 19: // '\023'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 18: // '\022'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 21: // '\025'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
                    break;

                case 20: // '\024'
                    f = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k1);
                    break;

                case 23: // '\027'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 22: // '\026'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k1);
                    break;

                case 25: // '\031'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 24: // '\030'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
                    break;

                case 26: // '\032'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j1).toString(), parcel);
            } else
            {
                return new zzgo(i1, bundle2, zzax1, zzba1, s6, applicationinfo, packageinfo, s5, s4, s3, zzhy1, bundle1, l, arraylist, bundle, flag1, messenger, k, j, f, s2, flag, i, s1, l1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzgo[i];
    }
}
