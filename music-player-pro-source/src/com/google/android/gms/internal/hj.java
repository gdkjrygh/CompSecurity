// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            hk

public class hj
    implements SafeParcelable
{

    public static final hk CREATOR = new hk();
    final int CK;
    final Bundle Db;
    public final int id;

    hj(int i, int j, Bundle bundle)
    {
        CK = i;
        id = j;
        Db = bundle;
    }

    public int describeContents()
    {
        hk hk1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hk hk1 = CREATOR;
        hk.a(this, parcel, i);
    }

}
