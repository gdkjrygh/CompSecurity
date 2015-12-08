// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            UpdateDisplayState, ao, InAppNotification

public static final class b extends b
{

    public static final android.os.ppNotificationState.b CREATOR = new ao();
    private static String c = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.INAPP_KEY";
    private static String d = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.HIGHLIGHT_KEY";
    private final InAppNotification a;
    private final int b;

    public final String a()
    {
        return "InAppNotificationState";
    }

    public final int b()
    {
        return b;
    }

    public final InAppNotification c()
    {
        return a;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable(c, a);
        bundle.putInt(d, b);
        parcel.writeBundle(bundle);
    }


    private (Bundle bundle)
    {
        super((byte)0);
        a = (InAppNotification)bundle.getParcelable(c);
        b = bundle.getInt(d);
    }

    d(Bundle bundle, byte byte0)
    {
        this(bundle);
    }

    public <init>(InAppNotification inappnotification, int i)
    {
        super((byte)0);
        a = inappnotification;
        b = i;
    }
}
