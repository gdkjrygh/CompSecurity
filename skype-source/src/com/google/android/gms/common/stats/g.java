// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.common.stats:
//            WakeLockEvent

public final class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(WakeLockEvent wakelockevent, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, wakelockevent.a);
        b.a(parcel, 2, wakelockevent.a());
        b.a(parcel, 4, wakelockevent.c());
        b.a(parcel, 5, wakelockevent.e());
        b.b(parcel, 6, wakelockevent.f());
        b.a(parcel, 8, wakelockevent.h());
        b.a(parcel, 10, wakelockevent.d());
        b.a(parcel, 11, wakelockevent.b());
        b.a(parcel, 12, wakelockevent.g());
        b.a(parcel, 13, wakelockevent.j());
        b.a(parcel, 14, wakelockevent.i());
        b.a(parcel, 15, wakelockevent.k());
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int l = 0;
        long l2 = 0L;
        int k = 0;
        String s3 = null;
        int j = 0;
        java.util.ArrayList arraylist = null;
        String s2 = null;
        long l1 = 0L;
        int i = 0;
        String s1 = null;
        String s = null;
        float f = 0.0F;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                case 3: // '\003'
                case 7: // '\007'
                case 9: // '\t'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 4: // '\004'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 6: // '\006'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.t(parcel, j1);
                    break;

                case 8: // '\b'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 10: // '\n'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 11: // '\013'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 12: // '\f'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 13: // '\r'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 14: // '\016'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 15: // '\017'
                    f = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new WakeLockEvent(l, l2, k, s3, j, arraylist, s2, l1, i, s1, s, f);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new WakeLockEvent[i];
    }
}
