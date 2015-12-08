// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AmsEntityUpdateParcelable

public final class av
    implements android.os.Parcelable.Creator
{

    public av()
    {
    }

    static void a(AmsEntityUpdateParcelable amsentityupdateparcelable, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, amsentityupdateparcelable.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, amsentityupdateparcelable.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, amsentityupdateparcelable.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, amsentityupdateparcelable.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        byte byte1 = 0;
        int j = zza.a(parcel);
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
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    byte0 = zza.d(parcel, k);
                    break;

                case 3: // '\003'
                    byte1 = zza.d(parcel, k);
                    break;

                case 4: // '\004'
                    s = zza.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
