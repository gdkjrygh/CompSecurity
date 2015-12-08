// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.concurrent.CancellationException;

// Referenced classes of package bolts:
//            j, f, i

static final class ct
    implements Runnable
{

    final f a;
    final ption b;
    final i c;
    final j d;

    public void run()
    {
        if (a != null && a.a())
        {
            b.b();
            return;
        }
        try
        {
            Object obj = c.then(d);
            b.b(obj);
            return;
        }
        catch (CancellationException cancellationexception)
        {
            b.b();
            return;
        }
        catch (Exception exception)
        {
            b.b(exception);
        }
    }

    ption(f f1, ption ption, i k, j j1)
    {
        a = f1;
        b = ption;
        c = k;
        d = j1;
        super();
    }
}
