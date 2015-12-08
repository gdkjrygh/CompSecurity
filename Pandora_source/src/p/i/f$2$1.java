// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.i;


// Referenced classes of package p.i:
//            e, f

class Object
    implements e
{

    final a a;

    public Void a(f f1)
    {
        if (f1.c())
        {
            a.a.a();
        } else
        if (f1.d())
        {
            a.a.a(f1.f());
        } else
        {
            a.a.a(f1.e());
        }
        return null;
    }

    public Object then(f f1)
        throws Exception
    {
        return a(f1);
    }

    Object(Object obj)
    {
        a = obj;
        super();
    }

    // Unreferenced inner class p/i/f$2

/* anonymous class */
    static final class f._cls2
        implements Runnable
    {

        final e a;
        final f b;
        final f.a c;

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
            f1.a(new f._cls2._cls1(this));
            return;
        }

            
            {
                a = e1;
                b = f1;
                c = a1;
                super();
            }
    }

}
