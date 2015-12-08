// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.rpc.RpcException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.wobs.caching:
//            WobsManager, WobDatastore, WobTailListByCategoryEvent, WobsCacheClient, 
//            WobCategory

final class val.wobCategory
    implements Callable
{

    final WobsManager this$0;
    final WobCategory val$wobCategory;

    private Void call()
    {
        boolean flag = true;
        byte abyte0[] = WobsManager.access$200(WobsManager.this).getNextPageToken(val$wobCategory);
        if (abyte0 == null)
        {
            WobsManager.access$300(WobsManager.this).post(val$wobCategory, new WobTailListByCategoryEvent(new com.google.wallet.proto.cts.WobInstance[0], false));
            return null;
        }
        Object obj;
        try
        {
            byte abyte1[] = WobsManager.access$700(WobsManager.this);
            obj = WobsManager.access$600(WobsManager.this).fetchTailWobs(abyte1, val$wobCategory, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            WobsManager.access$300(WobsManager.this).post(val$wobCategory, WobTailListByCategoryEvent.errorEvent());
            return null;
        }
        if (((com.google.wallet.proto.api..FetchNextWobsResponse) (obj)).callError != null)
        {
            if (((com.google.wallet.proto.api..FetchNextWobsResponse) (obj)).callError.errorCode.intValue() == 1)
            {
                WobsManager.access$800(WobsManager.this);
            }
            WobsManager.access$300(WobsManager.this).post(val$wobCategory, WobTailListByCategoryEvent.errorEvent());
            return null;
        }
        WobsManager.access$200(WobsManager.this).writeTailWobs(((com.google.wallet.proto.api..FetchNextWobsResponse) (obj)).wob);
        WobsManager.access$200(WobsManager.this).updateNextPageToken(Integer.valueOf(val$wobCategory.getId()), ((com.google.wallet.proto.api..FetchNextWobsResponse) (obj)).nextPageToken);
        EventBus eventbus = WobsManager.access$300(WobsManager.this);
        WobCategory wobcategory = val$wobCategory;
        com.google.wallet.proto.cts.WobInstance awobinstance[] = ((com.google.wallet.proto.api..FetchNextWobsResponse) (obj)).wob;
        if (((com.google.wallet.proto.api..FetchNextWobsResponse) (obj)).nextPageToken == null)
        {
            flag = false;
        }
        eventbus.post(wobcategory, new WobTailListByCategoryEvent(awobinstance, flag));
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    sponse()
    {
        this$0 = final_wobsmanager;
        val$wobCategory = WobCategory.this;
        super();
    }
}
