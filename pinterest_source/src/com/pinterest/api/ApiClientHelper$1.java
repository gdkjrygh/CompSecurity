// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import android.app.Activity;
import com.pinterest.base.Services;
import com.pinterest.kit.notification.AppRater;

final class a
    implements Runnable
{

    final Activity a;

    public final void run()
    {
        AppRater.registerEvent(a);
        Services.startPinUploaderService();
    }

    ter(Activity activity)
    {
        a = activity;
        super();
    }
}
