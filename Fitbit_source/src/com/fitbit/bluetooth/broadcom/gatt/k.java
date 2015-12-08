// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import com.fitbit.util.g.a;
import com.fitbit.util.g.b;
import java.lang.reflect.Method;

final class k extends a
{

    static byte a[] = {
        1, 0
    };
    static byte b[] = {
        0, 0
    };
    static byte c[] = {
        2, 0
    };
    static int d = 1;
    static int e = 2;
    static int f = 4;
    static int g = 16;
    static int h = 32;
    static int i = 64;
    static int j = 128;
    static int k = 256;
    static Method l;
    static Method m;
    static Method n;
    static Method o;
    static Method p;

    k()
    {
    }

    public void a(Class class1)
        throws Throwable
    {
        l = class1.getMethod("getValue", new Class[0]);
        m = class1.getMethod("setValue", new Class[] {
            [B
        });
        n = class1.getMethod("getCharacteristic", new Class[0]);
        o = class1.getMethod("getUuid", new Class[0]);
        p = class1.getMethod("getPermissions", new Class[0]);
        a = (byte[])(byte[])com.fitbit.util.g.b.a(class1, "ENABLE_NOTIFICATION_VALUE");
        b = (byte[])(byte[])com.fitbit.util.g.b.a(class1, "DISABLE_NOTIFICATION_VALUE");
        c = (byte[])(byte[])com.fitbit.util.g.b.a(class1, "ENABLE_INDICATION_VALUE");
        d = ((Integer)com.fitbit.util.g.b.a(class1, "PERMISSION_READ")).intValue();
        e = ((Integer)com.fitbit.util.g.b.a(class1, "PERMISSION_READ_ENCRYPTED")).intValue();
        f = ((Integer)com.fitbit.util.g.b.a(class1, "PERMISSION_READ_ENCRYPTED_MITM")).intValue();
        g = ((Integer)com.fitbit.util.g.b.a(class1, "PERMISSION_WRITE")).intValue();
        h = ((Integer)com.fitbit.util.g.b.a(class1, "PERMISSION_WRITE_ENCRYPTED")).intValue();
        i = ((Integer)com.fitbit.util.g.b.a(class1, "PERMISSION_WRITE_ENCRYPTED_MITM")).intValue();
        j = ((Integer)com.fitbit.util.g.b.a(class1, "PERMISSION_WRITE_SIGNED")).intValue();
        k = ((Integer)com.fitbit.util.g.b.a(class1, "PERMISSION_WRITE_SIGNED_MITM")).intValue();
    }

}
