// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jqo
    implements Runnable
{

    private int a;
    private jso b;
    private jql c;

    jqo(jql jql1, int i, jso jso1)
    {
        c = jql1;
        a = i;
        b = jso1;
        super();
    }

    public final void run()
    {
        boolean flag = c.stopSelfResult(a);
        if (flag)
        {
            b.a("Install campaign broadcast processed", Boolean.valueOf(flag));
        }
    }
}
