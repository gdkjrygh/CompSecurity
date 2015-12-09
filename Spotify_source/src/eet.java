// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class eet
    implements eep
{

    public eet()
    {
    }

    protected abstract void a();

    protected abstract void b();

    public abstract boolean c();

    public abstract boolean d();

    protected abstract String e();

    protected final void f()
    {
        if (c())
        {
            e();
            a();
        }
    }

    protected final void g()
    {
        if (d())
        {
            e();
            b();
        }
    }
}
