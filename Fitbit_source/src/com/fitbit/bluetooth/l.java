// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import com.fitbit.e.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.bluetooth:
//            Manufacturer, j, k

public class l
{

    private static final String a = "FitbitBluetoothAdapterHelper";
    private static List b;

    public l()
    {
    }

    public static Manufacturer a()
    {
        for (Iterator iterator = b().iterator(); iterator.hasNext();)
        {
            Manufacturer manufacturer = (Manufacturer)iterator.next();
            if (manufacturer.c())
            {
                return manufacturer;
            }
        }

        return com.fitbit.bluetooth.Manufacturer.a;
    }

    public static k a(Manufacturer manufacturer)
    {
        manufacturer = manufacturer.b();
        if (manufacturer != null)
        {
            try
            {
                manufacturer = ((Manufacturer) (manufacturer.getConstructor(new Class[0]).newInstance(new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (Manufacturer manufacturer)
            {
                com.fitbit.e.a.f("FitbitBluetoothAdapterHelper", "Unable to instantiate FitbitBluetoothAdapter", manufacturer, new Object[0]);
                manufacturer = null;
            }
            if (manufacturer == null)
            {
                return new j();
            } else
            {
                return (k)manufacturer;
            }
        } else
        {
            return new j();
        }
    }

    private static List b()
    {
        if (b == null)
        {
            b = new ArrayList(5);
            b.add(Manufacturer.c);
            b.add(Manufacturer.e);
            b.add(Manufacturer.f);
            b.add(Manufacturer.d);
            b.add(Manufacturer.b);
        }
        return b;
    }

    public static boolean b(Manufacturer manufacturer)
    {
        return b().contains(manufacturer);
    }
}
