// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import com.dominos.android.sdk.common.LogUtil;
import com.ford.syncV4.a.a;
import com.ford.syncV4.e.c.v;
import com.ford.syncV4.e.i;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.dominos.fordsync.service:
//            AppLinkManager

class this._cls0 extends TimerTask
{

    final AppLinkManager this$0;

    public void run()
    {
        try
        {
            LogUtil.d("FORDSYNC_AppLinkManager", "getvehicledata: %s", new Object[] {
                AppLinkManager.access$300(AppLinkManager.this)
            });
            v v1 = new v();
            v1.a(Boolean.valueOf(true));
            v1.b(Boolean.valueOf(true));
            v1.c(Boolean.valueOf(true));
            v1.d(Boolean.valueOf(true));
            v1.e(Boolean.valueOf(true));
            v1.a(Integer.valueOf(AppLinkManager.access$400(AppLinkManager.this).incrementAndGet()));
            AppLinkManager.access$300(AppLinkManager.this).a(v1);
            return;
        }
        catch (a a1)
        {
            LogUtil.e("FORDSYNC_AppLinkManager", "getvehicledata", a1, new Object[0]);
        }
        AppLinkManager.access$500(AppLinkManager.this);
    }

    ()
    {
        this$0 = AppLinkManager.this;
        super();
    }
}
