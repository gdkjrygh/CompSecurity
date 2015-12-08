// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class bhl
    implements android.os.Parcelable.Creator
{

    public bhl()
    {
    }

    public static void a(AdLauncherIntentInfoParcel adlauncherintentinfoparcel, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, adlauncherintentinfoparcel.a);
        brp.a(parcel, 2, adlauncherintentinfoparcel.b);
        brp.a(parcel, 3, adlauncherintentinfoparcel.c);
        brp.a(parcel, 4, adlauncherintentinfoparcel.d);
        brp.a(parcel, 5, adlauncherintentinfoparcel.e);
        brp.a(parcel, 6, adlauncherintentinfoparcel.f);
        brp.a(parcel, 7, adlauncherintentinfoparcel.g);
        brp.a(parcel, 8, adlauncherintentinfoparcel.h);
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = zza.a(parcel);
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
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    s6 = zza.h(parcel, k);
                    break;

                case 3: // '\003'
                    s5 = zza.h(parcel, k);
                    break;

                case 4: // '\004'
                    s4 = zza.h(parcel, k);
                    break;

                case 5: // '\005'
                    s3 = zza.h(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = zza.h(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = zza.h(parcel, k);
                    break;

                case 8: // '\b'
                    s = zza.h(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
