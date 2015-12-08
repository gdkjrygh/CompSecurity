// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import jxz;
import kay;
import kbc;

public class ValidateAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new kbc();
    public final int a;
    public final int b;
    public final IBinder c;
    public final Scope d[];
    public final Bundle e;
    public final String f;

    public ValidateAccountRequest(int i, int j, IBinder ibinder, Scope ascope[], Bundle bundle, String s)
    {
        a = i;
        b = j;
        c = ibinder;
        d = ascope;
        e = bundle;
        f = s;
    }

    public ValidateAccountRequest(kay kay1, Scope ascope[], String s, Bundle bundle)
    {
        int i = jxz.a;
        if (kay1 == null)
        {
            kay1 = null;
        } else
        {
            kay1 = kay1.asBinder();
        }
        this(1, i, ((IBinder) (kay1)), ascope, bundle, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kbc.a(this, parcel, i);
    }

}
