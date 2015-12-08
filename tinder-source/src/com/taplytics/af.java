// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, j, gs, ae

final class af
    implements InvocationHandler
{

    final ae a;

    af(ae ae)
    {
        a = ae;
        super();
    }

    public final Object invoke(Object obj, Method method, Object aobj[])
        throws Throwable
    {
        byte byte0;
        byte0 = 0;
        obj = method.getName();
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 2: default 40
    //                   -187285076: 70
    //                   147696667: 82;
           goto _L1 _L2 _L3
_L1:
        byte0 = -1;
_L7:
        byte0;
        JVM INSTR tableswitch 0 1: default 68
    //                   0 97
    //                   1 182;
           goto _L4 _L5 _L6
_L4:
        return null;
_L2:
        if (!((String) (obj)).equals("localyticsDidTagEvent")) goto _L1; else goto _L7
_L3:
        if (!((String) (obj)).equals("hashCode")) goto _L1; else goto _L8
_L8:
        byte0 = 1;
          goto _L7
_L5:
        long l;
        method = (String)aobj[0];
        obj = (Map)aobj[1];
        l = ((Long)aobj[2]).longValue();
        if (obj == null) goto _L10; else goto _L9
_L9:
        obj = new JSONObject(((Map) (obj)));
_L11:
        ci.b().d.a("localytics", method, Long.valueOf(l), ((JSONObject) (obj)));
          goto _L4
        obj;
        gs.c((new StringBuilder("Failed to log localytics event: ")).append(((Exception) (obj)).getMessage()).toString());
          goto _L4
_L6:
        return Integer.valueOf(hashCode());
_L10:
        obj = null;
          goto _L11
    }
}
