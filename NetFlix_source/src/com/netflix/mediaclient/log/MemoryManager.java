// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.log;

import android.app.ActivityManager;
import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.AndroidUtils;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class MemoryManager
    implements Runnable
{

    private static int DELTA = 0;
    private static final String TAG = "nf-memory";
    private ScheduledFuture cancelHelper;
    private Context context;
    private ScheduledExecutorService executor;

    public MemoryManager(Context context1)
    {
        this(context1, DELTA);
    }

    public MemoryManager(Context context1, int i)
    {
        executor = Executors.newSingleThreadScheduledExecutor();
        if (context1 == null)
        {
            throw new IllegalArgumentException("Context can not be null!");
        }
        context = context1;
        if (i <= 0)
        {
            i = DELTA;
        }
        cancelHelper = executor.scheduleAtFixedRate(this, 0L, 60L, TimeUnit.SECONDS);
    }

    private static void logLine(String s, int i, int j)
    {
        if (i > s.length())
        {
            return;
        }
        if (j > s.length())
        {
            Log.i("nf-memory", s.substring(i));
            return;
        } else
        {
            Log.i("nf-memory", s.substring(i, j));
            return;
        }
    }

    private static void parseMemoryDump(String s)
    {
        if (s != null)
        {
            int i = s.lastIndexOf("**") + 2;
            int k = s.indexOf("Objects");
            if (i < k)
            {
                s = s.substring(i, k);
                logLine(s, 0, 82);
                k = 0 + 82;
                for (int j = 0; j < 6; j++)
                {
                    logLine(s, k, k + 81);
                    k += 80;
                }

                Log.i("nf-memory", " \n");
                Log.i("nf-memory", " =================================");
                return;
            }
        }
    }

    public void destroy()
    {
        this;
        JVM INSTR monitorenter ;
        if (executor != null)
        {
            if (cancelHelper != null)
            {
                executor.execute(new Runnable() {

                    final MemoryManager this$0;

                    public void run()
                    {
                        cancelHelper.cancel(true);
                        cancelHelper = null;
                        executor.shutdown();
                        executor = null;
                        Log.d("nf-memory", "Memory manager stoped");
                    }

            
            {
                this$0 = MemoryManager.this;
                super();
            }
                });
            }
            context = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void run()
    {
        ActivityManager activitymanager = (ActivityManager)context.getSystemService("activity");
        if (activitymanager == null)
        {
            Log.e("nf-memory", "Unable to find activity manager! Unable to get memory data!");
            return;
        }
        android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
        activitymanager.getMemoryInfo(memoryinfo);
        Log.i("nf-memory", "=================================");
        Log.i("nf-memory", "Memory usage:\n");
        Log.i("nf-memory", (new StringBuilder()).append("minfo.availMem  [b]:").append(memoryinfo.availMem).toString());
        Log.i("nf-memory", (new StringBuilder()).append("minfo.lowMemory [b]: ").append(memoryinfo.lowMemory).toString());
        Log.i("nf-memory", (new StringBuilder()).append("minfo.threshold [b]: ").append(memoryinfo.threshold).toString());
        Log.i("nf-memory", "\n");
        try
        {
            parseMemoryDump(AndroidUtils.dumpMemInfo("com.netflix.mediaclient"));
            return;
        }
        catch (Throwable throwable)
        {
            Log.e("nf-memory", "Fail to execute dumpsys meminfo", throwable);
        }
    }

    static 
    {
        DELTA = 60;
    }



/*
    static ScheduledFuture access$002(MemoryManager memorymanager, ScheduledFuture scheduledfuture)
    {
        memorymanager.cancelHelper = scheduledfuture;
        return scheduledfuture;
    }

*/



/*
    static ScheduledExecutorService access$102(MemoryManager memorymanager, ScheduledExecutorService scheduledexecutorservice)
    {
        memorymanager.executor = scheduledexecutorservice;
        return scheduledexecutorservice;
    }

*/
}
