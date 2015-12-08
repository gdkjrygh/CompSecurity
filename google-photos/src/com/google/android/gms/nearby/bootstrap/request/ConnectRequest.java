// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.bootstrap.Device;
import lbq;
import lbr;
import lbt;
import lbu;
import lbw;
import lbx;
import ljv;

public class ConnectRequest
    implements SafeParcelable
{

    public static final ljv CREATOR = new ljv();
    public final int a;
    public final Device b;
    public final String c;
    public final String d;
    public final lbq e;
    public final lbt f;
    public final lbw g;
    public final byte h;
    public final long i;
    public final String j;
    public final byte k;

    public ConnectRequest(int l, Device device, String s, String s1, byte byte0, long l1, 
            String s2, byte byte1, IBinder ibinder, IBinder ibinder1, IBinder ibinder2)
    {
        a = l;
        b = (Device)b.d(device);
        c = b.o(s);
        d = (String)b.d(s1);
        h = byte0;
        i = l1;
        k = byte1;
        j = s2;
        b.d(ibinder);
        e = lbr.a(ibinder);
        b.d(ibinder1);
        f = lbu.a(ibinder1);
        b.d(ibinder2);
        g = lbx.a(ibinder2);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        ljv.a(this, parcel, l);
    }

}
