// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import lki;
import lkm;
import lkn;

public class GetPermissionStatusRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lki();
    public final int a;
    public final lkm b;
    public final String c;

    public GetPermissionStatusRequest(int i, IBinder ibinder, String s)
    {
        a = i;
        b = lkn.a(ibinder);
        c = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lki.a(this, parcel);
    }

}
