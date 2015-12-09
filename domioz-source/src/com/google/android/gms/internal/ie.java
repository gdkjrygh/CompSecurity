// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            zzlk, zzlh

public final class ie
    implements android.os.Parcelable.Creator
{

    public ie()
    {
    }

    static void a(zzlk zzlk1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, zzlk1.d());
        c.a(parcel, zzlk1.e());
        c.a(parcel, 3, zzlk1.f(), i);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        zzlh zzlh1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        Parcel parcel1 = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    parcel1 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, k);
                    break;

                case 3: // '\003'
                    zzlh1 = (zzlh)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, zzlh.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new zzlk(i, parcel1, zzlh1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzlk[i];
    }
}
