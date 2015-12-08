// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.common.api:
//            zzf

public final class Scope
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    final int zzFG;
    private final String zzNn;

    Scope(int i, String s)
    {
        zzx.zzb(s, "scopeUri must not be null or empty");
        zzFG = i;
        zzNn = s;
    }

    public Scope(String s)
    {
        this(1, s);
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
            return zzNn.equals(((Scope)obj).zzNn);
        }
    }

    public final int hashCode()
    {
        return zzNn.hashCode();
    }

    public final String toString()
    {
        return zzNn;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    public final String zzio()
    {
        return zzNn;
    }

}
