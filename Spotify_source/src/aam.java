// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aam
    implements Runnable
{

    private aak a;

    private aam(aak aak1)
    {
        a = aak1;
        super();
    }

    aam(aak aak1, byte byte0)
    {
        this(aak1);
    }

    public final void run()
    {
        aak.b(a);
    }
}
