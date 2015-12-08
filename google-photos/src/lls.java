// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.sharing.SharedContent;
import com.google.android.gms.nearby.sharing.internal.ProvideContentRequest;

public final class lls
    implements android.os.Parcelable.Creator
{

    public lls()
    {
    }

    public static void a(ProvideContentRequest providecontentrequest, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, providecontentrequest.a);
        b.a(parcel, 2, providecontentrequest.b, false);
        android.os.IBinder ibinder;
        if (providecontentrequest.c == null)
        {
            ibinder = null;
        } else
        {
            ibinder = providecontentrequest.c.asBinder();
        }
        b.a(parcel, 3, ibinder, false);
        b.c(parcel, 4, providecontentrequest.d, false);
        b.a(parcel, 5, providecontentrequest.e);
        b.a(parcel, 6, providecontentrequest.f.asBinder(), false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = b.b(parcel);
        int i = 0;
        long l = 0L;
        java.util.ArrayList arraylist = null;
        android.os.IBinder ibinder1 = null;
        android.os.IBinder ibinder2 = null;
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
                    ibinder2 = b.j(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder1 = b.j(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = b.c(parcel, k, SharedContent.CREATOR);
                    break;

                case 5: // '\005'
                    l = b.f(parcel, k);
                    break;

                case 6: // '\006'
                    ibinder = b.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ProvideContentRequest(i, ibinder2, ibinder1, arraylist, l, ibinder);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ProvideContentRequest[i];
    }
}
