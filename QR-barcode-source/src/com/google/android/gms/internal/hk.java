// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            hl

public class hk
    implements SafeParcelable
{

    public static final hl CREATOR = new hl();
    final int BR;
    final Bundle Ci;
    public final int id;

    hk(int i, int j, Bundle bundle)
    {
        BR = i;
        id = j;
        Ci = bundle;
    }

    public int describeContents()
    {
        hl hl1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hl hl1 = CREATOR;
        hl.a(this, parcel, i);
    }

}
