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
import lkc;

public class StopScanRequest
    implements SafeParcelable
{

    public static final lkc CREATOR = new lkc();
    public final int a;
    public final lbw b;

    public StopScanRequest(int i, IBinder ibinder)
    {
        a = i;
        b.d(ibinder);
        b = lbx.a(ibinder);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lkc.a(this, parcel);
    }

}
