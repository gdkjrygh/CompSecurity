// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ah, w

public class RemoveListenerRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ah();
    final int a;
    public final w b;

    RemoveListenerRequest(int i, IBinder ibinder)
    {
        a = i;
        if (ibinder != null)
        {
            b = w.a.a(ibinder);
            return;
        } else
        {
            b = null;
            return;
        }
    }

    public RemoveListenerRequest(w w)
    {
        a = 1;
        b = w;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ah.a(this, parcel);
    }

}
