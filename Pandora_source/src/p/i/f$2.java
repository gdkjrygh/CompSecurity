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
    final _cls1.a c;

    public void run()
    {
        f f1 = (f)a.then(b);
        if (f1 == null)
        {
            try
            {
                c.b(null);
                return;
            }
            catch (Exception exception)
            {
                c.b(exception);
            }
            break MISSING_BLOCK_LABEL_53;
        }
        f1.a(new e() {

            final f._cls2 a;

            public Void a(f f2)
            {
                if (f2.c())
                {
                    a.c.c();
                } else
                if (f2.d())
                {
                    a.c.b(f2.f());
                } else
                {
                    a.c.b(f2.e());
                }
                return null;
            }

            public Object then(f f2)
                throws Exception
            {
                return a(f2);
            }

            
            {
                a = f._cls2.this;
                super();
            }
        });
        return;
    }

    (e e1, f f1,  )
    {
        a = e1;
        b = f1;
        c = ;
        super();
    }
}
