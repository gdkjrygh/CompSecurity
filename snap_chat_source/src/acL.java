// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class acL extends ado
{

    private final acK a[];

    protected final int a(ado ado1)
    {
        throw new NullPointerException();
    }

    public final adh a()
    {
        return adh.j;
    }

    public final void a(acU acu)
    {
        acu = acu.m;
        int j = a.length;
        for (int i = 0; i < j; i++)
        {
            a[i] = (acK)acu.b(a[i]);
        }

    }

    protected final void a(adr adr, int i)
    {
        acK.a(a);
    }

    protected final void a_(acU acu, aeG aeg)
    {
        int j = a.length;
        aeg.d(j);
        for (int i = 0; i < j; i++)
        {
            aeg.d(a[i].d());
        }

    }

    public final int hashCode()
    {
        throw new NullPointerException();
    }
}
