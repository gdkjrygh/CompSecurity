// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            d

public class CancelPendingActionsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    final int CK;
    final List Pb;

    CancelPendingActionsRequest(int i, List list)
    {
        CK = i;
        Pb = list;
    }

    public CancelPendingActionsRequest(List list)
    {
        this(1, list);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
