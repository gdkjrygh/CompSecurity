// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.api:
//            ScopeCreator

public final class Scope
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ScopeCreator();
    public final String mScopeUri;
    final int mVersionCode;

    Scope(int i, String s)
    {
        Preconditions.checkNotEmpty(s, "scopeUri must not be null or empty");
        mVersionCode = i;
        mScopeUri = s;
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
            return mScopeUri.equals(((Scope)obj).mScopeUri);
        }
    }

    public final int hashCode()
    {
        return mScopeUri.hashCode();
    }

    public final String toString()
    {
        return mScopeUri;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ScopeCreator.writeToParcel$514aa83(this, parcel);
    }

}
