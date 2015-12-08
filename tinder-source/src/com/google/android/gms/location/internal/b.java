// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.location.internal:
//            ClientIdentity

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(ClientIdentity clientidentity, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, clientidentity.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, clientidentity.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, clientidentity.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = zza.a(parcel);
        String s = null;
        int i = 0;
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

                case 1000: 
                    i = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    s = zza.l(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ClientIdentity(i, j, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ClientIdentity[i];
    }
}
