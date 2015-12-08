// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            aa

public class OnDownloadProgressResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aa();
    final long FF;
    final long FG;
    final int xH;

    OnDownloadProgressResponse(int i, long l, long l1)
    {
        xH = i;
        FF = l;
        FG = l1;
    }

    public int describeContents()
    {
        return 0;
    }

    public long fJ()
    {
        return FF;
    }

    public long fK()
    {
        return FG;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aa.a(this, parcel, i);
    }

}
