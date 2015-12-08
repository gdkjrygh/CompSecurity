// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;


// Referenced classes of package bolts:
//            i, q, j

final class p
    implements Runnable
{

    final i a;
    final j b;
    final q c;

    p(i j, j j1, q q1)
    {
        a = j;
        b = j1;
        c = q1;
        super();
    }

    public final void run()
    {
        try
        {
            Object obj = a.then(b);
            c.a(obj);
            return;
        }
        catch (Exception exception)
        {
            c.a(exception);
        }
    }
}
