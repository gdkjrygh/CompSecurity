// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.location.internal:
//            LocationRequestInternal, ClientIdentity

public final class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    public static LocationRequestInternal a(Parcel parcel)
    {
        String s = null;
        boolean flag1 = true;
        boolean flag = false;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        Object obj = com.google.android.gms.location.internal.LocationRequestInternal.a;
        boolean flag2 = true;
        boolean flag3 = false;
        LocationRequest locationrequest = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    locationrequest = (LocationRequest)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, LocationRequest.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    flag3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 3: // '\003'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 4: // '\004'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 5: // '\005'
                    obj = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, ClientIdentity.CREATOR);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new LocationRequestInternal(i, locationrequest, flag3, flag2, flag1, ((java.util.List) (obj)), s, flag);
            }
        } while (true);
    }

    static void a(LocationRequestInternal locationrequestinternal, Parcel parcel, int i)
    {
        int k = b.a(parcel);
        b.a(parcel, 1, locationrequestinternal.b, i);
        b.a(parcel, 1000, locationrequestinternal.a());
        b.a(parcel, 2, locationrequestinternal.c);
        b.a(parcel, 3, locationrequestinternal.d);
        b.a(parcel, 4, locationrequestinternal.e);
        b.c(parcel, 5, locationrequestinternal.f);
        b.a(parcel, 6, locationrequestinternal.g);
        b.a(parcel, 7, locationrequestinternal.h);
        b.a(parcel, k);
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
