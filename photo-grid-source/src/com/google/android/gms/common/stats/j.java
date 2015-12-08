// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common.stats:
//            WakeLockEvent

public final class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(WakeLockEvent wakelockevent, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, wakelockevent.a);
        c.a(parcel, 2, wakelockevent.a());
        c.a(parcel, 4, wakelockevent.c(), false);
        c.a(parcel, 5, wakelockevent.e());
        c.a(parcel, 6, wakelockevent.f(), false);
        c.a(parcel, 8, wakelockevent.h());
        c.a(parcel, 10, wakelockevent.d(), false);
        c.a(parcel, 11, wakelockevent.b());
        c.a(parcel, 12, wakelockevent.g(), false);
        c.a(parcel, 13, wakelockevent.k(), false);
        c.a(parcel, 14, wakelockevent.j());
        c.a(parcel, 15, wakelockevent.m());
        c.a(parcel, 16, wakelockevent.n());
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i1 = 0;
        long l3 = 0L;
        int l = 0;
        String s3 = null;
        int k = 0;
        java.util.ArrayList arraylist = null;
        String s2 = null;
        long l2 = 0L;
        int i = 0;
        String s1 = null;
        String s = null;
        float f = 0.0F;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = parcel.readInt();
                switch (0xffff & k1)
                {
                case 3: // '\003'
                case 7: // '\007'
                case 9: // '\t'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k1);
                    break;

                case 2: // '\002'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k1);
                    break;

                case 4: // '\004'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k1);
                    break;

                case 5: // '\005'
                    k = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k1);
                    break;

                case 6: // '\006'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.q(parcel, k1);
                    break;

                case 8: // '\b'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k1);
                    break;

                case 10: // '\n'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k1);
                    break;

                case 11: // '\013'
                    l = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k1);
                    break;

                case 12: // '\f'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k1);
                    break;

                case 13: // '\r'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k1);
                    break;

                case 14: // '\016'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k1);
                    break;

                case 15: // '\017'
                    f = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 16: // '\020'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j1).toString(), parcel);
            } else
            {
                return new WakeLockEvent(i1, l3, l, s3, k, arraylist, s2, l2, i, s1, s, f, l1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new WakeLockEvent[i];
    }
}
