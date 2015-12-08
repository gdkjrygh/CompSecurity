// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.location.internal.ClientIdentity;

public final class lgz
    implements android.os.Parcelable.Creator
{

    public lgz()
    {
    }

    public static void a(ClientIdentity clientidentity, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, clientidentity.b);
        b.c(parcel, 1000, clientidentity.a);
        b.a(parcel, 2, clientidentity.c, false);
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
                    j = b.e(parcel, l);
                    break;

                case 1000: 
                    i = b.e(parcel, l);
                    break;

                case 2: // '\002'
                    s = b.i(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
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
