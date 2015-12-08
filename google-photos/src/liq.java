// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.Collections;

public final class liq
    implements android.os.Parcelable.Creator
{

    public liq()
    {
    }

    public static void a(LocationSettingsRequest locationsettingsrequest, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, Collections.unmodifiableList(locationsettingsrequest.b), false);
        b.c(parcel, 1000, locationsettingsrequest.a);
        b.a(parcel, 2, locationsettingsrequest.c);
        b.a(parcel, 3, locationsettingsrequest.d);
        b.a(parcel, 4, locationsettingsrequest.e);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = b.b(parcel);
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        boolean flag2 = false;
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
                    arraylist = b.c(parcel, k, LocationRequest.CREATOR);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    flag2 = b.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = b.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag = b.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LocationSettingsRequest(i, arraylist, flag2, flag1, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new LocationSettingsRequest[i];
    }
}
