// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.internal:
//            hr, hn

public final class jb
    implements android.os.Parcelable.Creator
{

    public jb()
    {
    }

    static void a(hr hr1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, hr1.a(), i, false);
        c.a(parcel, 1000, hr1.b);
        c.a(parcel, 2, hr1.b(), i, false);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        LocationRequest locationrequest = null;
        int i = 0;
        hn hn1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    locationrequest = (LocationRequest)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LocationRequest.h);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    hn1 = (hn)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, com.google.android.gms.internal.hn.a);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new hr(i, locationrequest, hn1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new hr[i];
    }
}
