// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.a;

import com.qihoo360.mobilesafe.service.ProcessInfo;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class com.qihoo.security.opti.a.a
{
    public static class a
    {

        String a;
        int b;
        float c;

        public int a()
        {
            return b;
        }

        public a(String s, float f)
        {
            a = s;
            c = f;
        }
    }

    public static class b
    {

        String a;
        int b[];

        public b(String s, int ai[])
        {
            a = s;
            b = ai;
        }
    }


    private static final String a = com/qihoo/security/opti/a/a.getSimpleName();

    public com.qihoo.security.opti.a.a()
    {
    }

    static float a(int ai[])
    {
        return b(ai);
    }

    public static long a(int i)
    {
        String as[];
        long l;
        try
        {
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(new FileInputStream((new StringBuilder()).append("/proc/").append(i).append("/stat").toString())), 1000);
            String s = bufferedreader.readLine();
            bufferedreader.close();
            as = s.split(" ");
        }
        catch (IOException ioexception)
        {
            ioexception = null;
        }
        l = 0L;
        if (as != null)
        {
            l = Long.parseLong(as[13]) + Long.parseLong(as[14]) + Long.parseLong(as[15]) + Long.parseLong(as[16]);
        }
        return l;
    }

    public static Map a(List list)
    {
        ArrayList arraylist = new ArrayList();
        if (list != null && !list.isEmpty())
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                ProcessInfo processinfo = (ProcessInfo)list.next();
                if (processinfo != null)
                {
                    arraylist.add(new b(processinfo.packageName, processinfo.pids));
                }
            } while (true);
        }
        return b(arraylist);
    }

    private static float b(int ai[])
    {
        float f = 0.0F;
        for (int i = 0; i < ai.length; i++)
        {
            f += a(ai[i]);
        }

        return f;
    }

    private static Map b(List list)
    {
        return c(list);
    }

    private static Map c(List list)
    {
        Map map;
        map = Collections.synchronizedMap(new HashMap());
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        ExecutorService executorservice;
        CountDownLatch countdownlatch;
        CountDownLatch countdownlatch1;
        if (list.isEmpty())
        {
            break MISSING_BLOCK_LABEL_233;
        }
        int i = list.size();
        countdownlatch = new CountDownLatch(1);
        countdownlatch1 = new CountDownLatch(i);
        executorservice = Executors.newFixedThreadPool(5);
        for (list = list.iterator(); list.hasNext(); executorservice.submit(new Runnable(countdownlatch, (b)list.next(), map, countdownlatch1) {

        final CountDownLatch a;
        final b b;
        final Map c;
        final CountDownLatch d;

        public void run()
        {
            Exception exception1;
            try
            {
                a.await();
                float f1 = com.qihoo.security.opti.a.a.a(b.b);
                a a2 = new a(b.a, f1);
                c.put(b.a, a2);
            }
            catch (Exception exception)
            {
                d.countDown();
                return;
            }
            finally
            {
                d.countDown();
            }
            d.countDown();
            return;
            throw exception1;
        }

            
            {
                a = countdownlatch;
                b = b1;
                c = map;
                d = countdownlatch1;
                super();
            }
    })) { }
        countdownlatch.countDown();
        float f;
        try
        {
            countdownlatch1.await();
        }
        // Misplaced declaration of an exception variable
        catch (List list) { }
        executorservice.shutdown();
        list = map.entrySet().iterator();
        f = 0.0F;
        while (list.hasNext()) 
        {
            f = ((a)((java.util.Map.Entry)list.next()).getValue()).c + f;
        }
        for (list = map.entrySet().iterator(); list.hasNext();)
        {
            a a1 = (a)((java.util.Map.Entry)list.next()).getValue();
            a1.b = (int)(100F * (a1.c / f));
        }

        return map;
        list;
        return map;
    }

}
