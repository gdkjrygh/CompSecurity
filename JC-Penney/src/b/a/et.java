// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            ep, eo, er, dl, 
//            o

public final class et
{

    private eo a;
    private er b;

    public et()
    {
    }

    public final er a()
    {
        this;
        JVM INSTR monitorenter ;
        er er1 = b;
        this;
        JVM INSTR monitorexit ;
        return er1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(o o1)
    {
        this;
        JVM INSTR monitorenter ;
        a = ep.a(o1);
        if (!a.a())
        {
            o1 = new er(o1.b(dl.j.a(), dl.j.b()));
            o1.a = ((er) (o1)).a + 1;
            b = o1;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        o1;
        throw o1;
    }

    public final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = true;
        if (a != null)
        {
            flag = a.a();
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
