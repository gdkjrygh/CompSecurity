// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.d;

import a.a.b.d;
import a.a.c.b;
import java.io.Serializable;
import org.apache.a.a.a.a;

public abstract class c
    implements Serializable
{

    private transient a a;
    private String b;
    private String c;

    public c()
    {
        a = new a();
    }

    public abstract String a();

    public abstract String a(b b1, a.a.c.a a1)
        throws d;

    protected String a(byte abyte0[])
    {
        return new String(a.a(abyte0));
    }

    public void a(String s)
    {
        b = s;
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        c = s;
    }

    public String c()
    {
        return c;
    }
}
