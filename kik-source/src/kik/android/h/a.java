// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.h;

import android.content.Context;
import com.c.a.c.h;
import com.kik.g.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import kik.a.d.b;
import kik.a.e.c;
import kik.a.e.q;
import kik.a.e.v;
import kik.a.j.n;
import kik.android.util.d;

// Referenced classes of package kik.android.h:
//            b, c, d, e, 
//            f, g

public final class a
    implements c
{

    private static final org.c.b b = org.c.c.a("AndroidAddressBookStorage");
    final p a = new p();
    private n c;
    private q d;
    private v e;
    private Context f;
    private kik.a.d.c g;

    public a(Context context, q q1)
    {
        f = context;
        d = q1;
    }

    static kik.a.d.c a(a a1)
    {
        return a1.g;
    }

    static kik.a.d.c a(a a1, kik.a.d.c c1)
    {
        a1.g = c1;
        return c1;
    }

    static v b(a a1)
    {
        return a1.e;
    }

    static org.c.b i()
    {
        return b;
    }

    private File j()
    {
        return d.c("addressFilterFile");
    }

    public final com.c.a.c.c a()
    {
        Object obj;
        com.c.a.c.c c1;
        try
        {
            obj = new ObjectInputStream(new FileInputStream(j()));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        c1 = (com.c.a.c.c)((ObjectInputStream) (obj)).readObject();
        ((ObjectInputStream) (obj)).close();
        return c1;
        Object obj1;
        obj1;
        ((ClassNotFoundException) (obj1)).printStackTrace();
        ((ObjectInputStream) (obj)).close();
        return null;
        obj1;
        ((ObjectInputStream) (obj)).close();
        throw obj1;
        return null;
    }

    public final void a(List list)
    {
        if (list != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        com.c.a.c.c c1 = a();
        if (c1 == null)
        {
            c1 = com.c.a.c.c.a(com.c.a.c.h.a());
        }
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            b b1 = (b)list.next();
            if (b1 != null)
            {
                c1.c(b1.c());
            }
        } while (true);
        try
        {
            list = new ObjectOutputStream(new FileOutputStream(j()));
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            list.printStackTrace();
            list = null;
        }
        if (list == null) goto _L1; else goto _L3
_L3:
        list.writeObject(c1);
        list.close();
        return;
        Exception exception;
        exception;
        list.close();
        throw exception;
    }

    public final void a(n n1, v v1, p p1, p p2)
    {
        c = n1;
        e = v1;
        kik.android.util.d.a(new File(f.getFilesDir(), "addressFilterFile"), j());
        p2.a(new kik.android.h.b(this));
        p1.a(new kik.android.h.c(this));
    }

    public final p b()
    {
        p p1 = new p();
        String s = e.n("AddressIntegration.MATCHING_OPT_IN_KEY");
        if (s != null)
        {
            boolean flag = Boolean.valueOf(s).booleanValue();
            p1.a(Boolean.valueOf(flag));
            g = new kik.a.d.c(Boolean.valueOf(flag));
            return p1;
        } else
        {
            a.a(new kik.android.h.d(this, p1));
            return p1;
        }
    }

    public final void c()
    {
        if (g != null)
        {
            g.a(true);
        } else
        {
            g = new kik.a.d.c(Boolean.valueOf(true));
        }
        e.c("AddressIntegration.MATCHING_OPT_IN_KEY", "true");
        c.b("ab_settings", null, g.b()).a(new e(this));
    }

    public final void d()
    {
        e.c("AddressIntegration.MATCHING_OPT_IN_KEY", "false");
        if (g != null)
        {
            g.a(false);
        } else
        {
            g = new kik.a.d.c(Boolean.valueOf(false));
        }
        c.b("ab_settings", null, g.b()).a(new f(this));
    }

    public final void e()
    {
        String s = e.n("AddressIntegration.MATCHING_OPT_IN_KEY");
        if (s != null)
        {
            g = new kik.a.d.c(Boolean.valueOf(Boolean.valueOf(s).booleanValue()));
            a.a(g);
        } else
        if (!a.g())
        {
            c.d("ab_settings", com/kik/n/a/a/a).a(new g(this));
            return;
        }
    }

    public final boolean f()
    {
        return "true".equals(e.n("AddressIntegration.MATCHING_OPT_IN_KEY"));
    }

    public final void g()
    {
        h();
    }

    public final void h()
    {
        d.c("addressFilterFile").delete();
    }

}
