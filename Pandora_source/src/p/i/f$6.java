// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.i;


// Referenced classes of package p.i:
//            f, e

static final class g.Object
    implements Runnable
{

    final e a;
    final f b;
    final g.Exception c;

    public void run()
    {
        try
        {
            Object obj = a.then(b);
            c.b(obj);
            return;
        }
        catch (Exception exception)
        {
            c.b(exception);
        }
    }

    ion(e e1, f f1, ion ion)
    {
        a = e1;
        b = f1;
        c = ion;
        super();
    }
}
