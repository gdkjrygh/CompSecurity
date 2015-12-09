// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.storelocator;

import com.dominos.android.sdk.common.BaseCallback;
import com.dominos.android.sdk.common.dom.locator.LocatorStore;
import com.dominos.android.sdk.core.models.LabsAddress;

public abstract class  extends BaseCallback
{

    public abstract void onAddressInvalid( );

    public abstract void onLocateStoreFailed();

    public abstract void onStoreFound(LocatorStore locatorstore, LabsAddress labsaddress);

    public abstract void onStoreNotFound();

    public ()
    {
    }
}
