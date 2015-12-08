// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.base;

import ahn;
import ahs;
import aif;
import aig;
import ajr;
import aju;
import ajw;

public final class VariableSource extends ahn
{

    private aju mOutputPort;
    private Object mValue;

    public VariableSource(ajr ajr, String s)
    {
        super(ajr, s);
        mValue = null;
        mOutputPort = null;
    }

    public final void a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        mValue = obj;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public final ajw b()
    {
        return (new ajw()).b("value", 2, aif.b()).a();
    }

    protected final void c()
    {
        mOutputPort = b("value");
    }

    protected final void e()
    {
        this;
        JVM INSTR monitorenter ;
        aig aig1 = mOutputPort.a(null).d();
        aig1.a(mValue);
        mOutputPort.a(aig1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
