// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import com.fitbit.util.g.a;
import java.lang.reflect.Constructor;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt:
//            e

final class f extends a
{

    private static Constructor a;

    f()
    {
    }

    static Object a(e e1)
    {
        try
        {
            e1 = ((e) (a.newInstance(new Object[] {
                e1
            })));
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            return null;
        }
        return e1;
    }

    public void a(Class class1)
        throws Throwable
    {
        a = class1.getConstructor(new Class[] {
            com/fitbit/bluetooth/broadcom/gatt/e
        });
        a.setAccessible(true);
    }
}
