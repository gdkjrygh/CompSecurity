// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            e, ab

public class zzae
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    final int a;
    final IBinder b;
    private final int c;
    private final Scope d[];
    private final Bundle e;
    private final String f;

    zzae(int i, int j, IBinder ibinder, Scope ascope[], Bundle bundle, String s)
    {
        a = i;
        c = j;
        b = ibinder;
        d = ascope;
        e = bundle;
        f = s;
    }

    public zzae(ab ab1, Scope ascope[], String s)
    {
        if (ab1 == null)
        {
            ab1 = null;
        } else
        {
            ab1 = ab1.asBinder();
        }
        this(1, 0x6c42d8, ((IBinder) (ab1)), ascope, null, s);
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
