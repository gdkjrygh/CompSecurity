// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import android.app.AlarmManager;
import android.content.Context;
import com.facebook.analytics.av;
import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.common.l.h;
import com.facebook.device_id.l;
import com.facebook.fbservice.ops.k;
import com.facebook.http.protocol.aq;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.push.c2dm:
//            FacebookPushServerRegistrar, ae, y, d, 
//            e

class j extends d
{

    final com.facebook.push.c2dm.d a;

    private j(com.facebook.push.c2dm.d d1)
    {
        a = d1;
        super();
    }

    j(com.facebook.push.c2dm.d d1, e e)
    {
        this(d1);
    }

    public FacebookPushServerRegistrar a()
    {
        return new FacebookPushServerRegistrar((Context)e().a(android/content/Context), (k)a(com/facebook/fbservice/ops/k), (aq)a(com/facebook/http/protocol/aq), (ae)a(com/facebook/push/c2dm/ae), b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId), (l)a(com/facebook/device_id/l), (com.facebook.common.hardware.k)a(com/facebook/common/hardware/k), (y)a(com/facebook/push/c2dm/y), (av)a(com/facebook/analytics/av), (AlarmManager)e().a(android/app/AlarmManager), (h)a(com/facebook/common/l/h), (com.facebook.common.e.h)a(com/facebook/common/e/h));
    }

    public Object b()
    {
        return a();
    }
}
