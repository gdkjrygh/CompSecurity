// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import com.google.android.apps.wallet.eventbus.EventBus;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.wobs.caching:
//            WobsManager, WobCategory, WobDatastore, WobHeadListByCategoryEvent

final class val.wobCategory
    implements Callable
{

    final WobsManager this$0;
    final WobCategory val$wobCategory;

    private Void call()
    {
        java.util.List list = WobsManager.access$200(WobsManager.this).readWobsByCategoryId(val$wobCategory.getId());
        boolean flag;
        if (WobsManager.access$200(WobsManager.this).getNextPageToken(val$wobCategory) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WobsManager.access$300(WobsManager.this).post(val$wobCategory, new WobHeadListByCategoryEvent(list, false, flag));
        WobsManager.access$400(WobsManager.this, val$wobCategory);
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ategoryEvent()
    {
        this$0 = final_wobsmanager;
        val$wobCategory = WobCategory.this;
        super();
    }
}
