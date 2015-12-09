// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import com.amazon.device.iap.model.ProductType;

// Referenced classes of package com.pandora.android.iap:
//            b

static class ProductType
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[com.amazon.device.iap.model.haseResponse.RequestStatus.values().length];
        try
        {
            b[com.amazon.device.iap.model.haseResponse.RequestStatus.ALREADY_PURCHASED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[com.amazon.device.iap.model.haseResponse.RequestStatus.SUCCESSFUL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[com.amazon.device.iap.model.haseResponse.RequestStatus.FAILED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[com.amazon.device.iap.model.haseResponse.RequestStatus.INVALID_SKU.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[ProductType.values().length];
        try
        {
            a[ProductType.SUBSCRIPTION.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[ProductType.CONSUMABLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ProductType.ENTITLED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
