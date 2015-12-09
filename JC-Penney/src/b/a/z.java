// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            ag

public final class z
    implements android.os.MessageQueue.IdleHandler
{

    private boolean a;

    private z()
    {
        a = false;
    }

    public z(byte byte0)
    {
        this();
    }

    public final boolean queueIdle()
    {
        this;
        JVM INSTR monitorenter ;
        if (!a)
        {
            a = true;
            ag.f();
        }
        this;
        JVM INSTR monitorexit ;
        return true;
        Exception exception;
        exception;
        throw exception;
    }
}
