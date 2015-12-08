// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.places:
//            l, e

public class PlacePhotoMetadataResult
    implements f, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new l();
    final int a;
    final Status b;
    final DataHolder c;
    private final e d;

    PlacePhotoMetadataResult(int i, Status status, DataHolder dataholder)
    {
        a = i;
        b = status;
        c = dataholder;
        if (dataholder == null)
        {
            d = null;
            return;
        } else
        {
            d = new e(c);
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

    public void writeToParcel(Parcel parcel, int i)
    {
        l.a(this, parcel, i);
    }

}
