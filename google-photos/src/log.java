// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.photos.autobackup.model.UserQuota;

public final class log
    implements android.os.Parcelable.Creator
{

    public log()
    {
    }

    public static void a(UserQuota userquota, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, userquota.a);
        b.a(parcel, 2, userquota.b);
        b.a(parcel, 3, userquota.c);
        b.a(parcel, 4, userquota.d);
        b.a(parcel, 5, userquota.e);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        long l = 0L;
        boolean flag = false;
        int j = b.b(parcel);
        boolean flag1 = false;
        long l1 = 0L;
        int i = 0;
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
                    l1 = b.f(parcel, k);
                    break;

                case 3: // '\003'
                    l = b.f(parcel, k);
                    break;

                case 4: // '\004'
                    flag1 = b.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag = b.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new UserQuota(i, l1, l, flag1, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new UserQuota[i];
    }
}
