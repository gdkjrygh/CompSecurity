// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.os.Handler;
import android.util.SparseArray;

public class UpdateScheduler
{

    private SparseArray a;
    private long b;
    private Handler c;

    public UpdateScheduler(Handler handler)
    {
        this(handler, 500L);
    }

    public UpdateScheduler(Handler handler, long l)
    {
        b = l;
        a = new SparseArray();
        c = handler;
    }

    public final void a(int i)
    {
        a(i, b, null);
    }

    public final void a(int i, long l, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        Long long2;
        long l1;
        if (c.hasMessages(i))
        {
            break MISSING_BLOCK_LABEL_96;
        }
        l1 = System.currentTimeMillis();
        long2 = (Long)a.get(i);
        Long long1;
        long1 = long2;
        if (long2 != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        long1 = Long.valueOf(0L);
        l = Math.max(l - (l1 - long1.longValue()), 0L);
        c.sendMessageDelayed(c.obtainMessage(i, obj), l);
        a.put(i, Long.valueOf(System.currentTimeMillis() + l));
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public final boolean a()
    {
        return c.hasMessages(1);
    }
}
