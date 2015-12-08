// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.lang.reflect.Field;
import java.security.AccessController;

// Referenced classes of package rx.internal.util:
//            f

public final class e
{

    private static final int a;
    private static final boolean b;

    public static boolean a()
    {
        return b;
    }

    public static int b()
    {
        return a;
    }

    private static int c()
    {
        try
        {
            ClassLoader classloader;
            if (System.getSecurityManager() == null)
            {
                classloader = ClassLoader.getSystemClassLoader();
            } else
            {
                classloader = (ClassLoader)AccessController.doPrivileged(new f());
            }
            return ((Integer)Class.forName("android.os.Build$VERSION", true, classloader).getField("SDK_INT").get(null)).intValue();
        }
        catch (Exception exception)
        {
            return 0;
        }
    }

    static 
    {
        int i = c();
        a = i;
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
