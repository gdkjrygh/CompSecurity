// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class lps
    implements jyv
{

    final ExecutorService a = Executors.newSingleThreadExecutor();

    lps(Context context, String s)
    {
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        a.shutdown();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
