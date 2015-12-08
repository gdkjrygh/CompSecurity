// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

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
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, logevent.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, logevent.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, logevent.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, logevent.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, logevent.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, logevent.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        long l = 0L;
        android.os.Bundle bundle = null;
        int j = zza.a(parcel);
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
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    l1 = zza.f(parcel, k);
                    break;

                case 3: // '\003'
                    s = zza.l(parcel, k);
                    break;

                case 4: // '\004'
                    abyte0 = zza.o(parcel, k);
                    break;

                case 5: // '\005'
                    bundle = zza.n(parcel, k);
                    break;

                case 6: // '\006'
                    l = zza.f(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
