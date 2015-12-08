// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dm;


// Referenced classes of package p.dm:
//            m, g

public abstract class f
{

    protected byte a;
    protected byte b[];
    public byte c[];

    public f()
    {
        b = new byte[0];
        c = new byte[0];
    }

    public String a()
    {
        return "";
    }

    public String a(g g)
    {
        return toString();
    }

    public byte c()
    {
        return a;
    }

    public Object clone()
    {
        return null;
    }

    public byte[] d()
    {
        return b;
    }

    public byte[] e()
    {
        return c;
    }

    public String toString()
    {
        return m.d(e());
    }
}
