// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.protocol;


// Referenced classes of package org.apache.http.protocol:
//            BasicHttpContext, HttpContext

public class SyncBasicHttpContext extends BasicHttpContext
{

    public SyncBasicHttpContext()
    {
    }

    public SyncBasicHttpContext(HttpContext httpcontext)
    {
        super(httpcontext);
    }

    public void clear()
    {
        this;
        JVM INSTR monitorenter ;
        super.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public Object getAttribute(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = ((String) (super.getAttribute(s)));
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public Object removeAttribute(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = ((String) (super.removeAttribute(s)));
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public void setAttribute(String s, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        super.setAttribute(s, obj);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
