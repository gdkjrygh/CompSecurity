// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void a(DataHolder dataholder, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, dataholder.c(), false);
        zzb.a(parcel, 1000, dataholder.b());
        zzb.a(parcel, 2, dataholder.d(), i, false);
        zzb.a(parcel, 3, dataholder.e());
        zzb.a(parcel, 4, dataholder.f(), false);
        zzb.a(parcel, j);
    }

    public DataHolder a(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int k = zza.b(parcel);
        CursorWindow acursorwindow[] = null;
        String as[] = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = zza.a(parcel);
                switch (zza.a(l))
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    as = zza.y(parcel, l);
                    break;

                case 1000: 
                    j = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    acursorwindow = (CursorWindow[])zza.b(parcel, l, CursorWindow.CREATOR);
                    break;

                case 3: // '\003'
                    i = zza.f(parcel, l);
                    break;

                case 4: // '\004'
                    bundle = zza.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                parcel = new DataHolder(j, as, acursorwindow, i, bundle);
                parcel.a();
                return parcel;
            }
        } while (true);
    }

    public DataHolder[] a(int i)
    {
        return new DataHolder[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
