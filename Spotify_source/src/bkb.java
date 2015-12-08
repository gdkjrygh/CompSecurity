// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class bkb
    implements android.os.Parcelable.Creator
{

    public bkb()
    {
    }

    public static void a(VersionInfoParcel versioninfoparcel, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, versioninfoparcel.a);
        brp.a(parcel, 2, versioninfoparcel.b);
        brp.b(parcel, 3, versioninfoparcel.c);
        brp.b(parcel, 4, versioninfoparcel.d);
        brp.a(parcel, 5, versioninfoparcel.e);
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int l = zza.a(parcel);
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
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    s = zza.h(parcel, i1);
                    break;

                case 3: // '\003'
                    j = zza.e(parcel, i1);
                    break;

                case 4: // '\004'
                    i = zza.e(parcel, i1);
                    break;

                case 5: // '\005'
                    flag = zza.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new VersionInfoParcel(k, s, j, i, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new VersionInfoParcel[i];
    }
}
