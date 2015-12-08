// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            c, bb, ae

public class b
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int CK;
    public final ae axv;
    public final IntentFilter axw[];

    b(int i, IBinder ibinder, IntentFilter aintentfilter[])
    {
        CK = i;
        if (ibinder != null)
        {
            axv = ae.a.bY(ibinder);
        } else
        {
            axv = null;
        }
        axw = aintentfilter;
    }

    public b(bb bb1)
    {
        CK = 1;
        axv = bb1;
        axw = bb1.rs();
    }

    public int describeContents()
    {
        return 0;
    }

    IBinder rm()
    {
        if (axv == null)
        {
            return null;
        } else
        {
            return axv.asBinder();
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
