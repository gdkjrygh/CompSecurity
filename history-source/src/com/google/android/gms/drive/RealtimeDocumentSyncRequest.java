// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jx;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive:
//            f

public class RealtimeDocumentSyncRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    final int CK;
    final List OK;
    final List OL;

    RealtimeDocumentSyncRequest(int i, List list, List list1)
    {
        CK = i;
        OK = (List)jx.i(list);
        OL = (List)jx.i(list1);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
