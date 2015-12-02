// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import android.os.Parcel;

// Referenced classes of package com.facebook.fbservice.service:
//            OperationResult

final class ae
    implements android.os.Parcelable.Creator
{

    ae()
    {
    }

    public OperationResult a(Parcel parcel)
    {
        return new OperationResult(parcel, null);
    }

    public OperationResult[] a(int i)
    {
        return new OperationResult[i];
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
