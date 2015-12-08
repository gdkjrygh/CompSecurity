// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import com.fitbit.util.g.a;
import com.fitbit.util.g.b;
import java.lang.reflect.Method;
import java.util.UUID;

final class h extends a
{

    static int A = 52;
    static Method B;
    static Method C;
    static Method D;
    static Method E;
    static Method F;
    static Method G;
    static Method H;
    static Method I;
    static Method J;
    static Method K;
    static int a = 1;
    static int b = 2;
    static int c = 4;
    static int d = 8;
    static int e = 16;
    static int f = 32;
    static int g = 64;
    static int h = 128;
    static int i = 1;
    static int j = 2;
    static int k = 4;
    static int l = 16;
    static int m = 32;
    static int n = 64;
    static int o = 128;
    static int p = 256;
    static int q = 2;
    static int r = 1;
    static int s = 4;
    static int t = 17;
    static int u = 18;
    static int v = 20;
    static int w = 33;
    static int x = 34;
    static int y = 36;
    static int z = 50;

    h()
    {
    }

    public void a(Class class1)
        throws Throwable
    {
        B = class1.getMethod("getDescriptor", new Class[] {
            java/util/UUID
        });
        C = class1.getMethod("setValue", new Class[] {
            [B
        });
        D = class1.getMethod("getValue", new Class[0]);
        E = class1.getMethod("getService", new Class[0]);
        F = class1.getMethod("getUuid", new Class[0]);
        G = class1.getMethod("getProperties", new Class[0]);
        H = class1.getMethod("getPermissions", new Class[0]);
        I = class1.getMethod("getWriteType", new Class[0]);
        J = class1.getMethod("setWriteType", new Class[] {
            Integer.TYPE
        });
        K = class1.getMethod("getDescriptors", new Class[0]);
        a = ((Integer)com.fitbit.util.g.b.a(class1, "PROPERTY_BROADCAST")).intValue();
        b = ((Integer)com.fitbit.util.g.b.a(class1, "PROPERTY_READ")).intValue();
        c = ((Integer)com.fitbit.util.g.b.a(class1, "PROPERTY_WRITE_NO_RESPONSE")).intValue();
        d = ((Integer)com.fitbit.util.g.b.a(class1, "PROPERTY_WRITE")).intValue();
        e = ((Integer)com.fitbit.util.g.b.a(class1, "PROPERTY_NOTIFY")).intValue();
        f = ((Integer)com.fitbit.util.g.b.a(class1, "PROPERTY_INDICATE")).intValue();
        g = ((Integer)com.fitbit.util.g.b.a(class1, "PROPERTY_SIGNED_WRITE")).intValue();
        h = ((Integer)com.fitbit.util.g.b.a(class1, "PROPERTY_EXTENDED_PROPS")).intValue();
        i = ((Integer)com.fitbit.util.g.b.a(class1, "PERMISSION_READ")).intValue();
        j = ((Integer)com.fitbit.util.g.b.a(class1, "PERMISSION_READ_ENCRYPTED")).intValue();
        k = ((Integer)com.fitbit.util.g.b.a(class1, "PERMISSION_READ_ENCRYPTED_MITM")).intValue();
        l = ((Integer)com.fitbit.util.g.b.a(class1, "PERMISSION_WRITE")).intValue();
        m = ((Integer)com.fitbit.util.g.b.a(class1, "PERMISSION_WRITE_ENCRYPTED")).intValue();
        n = ((Integer)com.fitbit.util.g.b.a(class1, "PERMISSION_WRITE_ENCRYPTED_MITM")).intValue();
        o = ((Integer)com.fitbit.util.g.b.a(class1, "PERMISSION_WRITE_SIGNED")).intValue();
        p = ((Integer)com.fitbit.util.g.b.a(class1, "PERMISSION_WRITE_SIGNED_MITM")).intValue();
        q = ((Integer)com.fitbit.util.g.b.a(class1, "WRITE_TYPE_DEFAULT")).intValue();
        r = ((Integer)com.fitbit.util.g.b.a(class1, "WRITE_TYPE_NO_RESPONSE")).intValue();
        s = ((Integer)com.fitbit.util.g.b.a(class1, "WRITE_TYPE_SIGNED")).intValue();
        t = ((Integer)com.fitbit.util.g.b.a(class1, "FORMAT_UINT8")).intValue();
        u = ((Integer)com.fitbit.util.g.b.a(class1, "FORMAT_UINT16")).intValue();
        v = ((Integer)com.fitbit.util.g.b.a(class1, "FORMAT_UINT32")).intValue();
        w = ((Integer)com.fitbit.util.g.b.a(class1, "FORMAT_SINT8")).intValue();
        x = ((Integer)com.fitbit.util.g.b.a(class1, "FORMAT_SINT16")).intValue();
        y = ((Integer)com.fitbit.util.g.b.a(class1, "FORMAT_SINT32")).intValue();
        z = ((Integer)com.fitbit.util.g.b.a(class1, "FORMAT_SFLOAT")).intValue();
        A = ((Integer)com.fitbit.util.g.b.a(class1, "FORMAT_FLOAT")).intValue();
    }

}
