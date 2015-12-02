// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alipay.android.app.util;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.alipay.android.app.util:
//            NamedThreadFactory

public final class ThreadPools
{

    private static final RejectedExecutionHandler a = new java.util.concurrent.ThreadPoolExecutor.AbortPolicy();
    private static final Map b = new ConcurrentHashMap();

    public ThreadPools()
    {
    }

    private static void a()
    {
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        Iterator iterator = b.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (((ThreadPoolExecutor)b.get(s)).isShutdown())
            {
                b.remove(s);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_75;
        Exception exception;
        exception;
        throw exception;
        map;
        JVM INSTR monitorexit ;
    }

    public static ThreadPoolExecutor applyDefaultThreadPool()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static ThreadPoolExecutor applyThreadPool(String s, int i, int j, int k, RejectedExecutionHandler rejectedexecutionhandler)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("\u7EBF\u7A0B\u6C60\u540D\u79F0\u4E0D\u5141\u8BB8\u4E3A\u7A7A");
        }
        a();
        s = s.trim();
        if ((ThreadPoolExecutor)b.get(s) == null)
        {
            if (k == 0)
            {
                b.put(s, new ThreadPoolExecutor(i, j, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new NamedThreadFactory((new StringBuilder()).append(s).append("-pool").toString()), rejectedexecutionhandler));
            } else
            {
                b.put(s, new ThreadPoolExecutor(i, j, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(k), new NamedThreadFactory((new StringBuilder()).append(s).append("-pool").toString()), rejectedexecutionhandler));
            }
        }
        return (ThreadPoolExecutor)b.get(s);
    }

    public static void closeThreadPool()
    {
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        String s;
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext(); b.remove(s))
        {
            s = (String)iterator.next();
            ThreadPoolExecutor threadpoolexecutor = (ThreadPoolExecutor)b.get(s);
            if (!threadpoolexecutor.isShutdown())
            {
                threadpoolexecutor.shutdownNow();
            }
        }

        break MISSING_BLOCK_LABEL_82;
        Exception exception;
        exception;
        throw exception;
        map;
        JVM INSTR monitorexit ;
    }

}
