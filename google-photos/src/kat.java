// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.CursorWindow;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

public final class kat
    implements android.os.Parcelable.Creator
{

    public kat()
    {
    }

    public static DataHolder a(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int k = b.b(parcel);
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
                    b.b(parcel, l);
                    break;

                case 1: // '\001'
                    as = b.n(parcel, l);
                    break;

                case 1000: 
                    j = b.e(parcel, l);
                    break;

                case 2: // '\002'
                    acursorwindow = (CursorWindow[])b.b(parcel, l, CursorWindow.CREATOR);
                    break;

                case 3: // '\003'
                    i = b.e(parcel, l);
                    break;

                case 4: // '\004'
                    bundle = b.k(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
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
        int j = b.q(parcel, 20293);
        b.a(parcel, 1, dataholder.b, false);
        b.c(parcel, 1000, dataholder.a);
        b.a(parcel, 2, dataholder.c, i, false);
        b.c(parcel, 3, dataholder.d);
        b.a(parcel, 4, dataholder.e, false);
        b.r(parcel, j);
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
