// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            an

public class OnDownloadProgressResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new an();
    final int CK;
    final long QL;
    final long QM;

    OnDownloadProgressResponse(int i, long l, long l1)
    {
        CK = i;
        QL = l;
        QM = l1;
    }

    public int describeContents()
    {
        return 0;
    }

    public long iO()
    {
        return QL;
    }

    public long iP()
    {
        return QM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        an.a(this, parcel, i);
    }

}
