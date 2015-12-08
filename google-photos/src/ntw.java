// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ntw
    implements nud
{

    final nue a = new nue();
    final Object b;
    boolean c;
    private final mwx d;

    public ntw(Object obj, mwx mwx1)
    {
        b = obj;
        d = mwx1;
    }

    public final void a()
    {
        b.u();
        a.a();
    }

    public final void a(nug nug)
    {
        b.u();
        a.b(nug);
    }

    public final void a(nug nug, boolean flag)
    {
        b.u();
        a.a(nug);
        if (flag)
        {
            d.a(new ntx(this, nug));
        }
    }

    public final void b()
    {
        b.u();
        if (!c)
        {
            c = true;
            d.a(new nty(this));
        }
    }
}
