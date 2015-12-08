// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.messages.internal.GetPermissionStatusRequest;

public final class lki
    implements android.os.Parcelable.Creator
{

    public lki()
    {
    }

    public static void a(GetPermissionStatusRequest getpermissionstatusrequest, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, getpermissionstatusrequest.a);
        b.a(parcel, 2, getpermissionstatusrequest.b.asBinder(), false);
        b.a(parcel, 3, getpermissionstatusrequest.c, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = b.b(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
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
                    ibinder = b.j(parcel, k);
                    break;

                case 3: // '\003'
                    s = b.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GetPermissionStatusRequest(i, ibinder, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GetPermissionStatusRequest[i];
    }
}
