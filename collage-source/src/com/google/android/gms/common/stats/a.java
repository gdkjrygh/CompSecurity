// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.common.stats:
//            ConnectionEvent

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(ConnectionEvent connectionevent, Parcel parcel, int i)
    {
        i = b.a(parcel);
        b.a(parcel, 1, connectionevent.a);
        b.a(parcel, 2, connectionevent.a());
        b.a(parcel, 4, connectionevent.c(), false);
        b.a(parcel, 5, connectionevent.d(), false);
        b.a(parcel, 6, connectionevent.e(), false);
        b.a(parcel, 7, connectionevent.f(), false);
        b.a(parcel, 8, connectionevent.g(), false);
        b.a(parcel, 10, connectionevent.j());
        b.a(parcel, 11, connectionevent.i());
        b.a(parcel, 12, connectionevent.b());
        b.a(parcel, 13, connectionevent.h(), false);
        b.a(parcel, i);
    }

    public ConnectionEvent a(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
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
                int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(l))
                {
                case 3: // '\003'
                case 9: // '\t'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 2: // '\002'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 4: // '\004'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 5: // '\005'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 6: // '\006'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 7: // '\007'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 8: // '\b'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 10: // '\n'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 11: // '\013'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 13: // '\r'
                    s = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ConnectionEvent(j, l3, i, s5, s4, s3, s2, s1, s, l2, l1);
            }
        } while (true);
    }

    public ConnectionEvent[] a(int i)
    {
        return new ConnectionEvent[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
