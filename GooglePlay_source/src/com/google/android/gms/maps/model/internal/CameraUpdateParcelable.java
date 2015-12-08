// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            CameraUpdateParcelableCreator

public final class CameraUpdateParcelable
    implements SafeParcelable
{

    public static final CameraUpdateParcelableCreator CREATOR = new CameraUpdateParcelableCreator();
    final int mVersionCode;
    Bundle parameters;
    int type;

    CameraUpdateParcelable(int i, int j, Bundle bundle)
    {
        mVersionCode = i;
        type = j;
        parameters = bundle;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        CameraUpdateParcelableCreator.writeToParcel$6e31228d(this, parcel);
    }

}
