// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import android.app.Activity;
import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.accounts:
//            UserRemovedController

private static class activity extends DefaultSubscriber
{

    private final Activity activity;

    public void onNext(CurrentUserChangedEvent currentuserchangedevent)
    {
        if (currentuserchangedevent.getKind() == 1)
        {
            activity.finish();
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((CurrentUserChangedEvent)obj);
    }

    public (Activity activity1)
    {
        activity = activity1;
    }
}
