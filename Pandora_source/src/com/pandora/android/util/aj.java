// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import com.pandora.android.provider.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class aj
{
    public static interface a
    {

        public abstract void a(int i);
    }


    private static volatile aj e;
    private final Handler a = new Handler();
    private final List b = Collections.synchronizedList(new ArrayList());
    private final AudioManager c;
    private volatile int d;

    private aj()
    {
        c = (AudioManager)b.a.h().getSystemService("audio");
    }

    public static int a()
    {
        return b().d();
    }

    public static int a(a a1)
    {
        if (a1 == null)
        {
            return -1;
        }
        aj aj1 = b();
        boolean flag;
        if (aj1.b.size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!aj1.b.contains(a1))
        {
            aj1.b.add(a1);
        }
        if (flag)
        {
            aj1.c();
        }
        return a();
    }

    public static void a(int i)
    {
        b().c(i);
    }

    static void a(aj aj1)
    {
        aj1.c();
    }

    private static aj b()
    {
        if (e == null)
        {
            e = new aj();
        }
        return e;
    }

    private void b(int i)
    {
        List list = b;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).a(i)) { }
        break MISSING_BLOCK_LABEL_49;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
    }

    public static boolean b(a a1)
    {
        return b().b.remove(a1);
    }

    private void c()
    {
        if (b.size() == 0)
        {
            return;
        }
        int i = a();
        if (i != d)
        {
            d = i;
            b(i);
        }
        a.postDelayed(new Runnable() {

            final aj a;

            public void run()
            {
                aj.a(a);
            }

            
            {
                a = aj.this;
                super();
            }
        }, 1000L);
    }

    private void c(int i)
    {
        c.setStreamVolume(3, i, 0);
    }

    private int d()
    {
        return c.getStreamVolume(3);
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }
}
