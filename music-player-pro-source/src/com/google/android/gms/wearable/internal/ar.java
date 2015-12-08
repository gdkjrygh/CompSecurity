// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            as, ae

public class ar
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new as();
    final int CK;
    public final ae axv;

    ar(int i, IBinder ibinder)
    {
        CK = i;
        if (ibinder != null)
        {
            axv = ae.a.bY(ibinder);
            return;
        } else
        {
            axv = null;
            return;
        }
    }

    public ar(ae ae1)
    {
        CK = 1;
        axv = ae1;
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
        as.a(this, parcel, i);
    }

}
