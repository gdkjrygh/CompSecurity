// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.notifications;

import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.infrastructure.notifications:
//            InAppNotificationService

class val.eventName
    implements Action1
{

    final InAppNotificationService this$0;
    final String val$eventName;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        showNotificationIfAvailable(val$eventName);
    }

    ()
    {
        this$0 = final_inappnotificationservice;
        val$eventName = String.this;
        super();
    }
}
