// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Parcel;
import bre;
import btl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class Scope
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bre();
    public final int a;
    public final String b;

    public Scope(int i, String s)
    {
        btl.a(s, "scopeUri must not be null or empty");
        a = i;
        b = s;
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
            return b.equals(((Scope)obj).b);
        }
    }

    public final int hashCode()
    {
        return b.hashCode();
    }

    public final String toString()
    {
        return b;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        bre.a(this, parcel);
    }

}
