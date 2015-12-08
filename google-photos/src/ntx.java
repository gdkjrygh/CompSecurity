// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ntx
    implements Runnable
{

    private nug a;
    private ntw b;

    ntx(ntw ntw1, nug nug1)
    {
        b = ntw1;
        a = nug1;
        super();
    }

    public final void run()
    {
        a.b_(b.b);
    }
}
