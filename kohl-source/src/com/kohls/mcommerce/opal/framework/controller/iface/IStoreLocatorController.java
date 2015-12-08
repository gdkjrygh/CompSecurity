// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.controller.iface;

import android.location.Location;

public interface IStoreLocatorController
{

    public abstract void getInventoryforSKU(Location location, com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store store, String s, com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store store1);

    public abstract void getStoreLocations(Location location, int i);
}
