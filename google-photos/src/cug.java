// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cug
    implements Runnable
{

    private cue a;

    cug(cue cue1)
    {
        a = cue1;
        super();
    }

    public final void run()
    {
        synchronized (cue.b(a))
        {
            cue.d(a).a(cue.c(a), cue.b(a));
        }
        return;
        exception;
        rectf;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
