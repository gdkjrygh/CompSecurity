// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.store;

import com.dominos.android.sdk.common.BaseCallback;
import com.dominos.android.sdk.common.RequestErrorCode;
import com.dominos.android.sdk.common.power.StoreProfile;

public abstract class  extends BaseCallback
{

    public abstract void onStoreClosed(StoreProfile storeprofile);

    public abstract void onStoreLoadError(RequestErrorCode requesterrorcode);

    public abstract void onStoreLoaded(StoreProfile storeprofile);

    public abstract void onStoreOffline(StoreProfile storeprofile);

    public ()
    {
    }
}
