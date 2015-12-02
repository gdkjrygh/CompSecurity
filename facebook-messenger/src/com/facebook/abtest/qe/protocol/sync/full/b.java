// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.protocol.sync.full;

import android.os.Parcel;

// Referenced classes of package com.facebook.abtest.qe.protocol.sync.full:
//            SyncQuickExperimentMetaInfoResult

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public SyncQuickExperimentMetaInfoResult a(Parcel parcel)
    {
        return new SyncQuickExperimentMetaInfoResult(parcel);
    }

    public SyncQuickExperimentMetaInfoResult[] a(int i)
    {
        return new SyncQuickExperimentMetaInfoResult[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
