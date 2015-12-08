// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import crq;
import crr;
import csp;
import csr;

public class AddListenerRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new csr();
    public final int a;
    public final crq b;
    public final IntentFilter c[];
    public final String d;
    public final String e;

    public AddListenerRequest(int i, IBinder ibinder, IntentFilter aintentfilter[], String s, String s1)
    {
        a = i;
        if (ibinder != null)
        {
            b = crr.a(ibinder);
        } else
        {
            b = null;
        }
        c = aintentfilter;
        d = s;
        e = s1;
    }

    public AddListenerRequest(csp csp1)
    {
        a = 1;
        b = csp1;
        c = csp1.a;
        d = csp1.b;
        e = csp1.c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        csr.a(this, parcel, i);
    }

}
