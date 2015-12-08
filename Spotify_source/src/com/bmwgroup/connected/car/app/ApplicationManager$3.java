// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bmwgroup.connected.car.app;


// Referenced classes of package com.bmwgroup.connected.car.app:
//            ApplicationManager, BrandType

final class _cls9
{

    static final int a[];

    static 
    {
        a = new int[BrandType.values().length];
        try
        {
            a[BrandType.c.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[BrandType.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[BrandType.a.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
