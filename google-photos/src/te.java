// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class te
    implements Runnable
{

    private td a;

    te(td td1)
    {
        a = td1;
        super();
    }

    public final void run()
    {
        if ((a.v & 1) != 0)
        {
            td.a(a, 0);
        }
        if ((a.v & 0x1000) != 0)
        {
            td.a(a, 108);
        }
        a.u = false;
        a.v = 0;
    }
}
