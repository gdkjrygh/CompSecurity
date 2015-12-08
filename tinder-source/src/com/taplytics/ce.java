// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// Referenced classes of package com.taplytics:
//            gs, cd, bg

final class ce
    implements InvocationHandler
{

    final cd a;

    ce(cd cd1)
    {
        a = cd1;
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
    //                   -829188934: 70
    //                   147696667: 82;
           goto _L1 _L2 _L3
_L1:
        byte0 = -1;
_L7:
        byte0;
        JVM INSTR tableswitch 0 1: default 68
    //                   0 97
    //                   1 206;
           goto _L4 _L5 _L6
_L4:
        return null;
_L2:
        if (!((String) (obj)).equals("onConnectionFailed")) goto _L1; else goto _L7
_L3:
        if (!((String) (obj)).equals("hashCode")) goto _L1; else goto _L8
_L8:
        byte0 = 1;
          goto _L7
_L5:
        obj = aobj[0];
        try
        {
            int i = ((Integer)obj.getClass().getMethod("getErrorCode", new Class[0]).invoke(obj, new Object[0])).intValue();
            gs.c((new StringBuilder("Cannot connect to Google Play Services: ")).append(i).append(". Could be missing or out of date").toString());
            if (a.d != null)
            {
                a.d.b();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gs.c((new StringBuilder("Failed to log localytics event: ")).append(((Exception) (obj)).getMessage()).toString());
        }
          goto _L4
_L6:
        return Integer.valueOf(hashCode());
          goto _L7
    }
}
