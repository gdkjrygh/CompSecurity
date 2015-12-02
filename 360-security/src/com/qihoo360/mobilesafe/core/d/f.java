// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core.d;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class f
{
    public static class a
    {

        int a;
        String b;
        long c;
        int d;

        public boolean a()
        {
            return System.currentTimeMillis() - c - 0x1d4c0L > 0L;
        }

        public String toString()
        {
            return (new StringBuilder("pid==")).append(a).append("  packageName=").append(b).append("  memory=").append(d).append("  lastCacheTime=").append(c).toString();
        }

        public a()
        {
        }
    }


    private static final String a = com/qihoo360/mobilesafe/core/d/f.getSimpleName();
    private static f b = null;
    private HashMap c;

    private f()
    {
        c = new LinkedHashMap(75, 0.75F, true) {

            final f a;

            protected boolean removeEldestEntry(java.util.Map.Entry entry)
            {
                return size() > 200;
            }

            
            {
                a = f.this;
                super(i, f2, flag);
            }
        };
        Collections.synchronizedMap(c);
    }

    public static f a()
    {
        com/qihoo360/mobilesafe/core/d/f;
        JVM INSTR monitorenter ;
        f f1;
        if (b == null)
        {
            b = new f();
        }
        f1 = b;
        com/qihoo360/mobilesafe/core/d/f;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public a a(int i)
    {
        return (a)c.get(Integer.valueOf(i));
    }

    public void a(int i, a a1)
    {
        c.put(Integer.valueOf(i), a1);
    }

    public boolean b()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (c != null)
        {
            flag = flag1;
            if (!c.isEmpty())
            {
                flag = true;
            }
        }
        return flag;
    }

}
