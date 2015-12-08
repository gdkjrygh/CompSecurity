// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.bootstrap.Device;
import lbw;
import lbx;
import ljy;

public class DisconnectRequest
    implements SafeParcelable
{

    public static final ljy CREATOR = new ljy();
    public final int a;
    public final Device b;
    public final lbw c;

    public DisconnectRequest(int i, Device device, IBinder ibinder)
    {
        a = i;
        b = (Device)b.d(device);
        b.d(ibinder);
        c = lbx.a(ibinder);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ljy.a(this, parcel, i);
    }

}
