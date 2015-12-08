// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ah

public class OnDownloadProgressResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ah();
    final long Jt;
    final long Ju;
    final int xJ;

    OnDownloadProgressResponse(int i, long l, long l1)
    {
        xJ = i;
        Jt = l;
        Ju = l1;
    }

    public int describeContents()
    {
        return 0;
    }

    public long gp()
    {
        return Jt;
    }

    public long gq()
    {
        return Ju;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ah.a(this, parcel, i);
    }

}
