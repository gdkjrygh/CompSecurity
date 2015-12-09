// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.store;

import org.androidannotations.api.c;

// Referenced classes of package com.dominos.android.sdk.core.store:
//            StoreManager_

class val.callback extends c
{

    final StoreManager_ this$0;
    final dStoreMenuCallback val$callback;
    final String val$storeId;

    public void execute()
    {
        try
        {
            StoreManager_.access$001(StoreManager_.this, val$storeId, val$callback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    dStoreMenuCallback(String s1, String s2, dStoreMenuCallback dstoremenucallback)
    {
        this$0 = final_storemanager_;
        val$storeId = s2;
        val$callback = dstoremenucallback;
        super(final_s, I.this, s1);
    }
}
