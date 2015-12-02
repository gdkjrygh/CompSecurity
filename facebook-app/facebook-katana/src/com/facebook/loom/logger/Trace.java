// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.logger;

import java.io.Closeable;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.facebook.loom.logger:
//            Closeables, LogWriter

public class Trace
    implements Closeable
{

    private final File a;
    private final int b;
    private final ClosedListener c;
    private final LogWriter d;
    private boolean e;

    public Trace(File file, LogWriter logwriter, int i, ClosedListener closedlistener)
    {
        a = file;
        d = logwriter;
        b = i;
        c = closedlistener;
    }

    public static String a(String s)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH-mm-ssZ", Locale.US);
        return String.format(Locale.ENGLISH, "%s-%s%s", new Object[] {
            simpledateformat.format(new Date()), s, ".tmp"
        });
    }

    final LogWriter a()
    {
        return d;
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        e = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final File b()
    {
        return a;
    }

    public final int c()
    {
        return b;
    }

    public void close()
    {
        Closeables.a(a());
        if (c != null)
        {
            c.a(this);
        }
    }

    public final boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private class ClosedListener
    {

        public abstract void a(Trace trace);
    }

}
