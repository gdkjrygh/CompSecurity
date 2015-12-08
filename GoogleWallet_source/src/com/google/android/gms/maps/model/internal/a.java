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
    private byte aAO;
    private Bundle aAP;
    private Bitmap aAQ;
    private final int mVersionCode;

    a(int i, byte byte0, Bundle bundle, Bitmap bitmap)
    {
        mVersionCode = i;
        aAO = byte0;
        aAP = bundle;
        aAQ = bitmap;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Bitmap getBitmap()
    {
        return aAQ;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final byte qv()
    {
        return aAO;
    }

    public final Bundle qw()
    {
        return aAP;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
