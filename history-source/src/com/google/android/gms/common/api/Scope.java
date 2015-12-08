// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.common.api:
//            e

public final class Scope
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    final int CK;
    private final String Kv;

    Scope(int i, String s)
    {
        jx.b(s, "scopeUri must not be null or empty");
        CK = i;
        Kv = s;
    }

    public Scope(String s)
    {
        this(1, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Scope))
        {
            return false;
        } else
        {
            return Kv.equals(((Scope)obj).Kv);
        }
    }

    public String gO()
    {
        return Kv;
    }

    public int hashCode()
    {
        return Kv.hashCode();
    }

    public String toString()
    {
        return Kv;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel, i);
    }

}
