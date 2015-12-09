// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;


// Referenced classes of package p.dg:
//            m

private class a
    implements Runnable
{

    Runnable a;
    final m b;

    public void run()
    {
        try
        {
            m.v(b);
            a.run();
            return;
        }
        catch (Exception exception)
        {
            m.a(b, "Exception runing media player command", exception);
        }
    }

    public .Runnable(m m1, Runnable runnable)
    {
        b = m1;
        super();
        a = runnable;
    }
}
