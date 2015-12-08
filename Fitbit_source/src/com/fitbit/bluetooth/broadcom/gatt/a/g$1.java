// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt.a;

import com.fitbit.bluetooth.Manufacturer;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt.a:
//            g

static class 
{

    static final int a[];

    static 
    {
        a = new int[Manufacturer.values().length];
        try
        {
            a[Manufacturer.d.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[Manufacturer.f.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[Manufacturer.e.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
