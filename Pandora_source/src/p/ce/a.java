// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ce;

import android.content.Context;
import com.pandora.android.provider.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.cm.af;

// Referenced classes of package p.ce:
//            b, c, f, d, 
//            g

public class a
    implements Runnable
{

    private static a a = null;
    private volatile boolean b;

    private a()
    {
    }

    public static a a()
    {
        if (a == null)
        {
            a = new a();
        }
        return a;
    }

    public String a(Context context)
    {
        List list = null;
        Object obj = new p.ce.b();
        Object obj1 = new c();
        if (((f) (obj)).a())
        {
            obj = ((f) (obj)).a(context);
        } else
        {
            obj = null;
        }
        if (((f) (obj1)).a())
        {
            list = ((f) (obj1)).a(context);
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new ArrayList();
        }
        if (list != null)
        {
            ((List) (obj1)).addAll(list);
        }
        obj = new d();
        if (((f) (obj)).a())
        {
            context = ((f) (obj)).a(context);
            if (context != null)
            {
                ((List) (obj1)).addAll(context);
            }
        }
        obj = new StringBuilder();
        if (obj1 != null)
        {
            obj1 = ((List) (obj1)).iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                g g1 = (g)((Iterator) (obj1)).next();
                ((StringBuilder) (obj)).append(g1.e).append(",");
                ((StringBuilder) (obj)).append(g1.f).append(",");
                ((StringBuilder) (obj)).append(g1.g).append(",");
                ((StringBuilder) (obj)).append(g1.h).append(",");
                ((StringBuilder) (obj)).append(g1.i).append(",");
                ((StringBuilder) (obj)).append(g1.j).append(",");
                ((StringBuilder) (obj)).append(g1.k).append(",");
                if (g1.l)
                {
                    context = "1";
                } else
                {
                    context = "";
                }
                ((StringBuilder) (obj)).append(context).append(",");
                if (g1.d)
                {
                    context = "1";
                } else
                {
                    context = "";
                }
                ((StringBuilder) (obj)).append(context).append(",");
            }
            if (((StringBuilder) (obj)).length() > 0)
            {
                ((StringBuilder) (obj)).setLength(((StringBuilder) (obj)).length() - 1);
            }
        }
        return ((StringBuilder) (obj)).toString();
    }

    public void b()
    {
        b = false;
        a = null;
    }

    public boolean c()
    {
        return b;
    }

    public void run()
    {
        b = true;
        Object obj = Thread.currentThread();
        ((Thread) (obj)).setPriority(1);
        ((Thread) (obj)).setName(p/ce/a.getSimpleName());
        obj = a(b.a.h());
        (new af()).execute(new Object[] {
            obj, this
        });
    }

}
