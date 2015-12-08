// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.os.Parcel;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncResult

final class 
    implements android.os.eator
{

    public final SyncResult createFromParcel(Parcel parcel)
    {
        return new SyncResult(parcel, null);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final SyncResult[] newArray(int i)
    {
        return new SyncResult[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
