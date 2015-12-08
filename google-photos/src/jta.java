// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jta
    implements jqs
{

    private int a;
    private boolean b;

    jta()
    {
        a = 2;
    }

    public final int a()
    {
        return a;
    }

    public final void a(int i)
    {
        a = i;
        if (!b)
        {
            jsl.b.a();
            (new StringBuilder("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.")).append((String)jsl.b.a()).append(" DEBUG");
            b = true;
        }
    }

    public final void a(String s)
    {
    }

    public final void b(String s)
    {
    }
}
