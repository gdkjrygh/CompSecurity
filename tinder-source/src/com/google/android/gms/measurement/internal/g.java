// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            UserAttributeParcel

public final class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    public static UserAttributeParcel a(Parcel parcel)
    {
        int j = zza.a(parcel);
        int i = 0;
        long l = 0L;
        String s = null;
        String s1 = null;
        Float float1 = null;
        Long long1 = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    s2 = zza.l(parcel, k);
                    break;

                case 3: // '\003'
                    l = zza.f(parcel, k);
                    break;

                case 4: // '\004'
                    long1 = zza.g(parcel, k);
                    break;

                case 5: // '\005'
                    k = zza.a(parcel, k);
                    if (k == 0)
                    {
                        float1 = null;
                    } else
                    {
                        zza.b(parcel, k, 4);
                        float1 = Float.valueOf(parcel.readFloat());
                    }
                    break;

                case 6: // '\006'
                    s1 = zza.l(parcel, k);
                    break;

                case 7: // '\007'
                    s = zza.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new UserAttributeParcel(i, s2, l, long1, float1, s1, s);
            }
        } while (true);
    }

    static void a(UserAttributeParcel userattributeparcel, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, userattributeparcel.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, userattributeparcel.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, userattributeparcel.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, userattributeparcel.d);
        Float float1 = userattributeparcel.e;
        if (float1 != null)
        {
            com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, 4);
            parcel.writeFloat(float1.floatValue());
        }
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, userattributeparcel.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, userattributeparcel.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new UserAttributeParcel[i];
    }
}
