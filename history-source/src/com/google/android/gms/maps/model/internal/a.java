// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            b

public final class a
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    private final int CK;
    private byte amJ;
    private Bundle amK;
    private Bitmap amL;

    a(int i, byte byte0, Bundle bundle, Bitmap bitmap)
    {
        CK = i;
        amJ = byte0;
        amK = bundle;
        amL = bitmap;
    }

    public int describeContents()
    {
        return 0;
    }

    public Bitmap getBitmap()
    {
        return amL;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public byte oh()
    {
        return amJ;
    }

    public Bundle oi()
    {
        return amK;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
