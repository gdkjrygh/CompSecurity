// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.udppriming.client;

import android.content.Context;
import android.content.SharedPreferences;

public class EncryptChannelInformation
{

    private static final EncryptChannelInformation a = new EncryptChannelInformation();
    private SharedPreferences b;
    private volatile String c;
    private volatile String d;
    private volatile String e;
    private volatile String f;
    private volatile int g;
    private volatile int h;
    private volatile long i;
    private volatile long j;
    private volatile long k;

    private EncryptChannelInformation()
    {
        c = null;
        d = null;
        e = null;
        f = null;
        g = 0;
        h = 0;
        i = 0L;
        j = 0L;
        k = 0L;
    }

    public static EncryptChannelInformation a()
    {
        return a;
    }

    private boolean e()
    {
        return System.currentTimeMillis() > j;
    }

    private boolean f()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        SharedPreferences sharedpreferences = b;
        if (sharedpreferences != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        c = b.getString("ENCRYPT_CHANNEL_INFO/CHANNEL_ID", null);
        d = b.getString("ENCRYPT_CHANNEL_INFO/MAC_KEY", null);
        e = b.getString("ENCRYPT_CHANNEL_INFO/ENCRYPTION_KEY", null);
        f = b.getString("ENCRYPT_CHANNEL_INFO/USER_AGENT", null);
        i = b.getLong("ENCRYPT_CHANNEL_INFO/UPDATED_TIME", 0L);
        j = b.getLong("ENCRYPT_CHANNEL_INFO/EXPIRE_TIME", 0L);
        g = b.getInt("ENCRYPT_CHANNEL_INFO/TTL_SINCE_ACTIVATE", 0);
        h = b.getInt("ENCRYPT_CHANNEL_INFO/ALGORITHM_VERSION", 0);
        k = b.getLong("ENCRYPT_CHANNEL_INFO/CREATION_TIME", 0L);
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s, String s1, String s2, String s3, int l, int i1, int j1, 
            long l1)
    {
        this;
        JVM INSTR monitorenter ;
        c = s;
        d = s1;
        e = s2;
        f = s3;
        i = System.currentTimeMillis();
        j = i + (long)l;
        g = i1;
        h = j1;
        k = l1;
        if (b != null)
        {
            s = b.edit();
            s.putString("ENCRYPT_CHANNEL_INFO/CHANNEL_ID", c);
            s.putString("ENCRYPT_CHANNEL_INFO/MAC_KEY", d);
            s.putString("ENCRYPT_CHANNEL_INFO/ENCRYPTION_KEY", e);
            s.putString("ENCRYPT_CHANNEL_INFO/USER_AGENT", f);
            s.putLong("ENCRYPT_CHANNEL_INFO/UPDATED_TIME", i);
            s.putLong("ENCRYPT_CHANNEL_INFO/EXPIRE_TIME", j);
            s.putInt("ENCRYPT_CHANNEL_INFO/TTL_SINCE_ACTIVATE", g);
            s.putInt("ENCRYPT_CHANNEL_INFO/ALGORITHM_VERSION", h);
            s.putLong("ENCRYPT_CHANNEL_INFO/CREATION_TIME", k);
            s.commit();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final boolean a(Context context)
    {
        b = context.getSharedPreferences("ENCRYPT_CHANNEL_INFO_STORAGE", 0);
        return f();
    }

    public final boolean a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (c == null || d == null || e == null || e() || f == null) goto _L2; else goto _L1
_L1:
        boolean flag = f.equals(s);
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        s;
        throw s;
    }

    public final String b()
    {
        return c;
    }

    public final String c()
    {
        return d;
    }

    public final String d()
    {
        return e;
    }

}
