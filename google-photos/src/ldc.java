// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ldc extends ldd
{

    private String g;
    private String h;

    public ldc(lmj lmj, jyn jyn, String s, String s1)
    {
        g = s;
        h = s1;
        super(jyn);
    }

    protected final void a(jyl jyl)
    {
        kcg kcg = ((lnd)jyl).a(this, g, h, 0);
        synchronized (super.a)
        {
            super.e = kcg;
        }
        return;
        exception;
        jyl;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
