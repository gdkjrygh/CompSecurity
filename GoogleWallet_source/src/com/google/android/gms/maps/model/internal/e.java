// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            f, a

public final class e
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    private a aAR;
    private final int mVersionCode;

    public e()
    {
        mVersionCode = 1;
    }

    e(int i, a a)
    {
        mVersionCode = i;
        aAR = a;
    }

    public final int describeContents()
    {
        return 0;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public final a qx()
    {
        return aAR;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
