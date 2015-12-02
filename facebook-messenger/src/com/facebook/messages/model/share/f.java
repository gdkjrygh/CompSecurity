// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.share;


// Referenced classes of package com.facebook.messages.model.share:
//            ShareMediaPhoto

public class f
{

    private String a;
    private String b;
    private String c;
    private String d;
    private int e;
    private int f;

    public f()
    {
    }

    public String a()
    {
        return a;
    }

    public void a(int i)
    {
        e = i;
    }

    public void a(String s)
    {
        a = s;
    }

    public String b()
    {
        return b;
    }

    public void b(int i)
    {
        f = i;
    }

    public void b(String s)
    {
        b = s;
    }

    public String c()
    {
        return c;
    }

    public void c(String s)
    {
        c = s;
    }

    public String d()
    {
        return d;
    }

    public void d(String s)
    {
        d = s;
    }

    public int e()
    {
        return e;
    }

    public int f()
    {
        return f;
    }

    public ShareMediaPhoto g()
    {
        return new ShareMediaPhoto(this);
    }
}
