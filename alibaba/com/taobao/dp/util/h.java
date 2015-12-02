// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.dp.util;

import java.lang.reflect.Method;

public final class h
{

    private static Class a = null;
    private static Method b = null;
    private static Object c = new Object();

    public static String a(String s, String s1)
    {
        if (a != null || b != null) goto _L2; else goto _L1
_L1:
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        Method method;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        method = b;
        if (method != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        Class class1 = Class.forName("android.os.SystemProperties");
        a = class1;
        b = class1.getMethod("get", new Class[] {
            java/lang/String, java/lang/String
        });
        obj;
        JVM INSTR monitorexit ;
_L2:
        try
        {
            s = (String)b.invoke(null, new Object[] {
                s, s1
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s1;
        }
        return s;
        s;
        obj;
        JVM INSTR monitorexit ;
        return s1;
        s;
        throw s;
    }

}
