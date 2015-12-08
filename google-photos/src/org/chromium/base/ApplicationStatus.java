// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.app.Activity;
import android.content.Context;
import ds;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import qwh;
import qwj;
import qwn;

// Referenced classes of package org.chromium.base:
//            ThreadUtils

public class ApplicationStatus
{

    private static Object a = new Object();
    private static Integer b;
    private static ds c;
    private static final Map d = new ConcurrentHashMap();
    private static final qwn e = new qwn();

    private ApplicationStatus()
    {
    }

    public static Activity a()
    {
        return null;
    }

    public static void a(ds ds)
    {
        qwn qwn1 = e;
        if (ds == null || qwn1.a.contains(ds))
        {
            return;
        } else
        {
            qwn1.a.add(ds);
            qwn1.c = qwn1.c + 1;
            return;
        }
    }

    public static Context b()
    {
        return null;
    }

    public static void b(ds ds)
    {
        qwn qwn1 = e;
        int i;
        if (ds != null)
        {
            if ((i = qwn1.a.indexOf(ds)) != -1)
            {
                if (qwn1.b == 0)
                {
                    qwn1.a.remove(i);
                } else
                {
                    qwn1.d = true;
                    qwn1.a.set(i, null);
                }
                qwn1.c = qwn1.c - 1;
                return;
            }
        }
    }

    public static int c()
    {
        int i;
        boolean flag1;
        i = 0;
        flag1 = true;
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b != null) goto _L2; else goto _L1
_L1:
        Iterator iterator = d.values().iterator();
        boolean flag = false;
_L5:
        int j;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_126;
        }
        j = ((qwj)iterator.next()).a;
        if (j == 4 || j == 5 || j == 6) goto _L4; else goto _L3
_L3:
        i = ((flag1) ? 1 : 0);
_L6:
        b = Integer.valueOf(i);
_L2:
        i = b.intValue();
        obj;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        if (j == 4)
        {
            flag = true;
        } else
        if (j == 5)
        {
            i = 1;
        }
          goto _L5
        if (flag)
        {
            i = 2;
        } else
        if (i != 0)
        {
            i = 3;
        } else
        {
            i = 4;
        }
          goto _L6
    }

    public static ds c(ds ds)
    {
        c = ds;
        return ds;
    }

    public static ds d()
    {
        return c;
    }

    private static native void nativeOnApplicationStateChange(int i);

    private static void registerThreadSafeNativeApplicationStateListener()
    {
        ThreadUtils.a(new qwh());
    }

    static 
    {
        new qwn();
    }
}
