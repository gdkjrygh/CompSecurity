// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AddListenerRequest, w

public final class ab
    implements android.os.Parcelable.Creator
{

    public ab()
    {
    }

    static void a(AddListenerRequest addlistenerrequest, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, addlistenerrequest.a);
        android.os.IBinder ibinder;
        if (addlistenerrequest.b == null)
        {
            ibinder = null;
        } else
        {
            ibinder = addlistenerrequest.b.asBinder();
        }
        b.a(parcel, 2, ibinder);
        b.a(parcel, 3, addlistenerrequest.c, i);
        b.a(parcel, 4, addlistenerrequest.d);
        b.a(parcel, 5, addlistenerrequest.e);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 3: // '\003'
                    aintentfilter = (IntentFilter[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, IntentFilter.CREATOR);
                    break;

                case 4: // '\004'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
