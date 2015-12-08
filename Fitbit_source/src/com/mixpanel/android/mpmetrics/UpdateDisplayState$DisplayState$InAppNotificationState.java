// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            UpdateDisplayState, InAppNotification

public static final class e extends e
{

    public static final android.os.ppNotificationState.e CREATOR = new _cls1();
    public static final String c = "InAppNotificationState";
    private static String f = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.INAPP_KEY";
    private static String g = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.HIGHLIGHT_KEY";
    private final InAppNotification d;
    private final int e;

    public String a()
    {
        return "InAppNotificationState";
    }

    public int b()
    {
        return e;
    }

    public InAppNotification c()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f, d);
        bundle.putInt(g, e);
        parcel.writeBundle(bundle);
    }


    private _cls1(Bundle bundle)
    {
        super(null);
        d = (InAppNotification)bundle.getParcelable(f);
        e = bundle.getInt(g);
    }

    g(Bundle bundle, g g1)
    {
        this(bundle);
    }

    public <init>(InAppNotification inappnotification, int i)
    {
        super(null);
        d = inappnotification;
        e = i;
    }

    /* block-local class not found */
    class _cls1 {}

}
