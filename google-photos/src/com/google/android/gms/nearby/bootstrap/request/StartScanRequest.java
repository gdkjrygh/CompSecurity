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
import lcc;
import lcd;
import lkb;

public class StartScanRequest
    implements SafeParcelable
{

    public static final lkb CREATOR = new lkb();
    public final int a;
    public final lcc b;
    public final lbw c;

    public StartScanRequest(int i, IBinder ibinder, IBinder ibinder1)
    {
        a = i;
        b.d(ibinder);
        b = lcd.a(ibinder);
        b.d(ibinder1);
        c = lbx.a(ibinder1);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lkb.a(this, parcel);
    }

}
