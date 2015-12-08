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
    public final IntentFilter alA[];
    public final ac alz;
    final int xM;

    b(int i, IBinder ibinder, IntentFilter aintentfilter[])
    {
        xM = i;
        if (ibinder != null)
        {
            alz = ac.a.bx(ibinder);
        } else
        {
            alz = null;
        }
        alA = aintentfilter;
    }

    public b(av av1)
    {
        xM = 1;
        alz = av1;
        alA = av1.nu();
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
        c.a(this, parcel, i);
    }

}
