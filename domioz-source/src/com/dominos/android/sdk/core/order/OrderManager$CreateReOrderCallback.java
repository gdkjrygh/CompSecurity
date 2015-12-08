// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.order;

import com.dominos.android.sdk.common.BaseCallback;
import com.dominos.android.sdk.core.models.LabsOrder;

public abstract class  extends BaseCallback
{

    public abstract void onFailure();

    public abstract void onNewOrder(LabsOrder labsorder);

    public abstract void onNoStoreFoundForDelivery();

    public abstract void onStoreCarryoutUnavailable(String s);

    public abstract void onStoreClosed();

    public abstract void onStoreDeliveryUnavailable(String s);

    public abstract void onStoreOffline(String s);

    public ()
    {
    }
}
