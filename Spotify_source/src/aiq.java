// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aiq
    implements Runnable
{

    private int a;
    private aif b;

    aiq(aif aif1)
    {
        b = aif1;
        a = 300;
        super();
    }

    public final void run()
    {
        b.a(a, false);
    }
}
