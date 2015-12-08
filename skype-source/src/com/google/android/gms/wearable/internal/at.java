// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AmsEntityUpdateParcelable

public final class at
    implements android.os.Parcelable.Creator
{

    public at()
    {
    }

    static void a(AmsEntityUpdateParcelable amsentityupdateparcelable, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, amsentityupdateparcelable.a);
        b.a(parcel, 2, amsentityupdateparcelable.a());
        b.a(parcel, 3, amsentityupdateparcelable.b());
        b.a(parcel, 4, amsentityupdateparcelable.c());
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        byte byte1 = 0;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s = null;
        byte byte0 = 0;
        int i = 0;
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
                    byte0 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 3: // '\003'
                    byte1 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AmsEntityUpdateParcelable(i, byte0, byte1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AmsEntityUpdateParcelable[i];
    }
}
