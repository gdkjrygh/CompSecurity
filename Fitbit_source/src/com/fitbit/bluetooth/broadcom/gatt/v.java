// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import com.fitbit.bluetooth.broadcom.gatt.a.f;
import com.fitbit.bluetooth.broadcom.gatt.a.g;
import com.fitbit.util.g.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.UUID;

final class v extends a
{

    static Constructor a;
    static Method b;

    v()
    {
    }

    static Object a(UUID uuid, int i, int j)
    {
        try
        {
            uuid = ((UUID) (a.newInstance(new Object[] {
                uuid, Integer.valueOf(i), Integer.valueOf(j)
            })));
        }
        // Misplaced declaration of an exception variable
        catch (UUID uuid)
        {
            return null;
        }
        return uuid;
    }

    public void a(Class class1)
        throws Throwable
    {
        a = class1.getDeclaredConstructor(new Class[] {
            java/util/UUID, Integer.TYPE, Integer.TYPE
        });
        b = class1.getMethod("addDescriptor", new Class[] {
            g.a().b()
        });
    }
}
