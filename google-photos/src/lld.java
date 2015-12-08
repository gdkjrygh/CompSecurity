// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.messages.Strategy;

public final class lld
    implements android.os.Parcelable.Creator
{

    public lld()
    {
    }

    public static void a(Strategy strategy, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, strategy.b);
        b.c(parcel, 1000, strategy.a);
        b.c(parcel, 2, strategy.c);
        b.c(parcel, 3, strategy.d);
        b.a(parcel, 4, strategy.e);
        b.c(parcel, 5, strategy.f);
        b.c(parcel, 6, strategy.g);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        int k1 = b.b(parcel);
        int j = 0;
        boolean flag = false;
        int k = 0;
        int l = 0;
        int i1 = 0;
        int j1 = 0;
        do
        {
            if (parcel.dataPosition() < k1)
            {
                int l1 = parcel.readInt();
                switch (0xffff & l1)
                {
                default:
                    b.b(parcel, l1);
                    break;

                case 1: // '\001'
                    i1 = b.e(parcel, l1);
                    break;

                case 1000: 
                    j1 = b.e(parcel, l1);
                    break;

                case 2: // '\002'
                    l = b.e(parcel, l1);
                    break;

                case 3: // '\003'
                    k = b.e(parcel, l1);
                    break;

                case 4: // '\004'
                    flag = b.c(parcel, l1);
                    break;

                case 5: // '\005'
                    j = b.e(parcel, l1);
                    break;

                case 6: // '\006'
                    i = b.e(parcel, l1);
                    break;
                }
            } else
            if (parcel.dataPosition() != k1)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k1).toString(), parcel);
            } else
            {
                return new Strategy(j1, i1, l, k, flag, j, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new Strategy[i];
    }
}
