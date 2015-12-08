// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zza

public final class BitmapDescriptorParcelable
    implements SafeParcelable
{

    public static final zza CREATOR = new zza();
    private final int a;
    private byte b;
    private Bundle c;
    private Bitmap d;

    BitmapDescriptorParcelable(int i, byte byte0, Bundle bundle, Bitmap bitmap)
    {
        a = i;
        b = byte0;
        c = bundle;
        d = bitmap;
    }

    public int a()
    {
        return a;
    }

    public byte b()
    {
        return b;
    }

    public Bundle c()
    {
        return c;
    }

    public Bitmap d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.a(this, parcel, i);
    }

}
