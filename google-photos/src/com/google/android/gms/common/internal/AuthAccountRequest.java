// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Set;
import kay;
import kbd;

public class AuthAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new kbd();
    public final int a;
    public final IBinder b;
    public final Scope c[];

    public AuthAccountRequest(int i, IBinder ibinder, Scope ascope[])
    {
        a = i;
        b = ibinder;
        c = ascope;
    }

    public AuthAccountRequest(kay kay1, Set set)
    {
        this(1, kay1.asBinder(), (Scope[])set.toArray(new Scope[set.size()]));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kbd.a(this, parcel, i);
    }

}
