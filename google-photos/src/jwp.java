// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.DeviceStatus;

public final class jwp
    implements android.os.Parcelable.Creator
{

    public jwp()
    {
    }

    public static void a(DeviceStatus devicestatus, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, devicestatus.a);
        b.a(parcel, 2, devicestatus.b);
        b.a(parcel, 3, devicestatus.c);
        b.c(parcel, 4, devicestatus.d);
        b.a(parcel, 5, devicestatus.e, i, false);
        b.c(parcel, 6, devicestatus.f);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        int l = b.b(parcel);
        double d = 0.0D;
        ApplicationMetadata applicationmetadata = null;
        int j = 0;
        boolean flag = false;
        int k = 0;
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
                    k = b.e(parcel, i1);
                    break;

                case 2: // '\002'
                    d = b.h(parcel, i1);
                    break;

                case 3: // '\003'
                    flag = b.c(parcel, i1);
                    break;

                case 4: // '\004'
                    j = b.e(parcel, i1);
                    break;

                case 5: // '\005'
                    applicationmetadata = (ApplicationMetadata)b.a(parcel, i1, ApplicationMetadata.CREATOR);
                    break;

                case 6: // '\006'
                    i = b.e(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new DeviceStatus(k, d, flag, j, applicationmetadata, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new DeviceStatus[i];
    }
}
