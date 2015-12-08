// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;

// Referenced classes of package com.google.android.gms.location.places:
//            m

public class PlacePhotoResult
    implements g, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new m();
    final int a;
    final BitmapTeleporter b;
    private final Status c;
    private final Bitmap d;

    PlacePhotoResult(int i, Status status, BitmapTeleporter bitmapteleporter)
    {
        a = i;
        c = status;
        b = bitmapteleporter;
        if (b != null)
        {
            d = bitmapteleporter.a();
            return;
        } else
        {
            d = null;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public Status getStatus()
    {
        return c;
    }

    public String toString()
    {
        return x.a(this).a("status", c).a("bitmap", d).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        m.a(this, parcel, i);
    }

}
