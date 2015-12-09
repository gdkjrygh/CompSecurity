// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.concurrent.CancellationException;

// Referenced classes of package bolts:
//            i, f, j

class 
    implements i
{

    final a a;

    public Void a(j j1)
    {
        if (a.a != null && a.a.a())
        {
            a.a.a();
            return null;
        }
        if (j1.c())
        {
            a.a.a();
            return null;
        }
        if (j1.d())
        {
            a.a.a(j1.f());
            return null;
        } else
        {
            a.a.a(j1.e());
            return null;
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class bolts/Task$14

/* anonymous class */
    static final class Task._cls14
        implements Runnable
    {

        final f a;
        final j.a b;
        final i c;
        final j d;

        public void run()
        {
            if (a != null && a.a())
            {
                b.c();
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
                    b.c();
                    return;
                }
                catch (Exception exception)
                {
                    b.b(exception);
                }
                break MISSING_BLOCK_LABEL_87;
            }
            ((j) (obj)).a(new Task._cls14._cls1(this));
            return;
        }

            
            {
                a = f1;
                b = a1;
                c = k;
                d = j1;
                super();
            }
    }

}
