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
//            e, as

public class ValidateAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    final int a;
    final IBinder b;
    private final int c;
    private final Scope d[];
    private final Bundle e;
    private final String f;

    ValidateAccountRequest(int i, int j, IBinder ibinder, Scope ascope[], Bundle bundle, String s)
    {
        a = i;
        c = j;
        b = ibinder;
        d = ascope;
        e = bundle;
        f = s;
    }

    public ValidateAccountRequest(as as1, Scope ascope[], String s)
    {
        int i = b.a;
        if (as1 == null)
        {
            as1 = null;
        } else
        {
            as1 = as1.asBinder();
        }
        this(1, i, ((IBinder) (as1)), ascope, null, s);
    }

    public final int a()
    {
        return c;
    }

    public final Scope[] b()
    {
        return d;
    }

    public final String c()
    {
        return f;
    }

    public final Bundle d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.common.internal.e.a(this, parcel, i);
    }

}
