// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.backgroundtasks;

import com.facebook.common.init.NeedsLowPriorityInitOnUiThread;
import com.facebook.fbservice.service.n;
import com.facebook.inject.a.a;
import com.facebook.inject.a.c;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.b;

// Referenced classes of package com.facebook.backgroundtasks:
//            e, i, d, h, 
//            AreBackgroundTasksEnabled, c

public class f extends b
{

    public f()
    {
    }

    protected void a()
    {
        a(com/facebook/backgroundtasks/e).a(new i(this, null)).a();
        a(com/facebook/backgroundtasks/d).a(new h(this, null)).a();
        b(java/lang/Boolean).a(com/facebook/backgroundtasks/AreBackgroundTasksEnabled).a(Boolean.valueOf(true));
        c(com/facebook/backgroundtasks/c);
        a(com/facebook/base/c, com/facebook/common/init/NeedsLowPriorityInitOnUiThread).a(com/facebook/backgroundtasks/e);
        c(com/facebook/fbservice/service/n).a(com/facebook/backgroundtasks/e);
    }
}
