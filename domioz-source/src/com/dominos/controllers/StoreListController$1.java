// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import com.dominos.android.sdk.common.dom.locator.LocatorResult;
import com.dominos.android.sdk.data.http.power.PowerRestCallback;
import com.dominos.controllers.interfaces.IDominosStoreList;

// Referenced classes of package com.dominos.controllers:
//            StoreListController

class estCallback extends PowerRestCallback
{

    final StoreListController this$0;

    public void onError(Exception exception, String s)
    {
        StoreListController.access$000(StoreListController.this).onLocateStoresCompleted(null);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        s = LocatorResult.from(s);
        StoreListController.access$000(StoreListController.this).onLocateStoresCompleted(s);
    }

    atorResult()
    {
        this$0 = StoreListController.this;
        super();
    }
}
