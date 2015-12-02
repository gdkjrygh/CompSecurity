// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.notify:
//            NotificationSetting

final class ar
    implements android.os.Parcelable.Creator
{

    ar()
    {
    }

    public NotificationSetting a(Parcel parcel)
    {
        return new NotificationSetting(parcel, null);
    }

    public NotificationSetting[] a(int i)
    {
        return new NotificationSetting[i];
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
