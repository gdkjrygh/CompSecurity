// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public final class jpy
    implements android.os.Parcelable.Creator
{

    public jpy()
    {
    }

    public static void a(VersionInfoParcel versioninfoparcel, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, versioninfoparcel.a);
        b.a(parcel, 2, versioninfoparcel.b, false);
        b.c(parcel, 3, versioninfoparcel.c);
        b.c(parcel, 4, versioninfoparcel.d);
        b.a(parcel, 5, versioninfoparcel.e);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int l = b.b(parcel);
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
                    b.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = b.e(parcel, i1);
                    break;

                case 2: // '\002'
                    s = b.i(parcel, i1);
                    break;

                case 3: // '\003'
                    j = b.e(parcel, i1);
                    break;

                case 4: // '\004'
                    i = b.e(parcel, i1);
                    break;

                case 5: // '\005'
                    flag = b.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
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
