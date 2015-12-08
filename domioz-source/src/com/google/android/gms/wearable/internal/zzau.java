// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ac, i, h

public class zzau
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ac();
    final int a;
    public final h b;

    zzau(int j, IBinder ibinder)
    {
        a = j;
        if (ibinder != null)
        {
            b = i.a(ibinder);
            return;
        } else
        {
            b = null;
            return;
        }
    }

    public zzau(h h)
    {
        a = 1;
        b = h;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        ac.a(this, parcel);
    }

}
