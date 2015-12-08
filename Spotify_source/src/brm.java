// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.CursorWindow;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class brm
    implements android.os.Parcelable.Creator
{

    public brm()
    {
    }

    public static DataHolder a(Parcel parcel)
    {
        int i = 0;
        int k = zza.a(parcel);
        android.os.Bundle bundle = null;
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
                    l = zza.a(parcel, l);
                    int i1 = parcel.dataPosition();
                    if (l == 0)
                    {
                        as = null;
                    } else
                    {
                        as = parcel.createStringArray();
                        parcel.setDataPosition(l + i1);
                    }
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
                    bundle = zza.j(parcel, l);
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

    public static void a(DataHolder dataholder, Parcel parcel, int i)
    {
        int j = brp.a(parcel, 20293);
        String as[] = dataholder.b;
        if (as != null)
        {
            int k = brp.a(parcel, 1);
            parcel.writeStringArray(as);
            brp.b(parcel, k);
        }
        brp.b(parcel, 1000, dataholder.a);
        brp.a(parcel, 2, dataholder.d, i);
        brp.b(parcel, 3, dataholder.e);
        brp.a(parcel, 4, dataholder.f);
        brp.b(parcel, j);
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
