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
import lka;

public class SendDataRequest
    implements SafeParcelable
{

    public static final lka CREATOR = new lka();
    public final int a;
    public final Device b;
    public final byte c[];
    public final lbw d;

    public SendDataRequest(int i, Device device, byte abyte0[], IBinder ibinder)
    {
        a = i;
        b = (Device)b.d(device);
        c = (byte[])b.d(abyte0);
        b.d(ibinder);
        d = lbx.a(ibinder);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lka.a(this, parcel, i);
    }

}
