// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsStates;

public final class lis
    implements android.os.Parcelable.Creator
{

    public lis()
    {
    }

    public static void a(LocationSettingsStates locationsettingsstates, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.a(parcel, 1, locationsettingsstates.b);
        b.c(parcel, 1000, locationsettingsstates.a);
        b.a(parcel, 2, locationsettingsstates.c);
        b.a(parcel, 3, locationsettingsstates.d);
        b.a(parcel, 4, locationsettingsstates.e);
        b.a(parcel, 5, locationsettingsstates.f);
        b.a(parcel, 6, locationsettingsstates.g);
        b.a(parcel, 7, locationsettingsstates.h);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = b.b(parcel);
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;
        int i = 0;
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
                    flag6 = b.c(parcel, k);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    flag5 = b.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag4 = b.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag3 = b.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag2 = b.c(parcel, k);
                    break;

                case 6: // '\006'
                    flag1 = b.c(parcel, k);
                    break;

                case 7: // '\007'
                    flag = b.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LocationSettingsStates(i, flag6, flag5, flag4, flag3, flag2, flag1, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new LocationSettingsStates[i];
    }
}
