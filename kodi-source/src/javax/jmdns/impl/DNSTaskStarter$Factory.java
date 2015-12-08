// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package javax.jmdns.impl:
//            DNSTaskStarter, JmDNSImpl

public static final class ClassDelegate
{
    public static interface ClassDelegate
    {

        public abstract DNSTaskStarter newDNSTaskStarter(JmDNSImpl jmdnsimpl);
    }


    private static final AtomicReference _databaseClassDelegate = new AtomicReference();
    private static volatile nce _instance;
    private final ConcurrentMap _instances = new ConcurrentHashMap(20);

    public static ClassDelegate getInstance()
    {
        if (_instance != null) goto _L2; else goto _L1
_L1:
        javax/jmdns/impl/DNSTaskStarter$Factory;
        JVM INSTR monitorenter ;
        if (_instance == null)
        {
            _instance = new <init>();
        }
        javax/jmdns/impl/DNSTaskStarter$Factory;
        JVM INSTR monitorexit ;
_L2:
        return _instance;
        Exception exception;
        exception;
        javax/jmdns/impl/DNSTaskStarter$Factory;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected static DNSTaskStarter newDNSTaskStarter(JmDNSImpl jmdnsimpl)
    {
        DNSTaskStarter dnstaskstarter = null;
        ClassDelegate classdelegate = (ClassDelegate)_databaseClassDelegate.get();
        if (classdelegate != null)
        {
            dnstaskstarter = classdelegate.newDNSTaskStarter(jmdnsimpl);
        }
        if (dnstaskstarter != null)
        {
            return dnstaskstarter;
        } else
        {
            return new tarterImpl(jmdnsimpl);
        }
    }

    public DNSTaskStarter getStarter(JmDNSImpl jmdnsimpl)
    {
        DNSTaskStarter dnstaskstarter1 = (DNSTaskStarter)_instances.get(jmdnsimpl);
        DNSTaskStarter dnstaskstarter = dnstaskstarter1;
        if (dnstaskstarter1 == null)
        {
            _instances.putIfAbsent(jmdnsimpl, newDNSTaskStarter(jmdnsimpl));
            dnstaskstarter = (DNSTaskStarter)_instances.get(jmdnsimpl);
        }
        return dnstaskstarter;
    }


    private ClassDelegate()
    {
    }
}
