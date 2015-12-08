// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import android.content.Context;
import b.a.a.a.a.b.x;
import b.a.a.a.a.c.n;
import java.io.File;
import java.util.Collection;

// Referenced classes of package b.a.a.a:
//            n, j, f, k

public abstract class o
    implements Comparable
{

    f b;
    b.a.a.a.n c;
    Context d;
    k e;
    x f;

    public o()
    {
        c = new b.a.a.a.n(this);
    }

    private boolean a(o o1)
    {
        n n1 = (n)getClass().getAnnotation(b/a/a/a/a/c/n);
        if (n1 != null)
        {
            Class aclass[] = n1.a();
            int k = aclass.length;
            for (int i = 0; i < k; i++)
            {
                if (aclass[i].equals(o1.getClass()))
                {
                    return true;
                }
            }

        }
        return false;
    }

    private boolean b()
    {
        return (n)getClass().getAnnotation(b/a/a/a/a/c/n) != null;
    }

    final void a(Context context, f f1, k k, x x1)
    {
        b = f1;
        d = new j(context, c(), y());
        e = k;
        f = x1;
    }

    protected boolean a()
    {
        return true;
    }

    public abstract String c();

    public int compareTo(Object obj)
    {
        obj = (o)obj;
        if (!a(((o) (obj))))
        {
            if (((o) (obj)).a(this))
            {
                return -1;
            }
            if (!b() || ((o) (obj)).b())
            {
                return b() || !((o) (obj)).b() ? 0 : -1;
            }
        }
        return 1;
    }

    public abstract String d();

    protected abstract Object t();

    final void u()
    {
        c.a(b.b(), new Void[] {
            null
        });
    }

    protected final x v()
    {
        return f;
    }

    public final Context w()
    {
        return d;
    }

    public final f x()
    {
        return b;
    }

    public final String y()
    {
        return (new StringBuilder(".Fabric")).append(File.separator).append(c()).toString();
    }

    protected final Collection z()
    {
        return c.f();
    }
}
