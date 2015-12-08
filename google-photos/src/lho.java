// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

public final class lho
    implements android.os.Parcelable.Creator
{

    public lho()
    {
    }

    public static LocationRequestUpdateData a(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int k = b.b(parcel);
        int j = 0;
        int i = 1;
        PendingIntent pendingintent = null;
        android.os.IBinder ibinder1 = null;
        LocationRequestInternal locationrequestinternal = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    b.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, l);
                    break;

                case 1000: 
                    j = b.e(parcel, l);
                    break;

                case 2: // '\002'
                    locationrequestinternal = (LocationRequestInternal)b.a(parcel, l, LocationRequestInternal.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder1 = b.j(parcel, l);
                    break;

                case 4: // '\004'
                    pendingintent = (PendingIntent)b.a(parcel, l, PendingIntent.CREATOR);
                    break;

                case 5: // '\005'
                    ibinder = b.j(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new LocationRequestUpdateData(j, i, locationrequestinternal, ibinder1, pendingintent, ibinder);
            }
        } while (true);
    }

    public static void a(LocationRequestUpdateData locationrequestupdatedata, Parcel parcel, int i)
    {
        Object obj = null;
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, locationrequestupdatedata.b);
        b.c(parcel, 1000, locationrequestupdatedata.a);
        b.a(parcel, 2, locationrequestupdatedata.c, i, false);
        android.os.IBinder ibinder;
        if (locationrequestupdatedata.d == null)
        {
            ibinder = null;
        } else
        {
            ibinder = locationrequestupdatedata.d.asBinder();
        }
        b.a(parcel, 3, ibinder, false);
        b.a(parcel, 4, locationrequestupdatedata.e, i, false);
        if (locationrequestupdatedata.f == null)
        {
            locationrequestupdatedata = obj;
        } else
        {
            locationrequestupdatedata = locationrequestupdatedata.f.asBinder();
        }
        b.a(parcel, 5, locationrequestupdatedata, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new LocationRequestUpdateData[i];
    }
}
