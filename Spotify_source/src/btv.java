// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.stats.WakeLockEvent;

public final class btv
    implements android.os.Parcelable.Creator
{

    public btv()
    {
    }

    public static void a(WakeLockEvent wakelockevent, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, wakelockevent.a);
        brp.a(parcel, 2, wakelockevent.b);
        brp.a(parcel, 4, wakelockevent.d);
        brp.b(parcel, 5, wakelockevent.e);
        brp.a(parcel, 6, wakelockevent.f);
        brp.a(parcel, 8, wakelockevent.h);
        brp.a(parcel, 10, wakelockevent.j);
        brp.b(parcel, 11, wakelockevent.c);
        brp.a(parcel, 12, wakelockevent.g);
        brp.a(parcel, 13, wakelockevent.k);
        brp.b(parcel, 14, wakelockevent.i);
        brp.a(parcel, 15, wakelockevent.l);
        brp.a(parcel, 16, wakelockevent.m);
        brp.b(parcel, i);
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
                    s3 = zza.h(parcel, j1);
                    break;

                case 5: // '\005'
                    j = zza.e(parcel, j1);
                    break;

                case 6: // '\006'
                    arraylist = zza.l(parcel, j1);
                    break;

                case 8: // '\b'
                    l2 = zza.f(parcel, j1);
                    break;

                case 10: // '\n'
                    s1 = zza.h(parcel, j1);
                    break;

                case 11: // '\013'
                    k = zza.e(parcel, j1);
                    break;

                case 12: // '\f'
                    s2 = zza.h(parcel, j1);
                    break;

                case 13: // '\r'
                    s = zza.h(parcel, j1);
                    break;

                case 14: // '\016'
                    i = zza.e(parcel, j1);
                    break;

                case 15: // '\017'
                    f = zza.g(parcel, j1);
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
