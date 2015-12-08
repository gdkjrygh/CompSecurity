// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push.notifications;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.urbanairship.push.notifications:
//            NotificationFactory

class val.androidActions
    implements android.support.v4.app.ender
{

    final NotificationFactory this$0;
    final List val$androidActions;

    public android.support.v4.app.lder extend(android.support.v4.app.lder lder)
    {
        for (Iterator iterator = val$androidActions.iterator(); iterator.hasNext(); lder.addAction((android.support.v4.app.ion)iterator.next())) { }
        return lder;
    }

    ()
    {
        this$0 = final_notificationfactory;
        val$androidActions = List.this;
        super();
    }
}
