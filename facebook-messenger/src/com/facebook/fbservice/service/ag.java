// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import android.os.Parcel;

// Referenced classes of package com.facebook.fbservice.service:
//            OperationType

final class ag
    implements android.os.Parcelable.Creator
{

    ag()
    {
    }

    public OperationType a(Parcel parcel)
    {
        return new OperationType(parcel, null);
    }

    public OperationType[] a(int i)
    {
        return new OperationType[i];
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
