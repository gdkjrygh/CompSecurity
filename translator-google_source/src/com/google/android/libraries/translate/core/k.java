// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;


// Referenced classes of package com.google.android.libraries.translate.core:
//            j

public abstract class k
{

    public Object a;

    public k()
    {
    }

    protected abstract Object a();

    public final Object b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (a == null)
        {
            a = a();
        }
        obj = a;
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        if (a != null && (a instanceof j))
        {
            ((j)a).a();
        }
        a = null;
    }
}
