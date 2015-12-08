// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public final class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    public static DataHolder a(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int k = zza.a(parcel);
        CursorWindow acursorwindow[] = null;
        String as[] = null;
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
                    as = zza.r(parcel, l);
                    break;

                case 1000: 
                    j = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    acursorwindow = (CursorWindow[])zza.b(parcel, l, CursorWindow.CREATOR);
                    break;

                case 3: // '\003'
                    i = zza.e(parcel, l);
                    break;

                case 4: // '\004'
                    bundle = zza.n(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                parcel = new DataHolder(j, as, acursorwindow, i, bundle);
                parcel.a();
                return parcel;
            }
        } while (true);
    }

    static void a(DataHolder dataholder, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, dataholder.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, dataholder.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, dataholder.d, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, dataholder.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, dataholder.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new DataHolder[i];
    }
}
