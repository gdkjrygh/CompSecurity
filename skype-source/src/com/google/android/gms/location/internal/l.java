// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.internal:
//            ParcelableGeofence

public final class l
    implements android.os.Parcelable.Creator
{

    public l()
    {
    }

    static void a(ParcelableGeofence parcelablegeofence, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, parcelablegeofence.f());
        b.a(parcel, 1000, parcelablegeofence.a());
        b.a(parcel, 2, parcelablegeofence.g());
        b.a(parcel, parcelablegeofence.b());
        b.a(parcel, 4, parcelablegeofence.c());
        b.a(parcel, 5, parcelablegeofence.d());
        b.a(parcel, 6, parcelablegeofence.e());
        b.a(parcel, 7, parcelablegeofence.h());
        b.a(parcel, 8, parcelablegeofence.i());
        b.a(parcel, 9, parcelablegeofence.j());
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i1 = 0;
        String s = null;
        int k = 0;
        short word0 = 0;
        double d1 = 0.0D;
        double d = 0.0D;
        float f = 0.0F;
        long l1 = 0L;
        int j = 0;
        int i = -1;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = parcel.readInt();
                switch (0xffff & k1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k1);
                    break;

                case 1000: 
                    i1 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 3: // '\003'
                    word0 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k1);
                    break;

                case 4: // '\004'
                    d1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k1);
                    break;

                case 5: // '\005'
                    d = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k1);
                    break;

                case 6: // '\006'
                    f = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k1);
                    break;

                case 7: // '\007'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 8: // '\b'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j1).toString(), parcel);
            } else
            {
                return new ParcelableGeofence(i1, s, k, word0, d1, d, f, l1, j, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ParcelableGeofence[i];
    }
}
