// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.wearable.zze;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzu

public final class bc
    implements android.os.Parcelable.Creator
{

    public bc()
    {
    }

    static void a(zzu zzu1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, zzu1.a);
        c.a(parcel, 2, zzu1.b);
        c.a(parcel, 3, zzu1.c, i);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        zze zze1 = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 3: // '\003'
                    zze1 = (zze)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, zze.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new zzu(i, j, zze1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzu[i];
    }
}
