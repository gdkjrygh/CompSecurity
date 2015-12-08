// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns;

import java.util.concurrent.atomic.AtomicReference;
import javax.jmdns.impl.NetworkTopologyDiscoveryImpl;

// Referenced classes of package javax.jmdns:
//            NetworkTopologyDiscovery

public static final class ClassDelegate
{
    public static interface ClassDelegate
    {

        public abstract NetworkTopologyDiscovery newNetworkTopologyDiscovery();
    }


    private static final AtomicReference _databaseClassDelegate = new AtomicReference();
    private static volatile NetworkTopologyDiscovery _instance;

    public static NetworkTopologyDiscovery getInstance()
    {
        if (_instance != null) goto _L2; else goto _L1
_L1:
        javax/jmdns/NetworkTopologyDiscovery$Factory;
        JVM INSTR monitorenter ;
        if (_instance == null)
        {
            _instance = newNetworkTopologyDiscovery();
        }
        javax/jmdns/NetworkTopologyDiscovery$Factory;
        JVM INSTR monitorexit ;
_L2:
        return _instance;
        Exception exception;
        exception;
        javax/jmdns/NetworkTopologyDiscovery$Factory;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected static NetworkTopologyDiscovery newNetworkTopologyDiscovery()
    {
        NetworkTopologyDiscovery networktopologydiscovery = null;
        ClassDelegate classdelegate = (ClassDelegate)_databaseClassDelegate.get();
        if (classdelegate != null)
        {
            networktopologydiscovery = classdelegate.newNetworkTopologyDiscovery();
        }
        if (networktopologydiscovery != null)
        {
            return networktopologydiscovery;
        } else
        {
            return new NetworkTopologyDiscoveryImpl();
        }
    }


    private ClassDelegate()
    {
    }
}
