// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobileapptracker;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Semaphore;
import org.json.JSONObject;

// Referenced classes of package com.mobileapptracker:
//            MobileAppTracker

public class MATEventQueue
{

    private static long d = 0L;
    private SharedPreferences a;
    private Semaphore b;
    private MobileAppTracker c;

    public MATEventQueue(Context context, MobileAppTracker mobileapptracker)
    {
        a = context.getSharedPreferences("mat_queue", 0);
        b = new Semaphore(1, true);
        c = mobileapptracker;
    }

    static long a(long l)
    {
        d = l;
        return l;
    }

    static Semaphore a(MATEventQueue mateventqueue)
    {
        return mateventqueue.b;
    }

    static long b()
    {
        return d;
    }

    static MobileAppTracker b(MATEventQueue mateventqueue)
    {
        return mateventqueue.c;
    }

    protected int a()
    {
        this;
        JVM INSTR monitorenter ;
        int i = a.getInt("queuesize", 0);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    protected void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = a.edit();
        int j;
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        editor.putInt("queuesize", j);
        editor.commit();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        a(a() - 1);
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.remove(s);
        editor.commit();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    protected void a(JSONObject jsonobject, String s)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString(s, jsonobject.toString());
        editor.commit();
        this;
        JVM INSTR monitorexit ;
        return;
        jsonobject;
        throw jsonobject;
    }

    protected String b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = a.getString(s, null);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

}
