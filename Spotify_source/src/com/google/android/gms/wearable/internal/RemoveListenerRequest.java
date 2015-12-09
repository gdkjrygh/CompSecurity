// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import crq;
import crr;
import csf;

public class RemoveListenerRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new csf();
    public final int a;
    public final crq b;

    public RemoveListenerRequest(int i, IBinder ibinder)
    {
        a = i;
        if (ibinder != null)
        {
            b = crr.a(ibinder);
            return;
        } else
        {
            b = null;
            return;
        }
    }

    public RemoveListenerRequest(crq crq)
    {
        a = 1;
        b = crq;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        csf.a(this, parcel);
    }

}
