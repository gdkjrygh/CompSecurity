// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dt;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.Set;
import p.dd.bg;

// Referenced classes of package p.dt:
//            c, k

public class i extends c
{
    public static interface a
    {

        public abstract void a();
    }


    private boolean a;
    private Handler b;
    private Object c;

    public i()
    {
        this(k.b, "Radio Bus");
    }

    protected i(k k1, String s)
    {
        super(k1, s);
        c = new Object();
    }

    static void a(i j, Object obj)
    {
        j.c.a(obj);
    }

    private boolean d(Class class1)
    {
        for (class1 = c(class1).iterator(); class1.hasNext();)
        {
            Set set = b((Class)class1.next());
            if (set != null && !set.isEmpty())
            {
                return true;
            }
        }

        return false;
    }

    public void a(Object obj)
    {
        a(obj, ((a) (null)));
    }

    public void a(Object obj, a a1)
    {
        if (b == null)
        {
            synchronized (c)
            {
                if (b == null)
                {
                    b = c();
                }
            }
        }
        b.post(new Runnable(obj, a1) {

            final Object a;
            final a b;
            final i c;

            public void run()
            {
                i.a(c, a);
                if (b != null)
                {
                    b.a();
                }
                return;
                Exception exception;
                exception;
                if (b != null)
                {
                    b.a();
                }
                throw exception;
            }

            
            {
                c = i.this;
                a = obj;
                b = a1;
                super();
            }
        });
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void b(Object obj)
    {
        super.b(obj);
        a = d(p/dd/bg);
    }

    public boolean b()
    {
        return a;
    }

    protected Handler c()
    {
        return new Handler(Looper.getMainLooper());
    }

    public void c(Object obj)
    {
        super.c(obj);
        a = d(p/dd/bg);
    }
}
