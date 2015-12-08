// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jca
    implements Runnable
{

    private jbz a;

    jca(jbz jbz1)
    {
        a = jbz1;
        super();
    }

    public final void run()
    {
        if (jbz.a(a))
        {
            return;
        }
        long l = jbz.b(a) - jbz.c(a).b();
        if (l > 0L)
        {
            jbz.a(a, jbz.d(a), (int)l);
            return;
        } else
        {
            a.a(dgw.d);
            return;
        }
    }
}
