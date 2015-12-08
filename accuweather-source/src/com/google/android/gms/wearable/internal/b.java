// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            c, av, ac

public class b
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    public final ac alw;
    public final IntentFilter alx[];
    final int xJ;

    b(int i, IBinder ibinder, IntentFilter aintentfilter[])
    {
        xJ = i;
        if (ibinder != null)
        {
            alw = ac.a.bx(ibinder);
        } else
        {
            alw = null;
        }
        alx = aintentfilter;
    }

    public b(av av1)
    {
        xJ = 1;
        alw = av1;
        alx = av1.np();
    }

    public int describeContents()
    {
        return 0;
    }

    IBinder nj()
    {
        if (alw == null)
        {
            return null;
        } else
        {
            return alw.asBinder();
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
