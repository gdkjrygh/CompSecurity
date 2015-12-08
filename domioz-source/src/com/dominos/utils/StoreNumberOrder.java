// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.common.power.StoreProfile;

public class StoreNumberOrder
{

    public TrackerOrderStatus status;
    public StoreProfile storeProfile;

    public StoreNumberOrder(TrackerOrderStatus trackerorderstatus, StoreProfile storeprofile)
    {
        status = trackerorderstatus;
        storeProfile = storeprofile;
    }
}
