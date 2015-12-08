// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            c, ax, ae

public class b
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int BR;
    public final ae avk;
    public final IntentFilter avl[];

    b(int i, IBinder ibinder, IntentFilter aintentfilter[])
    {
        BR = i;
        if (ibinder != null)
        {
            avk = ae.a.bS(ibinder);
        } else
        {
            avk = null;
        }
        avl = aintentfilter;
    }

    public b(ax ax1)
    {
        BR = 1;
        avk = ax1;
        avl = ax1.qb();
    }

    public int describeContents()
    {
        return 0;
    }

    IBinder pV()
    {
        if (avk == null)
        {
            return null;
        } else
        {
            return avk.asBinder();
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
