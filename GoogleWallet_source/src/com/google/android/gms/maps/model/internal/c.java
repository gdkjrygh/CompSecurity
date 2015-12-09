// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            d

public final class c
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    private Bundle aAP;
    private final int mVersionCode;
    private int type;

    c(int i, int j, Bundle bundle)
    {
        mVersionCode = i;
        type = j;
        aAP = bundle;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getType()
    {
        return type;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final Bundle qw()
    {
        return aAP;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
