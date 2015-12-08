// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.sharing.LocalContent;

public final class llz
    implements android.os.Parcelable.Creator
{

    public llz()
    {
    }

    public static void a(LocalContent localcontent, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, localcontent.a);
        b.c(parcel, 2, localcontent.b);
        b.a(parcel, 3, localcontent.c, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = b.b(parcel);
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
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new LocalContent(i, j, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new LocalContent[i];
    }
}
