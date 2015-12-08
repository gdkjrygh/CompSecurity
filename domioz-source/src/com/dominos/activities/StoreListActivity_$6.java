// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.dom.locator.LocatorResult;

// Referenced classes of package com.dominos.activities:
//            StoreListActivity_

class ocatorResult
    implements Runnable
{

    final StoreListActivity_ this$0;
    final LocatorResult val$result;

    public void run()
    {
        StoreListActivity_.access$401(StoreListActivity_.this, val$result);
    }

    ocatorResult()
    {
        this$0 = final_storelistactivity_;
        val$result = LocatorResult.this;
        super();
    }
}
