// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ap, ac

public class ao
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ap();
    public final ac alz;
    final int xM;

    ao(int i, IBinder ibinder)
    {
        xM = i;
        if (ibinder != null)
        {
            alz = ac.a.bx(ibinder);
            return;
        } else
        {
            alz = null;
            return;
        }
    }

    public ao(ac ac1)
    {
        xM = 1;
        alz = ac1;
    }

    public int describeContents()
    {
        return 0;
    }

    IBinder no()
    {
        if (alz == null)
        {
            return null;
        } else
        {
            return alz.asBinder();
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ap.a(this, parcel, i);
    }

}
