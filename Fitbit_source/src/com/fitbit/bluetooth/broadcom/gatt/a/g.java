// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt.a;

import com.fitbit.bluetooth.Manufacturer;
import com.fitbit.bluetooth.k;
import com.fitbit.bluetooth.n;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt.a:
//            c, b, h, d, 
//            f

public final class g
{

    public g()
    {
    }

    public static f a()
    {
        static class _cls1
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

        switch (_cls1.a[n.a().a().ordinal()])
        {
        default:
            return new c();

        case 1: // '\001'
            return new b();

        case 2: // '\002'
            return new h();

        case 3: // '\003'
            return new d();
        }
    }
}
