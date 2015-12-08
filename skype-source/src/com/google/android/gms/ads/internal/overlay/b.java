// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdLauncherIntentInfoParcel

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(AdLauncherIntentInfoParcel adlauncherintentinfoparcel, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, adlauncherintentinfoparcel.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, adlauncherintentinfoparcel.b);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, adlauncherintentinfoparcel.c);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, adlauncherintentinfoparcel.d);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, adlauncherintentinfoparcel.e);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, adlauncherintentinfoparcel.f);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, adlauncherintentinfoparcel.g);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, adlauncherintentinfoparcel.h);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 3: // '\003'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 4: // '\004'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AdLauncherIntentInfoParcel(i, s6, s5, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AdLauncherIntentInfoParcel[i];
    }
}
