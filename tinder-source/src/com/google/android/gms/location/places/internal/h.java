// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlacesParams

public final class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(PlacesParams placesparams, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, placesparams.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, placesparams.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, placesparams.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, placesparams.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, placesparams.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, placesparams.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 6, placesparams.h);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = zza.a(parcel);
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    s4 = zza.l(parcel, l);
                    break;

                case 1000: 
                    j = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    s3 = zza.l(parcel, l);
                    break;

                case 3: // '\003'
                    s2 = zza.l(parcel, l);
                    break;

                case 4: // '\004'
                    s1 = zza.l(parcel, l);
                    break;

                case 5: // '\005'
                    s = zza.l(parcel, l);
                    break;

                case 6: // '\006'
                    i = zza.e(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new PlacesParams(j, s4, s3, s2, s1, s, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PlacesParams[i];
    }
}
