// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.locale;

import android.app.Application;
import android.content.Intent;
import com.google.android.apps.wallet.eventbus.BroadcastEventPublisher;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.wallet.locale:
//            LocaleChangedEvent

public class LocaleChangedEventPublisher extends BroadcastEventPublisher
{

    LocaleChangedEventPublisher(Application application, EventBus eventbus, ThreadChecker threadchecker)
    {
        super(application, eventbus, threadchecker, com/google/android/apps/wallet/locale/LocaleChangedEvent, "android.intent.action.LOCALE_CHANGED");
    }

    private static LocaleChangedEvent translateIntent(Intent intent)
    {
        return new LocaleChangedEvent(Locale.getDefault());
    }

    protected final volatile Object translateIntent(Intent intent)
    {
        return translateIntent(intent);
    }
}
