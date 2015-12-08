// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            al

public class OnContentsResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new al();
    final int CK;
    final Contents PW;
    final boolean QJ;

    OnContentsResponse(int i, Contents contents, boolean flag)
    {
        CK = i;
        PW = contents;
        QJ = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public Contents iL()
    {
        return PW;
    }

    public boolean iM()
    {
        return QJ;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        al.a(this, parcel, i);
    }

}
