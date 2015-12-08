// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            AppMetadata

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    public static AppMetadata a(Parcel parcel)
    {
        long l1 = 0L;
        String s = null;
        int k = zza.a(parcel);
        int j = 0;
        long l2 = 0L;
        String s1 = null;
        String s2 = null;
        String s3 = null;
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
                    l2 = zza.f(parcel, l);
                    break;

                case 7: // '\007'
                    l1 = zza.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new AppMetadata(j, s3, s2, s1, s, l2, l1);
            }
        } while (true);
    }

    static void a(AppMetadata appmetadata, Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, appmetadata.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, appmetadata.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, appmetadata.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, appmetadata.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, appmetadata.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, appmetadata.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, appmetadata.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int j)
    {
        return new AppMetadata[j];
    }
}
