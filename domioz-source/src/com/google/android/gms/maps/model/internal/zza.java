// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            d

public final class zza
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    private final int a;
    private byte b;
    private Bundle c;
    private Bitmap d;

    zza(int i, byte byte0, Bundle bundle, Bitmap bitmap)
    {
        a = i;
        b = byte0;
        c = bundle;
        d = bitmap;
    }

    public final int a()
    {
        return a;
    }

    public final byte b()
    {
        return b;
    }

    public final Bundle c()
    {
        return c;
    }

    public final Bitmap d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.maps.model.internal.d.a(this, parcel, i);
    }

}
