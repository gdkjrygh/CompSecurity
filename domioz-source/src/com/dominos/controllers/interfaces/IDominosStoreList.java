// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers.interfaces;

import com.dominos.android.sdk.common.dom.locator.LocatorResult;

// Referenced classes of package com.dominos.controllers.interfaces:
//            IDominosView

public interface IDominosStoreList
    extends IDominosView
{

    public abstract void onLocateStoresCompleted(LocatorResult locatorresult);

    public abstract void showGpsEnableDialog();

    public abstract void showRetryLocationDialog();
}
