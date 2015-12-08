// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap;

import android.os.Parcel;
import b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import lkd;

public class Device
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lkd();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final byte e;

    public Device(int i, String s, String s1, String s2, byte byte0)
    {
        a = i;
        b = b.o(s);
        c = (String)b.d(s1);
        d = (String)b.d(s2);
        boolean flag;
        if (byte0 <= 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.b(flag, "Unknown device type");
        e = byte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append(b).append(": ").append(c).append("[").append(e).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lkd.a(this, parcel);
    }

}
