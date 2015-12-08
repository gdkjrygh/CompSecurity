// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.data.clienttelemetry;

import a.a.a.h;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.skype.data.clienttelemetry:
//            InitializeException, TelemetryListener, DataRVErrorCode, TelemetryConfig, 
//            DataToBond, TelemetryDependencies

public class TelemetryClient
{

    private HashSet a;
    private int b;
    private TelemetryConfig c;
    private TelemetryDependencies d;
    private long e;
    private long f;
    private boolean g;

    public TelemetryClient()
        throws InitializeException
    {
        a = new HashSet();
        e = 0L;
        f = 0L;
        g = false;
        e = createListenerNative();
        if (e == 0L)
        {
            throw new InitializeException("create listener for telemetry client failed");
        }
        f = createNative();
        if (f == 0L)
        {
            throw new InitializeException("create telemetry client instance failed");
        } else
        {
            b = getTelemetryVersionNative();
            return;
        }
    }

    public TelemetryClient(long l)
        throws InitializeException
    {
        a = new HashSet();
        e = 0L;
        f = 0L;
        g = true;
        e = createListenerNative();
        if (e == 0L)
        {
            throw new InitializeException("create listener for telemetry client failed");
        }
        f = l;
        if (f == 0L)
        {
            throw new InitializeException("the parameter sctInstance is null");
        } else
        {
            b = getTelemetryVersionNative();
            return;
        }
    }

    private native int addListenerNative(long l, long l1);

    private native long createListenerNative();

    private native long createNative();

    private native int getTelemetryVersionNative();

    private native int initNative(long l, TelemetryConfig telemetryconfig, TelemetryDependencies telemetrydependencies);

    private void onSctCallback(int i, int j, int k, String as[])
    {
        as = a;
        as;
        JVM INSTR monitorenter ;
        System.out.println("There is callback from service");
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((TelemetryListener)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_62;
        Exception exception;
        exception;
        as;
        JVM INSTR monitorexit ;
        throw exception;
        as;
        JVM INSTR monitorexit ;
    }

    private native int sendAsyncNative(long l, int i, String s, byte abyte0[]);

    private native int startNative(long l, long l1);

    public final DataRVErrorCode a()
    {
        this;
        JVM INSTR monitorenter ;
        DataRVErrorCode datarverrorcode;
        if (!g)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        addListenerNative(f, e);
        datarverrorcode = DataRVErrorCode.a;
        this;
        JVM INSTR monitorexit ;
        return datarverrorcode;
        int i = startNative(f, e);
        datarverrorcode = DataRVErrorCode.values()[i];
        this;
        JVM INSTR monitorexit ;
        return datarverrorcode;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final DataRVErrorCode a(TelemetryConfig telemetryconfig, TelemetryDependencies telemetrydependencies)
    {
        this;
        JVM INSTR monitorenter ;
        if (!g)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        telemetryconfig = DataRVErrorCode.a;
        this;
        JVM INSTR monitorexit ;
        return telemetryconfig;
        c = telemetryconfig;
        d = telemetrydependencies;
        if (c.c().length() == 0)
        {
            c.c("NULL");
        }
        int i = initNative(f, c, d);
        telemetryconfig = DataRVErrorCode.values()[i];
        this;
        JVM INSTR monitorexit ;
        return telemetryconfig;
        telemetryconfig;
        this;
        JVM INSTR monitorexit ;
        throw telemetryconfig;
    }

    public final DataRVErrorCode a(String s, h h)
        throws IOException
    {
        new DataToBond();
        int i;
        try
        {
            h = DataToBond.a(h);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IOException("serialized record to bond failed");
        }
        i = sendAsyncNative(f, b, s, h);
        return DataRVErrorCode.values()[i];
    }

    public final void a(TelemetryListener telemetrylistener)
    {
        synchronized (a)
        {
            a.add(telemetrylistener);
        }
        return;
        telemetrylistener;
        hashset;
        JVM INSTR monitorexit ;
        throw telemetrylistener;
    }

    public final int b()
    {
        return b;
    }
}
