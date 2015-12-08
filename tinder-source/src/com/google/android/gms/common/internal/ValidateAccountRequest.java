// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            c, o

public class ValidateAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int a;
    final int b;
    final IBinder c;
    final Scope d[];
    final Bundle e;
    final String f;

    ValidateAccountRequest(int i, int j, IBinder ibinder, Scope ascope[], Bundle bundle, String s)
    {
        a = i;
        b = j;
        c = ibinder;
        d = ascope;
        e = bundle;
        f = s;
    }

    public ValidateAccountRequest(o o1, Scope ascope[], String s)
    {
        int i = b.a;
        if (o1 == null)
        {
            o1 = null;
        } else
        {
            o1 = o1.asBinder();
        }
        this(1, i, ((IBinder) (o1)), ascope, null, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.common.internal.c.a(this, parcel, i);
    }

}
