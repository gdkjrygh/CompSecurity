// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nxk
    implements Runnable
{

    private nxb a;
    private Object b;

    nxk(nxh nxh, nxb nxb1, Object obj)
    {
        a = nxb1;
        b = obj;
        super();
    }

    public final void run()
    {
        a.a(b);
    }
}
