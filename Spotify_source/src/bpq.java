// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class bpq
    implements android.os.Parcelable.Creator
{

    public bpq()
    {
    }

    public static void a(DeviceStatus devicestatus, Parcel parcel, int i)
    {
        int j = brp.a(parcel, 20293);
        brp.b(parcel, 1, devicestatus.a);
        double d = devicestatus.b;
        brp.a(parcel, 2, 8);
        parcel.writeDouble(d);
        brp.a(parcel, 3, devicestatus.c);
        brp.b(parcel, 4, devicestatus.d);
        brp.a(parcel, 5, devicestatus.e, i);
        brp.b(parcel, 6, devicestatus.f);
        brp.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        int l = zza.a(parcel);
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
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    zza.a(parcel, i1, 8);
                    d = parcel.readDouble();
                    break;

                case 3: // '\003'
                    flag = zza.c(parcel, i1);
                    break;

                case 4: // '\004'
                    j = zza.e(parcel, i1);
                    break;

                case 5: // '\005'
                    applicationmetadata = (ApplicationMetadata)zza.a(parcel, i1, ApplicationMetadata.CREATOR);
                    break;

                case 6: // '\006'
                    i = zza.e(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
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
