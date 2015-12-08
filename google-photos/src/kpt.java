// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;

public final class kpt
    implements android.os.Parcelable.Creator
{

    public kpt()
    {
    }

    public static void a(OverflowMenuItem overflowmenuitem, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, overflowmenuitem.a);
        b.c(parcel, 2, overflowmenuitem.b);
        b.a(parcel, 3, overflowmenuitem.c, false);
        b.a(parcel, 4, overflowmenuitem.d, i, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Intent intent = null;
        int k = b.b(parcel);
        int j = 0;
        int i = 0;
        String s = null;
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
                    i = b.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = b.e(parcel, l);
                    break;

                case 3: // '\003'
                    s = b.i(parcel, l);
                    break;

                case 4: // '\004'
                    intent = (Intent)b.a(parcel, l, Intent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new OverflowMenuItem(i, j, s, intent);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new OverflowMenuItem[i];
    }
}
