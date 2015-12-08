// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class agw
{

    public int a[];
    int b;
    int c;
    public boolean d;
    int e;

    agw()
    {
        a = null;
        d = false;
        e = 0;
    }

    public abstract int a();

    public abstract Object a(int i);

    public abstract void a(agw agw1);

    public abstract void a(aif aif1);

    public void a(Object obj)
    {
        obj = String.valueOf(this);
        throw new RuntimeException((new StringBuilder(String.valueOf(obj).length() + 93)).append("Internal error: Setting data on frame backing ").append(((String) (obj))).append(", which does not support setting data directly!").toString());
    }

    public abstract int b();

    protected final void b(aif aif1)
    {
        if (aif1.a != 301)
        {
            throw new RuntimeException("Cannot allocate texture with non-RGBA data type!");
        }
        if (a == null || a.length != 2)
        {
            throw new RuntimeException("Cannot allocate non 2-dimensional texture!");
        } else
        {
            return;
        }
    }

    public abstract boolean c();

    public void d()
    {
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void g();

    public abstract int h();
}
