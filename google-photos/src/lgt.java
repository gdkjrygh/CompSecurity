// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;

public final class lgt
    implements android.os.Parcelable.Creator
{

    public lgt()
    {
    }

    public static LocationRequest a(Parcel parcel)
    {
        int l = b.b(parcel);
        int k = 0;
        int j = 102;
        long l4 = 0x36ee80L;
        long l3 = 0x927c0L;
        boolean flag = false;
        long l2 = 0x7fffffffffffffffL;
        int i = 0x7fffffff;
        float f = 0.0F;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    b.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = b.e(parcel, i1);
                    break;

                case 1000: 
                    k = b.e(parcel, i1);
                    break;

                case 2: // '\002'
                    l4 = b.f(parcel, i1);
                    break;

                case 3: // '\003'
                    l3 = b.f(parcel, i1);
                    break;

                case 4: // '\004'
                    flag = b.c(parcel, i1);
                    break;

                case 5: // '\005'
                    l2 = b.f(parcel, i1);
                    break;

                case 6: // '\006'
                    i = b.e(parcel, i1);
                    break;

                case 7: // '\007'
                    f = b.g(parcel, i1);
                    break;

                case 8: // '\b'
                    l1 = b.f(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new LocationRequest(k, j, l4, l3, flag, l2, i, f, l1);
            }
        } while (true);
    }

    public static void a(LocationRequest locationrequest, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, locationrequest.b);
        b.c(parcel, 1000, locationrequest.a);
        b.a(parcel, 2, locationrequest.c);
        b.a(parcel, 3, locationrequest.d);
        b.a(parcel, 4, locationrequest.e);
        b.a(parcel, 5, locationrequest.f);
        b.c(parcel, 6, locationrequest.g);
        b.a(parcel, 7, locationrequest.h);
        b.a(parcel, 8, locationrequest.i);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new LocationRequest[i];
    }
}
