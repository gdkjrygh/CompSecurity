// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.nearby.sharing.AppContentReceivedResult;

public final class lly
    implements android.os.Parcelable.Creator
{

    public lly()
    {
    }

    public static void a(AppContentReceivedResult appcontentreceivedresult, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, appcontentreceivedresult.a);
        b.a(parcel, 2, appcontentreceivedresult.b, i, false);
        b.c(parcel, 3, appcontentreceivedresult.c);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = b.b(parcel);
        Uri uri = null;
        int i = 0;
        int j = 0;
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
                    uri = (Uri)b.a(parcel, l, Uri.CREATOR);
                    break;

                case 3: // '\003'
                    j = b.e(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new AppContentReceivedResult(i, uri, j);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AppContentReceivedResult[i];
    }
}
