// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nua
    implements nud
{

    final nue a = new nue();
    final Object b;
    private final Runnable c = new nub(this);

    public nua(Object obj)
    {
        b = obj;
    }

    public final void a()
    {
        a.a();
    }

    public final void a(nug nug1)
    {
        a.b(nug1);
    }

    public final void a(nug nug1, boolean flag)
    {
        a.a(nug1);
        if (flag)
        {
            nug1.b_(b);
        }
    }

    public final void b()
    {
        b.a(c);
    }
}
