// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jrv extends jsw
{

    private final ljk a = new ljk();

    jrv(jrk jrk1)
    {
        super(jrk1);
    }

    protected final void a()
    {
        super.d.b().a().a(a);
        Object obj = super.d.e();
        String s = ((jsv) (obj)).c();
        if (s != null)
        {
            a.a = s;
        }
        obj = ((jsv) (obj)).b();
        if (obj != null)
        {
            a.b = ((String) (obj));
        }
    }

    public final ljk b()
    {
        r();
        return a;
    }
}
