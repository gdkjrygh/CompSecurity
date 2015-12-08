// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import com.fitbit.util.g.a;
import java.lang.reflect.Constructor;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt:
//            o

final class p extends a
{

    private static Constructor a;

    p()
    {
    }

    static Object a(o o1)
    {
        try
        {
            o1 = ((o) (a.newInstance(new Object[] {
                o1
            })));
        }
        // Misplaced declaration of an exception variable
        catch (o o1)
        {
            return null;
        }
        return o1;
    }

    public void a(Class class1)
        throws Throwable
    {
        a = class1.getConstructor(new Class[] {
            com/fitbit/bluetooth/broadcom/gatt/o
        });
        a.setAccessible(true);
    }
}
