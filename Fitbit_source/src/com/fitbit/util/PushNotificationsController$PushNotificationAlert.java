// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.fitbit.FitbitMobile.GCMNotification;

// Referenced classes of package com.fitbit.util:
//            SimpleConfirmDialogFragment, PushNotificationsController, r

public static class _cls1 extends SimpleConfirmDialogFragment
{

    private static final String e = "notification";
    private GCMNotification f;

    static GCMNotification a(_cls1 _pcls1)
    {
        return _pcls1.f;
    }

    public static f a(FragmentActivity fragmentactivity, GCMNotification gcmnotification)
    {
        f f1 = new <init>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("notification", gcmnotification);
        bundle.putAll(r.a(fragmentactivity.getString(0x7f08046c), gcmnotification.b()));
        f1.setArguments(bundle);
        return f1;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        f = (GCMNotification)getArguments().getParcelable("notification");
    /* block-local class not found */
    class _cls1 {}

        b(new _cls1());
    }

    public _cls1()
    {
        super(0x7f08046d, 0x7f08046b);
    }
}
