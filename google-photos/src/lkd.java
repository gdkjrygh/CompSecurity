// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.Device;

public final class lkd
    implements android.os.Parcelable.Creator
{

    public lkd()
    {
    }

    public static void a(Device device, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.a(parcel, 1, device.b, false);
        b.c(parcel, 1000, device.a);
        b.a(parcel, 2, device.c, false);
        b.a(parcel, 3, device.d, false);
        b.a(parcel, 4, device.e);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        byte byte0 = 0;
        String s = null;
        int j = b.b(parcel);
        String s1 = null;
        String s2 = null;
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
                    s2 = b.i(parcel, k);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = b.i(parcel, k);
                    break;

                case 3: // '\003'
                    s = b.i(parcel, k);
                    break;

                case 4: // '\004'
                    byte0 = b.d(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new Device(i, s2, s1, s, byte0);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new Device[i];
    }
}
