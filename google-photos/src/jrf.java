// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jrf
    implements Runnable
{

    private boolean a;
    private jre b;

    jrf(jre jre1, boolean flag)
    {
        b = jre1;
        a = flag;
        super();
    }

    public final void run()
    {
        b.a.n();
    }
}
