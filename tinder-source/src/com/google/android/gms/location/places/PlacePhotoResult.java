// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.t;

// Referenced classes of package com.google.android.gms.location.places:
//            m

public class PlacePhotoResult
    implements f, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new m();
    final int a;
    final Status b;
    final BitmapTeleporter c;
    private final Bitmap d;

    PlacePhotoResult(int i, Status status, BitmapTeleporter bitmapteleporter)
    {
        a = i;
        b = status;
        c = bitmapteleporter;
        if (c != null)
        {
            d = bitmapteleporter.a();
            return;
        } else
        {
            d = null;
            return;
        }
    }

    public final Status a()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return t.a(this).a("status", b).a("bitmap", d).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        m.a(this, parcel, i);
    }

}
