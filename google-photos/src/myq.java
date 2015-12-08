// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class myq
    implements Runnable
{

    private myp a;

    myq(myp myp1)
    {
        a = myp1;
        super();
    }

    public final void run()
    {
        myp.a(a);
    }
}
