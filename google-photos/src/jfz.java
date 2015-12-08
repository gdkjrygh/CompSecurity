// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jfz
    implements nuc
{

    public final nud a;
    public final jga b;
    public boolean c;
    public boolean d;

    public jfz()
    {
        this(new jga());
    }

    public jfz(jga jga1)
    {
        a = new ntz(this);
        b = jga1;
    }

    public final nud a()
    {
        return a;
    }

    public final void a(float f, float f1, boolean flag)
    {
        b.b = f;
        b.c = f1;
        b.a = flag;
        a.b();
    }

    public final void a(boolean flag)
    {
        c = flag;
        a.b();
    }
}
