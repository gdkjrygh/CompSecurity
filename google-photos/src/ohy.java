// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import javax.microedition.khronos.opengles.GL10;

final class ohy
{

    boolean a;
    ohx b;
    private boolean c;
    private int d;
    private boolean e;
    private boolean f;

    ohy()
    {
    }

    public final void a(GL10 gl10)
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        c();
        gl10 = gl10.glGetString(7937);
        if (d >= 0x20000)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        boolean flag;
        if (!gl10.startsWith("Q3Dimension MSM7500 "))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        notifyAll();
        if (!a)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        f = flag;
        e = true;
        this;
        JVM INSTR monitorexit ;
        return;
        gl10;
        throw gl10;
    }

    public final void a(ohx ohx1)
    {
        this;
        JVM INSTR monitorenter ;
        ohx.a(ohx1, true);
        if (b == ohx1)
        {
            b = null;
        }
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        ohx1;
        throw ohx1;
    }

    public final boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = f;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(ohx ohx1)
    {
        if (b == ohx1)
        {
            b = null;
        }
        notifyAll();
    }

    public final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        c();
        flag = a;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    void c()
    {
        if (!c)
        {
            d = oqv.a("ro.opengles.version", 0);
            if (d >= 0x20000)
            {
                a = true;
            }
            c = true;
        }
    }
}
