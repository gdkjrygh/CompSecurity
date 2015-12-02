// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nux.status;

import android.os.Parcel;

// Referenced classes of package com.facebook.nux.status:
//            UpdateNuxStatusParams

final class m
    implements android.os.Parcelable.Creator
{

    m()
    {
    }

    public UpdateNuxStatusParams a(Parcel parcel)
    {
        return new UpdateNuxStatusParams(parcel, null);
    }

    public UpdateNuxStatusParams[] a(int i)
    {
        return new UpdateNuxStatusParams[i];
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
