// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.location.internal:
//            ParcelableGeofence

public final class n
    implements android.os.Parcelable.Creator
{

    public n()
    {
    }

    static void a(ParcelableGeofence parcelablegeofence, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, parcelablegeofence.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, parcelablegeofence.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, parcelablegeofence.c);
        short word0 = parcelablegeofence.d;
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, 4);
        parcel.writeInt(word0);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, parcelablegeofence.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, parcelablegeofence.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, parcelablegeofence.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 7, parcelablegeofence.h);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 8, parcelablegeofence.i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 9, parcelablegeofence.j);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i1 = zza.a(parcel);
        int l = 0;
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
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    zza.b(parcel, j1);
                    break;

                case 1: // '\001'
                    s = zza.l(parcel, j1);
                    break;

                case 1000: 
                    l = zza.e(parcel, j1);
                    break;

                case 2: // '\002'
                    l1 = zza.f(parcel, j1);
                    break;

                case 3: // '\003'
                    zza.a(parcel, j1, 4);
                    word0 = (short)parcel.readInt();
                    break;

                case 4: // '\004'
                    d1 = zza.j(parcel, j1);
                    break;

                case 5: // '\005'
                    d = zza.j(parcel, j1);
                    break;

                case 6: // '\006'
                    f = zza.i(parcel, j1);
                    break;

                case 7: // '\007'
                    k = zza.e(parcel, j1);
                    break;

                case 8: // '\b'
                    j = zza.e(parcel, j1);
                    break;

                case 9: // '\t'
                    i = zza.e(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new ParcelableGeofence(l, s, k, word0, d1, d, f, l1, j, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ParcelableGeofence[i];
    }
}
