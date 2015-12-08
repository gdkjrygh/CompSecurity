// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import llf;
import llg;
import lll;
import llm;
import llt;

public final class ReceiveContentRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new llt();
    public final int a;
    public IBinder b;
    public llf c;
    public String d;
    public lll e;

    ReceiveContentRequest()
    {
        a = 1;
    }

    public ReceiveContentRequest(int i, IBinder ibinder, IBinder ibinder1, String s, IBinder ibinder2)
    {
        a = i;
        b = ibinder;
        c = llg.a(ibinder1);
        d = s;
        e = llm.a(ibinder2);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        llt.a(this, parcel);
    }

}
