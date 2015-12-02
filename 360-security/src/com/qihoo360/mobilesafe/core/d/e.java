// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core.d;

import android.content.pm.PackageInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class e
{
    public static class a
    {

        long a;
        PackageInfo b;

        public PackageInfo a()
        {
            return b;
        }

        public boolean b()
        {
            return System.currentTimeMillis() - a - 60000L > 0L;
        }

        public String toString()
        {
            return (new StringBuilder("PackageInfo==")).append(b).toString();
        }

        public a(PackageInfo packageinfo)
        {
            b = packageinfo;
            a = System.currentTimeMillis();
        }
    }


    private static final String a = com/qihoo360/mobilesafe/core/d/e.getSimpleName();
    private static e b = null;
    private HashMap c;

    private e()
    {
        c = new LinkedHashMap(75, 0.75F, true) {

            final e a;

            protected boolean removeEldestEntry(java.util.Map.Entry entry)
            {
                return size() > 200;
            }

            
            {
                a = e.this;
                super(i, f, flag);
            }
        };
        Collections.synchronizedMap(c);
    }

    public static e a()
    {
        com/qihoo360/mobilesafe/core/d/e;
        JVM INSTR monitorenter ;
        e e1;
        if (b == null)
        {
            b = new e();
        }
        e1 = b;
        com/qihoo360/mobilesafe/core/d/e;
        JVM INSTR monitorexit ;
        return e1;
        Exception exception;
        exception;
        throw exception;
    }

    public a a(PackageInfo packageinfo)
    {
        return new a(packageinfo);
    }

    public a a(String s)
    {
        return (a)c.get(s);
    }

    public void a(String s, PackageInfo packageinfo)
    {
        c.put(s, a(packageinfo));
    }

}
