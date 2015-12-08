// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.data.clienttelemetry;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.skype.data.clienttelemetry:
//            InitializeException, EcsErrorCode, EcsClientConfig, EcsClientDependencies

public class EcsClient
{

    private HashSet a;
    private int b;
    private EcsClientConfig c;
    private EcsClientDependencies d;
    private long e;
    private long f;
    private boolean g;

    public EcsClient()
        throws InitializeException
    {
        a = new HashSet();
        e = 0L;
        f = 0L;
        g = false;
        e = createListenerNative();
        if (e == 0L)
        {
            throw new InitializeException("create listener for ecs client failed");
        }
        f = createNative();
        if (f == 0L)
        {
            throw new InitializeException("create ecs client instance failed");
        } else
        {
            b = getEcsVersionNative();
            return;
        }
    }

    public EcsClient(long l)
        throws InitializeException
    {
        a = new HashSet();
        e = 0L;
        f = 0L;
        f = l;
        if (l == 0L)
        {
            throw new InitializeException("the parameter ecsInstance is null");
        }
        g = true;
        e = createListenerNative();
        if (e == 0L)
        {
            throw new InitializeException("Create listener for teecs client failed");
        } else
        {
            b = getEcsVersionNative();
            return;
        }
    }

    private native long createListenerNative();

    private native long createNative();

    private native int getEcsVersionNative();

    private native int initNative(long l, EcsClientConfig ecsclientconfig, EcsClientDependencies ecsclientdependencies);

    private void onEcsCallback(int i, int j, int k)
    {
        HashSet hashset = a;
        hashset;
        JVM INSTR monitorenter ;
        System.out.println("There is callback from service");
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
        break MISSING_BLOCK_LABEL_55;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public final long a()
    {
        return f;
    }

    public final EcsErrorCode a(EcsClientConfig ecsclientconfig, EcsClientDependencies ecsclientdependencies)
    {
        this;
        JVM INSTR monitorenter ;
        if (!g)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        ecsclientconfig = EcsErrorCode.a;
        this;
        JVM INSTR monitorexit ;
        return ecsclientconfig;
        c = ecsclientconfig;
        d = ecsclientdependencies;
        int i = initNative(f, ecsclientconfig, ecsclientdependencies);
        ecsclientconfig = EcsErrorCode.values()[i];
        this;
        JVM INSTR monitorexit ;
        return ecsclientconfig;
        ecsclientconfig;
        this;
        JVM INSTR monitorexit ;
        throw ecsclientconfig;
    }

    public final int b()
    {
        return b;
    }
}
