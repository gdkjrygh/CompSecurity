// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ag

public class OnContentsResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ag();
    final Contents HG;
    final int xM;

    OnContentsResponse(int i, Contents contents)
    {
        xM = i;
        HG = contents;
    }

    public int describeContents()
    {
        return 0;
    }

    public Contents gt()
    {
        return HG;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ag.a(this, parcel, i);
    }

}
