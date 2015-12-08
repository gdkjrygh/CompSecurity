// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.places:
//            l, e

public class PlacePhotoMetadataResult
    implements g, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new l();
    final int a;
    final DataHolder b;
    private final Status c;
    private final e d;

    PlacePhotoMetadataResult(int i, Status status, DataHolder dataholder)
    {
        a = i;
        c = status;
        b = dataholder;
        if (dataholder == null)
        {
            d = null;
            return;
        } else
        {
            d = new e(b);
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

    public void writeToParcel(Parcel parcel, int i)
    {
        l.a(this, parcel, i);
    }

}
