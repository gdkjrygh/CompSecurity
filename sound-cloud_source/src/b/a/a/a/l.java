// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import android.content.Context;
import b.a.a.a.a.b.t;
import b.a.a.a.a.c.a;
import b.a.a.a.a.c.h;
import java.io.File;
import java.util.concurrent.Executor;

// Referenced classes of package b.a.a.a:
//            k, g, d, i

public abstract class l
    implements Comparable
{

    public d l;
    public k m;
    public Context n;
    i o;
    public t p;

    public l()
    {
        m = new k(this);
    }

    private boolean a(l l1)
    {
        h h1 = (h)getClass().getAnnotation(b/a/a/a/a/c/h);
        if (h1 != null)
        {
            Class aclass[] = h1.a();
            int j = aclass.length;
            for (int i = 0; i < j; i++)
            {
                if (aclass[i].equals(l1.getClass()))
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

    final void a(Context context, d d1, i i, t t)
    {
        l = d1;
        n = new g(context, b(), l());
        o = i;
        p = t;
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

    public abstract Object d();

    public boolean e()
    {
        return true;
    }

    final void k()
    {
        k k1;
        b.a.a.a.a.c.j.a a1;
        k1 = m;
        a1 = new b.a.a.a.a.c.j.a(l.c, k1);
        if (((a) (k1)).f == b.a.a.a.a.c.a.d.a) goto _L2; else goto _L1
_L1:
        b.a.a.a.a.c.a._cls1.a[((a) (k1)).f - 1];
        JVM INSTR tableswitch 1 2: default 64
    //                   1 101
    //                   2 111;
           goto _L2 _L3 _L4
_L2:
        k1.f = b.a.a.a.a.c.a.d.b;
        k1.b();
        ((a) (k1)).d.b = (new Void[] {
            null
        });
        a1.execute(((a) (k1)).e);
        return;
_L3:
        throw new IllegalStateException("Cannot execute task: the task is already running.");
_L4:
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    public final String l()
    {
        return (new StringBuilder(".Fabric")).append(File.separator).append(b()).toString();
    }
}
