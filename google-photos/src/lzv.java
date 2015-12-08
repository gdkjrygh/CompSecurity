// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public class lzv
{

    public final jyt a;
    public final mau b;

    public lzv(jyt jyt1, mau mau1)
    {
        a = jyt1;
        b = mau1;
    }

    public lzx a()
    {
        return b.a(a.a());
    }

    public lzx a(long l, TimeUnit timeunit)
    {
        return b.a(a.a(l, timeunit));
    }

    public void a(lzy lzy)
    {
        a.a(new man(lzy, b));
    }

    public void b()
    {
        a.b();
    }
}
