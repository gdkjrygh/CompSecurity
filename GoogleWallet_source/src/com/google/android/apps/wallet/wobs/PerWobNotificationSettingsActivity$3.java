// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.wobs.caching.WobsManager;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            PerWobNotificationSettingsActivity

final class val.enableNotifications
    implements Callable
{

    final PerWobNotificationSettingsActivity this$0;
    final boolean val$enableNotifications;

    private Void call()
        throws CallErrorException
    {
        wobsManager.updateInstanceNotificationSettings(PerWobNotificationSettingsActivity.access$400(PerWobNotificationSettingsActivity.this), val$enableNotifications);
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_perwobnotificationsettingsactivity;
        val$enableNotifications = Z.this;
        super();
    }
}
