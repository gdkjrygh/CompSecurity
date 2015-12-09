// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import com.fitbit.util.g.a;
import com.fitbit.util.g.b;
import java.lang.reflect.Method;
import java.util.UUID;

final class t extends a
{

    static int a = 0;
    static int b = 1;
    static Method c;
    static Method d;

    t()
    {
    }

    public void a(Class class1)
        throws Throwable
    {
        c = class1.getMethod("getUuid", new Class[0]);
        d = class1.getMethod("getCharacteristic", new Class[] {
            java/util/UUID
        });
        a = ((Integer)com.fitbit.util.g.b.a(class1, "SERVICE_TYPE_PRIMARY")).intValue();
        b = ((Integer)com.fitbit.util.g.b.a(class1, "SERVICE_TYPE_SECONDARY")).intValue();
    }

}
