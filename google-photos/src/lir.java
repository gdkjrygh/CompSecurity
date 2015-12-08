// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;

public final class lir
    implements android.os.Parcelable.Creator
{

    public lir()
    {
    }

    public static void a(LocationSettingsResult locationsettingsresult, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.a(parcel, 1, locationsettingsresult.a_(), i, false);
        b.c(parcel, 1000, locationsettingsresult.a);
        b.a(parcel, 2, locationsettingsresult.b, i, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = b.b(parcel);
        Status status = null;
        int i = 0;
        LocationSettingsStates locationsettingsstates = null;
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
                    status = (Status)b.a(parcel, k, Status.CREATOR);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    locationsettingsstates = (LocationSettingsStates)b.a(parcel, k, LocationSettingsStates.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LocationSettingsResult(i, status, locationsettingsstates);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new LocationSettingsResult[i];
    }
}
