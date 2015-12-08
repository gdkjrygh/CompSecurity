// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            CapabilityInfoParcelable, NodeParcelable

public final class ba
    implements android.os.Parcelable.Creator
{

    public ba()
    {
    }

    static void a(CapabilityInfoParcelable capabilityinfoparcelable, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, capabilityinfoparcelable.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, capabilityinfoparcelable.b);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 3, capabilityinfoparcelable.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = zza.a(parcel);
        int i = 0;
        String s = null;
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
                    s = zza.l(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist = zza.c(parcel, k, NodeParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CapabilityInfoParcelable(i, s, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new CapabilityInfoParcelable[i];
    }
}
