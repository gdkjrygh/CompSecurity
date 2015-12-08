// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Parcel;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            InAppNotification

final class p
    implements android.os.Parcelable.Creator
{

    p()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new InAppNotification(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new InAppNotification[i];
    }
}
