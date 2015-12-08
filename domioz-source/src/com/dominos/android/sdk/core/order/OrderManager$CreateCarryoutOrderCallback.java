// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.order;

import com.dominos.android.sdk.common.BaseCallback;
import com.dominos.android.sdk.common.RequestErrorCode;
import com.dominos.android.sdk.core.models.LabsOrder;

public abstract class Q extends BaseCallback
{

    public abstract void onCreateOrderError(RequestErrorCode requesterrorcode);

    public abstract void onOrderCreated(LabsOrder labsorder);

    public abstract void onStoreCarryoutUnavailable(String s);

    public abstract void onStoreClosed();

    public abstract void onStoreOffline(String s);

    public Q()
    {
    }
}
