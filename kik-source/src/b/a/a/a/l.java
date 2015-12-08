// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import android.content.Context;
import b.a.a.a.a.b.t;
import b.a.a.a.a.c.h;
import java.io.File;
import java.util.Collection;

// Referenced classes of package b.a.a.a:
//            k, g, d, i

public abstract class l
    implements Comparable
{

    d e;
    k f;
    Context g;
    i h;
    t i;

    public l()
    {
        f = new k(this);
    }

    private boolean a(l l1)
    {
        h h1 = (h)getClass().getAnnotation(b/a/a/a/a/c/h);
        if (h1 != null)
        {
            Class aclass[] = h1.a();
            int i1 = aclass.length;
            for (int j = 0; j < i1; j++)
            {
                if (aclass[j].equals(l1.getClass()))
                {
                    return true;
                }
            }

        }
        return false;
    }

    private boolean c()
    {
        return (h)getClass().getAnnotation(b/a/a/a/a/c/h) != null;
    }

    public abstract String a();

    final void a(Context context, d d1, i j, t t1)
    {
        e = d1;
        g = new g(context, b(), x());
        h = j;
        i = t1;
    }

    protected boolean a_()
    {
        return true;
    }

    public abstract String b();

    public int compareTo(Object obj)
    {
        obj = (l)obj;
        if (!a(((l) (obj))))
        {
            if (((l) (obj)).a(this))
            {
                return -1;
            }
            if (!c() || ((l) (obj)).c())
            {
                return c() || !((l) (obj)).c() ? 0 : -1;
            }
        }
        return 1;
    }

    protected abstract Object e();

    final void t()
    {
        f.a(e.b(), new Void[] {
            null
        });
    }

    protected final t u()
    {
        return i;
    }

    public final Context v()
    {
        return g;
    }

    public final d w()
    {
        return e;
    }

    public final String x()
    {
        return (new StringBuilder(".Fabric")).append(File.separator).append(b()).toString();
    }

    protected final Collection y()
    {
        return f.f();
    }
}
