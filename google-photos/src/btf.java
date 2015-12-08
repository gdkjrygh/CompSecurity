// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class btf
    implements btk
{

    private btd a;

    btf(btd btd1)
    {
        a = btd1;
        super();
    }

    public final void a(String s, boolean flag)
    {
        btd.c(a).e = false;
        btd.a(a, s);
        btd.a(a, false);
        if (a.c.x() == bxd.c)
        {
            btd.d(a).a(btd.d());
        } else
        if (a.c.b.a == bxf.d)
        {
            btd.b(a);
            return;
        }
    }
}
