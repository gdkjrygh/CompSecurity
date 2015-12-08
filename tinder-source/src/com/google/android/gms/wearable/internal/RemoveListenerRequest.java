// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ai, x

public class RemoveListenerRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ai();
    final int a;
    public final x b;

    RemoveListenerRequest(int i, IBinder ibinder)
    {
        a = i;
        if (ibinder != null)
        {
            b = x.a.a(ibinder);
            return;
        } else
        {
            b = null;
            return;
        }
    }

    public RemoveListenerRequest(x x)
    {
        a = 1;
        b = x;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ai.a(this, parcel);
    }

}
