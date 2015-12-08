// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.b;

import com.android.slyce.a.a.a;
import com.android.slyce.a.a.d;
import java.util.LinkedList;

// Referenced classes of package com.android.slyce.a.b:
//            j, a, d, c

public class b extends j
    implements d, com.android.slyce.a.b.a, Runnable
{

    a a;
    Runnable b;
    LinkedList c;
    boolean d;
    private boolean i;
    private boolean j;

    public b()
    {
        this(null);
    }

    public b(a a1)
    {
        this(a1, null);
    }

    public b(a a1, Runnable runnable)
    {
        c = new LinkedList();
        b = runnable;
        a = a1;
    }

    static boolean a(b b1)
    {
        return b1.j;
    }

    static boolean a(b b1, boolean flag)
    {
        b1.j = flag;
        return flag;
    }

    private d b(d d1)
    {
        if (d1 instanceof com.android.slyce.a.b.d)
        {
            ((com.android.slyce.a.b.d)d1).a(this);
        }
        return d1;
    }

    static void b(b b1)
    {
        b1.h();
    }

    private a g()
    {
        return new c(this);
    }

    private void h()
    {
        if (!i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        d d1;
        if (c.size() <= 0 || j || isDone() || isCancelled())
        {
            continue; /* Loop/switch isn't completed */
        }
        d1 = (d)c.remove();
        i = true;
        j = true;
        d1.a(this, g());
        i = false;
          goto _L2
        Object obj;
        obj;
        a(((Exception) (obj)));
        i = false;
          goto _L2
        obj;
        i = false;
        throw obj;
        if (j || isDone() || isCancelled()) goto _L1; else goto _L3
_L3:
        a(((Exception) (null)));
        return;
    }

    public b a(d d1)
    {
        c.add(b(d1));
        return this;
    }

    public void a(a a1)
    {
        a = a1;
    }

    public void a(b b1, a a1)
    {
        a(a1);
        c();
    }

    void a(Exception exception)
    {
        while (!f() || a == null) 
        {
            return;
        }
        a.a(exception);
    }

    public boolean b()
    {
        if (!super.b())
        {
            return false;
        }
        if (b != null)
        {
            b.run();
        }
        return true;
    }

    public b c()
    {
        if (d)
        {
            throw new IllegalStateException("already started");
        } else
        {
            d = true;
            h();
            return this;
        }
    }

    public void run()
    {
        c();
    }
}
