// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.ads.internal.util.client:
//            VersionInfoParcel

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void a(VersionInfoParcel versioninfoparcel, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, versioninfoparcel.versionCode);
        c.a(parcel, 2, versioninfoparcel.zzJu, false);
        c.a(parcel, 3, versioninfoparcel.zzJv);
        c.a(parcel, 4, versioninfoparcel.zzJw);
        c.a(parcel, 5, versioninfoparcel.zzJx);
        c.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzp(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzO(i);
    }

    public VersionInfoParcel[] zzO(int i)
    {
        return new VersionInfoParcel[i];
    }

    public VersionInfoParcel zzp(Parcel parcel)
    {
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s = null;
        int i = 0;
        int j = 0;
        int k = 0;
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
                    k = com.google.android.gms.common.internal.safeparcel.a.d(parcel, i1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, i1);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.d(parcel, i1);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, i1);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new VersionInfoParcel(k, s, j, i, flag);
            }
        } while (true);
    }
}
