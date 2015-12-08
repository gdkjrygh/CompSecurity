// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.messages.internal.MessageWrapper;
import com.google.android.gms.nearby.messages.internal.UnpublishRequest;

public final class lkz
    implements android.os.Parcelable.Creator
{

    public lkz()
    {
    }

    public static void a(UnpublishRequest unpublishrequest, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, unpublishrequest.a);
        b.a(parcel, 2, unpublishrequest.b, i, false);
        b.a(parcel, 3, unpublishrequest.c.asBinder(), false);
        b.a(parcel, 4, unpublishrequest.d, false);
        b.a(parcel, 5, unpublishrequest.e, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = b.b(parcel);
        int i = 0;
        String s1 = null;
        android.os.IBinder ibinder = null;
        MessageWrapper messagewrapper = null;
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
                    messagewrapper = (MessageWrapper)b.a(parcel, k, MessageWrapper.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder = b.j(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = b.i(parcel, k);
                    break;

                case 5: // '\005'
                    s = b.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new UnpublishRequest(i, messagewrapper, ibinder, s1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new UnpublishRequest[i];
    }
}
