// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.ContentObserver;

final class duf extends ContentObserver
{

    private duc a;

    public duf(duc duc1)
    {
        a = duc1;
        super(null);
    }

    public final void onChange(boolean flag)
    {
        synchronized (duc.c(a))
        {
            duc.d(a);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
