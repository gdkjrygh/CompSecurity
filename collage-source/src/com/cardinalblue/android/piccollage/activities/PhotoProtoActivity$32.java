// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import com.cardinalblue.android.piccollage.view.k;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class a
    implements Callable
{

    final k a;
    final PhotoProtoActivity b;

    public Void a()
        throws Exception
    {
        k k1 = a;
        k1;
        JVM INSTR monitorenter ;
_L3:
        boolean flag = a.I();
        if (!flag) goto _L2; else goto _L1
_L1:
        Exception exception;
        try
        {
            a.wait(10L);
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        if (true) goto _L3; else goto _L2
_L2:
        k1;
        JVM INSTR monitorexit ;
        return null;
        k1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (PhotoProtoActivity photoprotoactivity, k k1)
    {
        b = photoprotoactivity;
        a = k1;
        super();
    }
}
