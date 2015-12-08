// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.appdatasearch.Feature;

public final class jtq
    implements android.os.Parcelable.Creator
{

    public jtq()
    {
    }

    public static void a(Feature feature, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, feature.b);
        b.c(parcel, 1000, feature.a);
        b.a(parcel, 2, feature.c, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = b.b(parcel);
        android.os.Bundle bundle = null;
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
                    bundle = b.k(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new Feature(i, j, bundle);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new Feature[i];
    }
}
