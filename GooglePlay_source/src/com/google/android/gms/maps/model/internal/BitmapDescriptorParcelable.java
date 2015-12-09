// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            BitmapDescriptorParcelableCreator

public final class BitmapDescriptorParcelable
    implements SafeParcelable
{

    public static final BitmapDescriptorParcelableCreator CREATOR = new BitmapDescriptorParcelableCreator();
    Bitmap bitmap;
    final int mVersionCode;
    Bundle parameters;
    byte type;

    BitmapDescriptorParcelable(int i, byte byte0, Bundle bundle, Bitmap bitmap1)
    {
        mVersionCode = i;
        type = byte0;
        parameters = bundle;
        bitmap = bitmap1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        BitmapDescriptorParcelableCreator.writeToParcel(this, parcel, i);
    }

}
