// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            LogEvent

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(LogEvent logevent, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, logevent.a);
        c.a(parcel, 2, logevent.b);
        c.a(parcel, 3, logevent.d, false);
        c.a(parcel, 4, logevent.e);
        c.a(parcel, 5, logevent.f);
        c.a(parcel, 6, logevent.c);
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        long l = 0L;
        android.os.Bundle bundle = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        byte abyte0[] = null;
        long l1 = 0L;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 4: // '\004'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 5: // '\005'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 6: // '\006'
                    l = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LogEvent(i, l1, l, s, abyte0, bundle);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new LogEvent[i];
    }
}
