// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.connection.AppIdentifier;

public final class lke
    implements android.os.Parcelable.Creator
{

    public lke()
    {
    }

    public static void a(AppIdentifier appidentifier, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.a(parcel, 1, appidentifier.b, false);
        b.c(parcel, 1000, appidentifier.a);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = b.b(parcel);
        int i = 0;
        String s = null;
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
                    s = b.i(parcel, k);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AppIdentifier(i, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AppIdentifier[i];
    }
}
