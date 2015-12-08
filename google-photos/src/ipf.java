// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ipf
    implements Runnable
{

    private int a;
    private String b;
    private ipb c;

    ipf(ipb ipb1, int i, String s)
    {
        c = ipb1;
        a = i;
        b = s;
        super();
    }

    public final void run()
    {
        c.a(a, b);
    }
}
