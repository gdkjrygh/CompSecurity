// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;

public final class crc
    implements android.os.Parcelable.Creator
{

    public crc()
    {
    }

    public static void a(GetCloudSyncOptInStatusResponse getcloudsyncoptinstatusresponse, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, getcloudsyncoptinstatusresponse.a);
        brp.b(parcel, 2, getcloudsyncoptinstatusresponse.b);
        brp.a(parcel, 3, getcloudsyncoptinstatusresponse.c);
        brp.a(parcel, 4, getcloudsyncoptinstatusresponse.d);
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag1 = false;
        int k = zza.a(parcel);
        boolean flag = false;
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = zza.e(parcel, l);
                    break;

                case 3: // '\003'
                    flag = zza.c(parcel, l);
                    break;

                case 4: // '\004'
                    flag1 = zza.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GetCloudSyncOptInStatusResponse(i, j, flag, flag1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GetCloudSyncOptInStatusResponse[i];
    }
}
