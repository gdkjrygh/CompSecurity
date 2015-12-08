// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import com.a.a.a;
import com.a.a.c.g;
import java.util.Random;

// Referenced classes of package kik.android.util:
//            DeviceUtils

public final class bx
{

    private static final Random a = new Random();

    public static void a(Throwable throwable)
    {
        if (throwable == null)
        {
            return;
        }
        if (DeviceUtils.c())
        {
            throwable.printStackTrace();
            return;
        } else
        {
            com.a.a.a.d().c.a(throwable);
            return;
        }
    }

    public static void a(Throwable throwable, int i)
    {
        if (throwable != null)
        {
            if (DeviceUtils.c())
            {
                throwable.printStackTrace();
                return;
            }
            if (a.nextInt(100) < i)
            {
                com.a.a.a.d().c.a(throwable);
                return;
            }
        }
    }

    public static void b(Throwable throwable)
    {
        a(throwable, 10);
    }

    public static void c(Throwable throwable)
    {
        if (DeviceUtils.c())
        {
            throwable.printStackTrace();
        }
    }

    public static void d(Throwable throwable)
    {
        if (DeviceUtils.c())
        {
            throw new RuntimeException(throwable);
        } else
        {
            com.a.a.a.d().c.a(throwable);
            return;
        }
    }

    public static void e(Throwable throwable)
    {
        if (DeviceUtils.c())
        {
            throw new RuntimeException(throwable);
        } else
        {
            return;
        }
    }

    public static void f(Throwable throwable)
    {
        if (DeviceUtils.c())
        {
            throwable.printStackTrace();
        }
    }

}
