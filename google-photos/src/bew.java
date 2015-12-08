// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bew
    implements Runnable
{

    private int a;
    private bem b;

    bew(bem bem1, int i)
    {
        b = bem1;
        a = i;
        super();
    }

    public final void run()
    {
        b.g(a);
    }
}
