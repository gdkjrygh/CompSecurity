// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            RemoveListenerRequest, w

public final class ah
    implements android.os.Parcelable.Creator
{

    public ah()
    {
    }

    static void a(RemoveListenerRequest removelistenerrequest, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, removelistenerrequest.a);
        if (removelistenerrequest.b == null)
        {
            removelistenerrequest = null;
        } else
        {
            removelistenerrequest = removelistenerrequest.b.asBinder();
        }
        b.a(parcel, 2, removelistenerrequest);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
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
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new RemoveListenerRequest(i, ibinder);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new RemoveListenerRequest[i];
    }
}
