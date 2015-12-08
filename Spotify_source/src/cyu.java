// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class cyu extends czh
{

    private final Handler b = new Handler(Looper.getMainLooper());
    private final Map c = new HashMap();
    private final Set d = new HashSet();

    public cyu()
    {
    }

    private void a(View view, List list)
    {
        Set set = d;
        set;
        JVM INSTR monitorenter ;
        int j = list.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        cyv cyv1 = new cyv(view, (czv)list.get(i), b);
        d.add(cyv1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        set;
        JVM INSTR monitorexit ;
        return;
        view;
        set;
        JVM INSTR monitorexit ;
        throw view;
    }

    private void c()
    {
        if (Thread.currentThread() == b.getLooper().getThread())
        {
            a();
            return;
        } else
        {
            b.post(new Runnable() {

                private cyu a;

                public final void run()
                {
                    a.a();
                }

            
            {
                a = cyu.this;
                super();
            }
            });
            return;
        }
    }

    final void a()
    {
        Iterator iterator = b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Activity activity = (Activity)iterator.next();
            Object obj = activity.getClass().getCanonicalName();
            View view = activity.getWindow().getDecorView().getRootView();
            List list;
            synchronized (c)
            {
                obj = (List)c.get(obj);
                list = (List)c.get(null);
            }
            if (obj != null)
            {
                a(view, ((List) (obj)));
            }
            if (list != null)
            {
                a(view, list);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_121;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(Activity activity)
    {
        super.b(activity);
        c();
    }

    public final volatile void a(Object obj)
    {
        super.a((Activity)obj);
    }

    public final void a(Map map)
    {
        Set set = d;
        set;
        JVM INSTR monitorenter ;
        cyv cyv1;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); cyv1.b.post(cyv1))
        {
            cyv1 = (cyv)iterator.next();
            cyv1.a = true;
        }

        break MISSING_BLOCK_LABEL_62;
        map;
        set;
        JVM INSTR monitorexit ;
        throw map;
        d.clear();
        set;
        JVM INSTR monitorexit ;
        synchronized (c)
        {
            c.clear();
            c.putAll(map);
        }
        c();
        return;
        map;
        map1;
        JVM INSTR monitorexit ;
        throw map;
    }

    public final void b(Activity activity)
    {
        super.a(activity);
    }

    public final void b(Object obj)
    {
        a((Activity)obj);
    }
}
