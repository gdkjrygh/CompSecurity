// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.location.reporting.UploadRequestResult;

public final class lig
    implements android.os.Parcelable.Creator
{

    public lig()
    {
    }

    public static UploadRequestResult a(Parcel parcel)
    {
        int j = 0;
        int k = b.b(parcel);
        long l1 = 0L;
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
                    i = b.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = b.e(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = b.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new UploadRequestResult(i, j, l1);
            }
        } while (true);
    }

    public static void a(UploadRequestResult uploadrequestresult, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, uploadrequestresult.a);
        b.c(parcel, 2, uploadrequestresult.b);
        b.a(parcel, 3, uploadrequestresult.c);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new UploadRequestResult[i];
    }
}
