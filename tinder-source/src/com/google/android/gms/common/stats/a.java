// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.common.stats:
//            ConnectionEvent

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(ConnectionEvent connectionevent, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, connectionevent.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, connectionevent.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, connectionevent.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, connectionevent.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, connectionevent.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, connectionevent.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, connectionevent.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, connectionevent.j);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 11, connectionevent.k);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 12, connectionevent.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 13, connectionevent.i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = zza.a(parcel);
        int j = 0;
        long l3 = 0L;
        int i = 0;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        long l2 = 0L;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                case 3: // '\003'
                case 9: // '\t'
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    l3 = zza.f(parcel, l);
                    break;

                case 4: // '\004'
                    s5 = zza.l(parcel, l);
                    break;

                case 5: // '\005'
                    s4 = zza.l(parcel, l);
                    break;

                case 6: // '\006'
                    s3 = zza.l(parcel, l);
                    break;

                case 7: // '\007'
                    s2 = zza.l(parcel, l);
                    break;

                case 8: // '\b'
                    s1 = zza.l(parcel, l);
                    break;

                case 10: // '\n'
                    l2 = zza.f(parcel, l);
                    break;

                case 11: // '\013'
                    l1 = zza.f(parcel, l);
                    break;

                case 12: // '\f'
                    i = zza.e(parcel, l);
                    break;

                case 13: // '\r'
                    s = zza.l(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ConnectionEvent(j, l3, i, s5, s4, s3, s2, s1, s, l2, l1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ConnectionEvent[i];
    }
}
