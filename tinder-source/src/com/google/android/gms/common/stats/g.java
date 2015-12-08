// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

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
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, wakelockevent.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, wakelockevent.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, wakelockevent.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, wakelockevent.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 6, wakelockevent.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, wakelockevent.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, wakelockevent.j);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 11, wakelockevent.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 12, wakelockevent.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 13, wakelockevent.k);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 14, wakelockevent.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 15, wakelockevent.l);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 16, wakelockevent.m);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i1 = zza.a(parcel);
        int l = 0;
        long l3 = 0L;
        int k = 0;
        String s3 = null;
        int j = 0;
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
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                case 3: // '\003'
                case 7: // '\007'
                case 9: // '\t'
                default:
                    zza.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = zza.e(parcel, j1);
                    break;

                case 2: // '\002'
                    l3 = zza.f(parcel, j1);
                    break;

                case 4: // '\004'
                    s3 = zza.l(parcel, j1);
                    break;

                case 5: // '\005'
                    j = zza.e(parcel, j1);
                    break;

                case 6: // '\006'
                    arraylist = zza.t(parcel, j1);
                    break;

                case 8: // '\b'
                    l2 = zza.f(parcel, j1);
                    break;

                case 10: // '\n'
                    s1 = zza.l(parcel, j1);
                    break;

                case 11: // '\013'
                    k = zza.e(parcel, j1);
                    break;

                case 12: // '\f'
                    s2 = zza.l(parcel, j1);
                    break;

                case 13: // '\r'
                    s = zza.l(parcel, j1);
                    break;

                case 14: // '\016'
                    i = zza.e(parcel, j1);
                    break;

                case 15: // '\017'
                    f = zza.i(parcel, j1);
                    break;

                case 16: // '\020'
                    l1 = zza.f(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new WakeLockEvent(l, l3, k, s3, j, arraylist, s2, l2, i, s1, s, f, l1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new WakeLockEvent[i];
    }
}
