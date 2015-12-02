// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.background;

import com.facebook.backgroundtasks.f;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.p;
import com.facebook.inject.a.a;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.config.background:
//            i, d, ConfigRefreshInterval, g, 
//            e, ConfigBackgroundQueue, k, f

public class b extends c
{

    public b()
    {
    }

    protected void a()
    {
        f(com/facebook/backgroundtasks/f);
        a(com/facebook/config/background/i).a(new d(null));
        c(com/facebook/backgroundtasks/c).a(com/facebook/config/background/i);
        b(java/lang/Long).a(com/facebook/config/background/ConfigRefreshInterval).a(Long.valueOf(0x36ee80L));
        a(com/facebook/config/background/g).a(new com.facebook.config.background.e(null));
        a(com/facebook/fbservice/service/e).a(com/facebook/config/background/ConfigBackgroundQueue).b(com/facebook/config/background/g);
        c(com/facebook/config/background/k);
    }

    public void a(t t1)
    {
        super.a(t1);
        ((p)t1.a(com/facebook/fbservice/service/p)).a(com.facebook.config.background.f.a, com/facebook/config/background/ConfigBackgroundQueue);
    }
}
