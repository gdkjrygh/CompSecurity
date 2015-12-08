// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ady extends ado
{

    final aeF a;

    public ady(aeF aef)
    {
        super(4, (aef.a() << 1) + 4);
        a = aef;
    }

    protected final int a(ado ado1)
    {
        return aeC.a(a, ((ady)ado1).a);
    }

    public final adh a()
    {
        return adh.i;
    }

    public final void a(acU acu)
    {
        acu = acu.g;
        int j = a.a();
        for (int i = 0; i < j; i++)
        {
            acu.a(a.a(i));
        }

    }

    protected final void a_(acU acu, aeG aeg)
    {
        acu = acu.g;
        int j = a.a();
        aeg.d(j);
        for (int i = 0; i < j; i++)
        {
            aeg.c(acu.b(a.a(i)));
        }

    }

    public final int hashCode()
    {
        return aeC.a(a);
    }
}
