// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            aj

public class OnDownloadProgressResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aj();
    final int BR;
    final long Pp;
    final long Pq;

    OnDownloadProgressResponse(int i, long l, long l1)
    {
        BR = i;
        Pp = l;
        Pq = l1;
    }

    public int describeContents()
    {
        return 0;
    }

    public long _mthif()
    {
        return Pp;
    }

    public long ig()
    {
        return Pq;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aj.a(this, parcel, i);
    }

}
