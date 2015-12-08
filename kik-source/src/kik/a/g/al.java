// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;


// Referenced classes of package kik.a.g:
//            v

final class al
    implements Runnable
{

    final v a;

    al(v v1)
    {
        a = v1;
        super();
    }

    public final void run()
    {
        synchronized (v.d(a))
        {
            v.e(a);
        }
        a.o();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
