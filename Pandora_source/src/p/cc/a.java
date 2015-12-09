// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cc;


// Referenced classes of package p.cc:
//            c

public class a extends Exception
{

    c a;

    public a(int i, String s)
    {
        this(new c(i, s));
    }

    public a(int i, String s, Exception exception)
    {
        this(new c(i, s), exception);
    }

    public a(c c1)
    {
        this(c1, ((Exception) (null)));
    }

    public a(c c1, Exception exception)
    {
        super(c1.b(), exception);
        a = c1;
    }

    public c a()
    {
        return a;
    }
}
