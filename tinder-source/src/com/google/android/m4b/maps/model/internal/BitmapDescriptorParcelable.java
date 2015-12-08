// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.model.internal:
//            a

public final class BitmapDescriptorParcelable
    implements c
{

    public static final a CREATOR = new a();
    final int a;
    byte b;
    Bundle c;
    Bitmap d;

    BitmapDescriptorParcelable(int i, byte byte0, Bundle bundle, Bitmap bitmap)
    {
        a = i;
        b = byte0;
        c = bundle;
        d = bitmap;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.m4b.maps.model.internal.a.a(this, parcel, i);
    }

}
