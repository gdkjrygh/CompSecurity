// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ah
{

    public static int a(String s)
    {
        if (android.os.Build.VERSION.SDK_INT <= 5)
        {
            return 0;
        }
        Class aclass[];
        Class class1;
        class1 = Class.forName("android.media.ExifInterface");
        aclass = new Class[1];
        aclass[0] = java/lang/String;
        s = ((String) (class1.getConstructor(aclass).newInstance(new Object[] {
            s
        })));
        if (s == null)
        {
            return 0;
        }
        Method method = s.getClass().getMethod("getAttribute", aclass);
        if (method == null)
        {
            return 0;
        }
        s = (String)method.invoke(s, new Object[] {
            "Orientation"
        });
        if (s == null)
        {
            return 0;
        }
        if (s.equals("3"))
        {
            return 180;
        }
        if (s.equals("6"))
        {
            return 90;
        }
        boolean flag = s.equals("8");
        return !flag ? 0 : 270;
        s;
        s.printStackTrace();
_L2:
        return 0;
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }
}
