// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.sharing.internal.TrustedDevicesRequest;

public final class llx
    implements android.os.Parcelable.Creator
{

    public llx()
    {
    }

    public static void a(TrustedDevicesRequest trusteddevicesrequest, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, trusteddevicesrequest.a);
        b.a(parcel, 2, trusteddevicesrequest.b, false);
        b.a(parcel, 3, trusteddevicesrequest.c, false);
        b.a(parcel, 4, trusteddevicesrequest.d.asBinder(), false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = b.b(parcel);
        String s = null;
        int i = 0;
        byte abyte0[] = null;
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
                    s = b.i(parcel, k);
                    break;

                case 3: // '\003'
                    abyte0 = b.l(parcel, k);
                    break;

                case 4: // '\004'
                    ibinder = b.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new TrustedDevicesRequest(i, s, abyte0, ibinder);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new TrustedDevicesRequest[i];
    }
}
