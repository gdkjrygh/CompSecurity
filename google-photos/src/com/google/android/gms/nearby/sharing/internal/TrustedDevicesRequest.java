// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import lll;
import llm;
import llx;

public final class TrustedDevicesRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new llx();
    public final int a;
    public String b;
    public byte c[];
    public lll d;

    public TrustedDevicesRequest(int i, String s, byte abyte0[], IBinder ibinder)
    {
        a = i;
        b = (String)b.d(s);
        c = (byte[])b.d(abyte0);
        d = llm.a(ibinder);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        llx.a(this, parcel);
    }

}
