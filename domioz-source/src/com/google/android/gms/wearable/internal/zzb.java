// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            aq, i, ap, h

public class zzb
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aq();
    final int a;
    public final h b;
    public final IntentFilter c[];

    zzb(int j, IBinder ibinder, IntentFilter aintentfilter[])
    {
        a = j;
        if (ibinder != null)
        {
            b = i.a(ibinder);
        } else
        {
            b = null;
        }
        c = aintentfilter;
    }

    public zzb(ap ap1)
    {
        a = 1;
        b = ap1;
        c = ap1.b();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        aq.a(this, parcel, j);
    }

}
