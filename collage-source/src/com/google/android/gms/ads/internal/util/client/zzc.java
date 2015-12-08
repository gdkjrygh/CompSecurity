// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.util.client:
//            VersionInfoParcel

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void zza(VersionInfoParcel versioninfoparcel, Parcel parcel, int i)
    {
        i = b.a(parcel);
        b.a(parcel, 1, versioninfoparcel.versionCode);
        b.a(parcel, 2, versioninfoparcel.zzIz, false);
        b.a(parcel, 3, versioninfoparcel.zzIA);
        b.a(parcel, 4, versioninfoparcel.zzIB);
        b.a(parcel, 5, versioninfoparcel.zzIC);
        b.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzq(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzN(i);
    }

    public VersionInfoParcel[] zzN(int i)
    {
        return new VersionInfoParcel[i];
    }

    public VersionInfoParcel zzq(Parcel parcel)
    {
        boolean flag = false;
        int l = a.b(parcel);
        String s = null;
        int i = 0;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = a.a(parcel);
                switch (a.a(i1))
                {
                default:
                    a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = a.d(parcel, i1);
                    break;

                case 2: // '\002'
                    s = a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    j = a.d(parcel, i1);
                    break;

                case 4: // '\004'
                    i = a.d(parcel, i1);
                    break;

                case 5: // '\005'
                    flag = a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new VersionInfoParcel(k, s, j, i, flag);
            }
        } while (true);
    }
}
