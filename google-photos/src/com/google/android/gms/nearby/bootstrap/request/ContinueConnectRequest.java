// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import lbw;
import lbx;
import ljw;

public class ContinueConnectRequest
    implements SafeParcelable
{

    public static final ljw CREATOR = new ljw();
    public final int a;
    public final String b;
    public final lbw c;

    public ContinueConnectRequest(int i, String s, IBinder ibinder)
    {
        a = i;
        b = (String)b.d(s);
        c = lbx.a(ibinder);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ljw.a(this, parcel);
    }

}
