// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import android.app.AlarmManager;
import android.content.Context;
import com.facebook.auth.b.b;
import com.facebook.backgroundtasks.AreBackgroundTasksEnabled;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.common.time.a;
import com.facebook.contacts.data.k;
import com.facebook.contacts.database.AddressBookPeriodicRunner;
import com.facebook.inject.ab;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.contacts:
//            a, b

class d extends com.facebook.inject.d
{

    final com.facebook.contacts.a a;

    private d(com.facebook.contacts.a a1)
    {
        a = a1;
        super();
    }

    d(com.facebook.contacts.a a1, com.facebook.contacts.b b1)
    {
        this(a1);
    }

    public AddressBookPeriodicRunner a()
    {
        return new AddressBookPeriodicRunner((Context)e().a(android/content/Context), (AlarmManager)e().a(android/app/AlarmManager), (k)a(com/facebook/contacts/data/k), (b)a(com/facebook/auth/b/b), (com.facebook.fbservice.ops.k)e().a(com/facebook/fbservice/ops/k), (a)a(com/facebook/common/time/a), (ExecutorService)a(java/util/concurrent/ExecutorService, com/facebook/common/executors/DefaultExecutorService), b(java/lang/Boolean, com/facebook/backgroundtasks/AreBackgroundTasksEnabled), (com.facebook.common.v.a)a(com/facebook/common/v/a), (com.facebook.config.a.d)a(com/facebook/config/a/d));
    }

    public Object b()
    {
        return a();
    }
}
