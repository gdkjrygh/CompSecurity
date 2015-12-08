// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.ClientIdentity;
import com.google.android.gms.location.internal.LocationRequestInternal;

public final class lhn
    implements android.os.Parcelable.Creator
{

    public lhn()
    {
    }

    public static LocationRequestInternal a(Parcel parcel)
    {
        String s = null;
        boolean flag1 = true;
        boolean flag = false;
        int j = b.b(parcel);
        Object obj = LocationRequestInternal.a;
        boolean flag2 = true;
        boolean flag3 = false;
        LocationRequest locationrequest = null;
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
                    locationrequest = (LocationRequest)b.a(parcel, k, LocationRequest.CREATOR);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    flag3 = b.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag2 = b.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag1 = b.c(parcel, k);
                    break;

                case 5: // '\005'
                    obj = b.c(parcel, k, ClientIdentity.CREATOR);
                    break;

                case 6: // '\006'
                    s = b.i(parcel, k);
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
                return new LocationRequestInternal(i, locationrequest, flag3, flag2, flag1, ((java.util.List) (obj)), s, flag);
            }
        } while (true);
    }

    public static void a(LocationRequestInternal locationrequestinternal, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.a(parcel, 1, locationrequestinternal.c, i, false);
        b.c(parcel, 1000, locationrequestinternal.b);
        b.a(parcel, 2, locationrequestinternal.d);
        b.a(parcel, 3, locationrequestinternal.e);
        b.a(parcel, 4, locationrequestinternal.f);
        b.c(parcel, 5, locationrequestinternal.g, false);
        b.a(parcel, 6, locationrequestinternal.h, false);
        b.a(parcel, 7, locationrequestinternal.i);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new LocationRequestInternal[i];
    }
}
