// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;

public final class jou
    implements android.os.Parcelable.Creator
{

    public jou()
    {
    }

    public static void a(AdLauncherIntentInfoParcel adlauncherintentinfoparcel, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, adlauncherintentinfoparcel.a);
        b.a(parcel, 2, adlauncherintentinfoparcel.b, false);
        b.a(parcel, 3, adlauncherintentinfoparcel.c, false);
        b.a(parcel, 4, adlauncherintentinfoparcel.d, false);
        b.a(parcel, 5, adlauncherintentinfoparcel.e, false);
        b.a(parcel, 6, adlauncherintentinfoparcel.f, false);
        b.a(parcel, 7, adlauncherintentinfoparcel.g, false);
        b.a(parcel, 8, adlauncherintentinfoparcel.h, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = b.b(parcel);
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
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    s6 = b.i(parcel, k);
                    break;

                case 3: // '\003'
                    s5 = b.i(parcel, k);
                    break;

                case 4: // '\004'
                    s4 = b.i(parcel, k);
                    break;

                case 5: // '\005'
                    s3 = b.i(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = b.i(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = b.i(parcel, k);
                    break;

                case 8: // '\b'
                    s = b.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
