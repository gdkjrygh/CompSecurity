// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AddListenerRequest, x

public final class as
    implements android.os.Parcelable.Creator
{

    public as()
    {
    }

    static void a(AddListenerRequest addlistenerrequest, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, addlistenerrequest.a);
        android.os.IBinder ibinder;
        if (addlistenerrequest.b == null)
        {
            ibinder = null;
        } else
        {
            ibinder = addlistenerrequest.b.asBinder();
        }
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, ibinder);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, addlistenerrequest.c, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, addlistenerrequest.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, addlistenerrequest.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = zza.a(parcel);
        int i = 0;
        String s1 = null;
        IntentFilter aintentfilter[] = null;
        android.os.IBinder ibinder = null;
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
                    ibinder = zza.m(parcel, k);
                    break;

                case 3: // '\003'
                    aintentfilter = (IntentFilter[])zza.b(parcel, k, IntentFilter.CREATOR);
                    break;

                case 4: // '\004'
                    s1 = zza.l(parcel, k);
                    break;

                case 5: // '\005'
                    s = zza.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AddListenerRequest(i, ibinder, aintentfilter, s1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AddListenerRequest[i];
    }
}
