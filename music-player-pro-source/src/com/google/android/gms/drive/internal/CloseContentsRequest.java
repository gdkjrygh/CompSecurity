// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            g

public class CloseContentsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    final int CK;
    final Contents Pr;
    final Boolean Pt;

    CloseContentsRequest(int i, Contents contents, Boolean boolean1)
    {
        CK = i;
        Pr = contents;
        Pt = boolean1;
    }

    public CloseContentsRequest(Contents contents, boolean flag)
    {
        this(1, contents, Boolean.valueOf(flag));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }

}
