// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import lll;
import llm;
import llw;

public final class StopProvidingContentRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new llw();
    public final int a;
    public long b;
    public lll c;

    StopProvidingContentRequest()
    {
        a = 1;
    }

    public StopProvidingContentRequest(int i, long l, IBinder ibinder)
    {
        a = i;
        b = l;
        c = llm.a(ibinder);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        llw.a(this, parcel);
    }

}
