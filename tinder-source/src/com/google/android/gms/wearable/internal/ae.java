// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            NodeParcelable

public final class ae
    implements android.os.Parcelable.Creator
{

    public ae()
    {
    }

    static void a(NodeParcelable nodeparcelable, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, nodeparcelable.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, nodeparcelable.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, nodeparcelable.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, nodeparcelable.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, nodeparcelable.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int k = zza.a(parcel);
        int i = 0;
        String s1 = null;
        int j = 0;
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
                    s1 = zza.l(parcel, l);
                    break;

                case 3: // '\003'
                    s = zza.l(parcel, l);
                    break;

                case 4: // '\004'
                    i = zza.e(parcel, l);
                    break;

                case 5: // '\005'
                    flag = zza.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new NodeParcelable(j, s1, s, i, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new NodeParcelable[i];
    }
}
