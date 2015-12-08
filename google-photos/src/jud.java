// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEvent;

public final class jud
    implements android.os.Parcelable.Creator
{

    public jud()
    {
    }

    public static void a(AccountChangeEvent accountchangeevent, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, accountchangeevent.a);
        b.a(parcel, 2, accountchangeevent.b);
        b.a(parcel, 3, accountchangeevent.c, false);
        b.c(parcel, 4, accountchangeevent.d);
        b.c(parcel, 5, accountchangeevent.e);
        b.a(parcel, 6, accountchangeevent.f, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = b.b(parcel);
        long l1 = 0L;
        int j = 0;
        String s1 = null;
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
                    l1 = b.f(parcel, i1);
                    break;

                case 3: // '\003'
                    s1 = b.i(parcel, i1);
                    break;

                case 4: // '\004'
                    j = b.e(parcel, i1);
                    break;

                case 5: // '\005'
                    i = b.e(parcel, i1);
                    break;

                case 6: // '\006'
                    s = b.i(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new AccountChangeEvent(k, l1, s1, j, i, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AccountChangeEvent[i];
    }
}
