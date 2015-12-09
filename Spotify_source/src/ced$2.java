// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements ckp
{

    private cei a;
    private ced b;

    public final void a(Object obj)
    {
        synchronized (b.a)
        {
            b.g = 0;
            if (b.f != null && a != b.f)
            {
                bka.d("New JS engine is loaded, marking previous one as destroyable.");
                b.f.c();
            }
            b.f = a;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (ced ced1, cei cei1)
    {
        b = ced1;
        a = cei1;
        super();
    }
}
