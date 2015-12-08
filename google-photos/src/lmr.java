// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;

public final class lmr
    implements android.os.Parcelable.Creator
{

    public lmr()
    {
    }

    public static ParcelableGetOptions a(Parcel parcel)
    {
        android.os.Bundle bundle = null;
        boolean flag = false;
        int j = b.b(parcel);
        String s = null;
        boolean flag1 = false;
        boolean flag2 = false;
        int i = 0;
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
                    flag2 = b.c(parcel, k);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    flag1 = b.c(parcel, k);
                    break;

                case 3: // '\003'
                    s = b.i(parcel, k);
                    break;

                case 4: // '\004'
                    flag = b.c(parcel, k);
                    break;

                case 5: // '\005'
                    bundle = b.k(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ParcelableGetOptions(i, flag2, flag1, flag, s, bundle);
            }
        } while (true);
    }

    public static void a(ParcelableGetOptions parcelablegetoptions, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.a(parcel, 1, parcelablegetoptions.b);
        b.c(parcel, 1000, parcelablegetoptions.a);
        b.a(parcel, 2, parcelablegetoptions.c);
        b.a(parcel, 3, parcelablegetoptions.d, false);
        b.a(parcel, 4, parcelablegetoptions.e);
        b.a(parcel, 5, parcelablegetoptions.f, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new ParcelableGetOptions[i];
    }
}
