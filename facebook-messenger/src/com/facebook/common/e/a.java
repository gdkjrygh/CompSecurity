// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.e;


// Referenced classes of package com.facebook.common.e:
//            h, m, n

public abstract class a
    implements h
{

    public a()
    {
    }

    public void a(String s, String s1)
    {
        a(m.b(s, s1));
    }

    public void a(String s, String s1, Throwable throwable)
    {
        a(m.a(s, s1).a(throwable).g());
    }

    public void a(String s, Throwable throwable)
    {
        a(s, throwable.getMessage(), throwable);
    }

    public void b(String s, String s1)
    {
        a(m.a(s, s1).a(true).g());
    }

    public void b(String s, String s1, Throwable throwable)
    {
        a(m.a(s, s1).a(true).a(throwable).g());
    }
}
