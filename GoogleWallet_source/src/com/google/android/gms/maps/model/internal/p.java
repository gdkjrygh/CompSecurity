// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            q, a

public final class p
    implements SafeParcelable
{

    public static final q CREATOR = new q();
    private a aAS;
    private final int mVersionCode;

    public p()
    {
        mVersionCode = 1;
    }

    p(int i, a a)
    {
        mVersionCode = i;
        aAS = a;
    }

    public final int describeContents()
    {
        return 0;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public final a qz()
    {
        return aAS;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        q.a(this, parcel, i);
    }

}
