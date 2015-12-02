// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.b;

import android.content.Context;
import android.os.Binder;
import java.lang.reflect.Method;

public class a
{

    public static int a(String s, int i, String s1, Context context)
    {
        Method method;
        context = ((Context) (context.getSystemService("appops")));
        method = a(context, "checkOp", new Class[] {
            java/lang/String, Integer.TYPE, java/lang/String
        });
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        s = ((String) (method.invoke(context, new Object[] {
            s, Integer.valueOf(i), s1
        })));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        if (!(s instanceof Integer))
        {
            break MISSING_BLOCK_LABEL_88;
        }
        i = ((Integer)s).intValue();
        return i;
        s;
_L2:
        return 0;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static transient Method a(Object obj, String s, Class aclass[])
    {
        try
        {
            obj = obj.getClass().getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        return ((Method) (obj));
    }

    public static boolean a(Context context)
    {
        return a("android:get_usage_stats", Binder.getCallingUid(), "com.qihoo.security.lite", context) == 0;
    }
}
