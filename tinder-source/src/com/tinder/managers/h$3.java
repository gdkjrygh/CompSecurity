// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.enums.PurchaseType;

// Referenced classes of package com.tinder.managers:
//            h

public static final class or
{

    public static final int a[];

    static 
    {
        a = new int[PurchaseType.values().length];
        try
        {
            a[PurchaseType.SUBSCRIPTION.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[PurchaseType.CONSUMABLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
