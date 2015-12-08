// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.Status;

public final class jts
    implements android.os.Parcelable.Creator
{

    public jts()
    {
    }

    public static com.google.android.gms.appdatasearch.GetRecentContextCall.Response a(Parcel parcel)
    {
        int j = b.b(parcel);
        java.util.ArrayList arraylist = null;
        Status status = null;
        int i = 0;
        String as[] = null;
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

                case 1000: 
                    i = b.e(parcel, k);
                    break;

                case 1: // '\001'
                    status = (Status)b.a(parcel, k, Status.CREATOR);
                    break;

                case 2: // '\002'
                    arraylist = b.c(parcel, k, UsageInfo.CREATOR);
                    break;

                case 3: // '\003'
                    as = b.n(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new com.google.android.gms.appdatasearch.GetRecentContextCall.Response(i, status, arraylist, as);
            }
        } while (true);
    }

    public static void a(com.google.android.gms.appdatasearch.GetRecentContextCall.Response response, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1000, response.d);
        b.a(parcel, 1, response.a, i, false);
        b.c(parcel, 2, response.b, false);
        b.a(parcel, 3, response.c, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new com.google.android.gms.appdatasearch.GetRecentContextCall.Response[i];
    }
}
