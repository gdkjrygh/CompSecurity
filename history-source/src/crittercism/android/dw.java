// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            ds, cq, ax, du

public final class dw
{

    private ds a;
    private du b;

    public dw()
    {
    }

    public final du a()
    {
        this;
        JVM INSTR monitorenter ;
        du du1 = b;
        this;
        JVM INSTR monitorexit ;
        return du1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(ax ax1)
    {
        this;
        JVM INSTR monitorenter ;
        int j;
        a = ds.a.a(ax1);
        if (a.a())
        {
            break MISSING_BLOCK_LABEL_88;
        }
        j = ax1.b(cq.j.a(), cq.j.b());
        int i;
        i = j;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        i = ax1.b(cq.k.a(), cq.k.b());
        ax1 = new du(i);
        ax1.a = ((du) (ax1)).a + 1;
        b = ax1;
        this;
        JVM INSTR monitorexit ;
        return;
        ax1;
        throw ax1;
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
