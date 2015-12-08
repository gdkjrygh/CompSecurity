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
    final _cls1.a b;
    final i c;
    final j d;

    public void run()
    {
        if (a != null && a.a())
        {
            b.b();
            return;
        }
        Object obj = (j)c.then(d);
        if (obj == null)
        {
            try
            {
                b.b(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                b.b();
                return;
            }
            catch (Exception exception)
            {
                b.b(exception);
            }
            break MISSING_BLOCK_LABEL_87;
        }
        ((j) (obj)).a(new i() {

            final Task._cls14 a;

            public Void a(j j1)
            {
                if (a.a != null && a.a.a())
                {
                    a.b.c();
                    return null;
                }
                if (j1.c())
                {
                    a.b.c();
                    return null;
                }
                if (j1.d())
                {
                    a.b.b(j1.f());
                    return null;
                } else
                {
                    a.b.b(j1.e());
                    return null;
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = Task._cls14.this;
                super();
            }
        });
        return;
    }

    ct(f f1, ct ct, i k, j j1)
    {
        a = f1;
        b = ct;
        c = k;
        d = j1;
        super();
    }
}
