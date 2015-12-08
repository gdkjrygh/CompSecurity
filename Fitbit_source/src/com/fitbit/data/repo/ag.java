// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import android.app.ActivityManager;
import android.support.v4.util.LruCache;
import com.fitbit.FitBitApplication;

// Referenced classes of package com.fitbit.data.repo:
//            l

public class ag extends l
{

    private LruCache a;

    public ag()
    {
        a = new _cls1((((ActivityManager)FitBitApplication.a().getSystemService("activity")).getMemoryClass() * 0x100000) / 16);
    }

    public void a(String s, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        if (a.get(s) == null)
        {
            a.put(s, abyte0);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public byte[] a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = (byte[])a.get(s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        a.remove(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void c()
    {
        a.evictAll();
    }

    public boolean c(String s)
    {
        return a.get(s) != null;
    }

    /* member class not found */
    class _cls1 {}

}
