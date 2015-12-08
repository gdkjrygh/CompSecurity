// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.sharing.ViewableItem;

public final class lmb
    implements android.os.Parcelable.Creator
{

    public lmb()
    {
    }

    public static void a(ViewableItem viewableitem, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, viewableitem.a);
        b.a(parcel, 2, viewableitem.b, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = b.b(parcel);
        int i = 0;
        String as[] = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    as = b.n(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ViewableItem(i, as);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ViewableItem[i];
    }
}
