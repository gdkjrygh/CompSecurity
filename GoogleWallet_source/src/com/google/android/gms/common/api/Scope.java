// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kn;

// Referenced classes of package com.google.android.gms.common.api:
//            e

public final class Scope
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    private final String Tg;
    final int mVersionCode;

    Scope(int i, String s)
    {
        kn.b(s, "scopeUri must not be null or empty");
        mVersionCode = i;
        Tg = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
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
            return Tg.equals(((Scope)obj).Tg);
        }
    }

    public final int hashCode()
    {
        return Tg.hashCode();
    }

    public final String ik()
    {
        return Tg;
    }

    public final String toString()
    {
        return Tg;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel, i);
    }

}
