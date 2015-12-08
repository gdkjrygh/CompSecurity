// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a;

import a.a.a.a.a.b.x;
import a.a.a.a.a.c.n;
import android.content.Context;
import java.io.File;
import java.util.Collection;

// Referenced classes of package a.a.a.a:
//            o, j, f, l

public abstract class p
    implements Comparable
{

    f e;
    o f;
    Context g;
    l h;
    x i;

    public p()
    {
        f = new o(this);
    }

    private boolean a(p p1)
    {
        n n1 = (n)getClass().getAnnotation(a/a/a/a/a/c/n);
        if (n1 != null)
        {
            Class aclass[] = n1.a();
            int l = aclass.length;
            for (int k = 0; k < l; k++)
            {
                if (aclass[k].equals(p1.getClass()))
                {
                    return true;
                }
            }

        }
        return false;
    }

    private boolean e()
    {
        return (n)getClass().getAnnotation(a/a/a/a/a/c/n) != null;
    }

    public abstract String a();

    final void a(Context context, f f1, l l, x x1)
    {
        e = f1;
        g = new j(context, b(), x());
        h = l;
        i = x1;
    }

    public abstract String b();

    public int compareTo(Object obj)
    {
        obj = (p)obj;
        if (!a(((p) (obj))))
        {
            if (((p) (obj)).a(this))
            {
                return -1;
            }
            if (!e() || ((p) (obj)).e())
            {
                return e() || !((p) (obj)).e() ? 0 : -1;
            }
        }
        return 1;
    }

    protected abstract Object d();

    protected boolean e_()
    {
        return true;
    }

    final void t()
    {
        f.a(e.c(), new Void[] {
            null
        });
    }

    protected final x u()
    {
        return i;
    }

    public final Context v()
    {
        return g;
    }

    public final f w()
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
