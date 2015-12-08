// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive:
//            RealtimeDocumentSyncRequestCreator

public class RealtimeDocumentSyncRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new RealtimeDocumentSyncRequestCreator();
    final List mDocumentsToDeleteCache;
    final List mDocumentsToSync;
    final int mVersionCode;

    RealtimeDocumentSyncRequest(int i, List list, List list1)
    {
        mVersionCode = i;
        mDocumentsToSync = (List)Preconditions.checkNotNull(list);
        mDocumentsToDeleteCache = (List)Preconditions.checkNotNull(list1);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        RealtimeDocumentSyncRequestCreator.writeToParcel$60887365(this, parcel);
    }

}
