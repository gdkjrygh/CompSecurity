// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.manager;

import com.dominos.android.sdk.common.BaseCallback;
import com.dominos.beacon.model.CarryoutOrder;

public abstract class  extends BaseCallback
{

    public abstract void onBeaconOrderList(CarryoutOrder carryoutorder);

    public abstract void onBeaconRequestFailed();

    public ()
    {
    }
}
