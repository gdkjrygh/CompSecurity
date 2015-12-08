// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ar, ae

public class aq
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ar();
    final int BR;
    public final ae avk;

    aq(int i, IBinder ibinder)
    {
        BR = i;
        if (ibinder != null)
        {
            avk = ae.a.bS(ibinder);
            return;
        } else
        {
            avk = null;
            return;
        }
    }

    public aq(ae ae1)
    {
        BR = 1;
        avk = ae1;
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
        ar.a(this, parcel, i);
    }

}
