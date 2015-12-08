// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.e;

import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package rx.e:
//            e, a, b, c, 
//            f

public final class d
{

    static final a a = new e();
    private static final d b = new d();
    private final AtomicReference c = new AtomicReference();
    private final AtomicReference d = new AtomicReference();
    private final AtomicReference e = new AtomicReference();

    d()
    {
    }

    private static Object a(Class class1)
    {
        String s = class1.getSimpleName();
        String s1 = System.getProperty((new StringBuilder("rxjava.plugin.")).append(s).append(".implementation").toString());
        if (s1 != null)
        {
            try
            {
                class1 = ((Class) (Class.forName(s1).asSubclass(class1).newInstance()));
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw new RuntimeException((new StringBuilder()).append(s).append(" implementation is not an instance of ").append(s).append(": ").append(s1).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw new RuntimeException((new StringBuilder()).append(s).append(" implementation class not found: ").append(s1).toString(), class1);
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw new RuntimeException((new StringBuilder()).append(s).append(" implementation not able to be instantiated: ").append(s1).toString(), class1);
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw new RuntimeException((new StringBuilder()).append(s).append(" implementation not able to be accessed: ").append(s1).toString(), class1);
            }
            return class1;
        } else
        {
            return null;
        }
    }

    public static d a()
    {
        return b;
    }

    public final a b()
    {
        if (c.get() == null)
        {
            Object obj = a(rx/e/a);
            if (obj == null)
            {
                c.compareAndSet(null, a);
            } else
            {
                c.compareAndSet(null, (a)obj);
            }
        }
        return (a)c.get();
    }

    public final b c()
    {
        if (d.get() == null)
        {
            Object obj = a(rx/e/b);
            if (obj == null)
            {
                d.compareAndSet(null, rx.e.c.a());
            } else
            {
                d.compareAndSet(null, (b)obj);
            }
        }
        return (b)d.get();
    }

    public final f d()
    {
        if (e.get() == null)
        {
            Object obj = a(rx/e/f);
            if (obj == null)
            {
                e.compareAndSet(null, f.d());
            } else
            {
                e.compareAndSet(null, (f)obj);
            }
        }
        return (f)e.get();
    }

}
