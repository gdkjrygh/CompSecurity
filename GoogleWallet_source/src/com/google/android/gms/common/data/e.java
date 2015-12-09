// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public final class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(DataHolder dataholder, Parcel parcel, int i)
    {
        int j = b.bU(parcel);
        b.a(parcel, 1, dataholder.is(), false);
        b.c(parcel, 1000, dataholder.getVersionCode());
        b.a(parcel, 2, dataholder.it(), i, false);
        b.c(parcel, 3, dataholder.getStatusCode());
        b.a(parcel, 4, dataholder.getMetadata(), false);
        b.J(parcel, j);
    }

    public static DataHolder bO(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        CursorWindow acursorwindow[] = null;
        String as[] = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    as = com.google.android.gms.common.internal.safeparcel.a.B(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    acursorwindow = (CursorWindow[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, CursorWindow.CREATOR);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 4: // '\004'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.r(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                parcel = new DataHolder(j, as, acursorwindow, i, bundle);
                parcel.ir();
                return parcel;
            }
        } while (true);
    }

    private static DataHolder[] cZ(int i)
    {
        return new DataHolder[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return bO(parcel);
    }

    public final Object[] newArray(int i)
    {
        return cZ(i);
    }
}
