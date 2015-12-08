// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.services.s3.model;

import com.amazonaws.b;

// Referenced classes of package com.amazonaws.services.s3.model:
//            f

public class ce extends b
{

    private f a;
    private String b;

    public ce(f f1, String s)
    {
        a = f1;
        b = s;
    }

    public ce(String s, f f1)
    {
        b = s;
        a = f1;
    }

    public void a(f f1)
    {
        a = f1;
    }

    public void b(f f1)
    {
        a = f1;
    }

    public void b(String s)
    {
        b = s;
    }

    public ce c(f f1)
    {
        b(f1);
        return this;
    }

    public void c(String s)
    {
        b = s;
    }

    public ce d(String s)
    {
        c(s);
        return this;
    }

    public f f()
    {
        return a;
    }

    public f g()
    {
        return a;
    }

    public String h()
    {
        return b;
    }

    public String i()
    {
        return b;
    }
}
